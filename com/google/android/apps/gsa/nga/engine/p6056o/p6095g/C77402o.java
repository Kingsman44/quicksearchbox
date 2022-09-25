package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6137s.C77910h;
import com.google.android.apps.gsa.nga.engine.understanding.C78981ah;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.shared.android.C80939a;
import com.google.android.apps.gsa.nga.shared.android.C80947c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80372b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80376f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80380j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80381k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80382l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80384n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80385o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.o */
/* compiled from: PG */
public final class C77402o {

    /* renamed from: c */
    public static final /* synthetic */ int f213420c = 0;

    /* renamed from: d */
    private static final C58974d f213421d = C58974d.m91136j();

    /* renamed from: e */
    private static final C58528ij f213422e = C58528ij.m90012L(C80517f.ORIGINAL, C80517f.UNKNOWN, C80517f.UNRECOGNIZED);

    /* renamed from: a */
    public final C80947c f213423a;

    /* renamed from: b */
    public final C74965n f213424b;

    /* renamed from: f */
    private final t f213425f;

    /* renamed from: g */
    private final Optional f213426g;

    /* renamed from: h */
    private final C80939a f213427h;

    public C77402o(C80939a aVar, C80947c cVar, t tVar, C77910h hVar, C74965n nVar) {
        Optional optional;
        this.f213427h = aVar;
        this.f213423a = cVar;
        this.f213425f = tVar;
        List k = hVar.mo72886k(nVar.mo71336k());
        if (k.isEmpty()) {
            optional = Optional.empty();
        } else {
            C80380j jVar = (C80380j) C80381k.f220564b.createBuilder();
            C80386p pVar = ((C80413ae) k.get(0)).f220697h;
            C80377g gVar = (pVar == null ? C80386p.f220578g : pVar).f220583d;
            C80375e eVar = (gVar == null ? C80377g.f220548e : gVar).f220553d;
            eVar = eVar == null ? C80375e.f220543c : eVar;
            jVar.copyOnWrite();
            eVar.getClass();
            ((C80381k) jVar.instance).f220566a = eVar;
            optional = Optional.m71637of((C80381k) jVar.build());
        }
        this.f213426g = optional;
        this.f213424b = nVar;
    }

    /* renamed from: a */
    public final C80386p mo72540a(C77426t tVar) {
        C80373c cVar;
        C80373c cVar2;
        C80386p c = mo72542c(tVar.mo72525b());
        C80379i f = tVar.mo72530f();
        int a = C82919fh.m132428a(tVar.mo72527d().f225878c);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        C80401n e = tVar.mo72528e();
        C80372b bVar = (C80372b) mo72544e(f, a).toBuilder();
        C80372b bVar2 = (C80372b) C80373c.f220529m.createBuilder();
        boolean z2 = !C81442m.m129553o(e);
        bVar2.copyOnWrite();
        ((C80373c) bVar2.instance).f220531a = z2;
        if (!z2) {
            cVar = (C80373c) bVar2.build();
        } else {
            Stream stream = Collection.EL.stream(C81442m.m129544f(e));
            Objects.requireNonNull(this.f213425f);
            C58529ik ikVar = new C58529ik();
            for (Intent intent : (Iterable) stream.map(new C77391d()).filter(C77398k.f213415a).map(C77392e.f213409a).collect(Collectors.toList())) {
                ikVar.mo55495c(this.f213427h.mo74725b(intent, true), intent);
            }
            C58532in a2 = ikVar.mo55493a();
            if (a2.map.keySet().size() > 1) {
                ((C58970a) ((C58970a) f213421d.mo56225c()).mo56372aa(3880)).mo56389s("Fulfillment produced multiple intents with different packages: %s", new C58827ar(",").mo56097d((Iterable) Collection.EL.stream(a2.map.keySet()).map(C77396i.f213413a).collect(C58370cn.f155946a)));
            }
            Collection.EL.stream(a2.mo55465t()).forEach(new C77397j(bVar2));
            Collection.EL.stream(a2.map.keySet()).filter(C77398k.f213415a).map(C77399l.f213416a).forEach(new C77400m(this, bVar2));
            if (C81442m.m129549k(e, C80294ap.SEND_DIRECT_ACTION_OP).isPresent()) {
                bVar2.copyOnWrite();
                ((C80373c) bVar2.instance).f220532b = true;
            }
            if (C81442m.m129549k(e, C80294ap.SEND_DYNAMIC_ACTION_OP).isPresent()) {
                bVar2.copyOnWrite();
                ((C80373c) bVar2.instance).f220532b = true;
                bVar2.copyOnWrite();
                ((C80373c) bVar2.instance).f220542l = true;
            }
            cVar = (C80373c) bVar2.build();
        }
        boolean z3 = cVar.f220531a;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220531a = z3;
        if (a == 10803 || a == 11201 || a == 19003 || f.f220557a.contains("com.google.android.deskclock")) {
            cVar2 = (C80373c) bVar.build();
        } else {
            boolean z4 = cVar.f220535e;
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220535e = z4;
            boolean z5 = cVar.f220532b;
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220532b = z5;
            boolean z6 = cVar.f220533c;
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220533c = z6;
            if (!cVar.f220534d && !f.f220558b) {
                z = false;
            }
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220534d = z;
            boolean z7 = cVar.f220542l;
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220542l = z7;
            cVar2 = (C80373c) bVar.build();
        }
        C80371a aVar = (C80371a) c.toBuilder();
        aVar.copyOnWrite();
        cVar2.getClass();
        ((C80386p) aVar.instance).f220580a = cVar2;
        return (C80386p) aVar.build();
    }

