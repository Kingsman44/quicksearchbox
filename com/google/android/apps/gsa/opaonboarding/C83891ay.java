package com.google.android.apps.gsa.opaonboarding;

import android.app.Activity;
import android.app.Fragment;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ay */
/* compiled from: PG */
public final class C83891ay {
    /* renamed from: a */
    public static void m133615a(Fragment fragment) {
        C83890ax axVar;
        Activity activity = fragment.getActivity();
        C58838bb.m90867b(activity, "%s must have non-null Activity", fragment.getClass().getSimpleName());
        if (activity instanceof C19599a) {
            axVar = (C83890ax) ((C19599a) activity).f54537b;
        } else {
            axVar = (C83890ax) activity;
        }
        C58838bb.m90866a(axVar, "Could not find injector for fragment = ".concat(fragment.toString()));
        C83889aw a = axVar.mo77276a();
        C58838bb.m90867b(a, "%s.getFragmentInjector() returned null", axVar.getClass().getSimpleName());
        a.mo65465a(fragment);
    }
}
