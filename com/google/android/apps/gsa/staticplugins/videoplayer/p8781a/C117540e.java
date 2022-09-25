package com.google.android.apps.gsa.staticplugins.videoplayer.p8781a;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6519al.p6552ap.C84718a;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90211b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91879c;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117547a;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117550d;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117551e;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117552f;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.a.e */
/* compiled from: PG */
public final class C117540e extends C23056g implements C117547a {

    /* renamed from: a */
    private static final C59071e f326262a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.videoplayer.a.e");

    /* renamed from: b */
    private final C117550d f326263b;

    /* renamed from: c */
    private final C91097g f326264c;

    /* renamed from: d */
    private final C68214a f326265d;

    /* renamed from: e */
    private final C86124t f326266e;

    /* renamed from: f */
    private final C86106b f326267f;

    /* renamed from: g */
    private final C91863e f326268g;

    /* renamed from: h */
    private final C91866h f326269h;

    public C117540e(C23052c cVar, C117550d dVar, C91097g gVar, C23058i iVar, C68214a aVar, C86106b bVar, C91863e eVar, C91866h hVar, C86124t tVar) {
        super(cVar);
        this.f326263b = dVar;
        this.f326264c = gVar;
        this.f326265d = aVar;
        this.f326266e = tVar;
        this.f326267f = bVar;
        this.f326268g = eVar;
        this.f326269h = hVar;
        iVar.mo28500a(cVar, new C117539d(dVar));
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if (str.equals("EVENT_GOOGLE_ANALYTICS")) {
            C91879c cVar = (C91879c) C23245b.m43557b((ProtoParcelable) parcelable, C91879c.f256200f.getParserForType(), C62921ba.m95368a(), true);
            if (cVar == null) {
                C59104x c = f326262a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ThirdPartyOneTapControl");
                ((C59052c) ((C59052c) c).mo56372aa(33559)).mo56386p("Got null Google Analytics data.");
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            if ((cVar.f256202a & 8) != 0) {
                ((C84718a) this.f326265d.mo27525b()).mo78441b(cVar.f256203b, cVar.f256204c, cVar.f256205d, cVar.f256206e);
            } else {
                ((C84718a) this.f326265d.mo27525b()).mo78440a(cVar.f256203b, cVar.f256204c, cVar.f256205d);
            }
        }
    }

    /* renamed from: e */
    public final void mo103366e(C54806z zVar) {
        C7718hj hjVar = ((C117552f) ((C23251a) this.f326263b.mo103360d()).f63720e).f326305j;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26955a & 128) != 0) {
            C8142xb a = C8142xb.m22954a(((C117552f) ((C23251a) this.f326263b.mo103360d()).f63720e).f326306k);
            if (a == null) {
                a = C8142xb.UNKNOWN_SURFACE;
            }
            C57057b c = this.f326269h.mo86390c(hjVar, a, this.f326266e);
            C91866h hVar = this.f326269h;
            C8178yk ykVar = hjVar.f26973n;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            C7709ha haVar = hjVar.f26972m;
            if (haVar == null) {
                haVar = C7709ha.f26910f;
            }
            C8178yk b = hVar.mo86389b(ykVar, haVar);
            if (b != null) {
                this.f326268g.mo86384a(b, this.f326267f.mo79727b(), c, zVar);
                return;
            }
            return;
        }
        C59104x d = f326262a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ThirdPartyOneTapControl");
        ((C59052c) ((C59052c) d).mo56372aa(33558)).mo56386p("Null VE info. Cannot populate eventId.");
    }

    /* renamed from: f */
    public final void mo103367f(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f326264c.mo65089a(intent);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90211b bVar = (C90211b) C23245b.m43557b(protoParcelable, C90211b.f252001n.getParserForType(), C62921ba.m95368a(), true);
        bVar.getClass();
        C58838bb.m90883r((bVar.f252003a & 2) != 0);
        C117551e eVar = (C117551e) C117552f.f326294l.createBuilder();
        long j = bVar.f252005c;
        eVar.copyOnWrite();
        C117552f fVar = (C117552f) eVar.instance;
        fVar.f326296a = 1 | fVar.f326296a;
        fVar.f326297b = j;
        long j2 = bVar.f252009g;
        eVar.copyOnWrite();
        C117552f fVar2 = (C117552f) eVar.instance;
        fVar2.f326296a |= 2;
        fVar2.f326298c = j2;
        C9212cu cuVar = bVar.f252011i;
        if (cuVar == null) {
            cuVar = C9212cu.f31820l;
        }
        eVar.copyOnWrite();
        C117552f fVar3 = (C117552f) eVar.instance;
        cuVar.getClass();
        fVar3.f326299d = cuVar;
        fVar3.f326296a |= 4;
        float f = bVar.f252012j;
        eVar.copyOnWrite();
        C117552f fVar4 = (C117552f) eVar.instance;
        fVar4.f326296a |= 8;
        fVar4.f326300e = f;
        C62971cq cqVar = bVar.f252006d;
        eVar.copyOnWrite();
        C117552f fVar5 = (C117552f) eVar.instance;
        C62971cq cqVar2 = fVar5.f326301f;
        if (!cqVar2.mo58948c()) {
            fVar5.f326301f = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) fVar5.f326301f);
        C62971cq cqVar3 = bVar.f252007e;
        eVar.copyOnWrite();
        C117552f fVar6 = (C117552f) eVar.instance;
        C62971cq cqVar4 = fVar6.f326302g;
        if (!cqVar4.mo58948c()) {
            fVar6.f326302g = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) cqVar3, (List) fVar6.f326302g);
        C62971cq cqVar5 = bVar.f252008f;
        eVar.copyOnWrite();
        C117552f fVar7 = (C117552f) eVar.instance;
        C62971cq cqVar6 = fVar7.f326303h;
        if (!cqVar6.mo58948c()) {
            fVar7.f326303h = C62942bv.mutableCopy(cqVar6);
        }
        C62947c.addAll((Iterable) cqVar5, (List) fVar7.f326303h);
        String str = bVar.f252010h;
        eVar.copyOnWrite();
        C117552f fVar8 = (C117552f) eVar.instance;
        str.getClass();
        fVar8.f326296a |= 32;
        fVar8.f326304i = str;
        C7718hj hjVar = bVar.f252014l;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        eVar.copyOnWrite();
        C117552f fVar9 = (C117552f) eVar.instance;
        hjVar.getClass();
        fVar9.f326305j = hjVar;
        fVar9.f326296a |= 64;
        C8142xb a = C8142xb.m22954a(bVar.f252015m);
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        eVar.copyOnWrite();
        C117552f fVar10 = (C117552f) eVar.instance;
        fVar10.f326306k = a.f28649u;
        fVar10.f326296a |= 128;
        ((C23251a) this.f326263b.mo103358b()).mo28730f(15000, false);
        ((C23251a) this.f326263b.mo103360d()).mo28730f((C117552f) eVar.build(), false);
        ((C23251a) this.f326263b.mo103359c()).mo28730f(bVar.f252010h, false);
    }
}
