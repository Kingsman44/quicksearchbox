package com.google.android.apps.gsa.smartspace.p7257a;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50709au;
import com.google.assistant.p3886c.C50710av;
import com.google.assistant.p3886c.C50736ba;
import com.google.assistant.p3886c.C50737bb;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60948g;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.smartspace.a.d */
/* compiled from: PG */
public final /* synthetic */ class C92022d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C83802r f256551a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f256552b;

    public /* synthetic */ C92022d(C83802r rVar, C86124t tVar) {
        this.f256551a = rVar;
        this.f256552b = tVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C50731p pVar;
        C50737bb bbVar;
        C83802r rVar = this.f256551a;
        C86124t tVar = this.f256552b;
        C58833ax b = ((C58833ax) obj).mo56106b(C92019a.f256547a);
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        if (!rVar.mo77094d().mo56113h()) {
            return C58836b.f156633a;
        }
        C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56107c();
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        C50794cr a2 = C92025g.m151032a(a);
        int hashCode = bcVar.f132038e.hashCode();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
        doVar.f132307d = hashCode;
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = bcVar.f132037d;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50723h hVar2 = (C50723h) aVar.build();
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        hVar2.getClass();
        czVar.f132239b = hVar2;
        czVar.f132238a |= 1;
        C50802cz czVar2 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        czVar2.getClass();
        doVar2.f132309f = czVar2;
        doVar2.f132304a |= 16;
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        C50710av avVar = bcVar.f132039f;
        if (avVar == null) {
            avVar = C50710av.f131964d;
        }
        int a3 = C50709au.m85889a(avVar.f131967b);
        if (a3 != 0 && a3 == 2) {
            C50710av avVar2 = bcVar.f132039f;
            if (avVar2 == null) {
                avVar2 = C50710av.f131964d;
            }
            String str2 = avVar2.f131968c;
            mVar.copyOnWrite();
            C50729n nVar = (C50729n) mVar.instance;
            str2.getClass();
            nVar.f132009a |= 4;
            nVar.f132011c = str2;
        }
        if (b.mo56113h()) {
            C63088z zVar = (C63088z) b.mo56107c();
            mVar.copyOnWrite();
            C50729n nVar2 = (C50729n) mVar.instance;
            zVar.getClass();
            nVar2.f132009a |= 16;
            nVar2.f132013e = zVar;
        }
        C50729n nVar3 = (C50729n) mVar.build();
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        nVar3.getClass();
        doVar3.f132314k = nVar3;
        doVar3.f132304a |= 512;
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        if (bcVar.f132035b == 7) {
            int a4 = C50736ba.m85913a(((C50737bb) bcVar.f132036c).f132031c);
            if (a4 == 0) {
                a4 = 1;
            }
            C50794cr crVar = C50794cr.UNDEFINED;
            int i = a4 - 1;
            if (i == 1) {
                pVar = C50731p.BROADCAST;
            } else if (i != 2) {
                pVar = C50731p.UNDEFINED;
            } else {
                pVar = C50731p.START_ACTIVITY;
            }
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            rVar2.f132024b = pVar.f132020d;
            rVar2.f132023a |= 1;
            if (bcVar.f132035b == 7) {
                bbVar = (C50737bb) bcVar.f132036c;
            } else {
                bbVar = C50737bb.f132027d;
            }
            String str3 = bbVar.f132030b;
            qVar.copyOnWrite();
            C50733r rVar3 = (C50733r) qVar.instance;
            str3.getClass();
            rVar3.f132023a |= 2;
            rVar3.f132025c = str3;
        }
        C50733r rVar4 = (C50733r) qVar.build();
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        rVar4.getClass();
        doVar4.f132316m = rVar4;
        doVar4.f132304a |= 2048;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        doVar5.f132315l = a2.f132222T;
        doVar5.f132304a |= 1024;
        int ordinal = a2.ordinal();
        if (!(ordinal == 7 || ordinal == 10 || ordinal == 30)) {
            switch (ordinal) {
                case 42:
                case 43:
                case 44:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        z = false;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132304a |= 524288;
        doVar6.f132324u = z;
        C50792cp cpVar = C50792cp.OTHER;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        doVar7.f132306c = cpVar.f132174e;
        doVar7.f132304a |= 2;
        if (tVar.mo79746e(C90017bw.f247870L)) {
            C92025g.m151038g(cnVar);
        }
        C58976aa aaVar = C58975e.f156826a;
        int i2 = bcVar.f132040g;
        if ((bcVar.f132034a & 16) != 0) {
            C49156z zVar2 = bcVar.f132041h;
            if (zVar2 == null) {
                zVar2 = C49156z.f127111d;
            }
            C63042fg fgVar = zVar2.f127114b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            long c = C62953e.m95478c(fgVar);
            cnVar.copyOnWrite();
            C50818do doVar8 = (C50818do) cnVar.instance;
            doVar8.f132304a |= 4096;
            doVar8.f132317n = c;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            C63042fg fgVar2 = zVar2.f127115c;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            long c2 = C62953e.m95478c(fgVar2);
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = c2;
            cnVar.copyOnWrite();
            C50818do doVar9 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar9.f132320q = ctVar2;
            doVar9.f132304a |= 32768;
            C63042fg fgVar3 = zVar2.f127114b;
            if (fgVar3 == null) {
                fgVar3 = C63042fg.f170152c;
            }
            long c3 = C62953e.m95478c(fgVar3);
            cnVar.copyOnWrite();
            C50818do doVar10 = (C50818do) cnVar.instance;
            doVar10.f132304a |= 8192;
            doVar10.f132318o = c3;
            C63042fg fgVar4 = zVar2.f127114b;
            if (fgVar4 == null) {
                fgVar4 = C63042fg.f170152c;
            }
            C63042fg fgVar5 = zVar2.f127115c;
            if (fgVar5 == null) {
                fgVar5 = C63042fg.f170152c;
            }
            long d = C62948a.m95453d(C62953e.m95480e(fgVar4, fgVar5));
            cnVar.copyOnWrite();
            C50818do doVar11 = (C50818do) cnVar.instance;
            doVar11.f132304a |= 16384;
            doVar11.f132319p = d;
        } else {
            C60948g gVar = C60948g.f165068a;
            Instant now = Instant.now();
            Duration ofMinutes = Duration.ofMinutes(30);
            long epochMilli = now.toEpochMilli();
            cnVar.copyOnWrite();
            C50818do doVar12 = (C50818do) cnVar.instance;
            doVar12.f132304a |= 4096;
            doVar12.f132317n = epochMilli;
            C50795cs csVar2 = (C50795cs) C50796ct.f132223c.createBuilder();
            long epochMilli2 = now.plus(ofMinutes).toEpochMilli();
            csVar2.copyOnWrite();
            C50796ct ctVar3 = (C50796ct) csVar2.instance;
            ctVar3.f132225a |= 1;
            ctVar3.f132226b = epochMilli2;
            cnVar.copyOnWrite();
            C50818do doVar13 = (C50818do) cnVar.instance;
            C50796ct ctVar4 = (C50796ct) csVar2.build();
            ctVar4.getClass();
            doVar13.f132320q = ctVar4;
            doVar13.f132304a = 32768 | doVar13.f132304a;
            long epochMilli3 = now.toEpochMilli();
            cnVar.copyOnWrite();
            C50818do doVar14 = (C50818do) cnVar.instance;
            doVar14.f132304a |= 8192;
            doVar14.f132318o = epochMilli3;
            long millis = ofMinutes.toMillis();
            cnVar.copyOnWrite();
            C50818do doVar15 = (C50818do) cnVar.instance;
            doVar15.f132304a |= 16384;
            doVar15.f132319p = millis;
        }
        return C58833ax.m90834k((C50818do) cnVar.build());
    }
}
