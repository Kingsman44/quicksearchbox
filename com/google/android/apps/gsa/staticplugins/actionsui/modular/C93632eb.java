package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.eb */
/* compiled from: PG */
public final class C93632eb {
    /* renamed from: a */
    public static TransitionSet m154486a(int i, Object... objArr) {
        return m154487b(250, 250, C91107f.f254405a, C91107f.f254406b, i, objArr);
    }

    /* renamed from: b */
    public static TransitionSet m154487b(int i, int i2, Interpolator interpolator, Interpolator interpolator2, int i3, Object... objArr) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (Object obj : objArr) {
            if (obj instanceof TextView) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(objArr.length);
                }
                arrayList2.add(obj);
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList(objArr.length);
                }
                arrayList.add(obj);
            }
        }
        Pair create = Pair.create(arrayList != null ? arrayList.toArray() : new Object[0], arrayList2 != null ? arrayList2.toArray() : new Object[0]);
        if (((Object[]) create.first).length != 0) {
            Fade fade = new Fade(2);
            long j = (long) i;
            fade.setDuration(j);
            fade.setInterpolator(interpolator);
            transitionSet.addTransition(fade);
            Fade fade2 = new Fade(1);
            fade2.setDuration((long) i2);
            fade2.setStartDelay(j);
            fade2.setInterpolator(interpolator2);
            transitionSet.addTransition(fade2);
            m154489d(fade, (Object[]) create.first);
            m154489d(fade2, (Object[]) create.first);
        }
        if (((Object[]) create.second).length != 0) {
            C93625dv dvVar = new C93625dv(0, 0, 0, 0, i3);
            transitionSet.addTransition(dvVar);
            m154489d(dvVar, (Object[]) create.second);
        }
        return transitionSet;
    }

    /* renamed from: c */
    public static C93617dn m154488c(int i, DisplayMetrics displayMetrics, Object... objArr) {
        C93617dn a = C93617dn.m154465a(i, (int) TypedValue.applyDimension(1, 60.0f, displayMetrics));
        a.setDuration(500);
        m154489d(a, objArr);
        a.setInterpolator(C91107f.f254408d);
        return a;
    }

    /* renamed from: d */
    public static void m154489d(Transition transition, Object[] objArr) {
        for (View view : objArr) {
            if (view instanceof View) {
                transition.addTarget(view);
            } else if (view instanceof Integer) {
                transition.addTarget(((Integer) view).intValue());
            } else {
                throw new IllegalArgumentException("Views must be Ids or View instances");
            }
        }
    }

    /* renamed from: e */
    public static void m154490e(List list, TransitionSet transitionSet, DisplayMetrics displayMetrics) {
        int size = list.size();
        int i = size <= 1 ? 0 : 100 / size;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, displayMetrics);
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            int i3 = i * i2;
            int i4 = i3 + 250;
            int i5 = 250 - i3;
            C58838bb.m90868c(applyDimension > 0);
            C93617dn dnVar = new C93617dn(-1, 0, applyDimension, 0);
            dnVar.addTarget(view);
            long j = (long) i4;
            dnVar.setStartDelay(j);
            long j2 = (long) i5;
            dnVar.setDuration(j2);
            transitionSet.addTransition(dnVar);
            Fade fade = new Fade(1);
            fade.addTarget(view);
            fade.setStartDelay(j);
            fade.setDuration(j2);
            transitionSet.addTransition(fade);
        }
    }

    /* renamed from: f */
    public static boolean m154491f(Context context) {
        return !C90772bp.m148283J(context);
    }

    /* renamed from: g */
    public static void m154492g(int i, int i2, C93584ch chVar, TransitionSet transitionSet, TransitionSet transitionSet2) {
        Pair iM = chVar.mo87843iM(i, i2);
        if (!(iM == null || iM.first == null)) {
            transitionSet.addTransition((Transition) iM.first);
        }
        if (iM != null && iM.second != null) {
            transitionSet2.addTransition((Transition) iM.second);
        }
    }
}
