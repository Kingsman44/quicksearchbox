package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82859db;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82862de;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83065as;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.bw */
/* compiled from: PG */
public final class C83157bw implements C83134b {

    /* renamed from: a */
    public final C83065as f226768a;

    public C83157bw(C83065as asVar) {
        this.f226768a = asVar;
    }

    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82862de deVar;
        if (eaVar.f225979a == 26) {
            deVar = (C82862de) eaVar.f225980b;
        } else {
            deVar = C82862de.f225943b;
        }
        C82859db dbVar = (C82859db) C82862de.f225943b.createBuilder();
        dbVar.copyOnWrite();
        C82862de deVar2 = (C82862de) dbVar.instance;
        deVar2.mo76627a();
        C62947c.addAll((Iterable) Collection.EL.stream(deVar.f225945a).map(new C83147bm(this)).collect(C58370cn.f155946a), (List) deVar2.f225945a);
        C82862de deVar3 = (C82862de) dbVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        deVar3.getClass();
        eaVar2.f225980b = deVar3;
        eaVar2.f225979a = 26;
    }
}
