package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82888ed;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.libraries.gsa.p1876k.C22862b;
import p3186j$.time.Duration;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C82203ae implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C82207ai f224668a;

    /* renamed from: b */
    public final /* synthetic */ C82887ec f224669b;

    /* renamed from: c */
    public final /* synthetic */ C83320io f224670c;

    /* renamed from: d */
    public final /* synthetic */ Supplier f224671d;

    public /* synthetic */ C82203ae(C82207ai aiVar, C82887ec ecVar, C83320io ioVar, Supplier supplier) {
        this.f224668a = aiVar;
        this.f224669b = ecVar;
        this.f224670c = ioVar;
        this.f224671d = supplier;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C82207ai aiVar = this.f224668a;
        C82887ec ecVar = this.f224669b;
        C83320io ioVar = this.f224670c;
        Supplier supplier = this.f224671d;
        C82888ed i = aiVar.mo75551i(ecVar, ioVar, Duration.ofNanos(aiVar.f224675b.mo26884a()));
        C82885ea eaVar = (C82885ea) supplier.get();
        i.copyOnWrite();
        C82889ee eeVar = (C82889ee) i.instance;
        C82889ee eeVar2 = C82889ee.f226094j;
        eaVar.getClass();
        eeVar.f226099d = eaVar;
        eeVar.f226096a |= 4;
        return (C82889ee) i.build();
    }
}
