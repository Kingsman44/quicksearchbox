package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80569c;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80570d;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80571e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80572f;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80574h;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80576j;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80582p;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80584r;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3926e.C51991gq;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bx */
/* compiled from: PG */
public final /* synthetic */ class C103702bx implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103704bz f288823a;

    public /* synthetic */ C103702bx(C103704bz bzVar) {
        this.f288823a = bzVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C103704bz bzVar = this.f288823a;
        C51992gr b = ((C89128d) obj).mo83101b();
        PackageManager packageManager = (PackageManager) bzVar.f288826a.mo27525b();
        C80569c cVar = (C80569c) C80570d.f221155f.createBuilder();
        C80571e eVar = (C80571e) C80572f.f221163d.createBuilder();
        String str = b.f136451e;
        eVar.copyOnWrite();
        str.getClass();
        ((C80572f) eVar.instance).f221166b = str;
        C51991gq gqVar = b.f136462p;
        if (gqVar == null) {
            gqVar = C51991gq.f136433k;
        }
        String str2 = gqVar.f136439e;
        eVar.copyOnWrite();
        str2.getClass();
        ((C80572f) eVar.instance).f221165a = str2;
        if ((b.f136447a & 16) != 0) {
            C51012dc dcVar = b.f136452f;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 8) != 0) {
                C80582p pVar = (C80582p) C80584r.f221200d.createBuilder();
                C51012dc dcVar2 = b.f136452f;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                C63088z zVar = dcVar2.f132819e;
                pVar.copyOnWrite();
                C80584r rVar = (C80584r) pVar.instance;
                zVar.getClass();
                rVar.f221202a = 4;
                rVar.f221203b = zVar;
                eVar.copyOnWrite();
                C80584r rVar2 = (C80584r) pVar.build();
                rVar2.getClass();
                ((C80572f) eVar.instance).f221167c = rVar2;
            } else {
                C51012dc dcVar3 = b.f136452f;
                if (((dcVar3 == null ? C51012dc.f132813k : dcVar3).f132815a & 2) != 0) {
                    C80582p pVar2 = (C80582p) C80584r.f221200d.createBuilder();
                    C51012dc dcVar4 = b.f136452f;
                    if (dcVar4 == null) {
                        dcVar4 = C51012dc.f132813k;
                    }
                    String str3 = dcVar4.f132817c;
                    pVar2.copyOnWrite();
                    C80584r rVar3 = (C80584r) pVar2.instance;
                    str3.getClass();
                    rVar3.f221202a = 1;
                    rVar3.f221203b = str3;
                    eVar.copyOnWrite();
                    C80584r rVar4 = (C80584r) pVar2.build();
                    rVar4.getClass();
                    ((C80572f) eVar.instance).f221167c = rVar4;
                } else {
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    if ((dcVar3.f132815a & 32) != 0) {
                        C80582p pVar3 = (C80582p) C80584r.f221200d.createBuilder();
                        C51012dc dcVar5 = b.f136452f;
                        if (dcVar5 == null) {
                            dcVar5 = C51012dc.f132813k;
                        }
                        String str4 = dcVar5.f132821g;
                        pVar3.copyOnWrite();
                        C80584r rVar5 = (C80584r) pVar3.instance;
                        str4.getClass();
                        rVar5.f221202a = 5;
                        rVar5.f221203b = str4;
                        eVar.copyOnWrite();
                        C80584r rVar6 = (C80584r) pVar3.build();
                        rVar6.getClass();
                        ((C80572f) eVar.instance).f221167c = rVar6;
                    }
                }
            }
        }
        cVar.copyOnWrite();
        C80572f fVar = (C80572f) eVar.build();
        fVar.getClass();
        ((C80570d) cVar.instance).f221157a = fVar;
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        C51994gt gtVar = b.f136454h;
        if (gtVar == null) {
            gtVar = C51994gt.f136465g;
        }
        Optional d = C80600k.m128229d(b, packageManager);
        if (d.isPresent()) {
            String str5 = ((C80576j) ((C80574h) d.get()).instance).f221171b;
            if (!str5.isEmpty()) {
                cVar.copyOnWrite();
                C80570d dVar = (C80570d) cVar.instance;
                str5.getClass();
                C62971cq cqVar = dVar.f221159c;
                if (!cqVar.mo58948c()) {
                    dVar.f221159c = C62942bv.mutableCopy(cqVar);
                }
                dVar.f221159c.add(str5);
            }
            kVar.copyOnWrite();
            C80578l lVar = (C80578l) kVar.instance;
            C80576j jVar = (C80576j) ((C80574h) d.get()).build();
            jVar.getClass();
            lVar.f221176b = jVar;
            lVar.f221175a = 3;
        } else if ((gtVar.f136467a & 2) != 0) {
            String str6 = gtVar.f136469c;
            kVar.copyOnWrite();
            C80578l lVar2 = (C80578l) kVar.instance;
            str6.getClass();
            lVar2.f221175a = 2;
            lVar2.f221176b = str6;
        } else {
            String str7 = b.f136451e;
            kVar.copyOnWrite();
            C80578l lVar3 = (C80578l) kVar.instance;
            str7.getClass();
            lVar3.f221175a = 2;
            lVar3.f221176b = str7;
        }
        if ((gtVar.f136467a & 1) != 0) {
            boolean z = gtVar.f136468b;
            kVar.copyOnWrite();
            ((C80578l) kVar.instance).f221177c = z;
        }
        if ((gtVar.f136467a & 16) != 0) {
            boolean z2 = gtVar.f136471e;
            kVar.copyOnWrite();
            ((C80578l) kVar.instance).f221180f = z2;
        }
        if ((gtVar.f136467a & 8) != 0) {
            C63088z zVar2 = gtVar.f136470d;
            kVar.copyOnWrite();
            zVar2.getClass();
            ((C80578l) kVar.instance).f221178d = zVar2;
        }
        cVar.copyOnWrite();
        C80578l lVar4 = (C80578l) kVar.build();
        lVar4.getClass();
        ((C80570d) cVar.instance).f221158b = lVar4;
        if ((b.f136447a & 4) != 0) {
            int i = b.f136450d;
            cVar.copyOnWrite();
            ((C80570d) cVar.instance).f221160d = i;
        }
        if ((b.f136447a & 1024) != 0) {
            try {
                C52230ka kaVar = b.f136457k;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                C63204j jVar2 = (C63204j) C62942bv.parseFrom((C62942bv) C63204j.f170749e, kaVar.f137061c, C62921ba.m95368a());
                cVar.copyOnWrite();
                jVar2.getClass();
                ((C80570d) cVar.instance).f221161e = jVar2;
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) C80600k.f221274a.mo56226d()).mo56382g(e)).mo56372aa(6122)).mo56386p("Failed to parse feature tree ref");
            }
        }
        return (C80570d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
