package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54193j;
import com.google.p4017at.p4060h.p4068b.p4069a.C54194k;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.s3.producers.e */
/* compiled from: PG */
public final class C84306e extends C84320s {

    /* renamed from: d */
    private static final C59071e f229438d = C59071e.m91332i("com.google.android.apps.gsa.s3.producers.e");

    /* renamed from: a */
    public C9318f f229439a;

    /* renamed from: e */
    private final C9318f f229440e;

    /* renamed from: f */
    private final C90931ca f229441f;

    /* renamed from: g */
    private final C86124t f229442g;

    /* renamed from: h */
    private final C86159h f229443h;

    /* renamed from: i */
    private final C68214a f229444i;

    public C84306e(C90931ca caVar, C86124t tVar, C86159h hVar, C22871g gVar, C68214a aVar) {
        super(caVar, gVar);
        C9318f fVar = C9318f.VOICE;
        this.f229440e = fVar;
        this.f229441f = caVar;
        this.f229442g = tVar;
        this.f229443h = hVar;
        this.f229444i = aVar;
        this.f229439a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77838a(C61818k kVar) {
        C54193j jVar = (C54193j) C54194k.f142224e.createBuilder();
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.copyOnWrite();
        C54188e eVar = (C54188e) bVar.instance;
        kVar.getClass();
        eVar.f142207c = kVar;
        eVar.f142205a |= 2;
        jVar.copyOnWrite();
        C54194k kVar2 = (C54194k) jVar.instance;
        C54188e eVar2 = (C54188e) bVar.build();
        eVar2.getClass();
        kVar2.f142229d = eVar2;
        kVar2.f142226a |= 4;
        return (C54194k) jVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo77839b(String str, String str2) {
        throw new UnsupportedOperationException("S3 updates for GWS header is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77840c(C84326y yVar, List list, Query query) {
        for (C60870cx cxVar : C84327z.m134528a(this.f229443h, this.f229442g, this.f229441f, this.f229439a, -1, this.f229444i)) {
            if (cxVar != null) {
                list.add(mo77858d(cxVar, yVar));
            } else {
                C59104x d = f229438d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GetRCRUpdateHandler");
                ((C59052c) ((C59052c) d).mo56372aa(7235)).mo56386p("Assist Data Future was null.");
            }
        }
        for (C60870cx d2 : C84327z.m134529b(this.f229443h, this.f229441f)) {
            list.add(mo77858d(d2, yVar));
        }
    }
}
