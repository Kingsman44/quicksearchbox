package com.google.android.libraries.search.rendering.xuikit.p3097a;

import android.databinding.C0118a;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3135d.C40346e;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40458b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.aa */
/* compiled from: PG */
public final class C39991aa {

    /* renamed from: a */
    private static final C58485gu f105124a = C58485gu.m89847o("google-sans", "google-sans-medium");

    /* renamed from: b */
    private static final C59071e f105125b = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.aa");

    /* renamed from: c */
    private final C40458b f105126c;

    /* renamed from: d */
    private final C40062d f105127d;

    /* renamed from: e */
    private final C40066f f105128e;

    /* renamed from: f */
    private final C40346e f105129f;

    /* renamed from: g */
    private final C40364q f105130g;

    public C39991aa(C40458b bVar, C40062d dVar, C40066f fVar, C40346e eVar, C40364q qVar) {
        this.f105126c = bVar;
        this.f105127d = dVar;
        this.f105128e = fVar;
        this.f105129f = eVar;
        this.f105130g = qVar;
    }

    /* renamed from: a */
    public final void mo42108a(C21196h hVar, C57784p pVar) {
        if ((pVar.f154384a & 1) != 0) {
            C58485gu guVar = f105124a;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                this.f105126c.mo42456c((String) guVar.get(i2));
            }
            this.f105129f.mo42409a();
            if ((pVar.f154384a & 2) != 0) {
                C40066f fVar = this.f105128e;
                C66184b bVar = pVar.f154386c;
                if (bVar == null) {
                    bVar = C66184b.f179967b;
                }
                fVar.mo42169b(bVar);
            }
            if ((pVar.f154384a & 4) != 0) {
                C40062d dVar = this.f105127d;
                C57776h hVar2 = pVar.f154387d;
                if (hVar2 == null) {
                    hVar2 = C57776h.f154365b;
                }
                dVar.mo42164a(hVar2);
            }
            C63070h hVar3 = pVar.f154385b;
            if (hVar3 == null) {
                hVar3 = C63070h.f170215c;
            }
            hVar.mo26215b(hVar3.f170218b.mo59174N());
            return;
        }
        C0118a.m108p(f105125b.mo56225c(), "xUIKit ElementsOutput doesn't contain an Element tree", 53297, C40364q.f106014a, this.f105130g.mo42422a());
    }
}
