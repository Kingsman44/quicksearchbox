package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.res.Resources;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93617dn;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ac */
/* compiled from: PG */
public final class C102396ac {

    /* renamed from: a */
    public static final Interpolator f285788a = C91107f.m148859b(0.25f, 0.0f, 0.05f, 1.0f);

    /* renamed from: b */
    public static final Interpolator f285789b = C91107f.m148859b(0.17f, 0.55f, 0.47f, 1.0f);

    /* renamed from: c */
    public static final Interpolator f285790c = C91107f.m148859b(0.47f, 0.0f, 0.41f, 0.57f);

    static {
        C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* renamed from: a */
    public static TransitionSet m169775a(Resources resources, Object... objArr) {
        return C93632eb.m154487b(133, 267, f285790c, f285789b, resources.getColor(R.color.action_card_medium_grey), objArr);
    }

    /* renamed from: b */
    static C93617dn m169776b(boolean z, int i, DisplayMetrics displayMetrics, Object... objArr) {
        C93617dn a = C93617dn.m154465a(i, (int) TypedValue.applyDimension(1, 72.0f, displayMetrics));
        if (z) {
            a.setDuration(133);
        } else {
            a.setStartDelay(133);
            a.setDuration(267);
        }
        C93632eb.m154489d(a, objArr);
        if (z) {
            a.setInterpolator(f285790c);
        } else {
            a.setInterpolator(f285789b);
        }
        return a;
    }

    /* renamed from: c */
    public static void m169777c(List list, TransitionSet transitionSet, DisplayMetrics displayMetrics) {
        int size = list.size();
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics);
        int i = 0;
        while (i < size) {
            i++;
            C93617dn a = C93617dn.m154465a(1, applyDimension * i);
            a.addTarget((View) list.get(i));
            a.setStartDelay(133);
            a.setDuration(267);
            a.setInterpolator(f285789b);
            transitionSet.addTransition(a);
        }
    }
}
