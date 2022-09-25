package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.search.p7138b.C90486b;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7174l.C91053a;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7602db;
import com.google.p375ai.p378b.C7604dd;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7965qn;
import com.google.p375ai.p378b.C7967qp;
import com.google.p375ai.p378b.C7969qr;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.ah */
/* compiled from: PG */
public final class C91679ah implements C91680ai {

    /* renamed from: a */
    private final C91643a f255675a;

    /* renamed from: b */
    private final C58833ax f255676b;

    public C91679ah(C91643a aVar, C58833ax axVar) {
        this.f255675a = aVar;
        this.f255676b = axVar;
    }

    /* renamed from: a */
    public final C90491g mo86158a(C7605de deVar) {
        Object obj;
        C55349pb pbVar;
        C90489e eVar = (C90489e) C90491g.f252884z.createBuilder();
        int a = C7602db.m22787a(deVar.f26283m);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = i != 2 ? i != 3 ? 0 : 2 : 1;
        eVar.copyOnWrite();
        C90491g gVar = (C90491g) eVar.instance;
        gVar.f252886a |= 16384;
        gVar.f252900o = i2;
        if ((deVar.f26271a & 2) != 0) {
            C7805kp kpVar = deVar.f26273c;
            if (kpVar == null) {
                kpVar = C7805kp.f27284h;
            }
            C63088z m = C90772bp.m148305m(C91966aq.m150921a(kpVar));
            eVar.copyOnWrite();
            C90491g gVar2 = (C90491g) eVar.instance;
            m.getClass();
            gVar2.f252886a = 1 | gVar2.f252886a;
            gVar2.f252887b = m;
        }
        if ((deVar.f26271a & 4) != 0) {
            String str = deVar.f26274d;
            eVar.copyOnWrite();
            C90491g gVar3 = (C90491g) eVar.instance;
            str.getClass();
            gVar3.f252886a = 2 | gVar3.f252886a;
            gVar3.f252888c = str;
        }
        if ((deVar.f26271a & 8) != 0) {
            String str2 = deVar.f26275e;
            eVar.copyOnWrite();
            C90491g gVar4 = (C90491g) eVar.instance;
            str2.getClass();
            gVar4.f252886a |= 4;
            gVar4.f252889d = str2;
        }
        if ((deVar.f26271a & 16) != 0) {
            String str3 = deVar.f26276f;
            eVar.copyOnWrite();
            C90491g gVar5 = (C90491g) eVar.instance;
            str3.getClass();
            gVar5.f252886a |= 64;
            gVar5.f252892g = str3;
        }
        if ((deVar.f26271a & 32) != 0) {
            String str4 = deVar.f26277g;
            eVar.copyOnWrite();
            C90491g gVar6 = (C90491g) eVar.instance;
            str4.getClass();
            gVar6.f252886a |= 256;
            gVar6.f252894i = str4;
        }
        if ((deVar.f26271a & 512) != 0) {
            String str5 = deVar.f26281k;
            eVar.copyOnWrite();
            C90491g gVar7 = (C90491g) eVar.instance;
            str5.getClass();
            gVar7.f252886a |= 512;
            gVar7.f252895j = str5;
        }
        if ((deVar.f26271a & 8192) != 0) {
            String str6 = deVar.f26285o;
            eVar.copyOnWrite();
            C90491g gVar8 = (C90491g) eVar.instance;
            str6.getClass();
            gVar8.f252886a |= 1024;
            gVar8.f252896k = str6;
        }
        if ((deVar.f26271a & 1024) != 0) {
            String str7 = deVar.f26282l;
            eVar.copyOnWrite();
            C90491g gVar9 = (C90491g) eVar.instance;
            str7.getClass();
            gVar9.f252886a |= 2048;
            gVar9.f252897l = str7;
        }
        int i3 = deVar.f26271a;
        if ((i3 & 2) == 0 && (i3 & 4) == 0 && (i3 & 8) == 0 && (i3 & 16) == 0 && (i3 & 32) == 0 && (i3 & 512) == 0 && (i3 & 8192) == 0 && (i3 & 64) != 0) {
            C7604dd ddVar = deVar.f26278h;
            if (ddVar == null) {
                ddVar = C7604dd.f26266a;
            }
            C62940bt r2 = C62942bv.checkIsLite(C7967qp.f27988c);
            ddVar.mo58887l(r2);
            Object l = ddVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            C7969qr qrVar = ((C7967qp) obj).f27990a;
            if (qrVar == null) {
                qrVar = C7969qr.f27993b;
            }
            if (!qrVar.f27995a.isEmpty()) {
                C7965qn qnVar = (C7965qn) qrVar.f27995a.get(0);
                if (qnVar.f27984a == 11) {
                    pbVar = (C55349pb) qnVar.f27985b;
                } else {
                    pbVar = C55349pb.f145830g;
                }
                eVar.copyOnWrite();
                C90491g gVar10 = (C90491g) eVar.instance;
                pbVar.getClass();
                gVar10.f252901p = pbVar;
                gVar10.f252886a |= 32768;
            }
        }
        if ((deVar.f26271a & 128) != 0) {
            String a2 = C91053a.m148741a("and.now", deVar.f26279i);
            eVar.copyOnWrite();
            C90491g gVar11 = (C90491g) eVar.instance;
            gVar11.f252886a |= 4096;
            gVar11.f252898m = a2;
        }
        if ((deVar.f26271a & 256) != 0) {
            String str8 = deVar.f26280j;
            eVar.copyOnWrite();
            C90491g gVar12 = (C90491g) eVar.instance;
            str8.getClass();
            gVar12.f252886a |= 8192;
            gVar12.f252899n = str8;
        }
        if ((deVar.f26271a & 4096) != 0) {
            boolean z = deVar.f26284n;
            eVar.copyOnWrite();
            C90491g gVar13 = (C90491g) eVar.instance;
            gVar13.f252886a |= 128;
            gVar13.f252893h = z;
        }
        if ((deVar.f26271a & 16384) != 0) {
            boolean z2 = deVar.f26286p;
            eVar.copyOnWrite();
            C90491g gVar14 = (C90491g) eVar.instance;
            gVar14.f252886a |= 65536;
            gVar14.f252902q = z2;
        }
        if ((deVar.f26271a & 32768) != 0) {
            String str9 = deVar.f26287q;
            eVar.copyOnWrite();
            C90491g gVar15 = (C90491g) eVar.instance;
            str9.getClass();
            gVar15.f252886a |= C89885b.S3REQUEST_VALUE;
            gVar15.f252903r = str9;
        }
        if (deVar.f26288r.size() > 0) {
            Map unmodifiableMap = Collections.unmodifiableMap(deVar.f26288r);
            eVar.copyOnWrite();
            C90491g gVar16 = (C90491g) eVar.instance;
            C62995dn dnVar = gVar16.f252910y;
            if (!dnVar.f170058b) {
                gVar16.f252910y = dnVar.mo58980a();
            }
            gVar16.f252910y.putAll(unmodifiableMap);
        }
        if (this.f255676b.mo56113h()) {
            C90486b bVar = (C90486b) this.f255676b.mo56107c();
            eVar.copyOnWrite();
            C90491g gVar17 = (C90491g) eVar.instance;
            bVar.getClass();
            gVar17.f252908w = bVar;
            gVar17.f252886a |= 4194304;
        }
        return (C90491g) eVar.build();
    }

    /* renamed from: b */
    public final void mo86157b(C9141ad adVar) {
        C58838bb.m90869d((adVar.f31535a & 64) != 0, "ClientAction must have an SearchAction to invoke handler.");
        C7605de deVar = adVar.f31543i;
        if (deVar == null) {
            deVar = C7605de.f26269s;
        }
        this.f255675a.mo85916a(deVar.f26272b, mo86158a(deVar));
    }
}
