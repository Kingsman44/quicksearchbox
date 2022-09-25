package com.google.android.apps.gsa.staticplugins.videoplayer.p8781a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90211b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91866h;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117547a;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117554h;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117555i;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
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
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.a.j */
/* compiled from: PG */
public final class C117545j extends C23056g implements C117547a {

    /* renamed from: a */
    private static final C59071e f326279a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.videoplayer.a.j");

    /* renamed from: b */
    private final C117554h f326280b;

    /* renamed from: c */
    private final C91097g f326281c;

    /* renamed from: d */
    private final C86124t f326282d;

    /* renamed from: e */
    private final C86106b f326283e;

    /* renamed from: f */
    private final C91863e f326284f;

    /* renamed from: g */
    private final C91866h f326285g;

    public C117545j(C23052c cVar, C117554h hVar, C91097g gVar, C86106b bVar, C91863e eVar, C91866h hVar2, C23058i iVar, C86124t tVar) {
        super(cVar);
        this.f326280b = hVar;
        this.f326281c = gVar;
        this.f326282d = tVar;
        this.f326283e = bVar;
        this.f326284f = eVar;
        this.f326285g = hVar2;
        iVar.mo28500a(cVar, new C117544i(hVar));
    }

    /* renamed from: e */
    public final void mo103366e(C54806z zVar) {
        C7718hj hjVar = ((C117556j) ((C23251a) this.f326280b.mo103365e()).f63720e).f326317h;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        if ((hjVar.f26955a & 128) != 0) {
            C8142xb a = C8142xb.m22954a(((C117556j) ((C23251a) this.f326280b.mo103365e()).f63720e).f326318i);
            if (a == null) {
                a = C8142xb.UNKNOWN_SURFACE;
            }
            C57057b c = this.f326285g.mo86390c(hjVar, a, this.f326282d);
            C91866h hVar = this.f326285g;
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
                this.f326284f.mo86384a(b, this.f326283e.mo79727b(), c, zVar);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f326279a.mo56226d()).mo56372aa(33562)).mo56386p("Null VE info. Cannot populate eventId.");
    }

    /* renamed from: f */
    public final void mo103367f(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f326281c.mo65089a(intent);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90211b bVar = (C90211b) C23245b.m43557b(protoParcelable, C90211b.f252001n.getParserForType(), C62921ba.m95368a(), true);
        bVar.getClass();
        C58838bb.m90883r(1 == (bVar.f252003a & 1));
        C58838bb.m90883r((bVar.f252003a & 2) != 0);
        C117555i iVar = (C117555i) C117556j.f326308j.createBuilder();
        String str = bVar.f252004b;
        iVar.copyOnWrite();
        C117556j jVar = (C117556j) iVar.instance;
        str.getClass();
        jVar.f326310a = 1 | jVar.f326310a;
        jVar.f326311b = str;
        long j = bVar.f252005c;
        iVar.copyOnWrite();
        C117556j jVar2 = (C117556j) iVar.instance;
        jVar2.f326310a |= 2;
        jVar2.f326312c = j;
        long j2 = bVar.f252009g;
        iVar.copyOnWrite();
        C117556j jVar3 = (C117556j) iVar.instance;
        jVar3.f326310a |= 4;
        jVar3.f326313d = j2;
        C62971cq cqVar = bVar.f252006d;
        iVar.copyOnWrite();
        C117556j jVar4 = (C117556j) iVar.instance;
        C62971cq cqVar2 = jVar4.f326314e;
        if (!cqVar2.mo58948c()) {
            jVar4.f326314e = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) jVar4.f326314e);
        C62971cq cqVar3 = bVar.f252007e;
        iVar.copyOnWrite();
        C117556j jVar5 = (C117556j) iVar.instance;
        C62971cq cqVar4 = jVar5.f326315f;
        if (!cqVar4.mo58948c()) {
            jVar5.f326315f = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) cqVar3, (List) jVar5.f326315f);
        C7718hj hjVar = bVar.f252014l;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        iVar.copyOnWrite();
        C117556j jVar6 = (C117556j) iVar.instance;
        hjVar.getClass();
        jVar6.f326317h = hjVar;
        jVar6.f326310a |= 16;
        C8142xb a = C8142xb.m22954a(bVar.f252015m);
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        iVar.copyOnWrite();
        C117556j jVar7 = (C117556j) iVar.instance;
        jVar7.f326318i = a.f28649u;
        jVar7.f326310a |= 32;
        if ((bVar.f252003a & 64) != 0) {
            String str2 = bVar.f252013k;
            iVar.copyOnWrite();
            C117556j jVar8 = (C117556j) iVar.instance;
            str2.getClass();
            jVar8.f326310a |= 8;
            jVar8.f326316g = str2;
        }
        ((C23251a) this.f326280b.mo103365e()).mo28730f((C117556j) iVar.build(), false);
        ((C23251a) this.f326280b.mo103362b()).mo28730f(bVar.f252010h, false);
        ((C23251a) this.f326280b.mo103364d()).mo28730f(Float.valueOf(bVar.f252012j), false);
    }
}
