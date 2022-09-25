package com.google.android.gms.car;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.car.p10765i.p10766a.C143318a;

/* renamed from: com.google.android.gms.car.bl */
/* compiled from: PG */
public final class C143128bl implements C143174da {
    /* renamed from: a */
    public final View mo118059a(ViewGroup viewGroup, ViewGroup viewGroup2, View view, int i, boolean z) {
        int i2;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup2, view, i);
        if (viewGroup2 == viewGroup) {
            return findNextFocus;
        }
        if (C143318a.m232519b(viewGroup2)) {
            if (findNextFocus != null) {
                if (C143109au.m232164a("CAR.PROJECTION.SEARCH", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.SEARCH", (Throwable) null, "Focus cluster search found %s. Focus Cluster: %s", findNextFocus, viewGroup2);
                }
                return findNextFocus;
            }
            int a = C143318a.m232518a(viewGroup2);
            if (a == 1) {
                if (C143109au.m232164a("CAR.PROJECTION.SEARCH", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.SEARCH", (Throwable) null, "Force field MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, C143200dq.m232322a(i));
                }
                return view;
            } else if (a != 2 || !z) {
                if (i == 66) {
                    i2 = viewGroup2.getNextFocusRightId();
                } else if (i == 17) {
                    i2 = viewGroup2.getNextFocusLeftId();
                } else if (i == 33) {
                    i2 = viewGroup2.getNextFocusUpId();
                } else {
                    i2 = i == 130 ? viewGroup2.getNextFocusDownId() : -1;
                }
                if (i2 != -1) {
                    if (i2 != view.getId()) {
                        return viewGroup.findViewById(i2);
                    }
                    if (C143109au.m232164a("CAR.PROJECTION.SEARCH", 3)) {
                        C143316a.m232514d(3, "CAR.PROJECTION.SEARCH", (Throwable) null, "Focus cluster user-defined next focus points to current focus. root: %s, nextFocusId: %s, direction: %s", viewGroup2, Integer.valueOf(i2), C143200dq.m232322a(i));
                    }
                    return view;
                }
            } else {
                if (C143109au.m232164a("CAR.PROJECTION.SEARCH", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.SEARCH", (Throwable) null, "Force field MULTIMOVE_MODAL triggered. root: %s, view: %s, direction: %s", viewGroup2, view, C143200dq.m232322a(i));
                }
                return view;
            }
        }
        ViewGroup b = mo118060b(viewGroup2, viewGroup);
        if (C143109au.m232164a("CAR.PROJECTION.SEARCH", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.SEARCH", (Throwable) null, "Focus cluster search returned null. Recursively searching next root. Focus Cluster: %s, Next Root: %s", viewGroup2, b);
        }
        return mo118059a(viewGroup, b, view, i, z);
    }

    /* renamed from: b */
    public final ViewGroup mo118060b(View view, ViewGroup viewGroup) {
        if (view == viewGroup) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        if (viewGroup2 == null) {
            return viewGroup;
        }
        if (C143318a.m232519b(viewGroup2)) {
            return viewGroup2;
        }
        return mo118060b(viewGroup2, viewGroup);
    }
}
