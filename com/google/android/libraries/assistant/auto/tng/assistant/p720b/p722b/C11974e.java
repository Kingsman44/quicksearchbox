package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p722b;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11976b;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11978d;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11982h;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13316a;
import com.google.android.libraries.assistant.portable.p1586b.C19056a;
import com.google.android.libraries.assistant.portable.p1586b.C19062af;
import com.google.android.libraries.assistant.portable.p1586b.C19063ag;
import com.google.android.libraries.assistant.portable.p1586b.C19065ai;
import com.google.android.libraries.assistant.portable.p1586b.C19066aj;
import com.google.android.libraries.assistant.portable.p1586b.C19068al;
import com.google.android.libraries.assistant.portable.p1586b.C19069am;
import com.google.android.libraries.assistant.portable.p1586b.C19070b;
import com.google.android.libraries.assistant.portable.p1586b.C19076h;
import com.google.android.libraries.assistant.portable.p1586b.C19077i;
import com.google.android.libraries.assistant.portable.p1586b.C19080l;
import com.google.android.libraries.assistant.portable.p1586b.C19081m;
import com.google.android.libraries.assistant.portable.p1586b.C19082n;
import com.google.android.libraries.assistant.portable.p1586b.C19084p;
import com.google.android.libraries.assistant.portable.p1586b.C19086r;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.search.logging.p3034a.C38745ah;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.assistant.p3745ab.C48225ak;
import com.google.assistant.p3745ab.C48226al;
import com.google.assistant.p3745ab.C48227am;
import com.google.assistant.p3745ab.C48228an;
import com.google.assistant.p3745ab.C48292ct;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5281b.C67982c;
import com.google.p5277z.p5281b.C67983d;
import com.google.p5277z.p5281b.C67986g;
import com.google.p5277z.p5281b.C67988i;
import com.google.p5277z.p5281b.C67989j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.b.e */
/* compiled from: PG */
public final class C11974e {

    /* renamed from: a */
    private final C58974d f38450a = C58974d.m91135i("ClearcutLogger");

    /* renamed from: b */
    private final C38750am f38451b;

    /* renamed from: c */
    private final String f38452c;

    public C11974e(C38750am amVar, String str) {
        this.f38451b = amVar;
        this.f38452c = str;
    }

