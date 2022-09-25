package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.assistant.p4016z.C53691ap;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C130718m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130725t f357898a;

    /* renamed from: b */
    public final /* synthetic */ C53691ap f357899b;

    public /* synthetic */ C130718m(C130725t tVar, C53691ap apVar) {
        this.f357898a = tVar;
        this.f357899b = apVar;
    }

    public final C60870cx apply(Object obj) {
        C130725t tVar = this.f357898a;
        C53691ap apVar = this.f357899b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C130712h hVar = (C130712h) tVar.f357912c.get(apVar);
        if (hVar == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return (C60870cx) hVar.mo109802a(new C130720o(tVar, apVar));
    }
}
