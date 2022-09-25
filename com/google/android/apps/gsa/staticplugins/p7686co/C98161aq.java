package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7635eh;
import com.google.p375ai.p378b.C7643ep;
import com.google.p375ai.p378b.C7644eq;
import com.google.p375ai.p378b.C7719hk;
import com.google.p375ai.p378b.C7720hl;
import com.google.p375ai.p378b.C7754is;
import com.google.p375ai.p378b.C7762j;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7975qx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.aq */
/* compiled from: PG */
public final /* synthetic */ class C98161aq implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98236ba f274112a;

    /* renamed from: b */
    public final /* synthetic */ C7975qx f274113b;

    /* renamed from: c */
    public final /* synthetic */ C7754is f274114c;

    /* renamed from: d */
    public final /* synthetic */ List f274115d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f274116e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f274117f;

    /* renamed from: g */
    public final /* synthetic */ C7762j f274118g;

    /* renamed from: h */
    public final /* synthetic */ Set f274119h;

    /* renamed from: i */
    public final /* synthetic */ List f274120i;

    public /* synthetic */ C98161aq(C98236ba baVar, C7975qx qxVar, C7754is isVar, List list, C58833ax axVar, C58833ax axVar2, C7762j jVar, Set set, List list2) {
        this.f274112a = baVar;
        this.f274113b = qxVar;
        this.f274114c = isVar;
        this.f274115d = list;
        this.f274116e = axVar;
        this.f274117f = axVar2;
        this.f274118g = jVar;
        this.f274119h = set;
        this.f274120i = list2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C98236ba baVar = this.f274112a;
        C7975qx qxVar = this.f274113b;
        C7754is isVar = this.f274114c;
        List list = this.f274115d;
        C58833ax axVar = this.f274116e;
        C58833ax axVar2 = this.f274117f;
        C7762j jVar = this.f274118g;
        Set set = this.f274119h;
        List list2 = this.f274120i;
        C7950pz pzVar = (C7950pz) baVar.f274275b.toBuilder();
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        qxVar.getClass();
        qaVar.f27925f = qxVar;
        qaVar.f27920a |= 32;
        pzVar.copyOnWrite();
        C7952qa qaVar2 = (C7952qa) pzVar.instance;
        isVar.getClass();
        qaVar2.f27931l = isVar;
        qaVar2.f27920a |= 16384;
        pzVar.copyOnWrite();
        ((C7952qa) pzVar.instance).f27940u = C7952qa.emptyIntList();
        pzVar.copyOnWrite();
        C7952qa qaVar3 = (C7952qa) pzVar.instance;
        C62961ch chVar = qaVar3.f27940u;
        if (!chVar.mo58948c()) {
            qaVar3.f27940u = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) list, (List) qaVar3.f27940u);
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            pzVar.copyOnWrite();
            C7952qa qaVar4 = (C7952qa) pzVar.instance;
            str.getClass();
            qaVar4.f27920a |= C89885b.HTTP_VALUE;
            qaVar4.f27941v = str;
        }
        if (axVar2.mo56113h()) {
            C7635eh ehVar = (C7635eh) axVar2.mo56107c();
            pzVar.copyOnWrite();
            C7952qa qaVar5 = (C7952qa) pzVar.instance;
            ehVar.getClass();
            C62971cq cqVar = qaVar5.f27934o;
            if (!cqVar.mo58948c()) {
                qaVar5.f27934o = C62942bv.mutableCopy(cqVar);
            }
            qaVar5.f27934o.add(ehVar);
        }
        pzVar.copyOnWrite();
        C7952qa qaVar6 = (C7952qa) pzVar.instance;
        jVar.getClass();
        qaVar6.f27923d = jVar;
        qaVar6.f27920a |= 8;
        if (!set.isEmpty()) {
            pzVar.copyOnWrite();
            ((C7952qa) pzVar.instance).f27942w = C62942bv.emptyProtobufList();
            pzVar.copyOnWrite();
            C7952qa qaVar7 = (C7952qa) pzVar.instance;
            C62971cq cqVar2 = qaVar7.f27942w;
            if (!cqVar2.mo58948c()) {
                qaVar7.f27942w = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) set, (List) qaVar7.f27942w);
        }
        if ((((C7952qa) pzVar.instance).f27920a & 4) != 0 && !list2.isEmpty()) {
            C7720hl hlVar = ((C7952qa) pzVar.instance).f27922c;
            if (hlVar == null) {
                hlVar = C7720hl.f26986e;
            }
            C7719hk hkVar = (C7719hk) hlVar.toBuilder();
            C7644eq eqVar = ((C7720hl) hkVar.instance).f26989b;
            if (eqVar == null) {
                eqVar = C7644eq.f26534e;
            }
            C7643ep epVar = (C7643ep) eqVar.toBuilder();
            epVar.copyOnWrite();
            ((C7644eq) epVar.instance).f26538c = C7644eq.emptyProtobufList();
            epVar.copyOnWrite();
            C7644eq eqVar2 = (C7644eq) epVar.instance;
            C62971cq cqVar3 = eqVar2.f26538c;
            if (!cqVar3.mo58948c()) {
                eqVar2.f26538c = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll((Iterable) list2, (List) eqVar2.f26538c);
            hkVar.copyOnWrite();
            C7720hl hlVar2 = (C7720hl) hkVar.instance;
            C7644eq eqVar3 = (C7644eq) epVar.build();
            eqVar3.getClass();
            hlVar2.f26989b = eqVar3;
            hlVar2.f26988a |= 1;
            pzVar.copyOnWrite();
            C7952qa qaVar8 = (C7952qa) pzVar.instance;
            C7720hl hlVar3 = (C7720hl) hkVar.build();
            hlVar3.getClass();
            qaVar8.f27922c = hlVar3;
            qaVar8.f27920a |= 4;
        }
        return (C7952qa) pzVar.build();
    }
}
