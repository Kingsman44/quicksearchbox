package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6389l.p6390a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83011t;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83013v;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.l.a.a */
/* compiled from: PG */
public final class C81843a {

    /* renamed from: a */
    private final C83334w f223838a;

    public C81843a(C83334w wVar) {
        this.f223838a = wVar;
    }

    /* renamed from: a */
    public final void mo75369a(int i) {
        C83334w wVar = this.f223838a;
        C82887ec ecVar = C82887ec.ASSIST_LAYER_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C83011t tVar = (C83011t) C83013v.f226526c.createBuilder();
        tVar.copyOnWrite();
        C83013v vVar = (C83013v) tVar.instance;
        vVar.f226529b = i - 1;
        vVar.f226528a |= 1;
        C83013v vVar2 = (C83013v) tVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        vVar2.getClass();
        eaVar.f225980b = vVar2;
        eaVar.f225979a = 97;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }
}
