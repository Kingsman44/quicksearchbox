package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133879g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p395al.p417d.p418a.C8577d;
import com.google.p4017at.p4060h.p4061a.p4062a.C54144d;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54122u;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a */
/* compiled from: PG */
final class C133872a {

    /* renamed from: c */
    private static final C59071e f364617c = C59071e.m91332i("com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a");

    /* renamed from: a */
    public final AtomicReference f364618a = new AtomicReference((Object) null);

    /* renamed from: b */
    public final AtomicBoolean f364619b = new AtomicBoolean(true);

    /* renamed from: d */
    private final C38750am f364620d;

    public C133872a(C38750am amVar) {
        this.f364620d = amVar;
    }

    /* renamed from: a */
    public final void mo111438a(C133879g gVar) {
        C28292j jVar = new C28292j(40997);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        C28292j jVar2 = new C28292j(79167);
        jVar2.mo33795i(5);
        jVar2.mo33794h(1);
        C60321oe b = C28285c.m52875b(C28293k.m52908e(jVar, C28293k.m52908e(jVar2, new C28293k[0])), 472);
        if (b != null) {
            C54120s sVar = gVar.f364640d;
            C60320od odVar = (C60320od) b.toBuilder();
            C54098av avVar = sVar.f142012c;
            if (avVar == null) {
                avVar = C54098av.f141935j;
            }
            C54122u uVar = avVar.f141942f;
            if (uVar == null) {
                uVar = C54122u.f142014h;
            }
            String str = uVar.f142017b;
            C54144d dVar = sVar.f142011b;
            if (dVar == null) {
                dVar = C54144d.f142090b;
            }
            C8577d dVar2 = dVar.f142092a;
            if (dVar2 == null) {
                dVar2 = C8577d.f29698b;
            }
            String str2 = dVar2.f29700a;
            try {
                C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                C60220t b2 = C28294l.m52912b(str2);
                qVar.copyOnWrite();
                C60218r rVar = (C60218r) qVar.instance;
                b2.getClass();
                rVar.f162928b = b2;
                rVar.f162927a = 1 | rVar.f162927a;
                C60218r rVar2 = (C60218r) qVar.build();
                aql aql = (aql) aqm.f159760n.createBuilder();
                aql.copyOnWrite();
                aqm aqm = (aqm) aql.instance;
                str.getClass();
                aqm.f159762a |= 2;
                aqm.f159764c = str;
                odVar.copyOnWrite();
                C60321oe oeVar = (C60321oe) odVar.instance;
                aqm aqm2 = (aqm) aql.build();
                aqm2.getClass();
                oeVar.f163230e = aqm2;
                oeVar.f163226a |= 16;
                odVar.copyOnWrite();
                C60321oe oeVar2 = (C60321oe) odVar.instance;
                oeVar2.f163231f = 3;
                oeVar2.f163226a |= 32;
                odVar.copyOnWrite();
                C60321oe oeVar3 = (C60321oe) odVar.instance;
                rVar2.getClass();
                oeVar3.f163229d = rVar2;
                oeVar3.f163226a |= 2;
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f364617c.mo56226d()).mo56382g(e)).mo56372aa(40162)).mo56386p("Unable to parse parent event");
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1303;
            C54098av avVar2 = sVar.f142012c;
            if (avVar2 == null) {
                avVar2 = C54098av.f141935j;
            }
            long j = avVar2.f141939c;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164252g |= 268435456;
            ufVar2.f164192bt = j;
            this.f364620d.mo41598j(C59743a.EXPLORE_ON_CONTENT_VISUAL_ELEMENTS_GRAFT_EVENT, tzVar, (C60321oe) odVar.build(), false);
        }
    }
}
