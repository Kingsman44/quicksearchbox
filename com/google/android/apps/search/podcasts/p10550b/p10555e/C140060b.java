package com.google.android.apps.search.podcasts.p10550b.p10555e;

import android.text.TextUtils;
import androidx.p060c.C0984n;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.search.podcasts.p10569h.C140387f;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p395al.p398b.p399a.p400a.C8415a;
import com.google.p395al.p398b.p399a.p400a.C8419c;
import com.google.p395al.p417d.p418a.C8534an;
import com.google.p395al.p417d.p418a.C8535ao;
import com.google.p4017at.p4060h.p4061a.p4062a.C54075a;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.p4017at.p4060h.p4061a.p4062a.C54180f;
import com.google.p4017at.p4060h.p4061a.p4062a.C54181g;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54165q;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54166r;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54167s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54168t;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54169u;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54170v;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54171w;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54172x;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54174z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63108g;
import com.google.protos.p4757ac.p4758a.C63109h;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.b.e.b */
/* compiled from: PG */
public final /* synthetic */ class C140060b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380645a;

    public /* synthetic */ C140060b(C140084z zVar) {
        this.f380645a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C140084z zVar = this.f380645a;
        C140083y yVar = (C140083y) obj;
        if (!yVar.f380684c) {
            return C60856cj.m92898g();
        }
        C140387f fVar = zVar.f380692c;
        int i = zVar.f380696g;
        if (yVar.f380683b.mo26870b() - yVar.f380689h > 604800000) {
            yVar.f380689h = 0;
        }
        C54169u uVar = (C54169u) C54170v.f142167d.createBuilder();
        long j = yVar.f380689h;
        uVar.copyOnWrite();
        C54170v vVar = (C54170v) uVar.instance;
        vVar.f142169a |= 1;
        vVar.f142171c = j;
        int i2 = yVar.f380685d.f3122d;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            String str = (String) yVar.f380685d.mo3702e(i2);
            C140074p pVar = (C140074p) yVar.f380682a.f380669a.get(str);
            if (pVar == null || pVar.f380667b == null) {
                C59104x d = C140084z.f380690a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ProgressManager");
                ((C59052c) ((C59052c) d).mo56372aa(41562)).mo56389s("Pending episode with cluster id %s doesn't have progress data.", str);
                yVar.f380685d.mo3704f(i2);
            } else {
                Iterator it = ((Set) yVar.f380685d.mo3708h(i2)).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (TextUtils.isEmpty(str2)) {
                        C59104x c = C140084z.f380690a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "ProgressManager");
                        ((C59052c) ((C59052c) c).mo56372aa(41565)).mo56386p("Pending episode has empty GUID.");
                        it.remove();
                        pVar.f380666a.remove(str2);
                    } else if (((C97885ak) pVar.f380666a.get(str2)) == null) {
                        C59104x d2 = C140084z.f380690a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "ProgressManager");
                        ((C59052c) ((C59052c) d2).mo56372aa(41564)).mo56389s("Pending episode with GUID %s doesn't have progress data.", str2);
                        it.remove();
                    }
                }
                if (!pVar.f380667b.f170375i.isEmpty()) {
                    C63108g gVar = (C63108g) C63109h.f170342e.createBuilder();
                    C63113l lVar = pVar.f380667b;
                    gVar.copyOnWrite();
                    C63109h hVar = (C63109h) gVar.instance;
                    lVar.getClass();
                    hVar.f170345b = lVar;
                    hVar.f170344a |= 1;
                    C63109h hVar2 = (C63109h) gVar.build();
                    ArrayList arrayList = new ArrayList();
                    if (hVar2 == null) {
                        arrayList.add("No player data");
                    } else if ((hVar2.f170344a & 1) != 0) {
                        C63113l lVar2 = hVar2.f170345b;
                        if (lVar2 == null) {
                            lVar2 = C63113l.f170365p;
                        }
                        if (lVar2.f170373g.isEmpty()) {
                            arrayList.add("No podcast show url");
                        }
                        C63113l lVar3 = hVar2.f170345b;
                        if (lVar3 == null) {
                            lVar3 = C63113l.f170365p;
                        }
                        if (lVar3.f170368b.isEmpty()) {
                            arrayList.add("No podcast show title");
                        }
                    } else {
                        arrayList.add("No podcast show data");
                    }
                    if (!arrayList.isEmpty()) {
                        ((C59052c) ((C59052c) C140058a.f380644a.mo56226d()).mo56372aa(41557)).mo56354G("Player data %s is incomplete because of: %s", hVar2, arrayList);
                    }
                }
                C58976aa aaVar = C58975e.f156826a;
                yVar.f380685d.mo3704f(i2);
                yVar.f380682a.f380669a.remove(str);
            }
        }
        yVar.f380686e = yVar.f380685d.f3122d;
        for (int i3 = 0; i3 < yVar.f380686e; i3++) {
            String str3 = (String) yVar.f380685d.mo3702e(i3);
            C140074p pVar2 = (C140074p) yVar.f380682a.f380669a.get(str3);
            pVar2.getClass();
            C63113l lVar4 = pVar2.f380667b;
            C54165q qVar = (C54165q) C54168t.f142159f.createBuilder();
            String str4 = lVar4.f170373g;
            qVar.copyOnWrite();
            C54168t tVar = (C54168t) qVar.instance;
            str4.getClass();
            tVar.f142161a |= 1;
            tVar.f142162b = str4;
            String str5 = lVar4.f170375i;
            qVar.copyOnWrite();
            C54168t tVar2 = (C54168t) qVar.instance;
            str5.getClass();
            tVar2.f142161a |= 4;
            tVar2.f142165e = str5;
            String str6 = lVar4.f170368b;
            qVar.copyOnWrite();
            C54168t tVar3 = (C54168t) qVar.instance;
            str6.getClass();
            tVar3.f142161a |= 2;
            tVar3.f142164d = str6;
            C0984n nVar = pVar2.f380666a;
            for (String str7 : (Set) yVar.f380685d.get(str3)) {
                C97885ak akVar = (C97885ak) nVar.get(str7);
                C54166r rVar = (C54166r) C54167s.f142149g.createBuilder();
                rVar.copyOnWrite();
                C54167s sVar = (C54167s) rVar.instance;
                str7.getClass();
                sVar.f142151a |= 1;
                sVar.f142152b = str7;
                boolean z = akVar.f273310d;
                rVar.copyOnWrite();
                C54167s sVar2 = (C54167s) rVar.instance;
                sVar2.f142151a |= 2;
                sVar2.f142153c = z;
                long j2 = akVar.f273309c;
                rVar.copyOnWrite();
                C54167s sVar3 = (C54167s) rVar.instance;
                sVar3.f142151a |= 4;
                sVar3.f142154d = j2;
                long j3 = akVar.f273311e;
                rVar.copyOnWrite();
                C54167s sVar4 = (C54167s) rVar.instance;
                sVar4.f142151a |= 16;
                sVar4.f142156f = j3;
                if ((akVar.f273307a & 32) != 0) {
                    float f = akVar.f273312f;
                    rVar.copyOnWrite();
                    C54167s sVar5 = (C54167s) rVar.instance;
                    sVar5.f142151a |= 8;
                    sVar5.f142155e = f;
                }
                qVar.copyOnWrite();
                C54168t tVar4 = (C54168t) qVar.instance;
                C54167s sVar6 = (C54167s) rVar.build();
                sVar6.getClass();
                C62971cq cqVar = tVar4.f142163c;
                if (!cqVar.mo58948c()) {
                    tVar4.f142163c = C62942bv.mutableCopy(cqVar);
                }
                tVar4.f142163c.add(sVar6);
            }
            uVar.copyOnWrite();
            C54170v vVar2 = (C54170v) uVar.instance;
            C54168t tVar5 = (C54168t) qVar.build();
            tVar5.getClass();
            C62971cq cqVar2 = vVar2.f142170b;
            if (!cqVar2.mo58948c()) {
                vVar2.f142170b = C62942bv.mutableCopy(cqVar2);
            }
            vVar2.f142170b.add(tVar5);
        }
        yVar.f380687f = yVar.f380683b.mo26870b();
        C54171w wVar = (C54171w) C54172x.f142173d.createBuilder();
        wVar.copyOnWrite();
        C54172x xVar = (C54172x) wVar.instance;
        C54170v vVar3 = (C54170v) uVar.build();
        vVar3.getClass();
        xVar.f142177c = vVar3;
        xVar.f142175a |= 2;
        C54075a aVar = (C54075a) C54128b.f142037d.createBuilder();
        C8415a aVar2 = (C8415a) C8419c.f29284d.createBuilder();
        aVar2.copyOnWrite();
        C8419c cVar = (C8419c) aVar2.instance;
        cVar.f29287b = 6;
        cVar.f29286a |= 1;
        String valueOf = String.valueOf(i);
        aVar2.copyOnWrite();
        C8419c cVar2 = (C8419c) aVar2.instance;
        valueOf.getClass();
        cVar2.f29286a |= 2;
        cVar2.f29288c = valueOf;
        C8419c cVar3 = (C8419c) aVar2.build();
        C8534an anVar = (C8534an) C8535ao.f29615c.createBuilder();
        anVar.copyOnWrite();
        C8535ao aoVar = (C8535ao) anVar.instance;
        cVar3.getClass();
        aoVar.f29618b = cVar3;
        aoVar.f29617a |= 1;
        C8535ao aoVar2 = (C8535ao) anVar.build();
        aVar.copyOnWrite();
        C54128b bVar = (C54128b) aVar.instance;
        aoVar2.getClass();
        bVar.f142040b = aoVar2;
        bVar.f142039a |= 1;
        C54128b bVar2 = (C54128b) aVar.build();
        wVar.copyOnWrite();
        C54172x xVar2 = (C54172x) wVar.instance;
        bVar2.getClass();
        xVar2.f142176b = bVar2;
        xVar2.f142175a |= 1;
        C54172x xVar3 = (C54172x) wVar.build();
        C140747m mVar = fVar.f381343b;
        C54180f fVar2 = fVar.f381342a;
        C70888j jVar = fVar2.f189039a;
        C70338di diVar = C54181g.f142196b;
        if (diVar == null) {
            synchronized (C54181g.class) {
                diVar = C54181g.f142196b;
                if (diVar == null) {
                    C70335df d3 = C70338di.m102603d();
                    d3.f187487c = C70337dh.UNARY;
                    d3.f187488d = C70338di.m102602c("google.internal.mothership.searchapi.v2.WernickeService", "SynchronizeProgress");
                    d3.f187489e = true;
                    d3.f187485a = C70850d.m103697c(C54172x.f142173d);
                    d3.f187486b = C70850d.m103697c(C54174z.f142179b);
                    diVar = d3.mo62040a();
                    C54181g.f142196b = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, fVar2.f189040b), xVar3);
        mVar.mo115851a("Wernicke", "SynchronizeProgress", a);
        return a;
    }
}
