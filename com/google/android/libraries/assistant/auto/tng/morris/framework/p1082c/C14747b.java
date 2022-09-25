package com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14231bo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14232bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14334fj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14501lo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14502lp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.c.b */
/* compiled from: PG */
public final class C14747b {
    /* renamed from: a */
    public static C14232bp m31074a(C14334fj fjVar) {
        C14231bo boVar = (C14231bo) C14232bp.f43070d.createBuilder();
        C14542nb nbVar = C14542nb.MEDIA;
        boVar.copyOnWrite();
        ((C14232bp) boVar.instance).f43074c = nbVar.getNumber();
        boVar.copyOnWrite();
        C14232bp bpVar = (C14232bp) boVar.instance;
        bpVar.f43073b = Integer.valueOf(fjVar.getNumber());
        bpVar.f43072a = 3;
        return (C14232bp) boVar.build();
    }

    /* renamed from: b */
    public static C14232bp m31075b(C14501lo loVar) {
        C14231bo boVar = (C14231bo) C14232bp.f43070d.createBuilder();
        C14542nb nbVar = C14542nb.NAVIGATION;
        boVar.copyOnWrite();
        ((C14232bp) boVar.instance).f43074c = nbVar.getNumber();
        boVar.copyOnWrite();
        C14232bp bpVar = (C14232bp) boVar.instance;
        bpVar.f43073b = Integer.valueOf(loVar.getNumber());
        bpVar.f43072a = 2;
        return (C14232bp) boVar.build();
    }

    /* renamed from: c */
    public static C14232bp m31076c(int i) {
        C14231bo boVar = (C14231bo) C14232bp.f43070d.createBuilder();
        C14542nb nbVar = C14542nb.ONGOING_CALL;
        boVar.copyOnWrite();
        ((C14232bp) boVar.instance).f43074c = nbVar.getNumber();
        boVar.copyOnWrite();
        C14232bp bpVar = (C14232bp) boVar.instance;
        bpVar.f43073b = Integer.valueOf(C14502lp.m30629a(i));
        bpVar.f43072a = 4;
        return (C14232bp) boVar.build();
    }
}
