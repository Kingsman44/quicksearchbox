package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.bf */
/* compiled from: PG */
final class C120937bf {
    /* renamed from: a */
    public static float m200199a(Context context) {
        return context.getResources().getDimension(R.dimen.assistant_enforced_rounded_corner_max_radius);
    }

    /* renamed from: b */
    public static View m200200b(View view) {
        View view2 = null;
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.getVisibility() == 0 && (!view.willNotDraw() || view.getForeground() != null || view.getBackground() != null)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View b = m200200b(viewGroup.getChildAt(i));
                if (b != null) {
                    if (view2 != null) {
                        return view;
                    }
                    view2 = b;
                }
            }
        }
        return view2;
    }

    /* renamed from: c */
    public static void m200201c(View view, List list) {
        if (view.getId() == 16908288) {
            list.add(view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m200201c(viewGroup.getChildAt(i), list);
            }
        }
    }
}
