package com.google.android.libraries.onegoogle.common;

import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.p2380c.C30898c;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.common.z */
/* compiled from: PG */
public final class C30939z {

    /* renamed from: a */
    public final C30898c f83363a;

    /* renamed from: b */
    public final C63644b f83364b;

    /* renamed from: c */
    public final C30253a f83365c;

    public C30939z(C30898c cVar, C63644b bVar, C30253a aVar) {
        this.f83363a = cVar;
        this.f83364b = bVar;
        this.f83365c = aVar;
    }

    /* renamed from: a */
    public final void mo36616a(int i) {
        C30898c cVar = this.f83363a;
        Object c = C30281j.m56319c(((C30306o) this.f83365c).f81934a.f81883d);
        C63643a aVar = (C63643a) this.f83364b.toBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172122b = i - 1;
        bVar.f172121a |= 1;
        cVar.mo35875a(c, (C63644b) aVar.build());
    }
}