    /* renamed from: b */
    public final C80386p mo72541b(C78981ah ahVar) {
        return mo72543d(ahVar.mo73741a(), ahVar.mo73743c());
    }

    /* renamed from: c */
    public final C80386p mo72542c(C78983aj ajVar) {
        if (ajVar.mo73747b().isPresent()) {
            return mo72543d(ajVar.mo73746a(), ajVar.mo73747b());
        }
        C80371a aVar = (C80371a) mo72543d(ajVar.mo73746a(), Optional.empty()).toBuilder();
        C80376f fVar = (C80376f) C80377g.f220548e.createBuilder();
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220550a = false;
        aVar.copyOnWrite();
        C80377g gVar = (C80377g) fVar.build();
        gVar.getClass();
        ((C80386p) aVar.instance).f220583d = gVar;
        return (C80386p) aVar.build();
    }

    /* renamed from: d */
    public final C80386p mo72543d(C74757n nVar, Optional optional) {
        C80371a aVar = (C80371a) C80386p.f220578g.createBuilder();
        Optional optional2 = this.f213426g;
        Objects.requireNonNull(aVar);
        optional2.ifPresent(new C77389b(aVar));
        C80384n nVar2 = (C80384n) C80385o.f220574c.createBuilder();
        double b = nVar.mo71149b();
        nVar2.copyOnWrite();
        ((C80385o) nVar2.instance).f220576a = b;
        boolean z = nVar.mo71161n().isPresent() && f213422e.contains(nVar.mo71160m().orElse(C80517f.UNKNOWN));
        nVar2.copyOnWrite();
        ((C80385o) nVar2.instance).f220577b = z;
        aVar.copyOnWrite();
        C80385o oVar = (C80385o) nVar2.build();
        oVar.getClass();
        ((C80386p) aVar.instance).f220581b = oVar;
        if (nVar.mo71160m().isPresent()) {
            double a = nVar.mo71148a();
            Optional j = nVar.mo71157j();
            boolean booleanValue = ((Boolean) nVar.mo71159l().orElse(false)).booleanValue();
            C80382l lVar = (C80382l) C80383m.f220568e.createBuilder();
            lVar.copyOnWrite();
            ((C80383m) lVar.instance).f220570a = ((C80517f) nVar.mo71160m().get()).getNumber();
            lVar.copyOnWrite();
            ((C80383m) lVar.instance).f220571b = a;
            lVar.copyOnWrite();
            ((C80383m) lVar.instance).f220573d = booleanValue;
            Optional map = j.map(C77401n.f213419a);
            Objects.requireNonNull(lVar);
            map.ifPresent(new C77390c(lVar));
            C80383m mVar = (C80383m) lVar.build();
            aVar.copyOnWrite();
            mVar.getClass();
            ((C80386p) aVar.instance).f220582c = mVar;
        }
        Optional map2 = optional.map(C77393f.f213410a);
        Objects.requireNonNull(aVar);
        map2.ifPresent(new C77394g(aVar));
        return (C80386p) aVar.build();
    }

    /* renamed from: e */
    public final C80373c mo72544e(C80379i iVar, int i) {
        C80372b bVar = (C80372b) C80373c.f220529m.createBuilder();
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220531a = true;
        boolean z = iVar.f220558b;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220534d = z;
        boolean z2 = iVar.f220559c;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220535e = z2;
        boolean z3 = iVar.f220560d;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220537g = z3;
        boolean z4 = iVar.f220561e;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220538h = z4;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220539i = i - 1;
        boolean z5 = iVar.f220562f;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220540j = z5;
        boolean z6 = iVar.f220563g;
        bVar.copyOnWrite();
        ((C80373c) bVar.instance).f220541k = z6;
        Optional o = this.f213424b.mo71340o();
        if (!this.f213424b.mo71340o().isPresent()) {
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220533c = true;
        } else if (iVar.f220557a.isEmpty() || iVar.f220557a.contains(o.get())) {
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220532b = true;
        } else {
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220533c = true;
        }
        if (i == 11201 || i == 19003) {
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220532b = true;
            bVar.copyOnWrite();
            ((C80373c) bVar.instance).f220533c = false;
            return (C80373c) bVar.build();
        }
        if (iVar.f220557a.contains("com.google.android.deskclock")) {
            if (this.f213424b.mo71340o().filter(C77395h.f213412a).isPresent()) {
                bVar.copyOnWrite();
                ((C80373c) bVar.instance).f220532b = true;
                bVar.copyOnWrite();
                ((C80373c) bVar.instance).f220533c = false;
            } else {
                bVar.copyOnWrite();
                ((C80373c) bVar.instance).f220532b = false;
                bVar.copyOnWrite();
                ((C80373c) bVar.instance).f220533c = true;
            }
        }
        return (C80373c) bVar.build();
    }
}
