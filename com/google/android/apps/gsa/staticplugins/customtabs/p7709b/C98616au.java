package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.content.Intent;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.h.h.a;
import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p395al.p417d.p418a.C8577d;
import com.google.p4017at.p4060h.p4061a.p4062a.C54144d;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54122u;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.au */
/* compiled from: PG */
final class C98616au implements C98620c {

    /* renamed from: a */
    final /* synthetic */ RemoteViews f275444a;

    /* renamed from: b */
    final /* synthetic */ boolean f275445b;

    /* renamed from: c */
    final /* synthetic */ c f275446c;

    /* renamed from: d */
    final /* synthetic */ C54120s f275447d;

    /* renamed from: e */
    final /* synthetic */ C28293k f275448e;

    public C98616au(RemoteViews remoteViews, boolean z, c cVar, C54120s sVar, C28293k kVar) {
        this.f275444a = remoteViews;
        this.f275445b = z;
        this.f275446c = cVar;
        this.f275447d = sVar;
        this.f275448e = kVar;
    }

    /* renamed from: a */
    public final Intent mo91223a() {
        if (this.f275445b) {
            C58976aa aaVar = C58975e.f156826a;
            return a.a(this.f275446c);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return a.a(this.f275447d);
    }

    /* renamed from: b */
    public final RemoteViews mo91224b() {
        return this.f275444a;
    }

    /* renamed from: c */
    public final void mo91225c() {
        C58976aa aaVar = C58975e.f156826a;
        C60321oe b = C28285c.m52875b(this.f275448e, 472);
        if (b != null) {
            C60320od odVar = (C60320od) b.toBuilder();
            C54120s sVar = this.f275447d;
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
                rVar.f162927a |= 1;
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
                C59104x c = C98617av.f275449a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BottomBarFactory");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19181)).mo56386p("Failed to log client event");
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1303;
            C54098av avVar2 = this.f275447d.f142012c;
            if (avVar2 == null) {
                avVar2 = C54098av.f141935j;
            }
            long j = avVar2.f141939c;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164252g |= 268435456;
            ufVar2.f164192bt = j;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) odVar.build(), (C63196b) null, (String) null);
        }
    }
}
