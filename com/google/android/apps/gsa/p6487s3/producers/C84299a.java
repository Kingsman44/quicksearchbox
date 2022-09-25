package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.opa.C83609f;
import com.google.android.apps.gsa.search.core.google.p6795e.C85977a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86159h;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90077eb;
import com.google.android.apps.gsa.shared.p7144t.p7145a.C90610a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.s3.producers.a */
/* compiled from: PG */
public final class C84299a extends C84320s {

    /* renamed from: a */
    private static final C59071e f229413a = C59071e.m91332i("com.google.android.apps.gsa.s3.producers.a");

    /* renamed from: d */
    private final C90931ca f229414d;

    /* renamed from: e */
    private final C86124t f229415e;

    /* renamed from: f */
    private final C86159h f229416f;

    /* renamed from: g */
    private final C84313l f229417g;

    /* renamed from: h */
    private final C85977a f229418h;

    /* renamed from: i */
    private final C58833ax f229419i;

    /* renamed from: j */
    private final C68214a f229420j;

    /* renamed from: k */
    private final C58833ax f229421k;

    public C84299a(C90931ca caVar, C86124t tVar, C86159h hVar, C84313l lVar, C85977a aVar, C58833ax axVar, C22871g gVar, C68214a aVar2, C58833ax axVar2) {
        super(caVar, gVar);
        this.f229414d = caVar;
        this.f229415e = tVar;
        this.f229416f = hVar;
        this.f229417g = lVar;
        this.f229418h = aVar;
        this.f229419i = axVar;
        this.f229420j = aVar2;
        this.f229421k = axVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo77838a(C61818k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.copyOnWrite();
        C54188e eVar = (C54188e) bVar.instance;
        kVar.getClass();
        eVar.f142207c = kVar;
        eVar.f142205a |= 2;
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        C54188e eVar2 = (C54188e) bVar.build();
        eVar2.getClass();
        dVar.f133251c = eVar2;
        dVar.f133249a |= 2;
        return (C51189d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo77839b(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.mo54074c(str, str2);
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        C54188e eVar = (C54188e) bVar.build();
        eVar.getClass();
        dVar.f133251c = eVar;
        dVar.f133249a |= 2;
        return (C51189d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77840c(C84326y yVar, List list, Query query) {
        C9318f fVar;
        if (!this.f229415e.mo79746e(C90077eb.f249793g) || !this.f229421k.mo56113h() || !((C74714bo) this.f229421k.mo56107c()).mo71081c()) {
            fVar = k.b(this.f229415e, query) ? C9318f.CONTEXTUAL : C9318f.VOICE;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            fVar = C9318f.LIGHTWEIGHT;
        }
        C9318f fVar2 = fVar;
        C58976aa aaVar2 = C58975e.f156826a;
        for (C60870cx cxVar : C84327z.m134528a(this.f229416f, this.f229415e, this.f229414d, fVar2, (int) this.f229415e.mo79743a(C90014bt.f247046K), this.f229420j)) {
            if (cxVar != null) {
                list.add(mo77858d(cxVar, yVar));
            } else {
                C59104x d = f229413a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ARUpdateHandler");
                ((C59052c) ((C59052c) d).mo56372aa(7233)).mo56386p("Assist Data future was null.");
            }
        }
        for (C60870cx d2 : C84327z.m134529b(this.f229416f, this.f229414d)) {
            list.add(mo77858d(d2, yVar));
        }
        if (this.f229419i.mo56113h()) {
            list.add(mo77858d(((C83609f) this.f229419i.mo56107c()).mo76968a(), yVar));
        }
        if (this.f229415e.mo79746e(C90014bt.f247523ik) && this.f229418h.mo79635f()) {
            C90931ca caVar = this.f229414d;
            C86159h hVar = this.f229416f;
            C85977a aVar = this.f229418h;
            if (aVar.mo79635f()) {
                list.add(mo77858d(caVar.mo85141f(((C90610a) ((C58833ax) aVar.f232485b.mo27525b()).mo56107c()).mo84759a(), new C84324w(hVar, aVar)), yVar));
            } else {
                C59104x c = C85977a.f232484a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TransactionsProtoFiller");
                ((C59052c) ((C59052c) c).mo56372aa(8182)).mo56386p("getClientTokenFuture called when there is no WalletClient.");
                throw new IllegalStateException("WalletClient is not available");
            }
        }
        list.addAll(this.f229417g.mo77856a(new C84316o(this, yVar), query));
    }
}
