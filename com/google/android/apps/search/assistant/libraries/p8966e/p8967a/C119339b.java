package com.google.android.apps.search.assistant.libraries.p8966e.p8967a;

import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35478e;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35479f;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35480g;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35481h;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35482i;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35483j;
import com.google.assistant.p3741aa.C48172g;
import com.google.assistant.p3741aa.C48173h;
import com.google.assistant.p3745ab.p3754f.C48324b;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C119339b implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C119339b f332734a = new C119339b();

    private /* synthetic */ C119339b() {
    }

    public final C60870cx apply(Object obj) {
        C48173h hVar = (C48173h) obj;
        C59071e eVar = C119341d.f332737a;
        C35478e eVar2 = (C35478e) C35483j.f93186d.createBuilder();
        if ((hVar.f124652a & 2) != 0) {
            C63088z zVar = hVar.f124655d;
            eVar2.copyOnWrite();
            C35483j jVar = (C35483j) eVar2.instance;
            zVar.getClass();
            jVar.f93188a |= 1;
            jVar.f93190c = zVar;
        }
        for (C48172g gVar : hVar.f124654c) {
            C35479f fVar = (C35479f) C35482i.f93181d.createBuilder();
            C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
            String str = gVar.f124646b;
            riVar.copyOnWrite();
            C52428rj rjVar = (C52428rj) riVar.instance;
            str.getClass();
            rjVar.f137560a |= 512;
            rjVar.f137568i = str;
            String str2 = gVar.f124646b;
            riVar.copyOnWrite();
            C52428rj rjVar2 = (C52428rj) riVar.instance;
            str2.getClass();
            rjVar2.f137560a |= 16;
            rjVar2.f137564e = str2;
            fVar.copyOnWrite();
            C35482i iVar = (C35482i) fVar.instance;
            C52428rj rjVar3 = (C52428rj) riVar.build();
            rjVar3.getClass();
            iVar.f93185c = rjVar3;
            iVar.f93183a |= 2;
            Iterator it = gVar.f124648d.iterator();
            for (C52083ep epVar : gVar.f124647c) {
                C35480g gVar2 = (C35480g) C35481h.f93174f.createBuilder();
                gVar2.copyOnWrite();
                epVar.getClass();
                ((C35481h) gVar2.instance).f93177b = epVar;
                if (it.hasNext()) {
                    C48324b bVar = (C48324b) it.next();
                    if (!((bVar.f124969a & 2) == 0 || bVar.f124971c == C52235kf.IGNORE.f137088t)) {
                        String str3 = bVar.f124970b;
                        gVar2.copyOnWrite();
                        C35481h hVar2 = (C35481h) gVar2.instance;
                        str3.getClass();
                        hVar2.f93176a |= 1;
                        hVar2.f93178c = str3;
                        C63042fg j = C62953e.m95485j(bVar.f124972d);
                        gVar2.copyOnWrite();
                        C35481h hVar3 = (C35481h) gVar2.instance;
                        j.getClass();
                        hVar3.f93179d = j;
                        hVar3.f93176a |= 2;
                        C63042fg j2 = C62953e.m95485j(bVar.f124973e);
                        gVar2.copyOnWrite();
                        C35481h hVar4 = (C35481h) gVar2.instance;
                        j2.getClass();
                        hVar4.f93180e = j2;
                        hVar4.f93176a |= 4;
                    }
                }
                fVar.copyOnWrite();
                C35482i iVar2 = (C35482i) fVar.instance;
                C35481h hVar5 = (C35481h) gVar2.build();
                hVar5.getClass();
                C62971cq cqVar = iVar2.f93184b;
                if (!cqVar.mo58948c()) {
                    iVar2.f93184b = C62942bv.mutableCopy(cqVar);
                }
                iVar2.f93184b.add(hVar5);
            }
            C35482i iVar3 = (C35482i) fVar.build();
            eVar2.copyOnWrite();
            C35483j jVar2 = (C35483j) eVar2.instance;
            iVar3.getClass();
            C62971cq cqVar2 = jVar2.f93189b;
            if (!cqVar2.mo58948c()) {
                jVar2.f93189b = C62942bv.mutableCopy(cqVar2);
            }
            jVar2.f93189b.add(iVar3);
        }
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b(C119341d.f332739c.mo38881b((C35483j) eVar2.build()));
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return C60856cj.m92900i((C52070ec) dzVar.build());
    }
}
