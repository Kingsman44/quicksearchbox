package com.google.android.libraries.logging.p2185ve.synthetic.dialogs;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.synthetic.C28467k;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.dialogs.d */
/* compiled from: PG */
public final class C28459d {
    /* renamed from: a */
    public static View m53186a(C0260w wVar) {
        m53189d(wVar);
        return wVar.getDialog().getWindow().findViewById(16908290);
    }

    /* renamed from: b */
    public static void m53187b(C0260w wVar, C28439i iVar) {
        boolean z = true;
        C28439i a = C28485y.m53234a(m53190e(wVar, true));
        if (a == null) {
            z = false;
        }
        C58838bb.m90884s(z, "Host fragment/activity must be instrumented");
        C28467k.m53225a(iVar, a);
    }

    /* renamed from: c */
    public static void m53188c(C0260w wVar) {
        C28439i a = C28485y.m53234a(m53186a(wVar));
        C58838bb.m90866a(a, "Dialog root must be instrumented.");
        boolean z = false;
        C28439i a2 = C28485y.m53234a(m53190e(wVar, false));
        if (a2 != null) {
            z = true;
        }
        C58838bb.m90884s(z, "Parent fragment/activity must be instrumented");
        C28467k.m53225a(a, a2);
    }

    /* renamed from: d */
    static void m53189d(C0260w wVar) {
        C58838bb.m90869d(wVar.getDialog() != null, "Wrap OnShowListener with SyntheticDialogs#whileDialogExists");
    }

    /* renamed from: e */
    private static View m53190e(C0260w wVar, boolean z) {
        for (Fragment parentFragment = wVar.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            View view = parentFragment.getView();
            if (view != null && (!z || C28485y.m53234a(view) != null)) {
                return view;
            }
        }
        C0167am activity = wVar.getActivity();
        int i = C28485y.f77298f;
        return activity.findViewById(16908290);
    }
}
