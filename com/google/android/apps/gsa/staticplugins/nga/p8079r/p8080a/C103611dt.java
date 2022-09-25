package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82879dv;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82881dx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dt */
/* compiled from: PG */
public final class C103611dt {

    /* renamed from: a */
    public static final C59071e f288631a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.a.dt");

    /* renamed from: a */
    public static void m171596a(C83334w wVar, int i) {
        C82887ec ecVar = C82887ec.MULTI_DEVICE_ARBITRATION;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82879dv dvVar = (C82879dv) C82881dx.f225971c.createBuilder();
        dvVar.copyOnWrite();
        C82881dx dxVar = (C82881dx) dvVar.instance;
        dxVar.f225974b = i - 1;
        dxVar.f225973a |= 1;
        C82881dx dxVar2 = (C82881dx) dvVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        dxVar2.getClass();
        eaVar.f225980b = dxVar2;
        eaVar.f225979a = 105;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }
}
