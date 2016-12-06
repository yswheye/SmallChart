package smallchart.idtk.com.smallchartexample.fragment;

import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Created by Idtk on 2016/6/26.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 : 基础类
 */
public class BaseFragment extends Fragment {

    protected float[][] points = new float[][]{{1,36.2f}, {2,37f}, {3,36.3f}, {4,36.5f}, {5,36.4f},{6,36.3f}, {7,36.2f}, {8,37f}, {9,38}, {10,36}};
    protected float[][] points2 = new float[][]{{1,52}, {2,13}, {3,51}, {4,20}, {5,19},{6,20}, {7,54}, {8,7}, {9,19}, {10,41}};
    protected int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080,
            0xFFE6B800, 0xFF7CFC00};

    protected float pxTodp(float value){
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        float valueDP= TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,value,metrics);
        return valueDP;
    }
}
