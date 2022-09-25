package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.assistant.p1533o.C18469be;
import com.google.android.libraries.assistant.p1533o.C18473bi;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.k.j */
/* compiled from: PG */
public final class C122076j extends C18473bi {

    /* renamed from: a */
    private final C18469be f338678a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122076j(C18469be beVar) {
        super(C69586p.f185991a);
        C69664n.m101061g(beVar, "delegate");
        this.f338678a = beVar;
    }

    /* renamed from: b */
    public final C71587n mo23998b(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        C122075i iVar = new C122075i(this.f338678a);
        C69664n.m101061g(nVar, "input");
        return C71598y.m104521a(C71590q.m104504a(new C122071e(iVar, nVar, (C69577g) null)), Integer.MAX_VALUE, C71387t.SUSPEND);
    }
}
