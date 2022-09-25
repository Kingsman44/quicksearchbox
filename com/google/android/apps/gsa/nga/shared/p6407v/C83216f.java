package com.google.android.apps.gsa.nga.shared.p6407v;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82355cc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.f */
/* compiled from: PG */
public final class C83216f {

    /* renamed from: a */
    private final C83334w f226832a;

    /* renamed from: b */
    private final C83305i f226833b;

    /* renamed from: c */
    private final C82831ca f226834c;

    public C83216f(C83334w wVar, C83305i iVar, C82831ca caVar) {
        this.f226832a = wVar;
        this.f226833b = iVar;
        this.f226834c = caVar;
    }

    /* renamed from: a */
    public final void mo76648a(C83320io ioVar, C82835ce ceVar, Consumer consumer) {
        C82832cb cbVar = (C82832cb) C82833cc.f225801h.createBuilder();
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        ccVar.f225804b = ceVar.f225873aj;
        ccVar.f225803a |= 1;
        C82831ca caVar = this.f226834c;
        cbVar.copyOnWrite();
        C82833cc ccVar2 = (C82833cc) cbVar.instance;
        ccVar2.f225805c = caVar.f225800aL;
        ccVar2.f225803a |= 2;
        consumer.accept(cbVar);
        C83334w wVar = this.f226832a;
        C82887ec ecVar = C82887ec.FULFILLMENT_ABORT_SENSITIVE;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82833cc ccVar3 = (C82833cc) cbVar.build();
        ccVar3.getClass();
        eaVar.f225980b = ccVar3;
        eaVar.f225979a = 35;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
        this.f226833b.mo75579d(new C82355cc("NGA_FULFILLMENT_ABORT_REASON_TYPED", ceVar.f225873aj, this.f226834c.f225800aL));
    }
}