    /* renamed from: a */
    public final void mo20347a(C11978d dVar) {
        C48292ct ctVar;
        C19088t tVar;
        String str = dVar.f38473b;
        C11976b bVar = dVar.f38474c;
        if (bVar == null) {
            bVar = C11976b.f38453o;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        str.getClass();
        int i = 4;
        ufVar.f164093a |= 4;
        ufVar.f164259n = str;
        int i2 = 1453;
        if ((bVar.f38455a & 2048) != 0 && !bVar.f38468n) {
            i2 = 1630;
        }
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 2;
        ufVar2.f164258m = i2;
        C19065ai aiVar = (C19065ai) C19066aj.f53483e.createBuilder();
        C52431rm rmVar = C52431rm.OPA_ANDROID_AUTO;
        aiVar.copyOnWrite();
        C19066aj ajVar = (C19066aj) aiVar.instance;
        ajVar.f53486b = rmVar.f137633ah;
        ajVar.f53485a |= 1;
        C51209d dVar2 = C51209d.UNKNOWN_SOURCE;
        C11976b bVar2 = dVar.f38474c;
        if (bVar2 == null) {
            bVar2 = C11976b.f38453o;
        }
        C51209d a = C51209d.m86086a(bVar2.f38467m);
        if (a == null) {
            a = C51209d.UNKNOWN_SOURCE;
        }
        if (!dVar2.equals(a)) {
            C11976b bVar3 = dVar.f38474c;
            if (bVar3 == null) {
                bVar3 = C11976b.f38453o;
            }
            C51209d a2 = C51209d.m86086a(bVar3.f38467m);
            if (a2 == null) {
                a2 = C51209d.UNKNOWN_SOURCE;
            }
            aiVar.mo24282a(a2);
        }
        C19080l lVar = (C19080l) C19081m.f53515g.createBuilder();
        lVar.copyOnWrite();
        C19081m mVar = (C19081m) lVar.instance;
        C19066aj ajVar2 = (C19066aj) aiVar.build();
        ajVar2.getClass();
        mVar.f53519c = ajVar2;
        mVar.f53517a |= 8;
        C19087s sVar = (C19087s) C19088t.f53533p.createBuilder();
        String str2 = bVar.f38456b;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        str2.getClass();
        ufVar3.f164249d |= 64;
        ufVar3.f164133an = str2;
        sVar.copyOnWrite();
        C19088t tVar2 = (C19088t) sVar.instance;
        str2.getClass();
        tVar2.f53535a |= 1;
        tVar2.f53536b = str2;
        String str3 = bVar.f38459e;
        sVar.copyOnWrite();
        C19088t tVar3 = (C19088t) sVar.instance;
        str3.getClass();
        tVar3.f53535a |= 2;
        tVar3.f53537c = str3;
        C61752n nVar = bVar.f38457c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        sVar.copyOnWrite();
        C19088t tVar4 = (C19088t) sVar.instance;
        nVar.getClass();
        tVar4.f53540f = nVar;
        tVar4.f53535a |= 16;
        C19062af afVar = (C19062af) C19063ag.f53477c.createBuilder();
        int a3 = C11982h.m27853a(bVar.f38458d);
        if (a3 != 0 && a3 == 2) {
            ctVar = C48292ct.SUCCESS;
        } else {
            ctVar = C48292ct.ERROR_FAILED_INTERNAL;
        }
        afVar.copyOnWrite();
        C19063ag agVar = (C19063ag) afVar.instance;
        agVar.f53480b = ctVar.f124907o;
        agVar.f53479a |= 1;
        C19063ag agVar2 = (C19063ag) afVar.build();
        sVar.copyOnWrite();
        C19088t tVar5 = (C19088t) sVar.instance;
        agVar2.getClass();
        tVar5.f53541g = agVar2;
        tVar5.f53535a |= 64;
        if (bVar.f38460f.size() > 0) {
            C19076h hVar = (C19076h) C19077i.f53509c.createBuilder();
            int d = bVar.f38460f.mo58914d(0);
            hVar.copyOnWrite();
            C19077i iVar = (C19077i) hVar.instance;
            iVar.f53511a |= 1;
            iVar.f53512b = d;
            sVar.mo24283a((C19077i) hVar.build());
        }
        String str4 = bVar.f38461g;
        lVar.copyOnWrite();
        C19081m mVar2 = (C19081m) lVar.instance;
        str4.getClass();
        mVar2.f53517a |= 64;
        mVar2.f53522f = str4;
        C48227am amVar = (C48227am) C48228an.f124774c.createBuilder();
        if (bVar.f38462h) {
            amVar.copyOnWrite();
            ((C48228an) amVar.instance).f124777b = true;
        }
        C48225ak akVar = (C48225ak) C48226al.f124770b.createBuilder();
        C67982c cVar = (C67982c) C67983d.f184217c.createBuilder();
        C67986g gVar = (C67986g) C67989j.f184225b.createBuilder();
        int b = C67988i.m98230b(bVar.f38464j);
        if (b == 0) {
            b = 2;
        }
        gVar.copyOnWrite();
        ((C67989j) gVar.instance).f184227a = C67988i.m98229a(b);
        cVar.copyOnWrite();
        C67989j jVar = (C67989j) gVar.build();
        jVar.getClass();
        ((C67983d) cVar.instance).f184220b = jVar;
        akVar.copyOnWrite();
        C67983d dVar3 = (C67983d) cVar.build();
        dVar3.getClass();
        ((C48226al) akVar.instance).f124772a = dVar3;
        amVar.mo53149a(akVar);
        sVar.copyOnWrite();
        C19088t tVar6 = (C19088t) sVar.instance;
        C48228an anVar = (C48228an) amVar.build();
        anVar.getClass();
        tVar6.f53543i = anVar;
        tVar6.f53535a |= 256;
        C19082n nVar2 = (C19082n) C19086r.f53525f.createBuilder();
        int a4 = C19084p.m36523a(bVar.f38466l);
        if (a4 == 0) {
            a4 = 1;
        }
        nVar2.copyOnWrite();
        C19086r rVar = (C19086r) nVar2.instance;
        rVar.f53531e = a4 - 1;
        rVar.f53527a |= 256;
        if (C13316a.m29572a(this.f38452c)) {
            i = 2;
        } else if (!C13316a.m29573b(this.f38452c)) {
            i = 3;
        }
        nVar2.copyOnWrite();
        C19086r rVar2 = (C19086r) nVar2.instance;
        rVar2.f53530d = i - 1;
        rVar2.f53527a |= 128;
        sVar.copyOnWrite();
        C19088t tVar7 = (C19088t) sVar.instance;
        C19086r rVar3 = (C19086r) nVar2.build();
        rVar3.getClass();
        tVar7.f53545k = rVar3;
        tVar7.f53535a |= 1024;
        C19068al alVar = (C19068al) C19069am.f53489c.createBuilder();
        C19056a aVar = (C19056a) C19070b.f53493c.createBuilder();
        String str5 = bVar.f38463i;
        aVar.copyOnWrite();
        C19070b bVar4 = (C19070b) aVar.instance;
        str5.getClass();
        bVar4.f53495a |= 1;
        bVar4.f53496b = str5;
        alVar.copyOnWrite();
        C19069am amVar2 = (C19069am) alVar.instance;
        C19070b bVar5 = (C19070b) aVar.build();
        bVar5.getClass();
        amVar2.f53492b = bVar5;
        amVar2.f53491a = 1;
        lVar.copyOnWrite();
        C19081m mVar3 = (C19081m) lVar.instance;
        C19069am amVar3 = (C19069am) alVar.build();
        amVar3.getClass();
        mVar3.f53521e = amVar3;
        mVar3.f53517a |= 32;
        sVar.copyOnWrite();
        C19088t tVar8 = (C19088t) sVar.instance;
        C19081m mVar4 = (C19081m) lVar.build();
        mVar4.getClass();
        tVar8.f53542h = mVar4;
        tVar8.f53535a |= 128;
        C60555uf ufVar4 = (C60555uf) tzVar.build();
        C19088t tVar9 = bVar.f38465k;
        if (tVar9 == null) {
            try {
                tVar9 = C19088t.f53533p;
            } catch (C62974ct unused) {
                ((C58970a) ((C58970a) this.f38450a.mo56226d()).mo56372aa(43947)).mo56386p("Proto merging failed in offline logging.");
                C19088t tVar10 = bVar.f38465k;
                if (tVar10 == null) {
                    tVar10 = C19088t.f53533p;
                }
                C19087s sVar2 = (C19087s) tVar10.toBuilder();
                sVar2.mergeFrom((C19088t) sVar.build());
                tVar = (C19088t) sVar2.build();
            }
        }
        C19087s sVar3 = (C19087s) tVar9.toBuilder();
        sVar3.mergeFrom(((C19088t) sVar.build()).toByteString(), C62921ba.m95368a());
        tVar = (C19088t) sVar3.build();
        ((C58970a) ((C58970a) this.f38450a.mo56224b()).mo56372aa(43946)).mo56386p("Clearcut logging for offline event.");
        C38750am amVar4 = this.f38451b;
        if (((C60555uf) tzVar.instance).f164258m == 1630) {
            ((C38745ah) amVar4).mo41603o(C59743a.ASSISTANT_AUTO_ONDEVICE_QUERY_PROCESSING, tzVar, tVar);
            return;
        }
        ((C38745ah) amVar4).mo41603o(C59743a.ASSISTANT_AUTO_QUERY, tzVar, tVar);
    }
}
