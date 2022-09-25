package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager2.widget.b */
/* compiled from: PG */
final class C4299b {

    /* renamed from: a */
    public static final ViewGroup.MarginLayoutParams f13913a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f13913a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* renamed from: a */
    public static boolean m12343a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m12343a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
