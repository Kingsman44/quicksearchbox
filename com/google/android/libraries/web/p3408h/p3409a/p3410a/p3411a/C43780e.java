package com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43782b;
import java.util.Map;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.h.a.a.a.e */
/* compiled from: PG */
public final class C43780e extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C43781f f114160a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43780e(C43781f fVar) {
        super(0);
        this.f114160a = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        for (Map.Entry value : this.f114160a.f114161a.entrySet()) {
            C43778c cVar = (C43778c) value.getValue();
            C19559g.m37304c();
            if (cVar.mo46795a() != C43782b.CLOSED) {
                C43779d dVar = (C43779d) cVar.f114156c.get();
                if (dVar != null) {
                    dVar.f114158a.f114465a = null;
                    dVar.f114159b.mo5672a();
                }
                cVar.f114156c.set((Object) null);
                cVar.f114155b.set(C43782b.CLOSED);
            }
        }
        return C69788q.f186170a;
    }
}
