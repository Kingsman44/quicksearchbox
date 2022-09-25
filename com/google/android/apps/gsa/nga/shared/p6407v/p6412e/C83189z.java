package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83102u;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.z */
/* compiled from: PG */
public final class C83189z implements C83134b {

    /* renamed from: a */
    private final C83102u f226805a;

    public C83189z(C83102u uVar) {
        this.f226805a = uVar;
    }

    /* renamed from: a */
    public final void mo76647a(C82885ea eaVar, C82883dz dzVar) {
        C82843cm cmVar;
        if (eaVar.f225979a == 2) {
            cmVar = (C82843cm) eaVar.f225980b;
        } else {
            cmVar = C82843cm.f225889f;
        }
        C82843cm a = this.f226805a.apply(cmVar);
        dzVar.copyOnWrite();
        C82885ea eaVar2 = (C82885ea) dzVar.instance;
        a.getClass();
        eaVar2.f225980b = a;
        eaVar2.f225979a = 2;
    }
}
