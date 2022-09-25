package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134577bo;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ay */
/* compiled from: PG */
final class C135153ay implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135161bf f368123a;

    /* renamed from: b */
    final /* synthetic */ C135157bb f368124b;

    public C135153ay(C135161bf bfVar, C135157bb bbVar) {
        this.f368123a = bfVar;
        this.f368124b = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112131a(C135205y yVar) {
        C134577bo boVar = this.f368123a.f368147a;
        if (boVar != null) {
            String d = this.f368124b.mo112135d(yVar);
            if (d == null) {
                throw new C135137ai();
            } else if (C69664n.m101066l(d, this.f368123a.f368148b)) {
                yVar.mo112166d(this.f368124b.f368141g, C69505av.m100862d(new C69685i("Session::LastUserInteraction", boVar.toByteString())));
            } else {
                throw new C135174bs("Update user interaction failed due to target feed mismatch");
            }
        }
        return C69788q.f186170a;
    }
}
