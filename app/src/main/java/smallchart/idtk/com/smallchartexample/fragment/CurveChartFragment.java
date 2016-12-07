package smallchart.idtk.com.smallchartexample.fragment;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idtk.smallchart.chart.CurveChart;
import com.idtk.smallchart.color.DrawableEntity;
import com.idtk.smallchart.data.CurveData;
import com.idtk.smallchart.interfaces.iData.ICurveData;

import java.util.ArrayList;

import smallchart.idtk.com.smallchartexample.R;

import static smallchart.idtk.com.smallchartexample.R.id.curveChart;

/**
 * Created by Idtk on 2016/6/26.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 : 曲线图
 */
public class CurveChartFragment extends BaseFragment {

    private ArrayList<ICurveData> mDataList = new ArrayList<>();
    private CurveData mCurveData = new CurveData();
    private ArrayList<PointF> mPointArrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_curvechart,container,false);
        CurveChart chartview = (CurveChart) view.findViewById(curveChart);
        /**
         * setting
         */
        chartview.setAxisTextSize(18f);

        initData(chartview);
//        curveChart.setData(mCurveData);
        chartview.setDataList(mDataList);
        return view;
    }

    private void initData(CurveChart chartview) {
        for (int i = 0; i < 8; i++) {
            mPointArrayList.add(new PointF(points[i][0], points[i][1]));
        }
        mCurveData.setValue(mPointArrayList);
//        mCurveData.setColor(Color.RED);

        Drawable drawable1 = ContextCompat.getDrawable(getContext(), R.drawable.fade_red);
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.fade_blue);
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), R.drawable.fade_green);
        ArrayList<DrawableEntity> drawableEntities = new ArrayList<>();
        drawableEntities.add(new DrawableEntity(drawable1, 2));
        drawableEntities.add(new DrawableEntity(drawable2, 3));
        drawableEntities.add(new DrawableEntity(drawable3, 2));
        mCurveData.setDrawableEntitys(drawableEntities);
        String[] xLebel = {"12-01", "12-02", "12-03", "12-04", "12-05", "12-06", "12-07", "12-08"};
        chartview.setxLabels(xLebel);

//        mCurveData.setPointShape(PointShape.SOLIDROUND);
//        mCurveData.setPaintWidth(pxTodp(3));
        mCurveData.setTextSize(pxTodp(10));
        mDataList.add(mCurveData);
    }
}
