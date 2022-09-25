package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134553ar;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134557av;
import com.google.android.apps.search.googleapp.discover.p10214s.C134603u;
import com.google.android.apps.search.googleapp.discover.p10214s.C134605w;
import com.google.protobuf.C62934bn;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.az */
/* compiled from: PG */
final class C135154az implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135157bb f368125a;

    /* renamed from: b */
    final /* synthetic */ String f368126b;

    public C135154az(C135157bb bbVar, String str) {
        this.f368125a = bbVar;
        this.f368126b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112131a(C135205y yVar) {
        C134556au a = this.f368125a.mo112132a(this.f368126b, yVar);
        C135157bb bbVar = this.f368125a;
        C62934bn builder = a.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134603u a2 = C69664n.m101061g((C134553ar) builder, "builder");
        C62934bn builder2 = a2.mo111832b().toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C134605w a3 = C69664n.m101061g((C134557av) builder2, "builder");
        Instant a4 = bbVar.f368138d.mo57444a();
        C69664n.m101060f(a4, "timeSource.now()");
        a3.mo111837b(C62949a.m95467b(a4));
        a2.mo111835e(a3.mo111836a());
        Instant a5 = bbVar.f368138d.mo57444a();
        C69664n.m101060f(a5, "timeSource.now()");
        a2.mo111833c(C62949a.m95467b(a5));
        yVar.mo112165c(this.f368125a.f368141g, a2.mo111831a());
        return C69788q.f186170a;
    }
}
