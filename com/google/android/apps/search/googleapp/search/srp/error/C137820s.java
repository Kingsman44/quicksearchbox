package com.google.android.apps.search.googleapp.search.srp.error;

import com.google.android.apps.search.googleapp.p10318i.C136219h;
import com.google.android.libraries.web.contrib.errorpage.C43516d;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.s */
/* compiled from: PG */
final class C137820s implements C43516d {

    /* renamed from: a */
    final /* synthetic */ C137821t f374949a;

    public C137820s(C137821t tVar) {
        this.f374949a = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46581a() {
    }

    /* renamed from: b */
    public final void mo46582b(C43376u uVar, Optional optional) {
        Object obj;
        C43363h hVar = null;
        if (optional.isPresent()) {
            C43512b bVar = (C43512b) optional.get();
            C62940bt r5 = C62942bv.checkIsLite(C137825x.f374971a);
            bVar.mo58887l(r5);
            Object l = bVar.f169962ag.mo58854l(r5.f169971d);
            if (l == null) {
                obj = r5.f169969b;
            } else {
                obj = r5.mo58889c(l);
            }
            C137824w wVar = C137824w.ERROR_REQUEST_DATA_UNAVAILABLE;
            int ordinal = ((C137824w) obj).ordinal();
            if (ordinal == 0) {
                this.f374949a.mo113983b((C43363h) null, false);
            } else if (ordinal == 1) {
                C137821t tVar = this.f374949a;
                C136219h a = tVar.f374953c.mo112846a(12, tVar.f374952b, false);
                if (!a.equals(tVar.f374960j)) {
                    C69664n.m101060f(a, "cardArgs");
                    tVar.mo113982a(a);
                    tVar.f374960j = a;
                }
                tVar.f374954d.requireView().setVisibility(0);
            } else if (ordinal == 2) {
                C137821t tVar2 = this.f374949a;
                C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
                C69664n.m101060f(cVar, "newBuilder()");
                C69664n.m101061g(cVar, "builder");
                C43362g gVar = C43362g.CONNECTIVITY;
                C69664n.m101061g(gVar, "value");
                cVar.copyOnWrite();
                C43363h hVar2 = (C43363h) cVar.instance;
                hVar2.f113278b = gVar.f113274h;
                hVar2.f113277a |= 1;
                C62942bv build = cVar.build();
                C69664n.m101060f(build, "_builder.build()");
                tVar2.mo113983b((C43363h) build, true);
            }
        } else {
            C137821t tVar3 = this.f374949a;
            C43363h hVar3 = uVar.f113331d;
            if (hVar3 == null) {
                hVar3 = C43363h.f113275f;
            }
            if ((uVar.f113328a & 4) != 0) {
                hVar = hVar3;
            }
            tVar3.mo113983b(hVar, false);
        }
    }
}
