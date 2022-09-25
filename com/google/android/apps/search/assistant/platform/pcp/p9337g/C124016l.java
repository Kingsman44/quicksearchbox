package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123793v;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.assistant.p3994s.p3995a.C53123cf;
import com.google.assistant.p3994s.p3995a.C53124cg;
import com.google.assistant.p3994s.p3995a.C53137ct;
import com.google.assistant.p3994s.p3995a.C53139cv;
import com.google.assistant.p3994s.p3995a.C53140cw;
import com.google.assistant.p3994s.p3995a.C53143cz;
import com.google.assistant.p3994s.p3995a.C53145da;
import com.google.assistant.p3994s.p3995a.C53146db;
import com.google.assistant.p3994s.p3995a.C53147dc;
import com.google.assistant.p3994s.p3995a.C53148dd;
import com.google.assistant.p3994s.p3995a.C53149de;
import com.google.assistant.p3994s.p3995a.C53150df;
import com.google.assistant.p3994s.p3995a.C53151dg;
import com.google.assistant.p3994s.p3995a.C53251gz;
import com.google.assistant.p3994s.p3995a.C53253ha;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import p3186j$.time.ZoneId;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.l */
/* compiled from: PG */
public final /* synthetic */ class C124016l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124017m f342536a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342537b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f342538c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f342539d;

    /* renamed from: e */
    public final /* synthetic */ C123755bv f342540e;

    /* renamed from: f */
    public final /* synthetic */ C53306j f342541f;

    /* renamed from: g */
    public final /* synthetic */ Optional f342542g;

    /* renamed from: h */
    public final /* synthetic */ C123777f f342543h;

    public /* synthetic */ C124016l(C124017m mVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C123755bv bvVar, C53306j jVar, Optional optional, C123777f fVar) {
        this.f342536a = mVar;
        this.f342537b = cxVar;
        this.f342538c = cxVar2;
        this.f342539d = cxVar3;
        this.f342540e = bvVar;
        this.f342541f = jVar;
        this.f342542g = optional;
        this.f342543h = fVar;
    }

    public final Object call() {
        Object obj;
        Object obj2;
        C124017m mVar = this.f342536a;
        C60870cx cxVar = this.f342537b;
        C60870cx cxVar2 = this.f342538c;
        C60870cx cxVar3 = this.f342539d;
        C123755bv bvVar = this.f342540e;
        C53306j jVar = this.f342541f;
        Optional optional = this.f342542g;
        C123777f fVar = this.f342543h;
        String str = (String) C60856cj.m92909r(cxVar);
        List list = (List) C60856cj.m92909r(cxVar2);
        C53123cf cfVar = (C53123cf) C60856cj.m92909r(cxVar3);
        C59104x b = C124017m.f342544a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.SyncRequest");
        ((C59052c) ((C59052c) b).mo56372aa(35359)).mo56386p("#buildUserContext");
        C53251gz gzVar = (C53251gz) C53253ha.f139593f.createBuilder();
        if (mVar.f342550g) {
            String languageTag = Locale.getDefault().toLanguageTag();
            gzVar.copyOnWrite();
            C53253ha haVar = (C53253ha) gzVar.instance;
            languageTag.getClass();
            haVar.f139595a |= 1;
            haVar.f139596b = languageTag;
        } else if ((bvVar.f341839a & 512) != 0) {
            String str2 = bvVar.f341850l;
            gzVar.copyOnWrite();
            C53253ha haVar2 = (C53253ha) gzVar.instance;
            str2.getClass();
            haVar2.f139595a |= 1;
            haVar2.f139596b = str2;
        }
        C51334dw dwVar = bvVar.f341851m;
        if (dwVar == null) {
            dwVar = C51334dw.f133658ab;
        }
        C52405qn qnVar = dwVar.f133694h;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        if ((qnVar.f137521a & 1) != 0) {
            C51334dw dwVar2 = bvVar.f341851m;
            if (dwVar2 == null) {
                dwVar2 = C51334dw.f133658ab;
            }
            C52405qn qnVar2 = dwVar2.f133694h;
            if (qnVar2 == null) {
                qnVar2 = C52405qn.f137519c;
            }
            String str3 = qnVar2.f137522b;
            gzVar.copyOnWrite();
            C53253ha haVar3 = (C53253ha) gzVar.instance;
            str3.getClass();
            haVar3.f139595a |= 2;
            haVar3.f139597c = str3;
        } else {
            C53271hs hsVar = bvVar.f341848j;
            if (hsVar == null) {
                hsVar = C53271hs.f139650u;
            }
            if ((hsVar.f139652a & 1) != 0) {
                C53271hs hsVar2 = bvVar.f341848j;
                if (hsVar2 == null) {
                    hsVar2 = C53271hs.f139650u;
                }
                String str4 = hsVar2.f139653b;
                gzVar.copyOnWrite();
                C53253ha haVar4 = (C53253ha) gzVar.instance;
                str4.getClass();
                haVar4.f139595a |= 2;
                haVar4.f139597c = str4;
            } else {
                String id = ZoneId.systemDefault().getId();
                gzVar.copyOnWrite();
                C53253ha haVar5 = (C53253ha) gzVar.instance;
                id.getClass();
                haVar5.f139595a |= 2;
                haVar5.f139597c = id;
            }
        }
        if ((bvVar.f341839a & 4) != 0) {
            C51270bm bmVar = bvVar.f341843e;
            if (bmVar == null) {
                bmVar = C51270bm.f133476f;
            }
            gzVar.copyOnWrite();
            C53253ha haVar6 = (C53253ha) gzVar.instance;
            bmVar.getClass();
            haVar6.f139598d = bmVar;
            haVar6.f139595a |= 16;
        }
        C53253ha haVar7 = (C53253ha) gzVar.build();
        C53137ct ctVar = (C53137ct) C53140cw.f139278h.createBuilder();
        ctVar.copyOnWrite();
        C53140cw cwVar = (C53140cw) ctVar.instance;
        haVar7.getClass();
        cwVar.f139281b = haVar7;
        cwVar.f139280a |= 1;
        ctVar.copyOnWrite();
        C53140cw cwVar2 = (C53140cw) ctVar.instance;
        C53124cg cgVar = (C53124cg) cfVar.build();
        cgVar.getClass();
        cwVar2.f139282c = cgVar;
        cwVar2.f139280a |= 2;
        C53143cz czVar = (C53143cz) C53151dg.f139308e.createBuilder();
        czVar.copyOnWrite();
        C53151dg dgVar = (C53151dg) czVar.instance;
        dgVar.f139311b = jVar.f139793X;
        dgVar.f139310a |= 1;
        if (optional.isPresent()) {
            for (Integer num : (Set) optional.get()) {
                C53145da daVar = (C53145da) C53150df.f139301e.createBuilder();
                int intValue = num.intValue();
                daVar.copyOnWrite();
                C53150df dfVar = (C53150df) daVar.instance;
                dfVar.f139303a |= 1;
                dfVar.f139304b = intValue;
                int intValue2 = num.intValue();
                if (intValue2 == 100) {
                    C62940bt r0 = C62942bv.checkIsLite(C123793v.f341984c);
                    fVar.mo58887l(r0);
                    if (fVar.f169962ag.mo58857o(r0.f169971d)) {
                        C53148dd ddVar = (C53148dd) C53149de.f139297b.createBuilder();
                        C62940bt r12 = C62942bv.checkIsLite(C123793v.f341984c);
                        fVar.mo58887l(r12);
                        Object l = fVar.f169962ag.mo58854l(r12.f169971d);
                        if (l == null) {
                            obj = r12.f169969b;
                        } else {
                            obj = r12.mo58889c(l);
                        }
                        C62971cq cqVar = ((C123793v) obj).f341987a;
                        ddVar.copyOnWrite();
                        C53149de deVar = (C53149de) ddVar.instance;
                        C62971cq cqVar2 = deVar.f139299a;
                        if (!cqVar2.mo58948c()) {
                            deVar.f139299a = C62942bv.mutableCopy(cqVar2);
                        }
                        C62947c.addAll((Iterable) cqVar, (List) deVar.f139299a);
                        daVar.copyOnWrite();
                        C53150df dfVar2 = (C53150df) daVar.instance;
                        C53149de deVar2 = (C53149de) ddVar.build();
                        deVar2.getClass();
                        dfVar2.f139305c = deVar2;
                        dfVar2.f139303a |= 2;
                    }
                } else if (intValue2 == 101) {
                    C62940bt r02 = C62942bv.checkIsLite(C123793v.f341985d);
                    fVar.mo58887l(r02);
                    if (fVar.f169962ag.mo58857o(r02.f169971d)) {
                        C53146db dbVar = (C53146db) C53147dc.f139293b.createBuilder();
                        C62940bt r122 = C62942bv.checkIsLite(C123793v.f341985d);
                        fVar.mo58887l(r122);
                        Object l2 = fVar.f169962ag.mo58854l(r122.f169971d);
                        if (l2 == null) {
                            obj2 = r122.f169969b;
                        } else {
                            obj2 = r122.mo58889c(l2);
                        }
                        C62971cq cqVar3 = ((C123793v) obj2).f341987a;
                        dbVar.copyOnWrite();
                        C53147dc dcVar = (C53147dc) dbVar.instance;
                        C62971cq cqVar4 = dcVar.f139295a;
                        if (!cqVar4.mo58948c()) {
                            dcVar.f139295a = C62942bv.mutableCopy(cqVar4);
                        }
                        C62947c.addAll((Iterable) cqVar3, (List) dcVar.f139295a);
                        daVar.copyOnWrite();
                        C53150df dfVar3 = (C53150df) daVar.instance;
                        C53147dc dcVar2 = (C53147dc) dbVar.build();
                        dcVar2.getClass();
                        dfVar3.f139306d = dcVar2;
                        dfVar3.f139303a |= 4;
                    }
                }
                czVar.copyOnWrite();
                C53151dg dgVar2 = (C53151dg) czVar.instance;
                C53150df dfVar4 = (C53150df) daVar.build();
                dfVar4.getClass();
                C62971cq cqVar5 = dgVar2.f139313d;
                if (!cqVar5.mo58948c()) {
                    dgVar2.f139313d = C62942bv.mutableCopy(cqVar5);
                }
                dgVar2.f139313d.add(dfVar4);
            }
        }
        C53151dg dgVar3 = (C53151dg) czVar.build();
        ctVar.copyOnWrite();
        C53140cw cwVar3 = (C53140cw) ctVar.instance;
        dgVar3.getClass();
        C62971cq cqVar6 = cwVar3.f139283d;
        if (!cqVar6.mo58948c()) {
            cwVar3.f139283d = C62942bv.mutableCopy(cqVar6);
        }
        cwVar3.f139283d.add(dgVar3);
        ctVar.copyOnWrite();
        C53140cw cwVar4 = (C53140cw) ctVar.instance;
        cwVar4.f139284e = jVar.f139793X;
        cwVar4.f139280a |= 4;
        ctVar.copyOnWrite();
        C53140cw cwVar5 = (C53140cw) ctVar.instance;
        C62971cq cqVar7 = cwVar5.f139286g;
        if (!cqVar7.mo58948c()) {
            cwVar5.f139286g = C62942bv.mutableCopy(cqVar7);
        }
        C62947c.addAll((Iterable) list, (List) cwVar5.f139286g);
        if ((bvVar.f341839a & 32) != 0) {
            int a = C53139cv.m86781a(bvVar.f341846h);
            if (a == 0) {
                a = 1;
            }
            ctVar.copyOnWrite();
            C53140cw cwVar6 = (C53140cw) ctVar.instance;
            cwVar6.f139285f = a - 1;
            cwVar6.f139280a |= 8;
        }
        if (str != null) {
            C54188e eVar = ((C53124cg) cfVar.instance).f139222b;
            if (eVar == null) {
                eVar = C54188e.f142203f;
            }
            C54185b bVar = (C54185b) eVar.toBuilder();
            bVar.mo54074c("X-Geo", str);
            cfVar.copyOnWrite();
            C53124cg cgVar2 = (C53124cg) cfVar.instance;
            C54188e eVar2 = (C54188e) bVar.build();
            eVar2.getClass();
            cgVar2.f139222b = eVar2;
            cgVar2.f139221a |= 1;
            ctVar.copyOnWrite();
            C53140cw cwVar7 = (C53140cw) ctVar.instance;
            C53124cg cgVar3 = (C53124cg) cfVar.build();
            cgVar3.getClass();
            cwVar7.f139282c = cgVar3;
            cwVar7.f139280a |= 2;
        }
        C59104x b2 = C124017m.f342544a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PCP.SyncRequest");
        ((C59052c) ((C59052c) b2).mo56372aa(35358)).mo56386p("#createPcpDataSyncRequest finished");
        return (C53140cw) ctVar.build();
    }
}
