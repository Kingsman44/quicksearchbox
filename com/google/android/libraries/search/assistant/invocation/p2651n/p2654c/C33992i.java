package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.i */
/* compiled from: PG */
public final class C33992i extends C33987d {

    /* renamed from: a */
    private final C34003t f90616a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33992i(C34003t tVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(tVar, "backend");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f90616a = tVar;
    }

    /* renamed from: b */
    public final Object mo39179b(C34000q qVar, C69577g gVar) {
        C61541e eVar = C33487a.f89616a;
        C69664n.m101060f(eVar, "BUNDLE_KEYS");
        Parcelable d = C61543g.m94277d(eVar);
        C69664n.m101060f(d, "BUNDLE_KEYS.fromRequestHeaders()");
        return this.f90616a.mo39184a((Bundle) d, qVar.f90630a, gVar);
    }
}
