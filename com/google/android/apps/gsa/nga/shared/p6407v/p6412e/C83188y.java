package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82836cf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82839ci;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83095n;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.y */
/* compiled from: PG */
public final class C83188y implements C83134b {

    /* renamed from: a */
    private final C83095n f226804a;

    public C83188y(C83095n nVar) {
        this.f226804a = nVar;
    }

    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82839ci ciVar;
        if (eaVar.f225979a == 21) {
            ciVar = (C82839ci) eaVar.f225980b;
        } else {
            ciVar = C82839ci.f225884b;
        }
        C82836cf cfVar = (C82836cf) C82839ci.f225884b.createBuilder();
        cfVar.copyOnWrite();
        C82839ci ciVar2 = (C82839ci) cfVar.instance;
        ciVar2.mo76625a();
        C62947c.addAll((Iterable) Collection.EL.stream(ciVar.f225886a).map(this.f226804a).collect(C58370cn.f155946a), (List) ciVar2.f225886a);
        C82839ci ciVar3 = (C82839ci) cfVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        ciVar3.getClass();
        eaVar2.f225980b = ciVar3;
        eaVar2.f225979a = 21;
    }
}
