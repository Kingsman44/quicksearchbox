package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134553ar;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134557av;
import com.google.android.apps.search.googleapp.discover.p10214s.C134603u;
import com.google.android.apps.search.googleapp.discover.p10214s.C134605w;
import com.google.protobuf.C62934bn;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ak */
/* compiled from: PG */
final class C135139ak implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135157bb f368070a;

    /* renamed from: b */
    final /* synthetic */ String f368071b;

    /* renamed from: c */
    final /* synthetic */ List f368072c;

    public C135139ak(C135157bb bbVar, String str, List list) {
        this.f368070a = bbVar;
        this.f368071b = str;
        this.f368072c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112131a(C135205y yVar) {
        C134556au a = this.f368070a.mo112132a(this.f368071b, yVar);
        C135177bv a2 = C135176bu.m219240a(this.f368072c);
        List list = a2.f368200a;
        List list2 = a2.f368201b;
        C135157bb bbVar = this.f368070a;
        C62934bn builder = a.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134603u a3 = C69664n.m101061g((C134553ar) builder, "builder");
        C62934bn builder2 = a3.mo111832b().toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C134605w a4 = C69664n.m101061g((C134557av) builder2, "builder");
        Instant a5 = bbVar.f368138d.mo57444a();
        C69664n.m101060f(a5, "timeSource.now()");
        a4.mo111837b(C62949a.m95467b(a5));
        a4.mo111839d();
        a4.mo111838c(list);
        a3.mo111835e(a4.mo111836a());
        yVar.mo112165c(this.f368070a.f368141g, a3.mo111831a());
        yVar.mo112166d(this.f368070a.f368141g, C135138aj.m219167a(list2));
        return C69788q.f186170a;
    }
}
