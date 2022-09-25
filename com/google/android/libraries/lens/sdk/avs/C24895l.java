package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.common.text.C24136l;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.RenderableGleam;
import com.google.android.libraries.lens.sdk.avs.data.RenderableParagraph;
import com.google.android.libraries.lens.sdk.avs.p2040b.p2041a.C24858a;
import com.google.android.libraries.lens.sdk.avs.p2040b.p2041a.C24859b;
import com.google.android.libraries.lens.sdk.avs.p2040b.p2041a.C24860c;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24864c;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25348x;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62475cy;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62947c;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.sdk.avs.l */
/* compiled from: PG */
final class C24895l implements C24209al {

    /* renamed from: a */
    final /* synthetic */ C24876k f67995a;

    /* renamed from: b */
    final /* synthetic */ C24901r f67996b;

    public C24895l(C24876k kVar, C24901r rVar) {
        this.f67995a = kVar;
        this.f67996b = rVar;
    }

    /* renamed from: a */
    public final void mo29702a(Throwable th) {
    }

    /* renamed from: b */
    public final void mo29703b(C24208ak akVar) {
    }

    /* renamed from: c */
    public final void mo29704c(C24208ak akVar) {
        C62445bv bvVar;
        ((C58970a) ((C58970a) C24896m.f67997a.mo56224b()).mo56372aa(48877)).mo56386p("onUpdate");
        C24876k kVar = this.f67995a;
        C24877l lVar = null;
        boolean z = false;
        if (akVar.mo29700f() && akVar.mo29696a().mo29747n()) {
            C56220aa j = akVar.mo29696a().mo29743j();
            ((C58970a) ((C58970a) C24896m.f67997a.mo56224b()).mo56372aa(48878)).mo56386p("Process gleam response.");
            lVar = new C24877l();
            ArrayList arrayList = new ArrayList();
            for (C56327y yVar : j.f149750a) {
                C56324v vVar = yVar.f150144g;
                if (vVar == null) {
                    vVar = C56324v.f150122c;
                }
                C56323u a = C56323u.m87968a(vVar.f150125b);
                if (a == null) {
                    a = C56323u.GLEAM;
                }
                if (!(a == C56323u.NONE || a == C56323u.TEXT_GLEAM)) {
                    C25348x xVar = (C25348x) C25308ap.f68839y.createBuilder();
                    C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
                    if (yVar.f150139b == 7) {
                        bvVar = (C62445bv) yVar.f150140c;
                    } else {
                        bvVar = C62445bv.f168618e;
                    }
                    C62441br brVar = bvVar.f168621b;
                    if (brVar == null) {
                        brVar = C62441br.f168608h;
                    }
                    buVar.copyOnWrite();
                    C62445bv bvVar2 = (C62445bv) buVar.instance;
                    brVar.getClass();
                    bvVar2.f168621b = brVar;
                    bvVar2.f168620a |= 1;
                    C62445bv bvVar3 = (C62445bv) buVar.build();
                    xVar.copyOnWrite();
                    bvVar3.getClass();
                    ((C25308ap) xVar.instance).f68847h = bvVar3;
                    arrayList.add(new RenderableGleam((C25308ap) xVar.build()));
                }
            }
            lVar.mo30095d((RenderableGleam[]) arrayList.toArray(new RenderableGleam[0]));
            ArrayList arrayList2 = new ArrayList();
            for (C56327y yVar2 : j.f149750a) {
                for (C56320r rVar : yVar2.f150143f) {
                    C56310h hVar = rVar.f150100g;
                    if (hVar == null) {
                        hVar = C56310h.f150072g;
                    }
                    if ((hVar.f150074a & 1) != 0) {
                        C56310h hVar2 = rVar.f150100g;
                        if (hVar2 == null) {
                            hVar2 = C56310h.f150072g;
                        }
                        C56235ap apVar = hVar2.f150077d;
                        if (apVar == null) {
                            apVar = C56235ap.f149780e;
                        }
                        String str = C62219be.f167986j.f167991d;
                        C58485gu guVar = (C58485gu) Collection.EL.stream(apVar.f149783b).map(C24858a.f67911a).collect(C58370cn.f155946a);
                        C24136l lVar2 = (C24136l) C24137m.f65898g.createBuilder();
                        lVar2.copyOnWrite();
                        str.getClass();
                        ((C24137m) lVar2.instance).f65905f = str;
                        int b = C62475cy.m94782b(apVar.f149785d);
                        if (b == 0) {
                            b = 2;
                        }
                        lVar2.copyOnWrite();
                        ((C24137m) lVar2.instance).f65902c = C62475cy.m94781a(b);
                        lVar2.copyOnWrite();
                        C24137m mVar = (C24137m) lVar2.instance;
                        mVar.mo29543a();
                        C62947c.addAll((Iterable) guVar, (List) mVar.f65900a);
                        String str2 = (String) Collection.EL.stream(guVar).map(C24859b.f67912a).filter(C24860c.f67913a).collect(Collectors.joining(" "));
                        lVar2.copyOnWrite();
                        str2.getClass();
                        ((C24137m) lVar2.instance).f65904e = str2;
                        arrayList2.add(new RenderableParagraph((C24137m) lVar2.build()));
                    }
                }
            }
            lVar.f67960a.putParcelableArray("paragraphs", (RenderableParagraph[]) arrayList2.toArray(new RenderableParagraph[0]));
            if (kVar.f67959a.containsKey("session_id")) {
                String c = kVar.mo30089c();
                c.getClass();
                lVar.mo30097f(c);
            }
            if (kVar.f67959a.containsKey("query_id")) {
                lVar.mo30096e(kVar.mo30087a());
            }
        }
        if (lVar != null) {
            C24901r rVar2 = this.f67996b;
            C58974d dVar = C24902s.f68013a;
            rVar2.f68012b.f68017d.get();
            C24902s sVar = rVar2.f68012b;
            if (sVar.f68015b) {
                if (sVar.f68017d.get() > 0) {
                    z = true;
                }
                lVar.mo30094c(z);
            } else {
                lVar.mo30094c(true);
            }
            lVar.mo30098g(2);
            rVar2.f68012b.f68017d.incrementAndGet();
            rVar2.f68011a.mo30134a(C24864c.m46002a("QueryResult", lVar.f67960a));
        }
    }
}
