package com.google.android.setupdesign.p3556e.p3557a;

import android.support.p031v4.app.Fragment;
import android.util.Log;
import com.google.android.material.p3516m.p3517a.C44800d;
import com.google.android.setupdesign.p3556e.C45304a;

/* renamed from: com.google.android.setupdesign.e.a.a */
/* compiled from: PG */
public final class C45305a {
    /* renamed from: a */
    public static void m80753a(Fragment fragment) {
        if (C45304a.m80745a(fragment.getContext()) == 1) {
            fragment.setReturnTransition(new C44800d(false));
            fragment.setReenterTransition(new C44800d(false));
            return;
        }
        Log.w("TransitionHelper", "Not apply the backward transition for support lib's fragment.");
    }

    /* renamed from: b */
    public static void m80754b(Fragment fragment) {
        if (C45304a.m80745a(fragment.getContext()) == 1) {
            fragment.setExitTransition(new C44800d(true));
            fragment.setEnterTransition(new C44800d(true));
            return;
        }
        Log.w("TransitionHelper", "Not apply the forward transition for support lib's fragment.");
    }
}
