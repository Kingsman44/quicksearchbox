package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97929s;
import com.google.android.apps.search.podcasts.p10573k.C140421a;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p4757ac.p4758a.C63107f;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.podcasts.b.g.w */
/* compiled from: PG */
final class C140159w implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140133ai f380823a;

    public C140159w(C140133ai aiVar) {
        this.f380823a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C140131ag agVar = (C140131ag) obj;
        C140421a aVar = (C140421a) this.f380823a.f380791g.mo56107c();
        String str = agVar.f380779b;
        C140160x xVar = agVar.f380780c;
        HashSet hashSet = new HashSet();
        for (C97929s sVar : xVar.f380824a.values()) {
            if (sVar.f273466n) {
                C63107f fVar = sVar.f273464l;
                if (fVar == null) {
                    fVar = C63107f.f170337d;
                }
                hashSet.add(fVar.f170340b);
            }
            if (sVar.f273465m) {
                C63107f fVar2 = sVar.f273464l;
                if (fVar2 == null) {
                    fVar2 = C63107f.f170337d;
                }
                hashSet.add(fVar2.f170341c);
            }
        }
        aVar.mo115660a(str, hashSet);
    }
}
