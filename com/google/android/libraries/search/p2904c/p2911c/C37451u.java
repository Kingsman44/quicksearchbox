package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2907ab.C37337d;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37424a;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37431h;
import com.google.android.libraries.search.p2904c.p2942m.p2944b.C37876d;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.c.u */
/* compiled from: PG */
public final class C37451u implements C37337d {

    /* renamed from: a */
    private static final C59071e f99425a = C59071e.m91331h();

    /* renamed from: b */
    private final C37433c f99426b;

    /* renamed from: c */
    private final C37431h f99427c;

    public C37451u(C37433c cVar, C37431h hVar) {
        this.f99426b = cVar;
        this.f99427c = hVar;
    }

    /* renamed from: a */
    public final C37335b mo40892a(C37360ay ayVar) {
        C37335b bVar;
        C69664n.m101061g(ayVar, "params");
        C37433c cVar = this.f99426b;
        C69664n.m101061g(ayVar, "params");
        if (ayVar.f99236k) {
            bVar = cVar.mo40957c(ayVar, C58836b.f156633a);
        } else {
            bVar = cVar.mo40955a(ayVar);
        }
        C59052c cVar2 = (C59052c) f99425a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "ALT.AudioBufferProvider");
        String a = C37331f.m66337a(bVar);
        cVar2.mo56379ah(new C59094n(52685));
        cVar2.mo56389s("#audio# create writeable audio buffer(%s)", a);
        C37424a aVar = bVar instanceof C37424a ? (C37424a) bVar : null;
        if (aVar != null) {
            C37431h hVar = this.f99427c;
            ayVar.getClass();
            C37876d dVar = (C37876d) hVar.f99376a.mo17428b();
            dVar.getClass();
            aVar.mo40949e(new C37430g(ayVar, dVar));
        }
        return bVar;
    }
}
