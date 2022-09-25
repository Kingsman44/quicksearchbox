package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.android.libraries.assistant.pcp.p1578m.C18982l;
import com.google.android.libraries.assistant.pcp.p1578m.C18983m;
import com.google.android.libraries.assistant.pcp.p1578m.C18988r;
import com.google.android.libraries.assistant.pcp.p1578m.C18989s;
import com.google.android.libraries.assistant.pcp.p1578m.C18994x;
import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.assistant.p3803ag.p3809c.C49018dk;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3803ag.p3809c.C49024dq;
import com.google.assistant.p3803ag.p3809c.C49026ds;
import com.google.assistant.p3803ag.p3809c.C49027dt;
import com.google.assistant.p3803ag.p3809c.C49108gt;
import com.google.assistant.p3803ag.p3809c.C49109gu;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3803ag.p3809c.C49116ha;
import com.google.assistant.p3803ag.p3809c.C49118hc;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C63042fg;
import java.util.Collections;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.o.r */
/* compiled from: PG */
public final class C19041r {
    /* renamed from: a */
    public static C18989s m36458a(C49019dl dlVar, C49109gu guVar) {
        C18988r rVar = (C18988r) C18989s.f53353f.createBuilder();
        int i = dlVar.f126795b;
        rVar.copyOnWrite();
        C18989s sVar = (C18989s) rVar.instance;
        sVar.f53355a |= 1;
        sVar.f53356b = i;
        String str = dlVar.f126796c;
        rVar.copyOnWrite();
        C18989s sVar2 = (C18989s) rVar.instance;
        str.getClass();
        sVar2.f53355a |= 2;
        sVar2.f53357c = str;
        C53306j a = C53306j.m86809a(guVar.f127016d);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        rVar.copyOnWrite();
        C18989s sVar3 = (C18989s) rVar.instance;
        sVar3.f53358d = a.f139793X;
        sVar3.f53355a |= 4;
        String str2 = guVar.f127015c;
        rVar.copyOnWrite();
        C18989s sVar4 = (C18989s) rVar.instance;
        str2.getClass();
        sVar4.f53355a |= 8;
        sVar4.f53359e = str2;
        return (C18989s) rVar.build();
    }

    /* renamed from: b */
    public static C18995y m36459b(C18995y yVar, Set set, C63042fg fgVar) {
        C49019dl dlVar = yVar.f53369b;
        if (dlVar == null) {
            dlVar = C49019dl.f126792f;
        }
        C58528ij ijVar = (C58528ij) Collection.EL.stream(dlVar.f126798e).map(C19038o.f53424a).collect(C58370cn.f155947b);
        Stream map = Collection.EL.stream(set).map(C19039p.f53425a);
        Objects.requireNonNull(ijVar);
        C58485gu guVar = (C58485gu) map.filter(Predicate.CC.not(new C19028e(ijVar))).map(C19029f.f53415a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return yVar;
        }
        C18994x xVar = (C18994x) yVar.toBuilder();
        C49019dl dlVar2 = yVar.f53369b;
        if (dlVar2 == null) {
            dlVar2 = C49019dl.f126792f;
        }
        C49018dk dkVar = (C49018dk) dlVar2.toBuilder();
        dkVar.mo53208a(guVar);
        C49019dl dlVar3 = (C49019dl) dkVar.build();
        xVar.copyOnWrite();
        C18995y yVar2 = (C18995y) xVar.instance;
        dlVar3.getClass();
        yVar2.f53369b = dlVar3;
        yVar2.f53368a |= 1;
        int size = guVar.size();
        C49024dq dqVar = (C49024dq) C49027dt.f126812e.createBuilder();
        dqVar.copyOnWrite();
        C49027dt dtVar = (C49027dt) dqVar.instance;
        dtVar.f126815b = 3;
        dtVar.f126814a |= 1;
        dqVar.copyOnWrite();
        C49027dt dtVar2 = (C49027dt) dqVar.instance;
        fgVar.getClass();
        dtVar2.f126816c = fgVar;
        dtVar2.f126814a |= 2;
        dqVar.copyOnWrite();
        C49027dt dtVar3 = (C49027dt) dqVar.instance;
        fgVar.getClass();
        dtVar3.f126817d = fgVar;
        dtVar3.f126814a |= 4;
        xVar.mo24236a(Collections.nCopies(size, (C49027dt) dqVar.build()));
        return (C18995y) xVar.build();
    }

    /* renamed from: c */
    public static C49109gu m36460c(C53306j jVar) {
        C49108gt gtVar = (C49108gt) C49109gu.f127011f.createBuilder();
        gtVar.copyOnWrite();
        C49109gu guVar = (C49109gu) gtVar.instance;
        guVar.f127016d = jVar.f139793X;
        guVar.f127013a |= 4;
        C49111gw gwVar = C49111gw.f127019a;
        gtVar.copyOnWrite();
        C49109gu guVar2 = (C49109gu) gtVar.instance;
        gwVar.getClass();
        guVar2.f127014b = gwVar;
        guVar2.f127013a |= 1;
        return (C49109gu) gtVar.build();
    }

    /* renamed from: d */
    public static C58485gu m36461d(C18995y yVar, C53306j jVar, Set set) {
        int a;
        C49027dt dtVar = yVar.f53370c;
        if (dtVar == null) {
            dtVar = C49027dt.f126812e;
        }
        int a2 = C49026ds.m85348a(dtVar.f126815b);
        if (a2 == 0 || a2 != 3) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        C49019dl dlVar = yVar.f53369b;
        if (dlVar == null) {
            dlVar = C49019dl.f126792f;
        }
        for (int i = 0; i < dlVar.f126798e.size(); i++) {
            C49109gu guVar = (C49109gu) dlVar.f126798e.get(i);
            C49027dt dtVar2 = (C49027dt) yVar.f53371d.get(i);
            C53306j a3 = C53306j.m86809a(guVar.f127016d);
            if (a3 == null) {
                a3 = C53306j.UNKNOWNN;
            }
            if (a3 == jVar && (a = C49026ds.m85348a(dtVar2.f126815b)) != 0 && a == 3) {
                C18989s a4 = m36458a(dlVar, guVar);
                if (!set.contains(a4)) {
                    C18982l lVar = (C18982l) C18983m.f53340e.createBuilder();
                    lVar.copyOnWrite();
                    C18983m mVar = (C18983m) lVar.instance;
                    a4.getClass();
                    mVar.f53343b = a4;
                    mVar.f53342a |= 1;
                    C49116ha haVar = dlVar.f126797d;
                    if (haVar == null) {
                        haVar = C49116ha.f127027d;
                    }
                    C49118hc hcVar = haVar.f127030b;
                    if (hcVar == null) {
                        hcVar = C49118hc.f127034a;
                    }
                    lVar.copyOnWrite();
                    C18983m mVar2 = (C18983m) lVar.instance;
                    hcVar.getClass();
                    mVar2.f53344c = hcVar;
                    mVar2.f53342a |= 2;
                    C49111gw gwVar = guVar.f127014b;
                    if (gwVar == null) {
                        gwVar = C49111gw.f127019a;
                    }
                    lVar.copyOnWrite();
                    C18983m mVar3 = (C18983m) lVar.instance;
                    gwVar.getClass();
                    mVar3.f53345d = gwVar;
                    mVar3.f53342a |= 4;
                    e.mo55395g((C18983m) lVar.build());
                }
            }
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public static boolean m36462e(C49019dl dlVar, C53306j jVar) {
        return Collection.EL.stream(dlVar.f126798e).anyMatch(new C19027d(jVar));
    }
}
