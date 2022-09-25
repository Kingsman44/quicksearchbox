package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14525ml;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45625ae;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45631ak;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45639as;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45640at;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61753o;
import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.p4242bp.p4266g.C56359i;
import com.google.p4242bp.p4266g.C56364n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62947c;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4985f.p5001d.C64823e;
import com.google.protos.p4985f.p5001d.C64824f;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.e */
/* compiled from: PG */
public final class C15377e {
    /* renamed from: a */
    public static C61752n m31987a(C14636z zVar) {
        String str;
        C58480gp e = C58485gu.m89837e();
        for (C14525ml mlVar : zVar.f44235d) {
            C45639as asVar = (C45639as) C45640at.f120065g.createBuilder();
            int i = mlVar.f43907b;
            if (i == 12) {
                str = "main";
            } else if (i == 13) {
                str = "otherFax";
            } else if (i == 17) {
                str = "workMobile";
            } else if (i != 18) {
                switch (i) {
                    case 1:
                        str = "home";
                        break;
                    case 2:
                        str = "mobile";
                        break;
                    case 3:
                        str = "work";
                        break;
                    case 4:
                        str = "workFax";
                        break;
                    case 5:
                        str = "homeFax";
                        break;
                    case 6:
                        str = "pager";
                        break;
                    default:
                        str = "other";
                        break;
                }
            } else {
                str = "workPager";
            }
            asVar.copyOnWrite();
            C45640at atVar = (C45640at) asVar.instance;
            atVar.f120067a |= 4;
            atVar.f120070d = str;
            String str2 = mlVar.f43906a;
            asVar.copyOnWrite();
            C45640at atVar2 = (C45640at) asVar.instance;
            str2.getClass();
            atVar2.f120067a |= 16;
            atVar2.f120071e = str2;
            String str3 = mlVar.f43906a;
            asVar.copyOnWrite();
            C45640at atVar3 = (C45640at) asVar.instance;
            str3.getClass();
            atVar3.f120067a = 2 | atVar3.f120067a;
            atVar3.f120069c = str3;
            e.mo55395g((C45640at) asVar.build());
        }
        C56359i iVar = (C56359i) C56364n.f150310j.createBuilder();
        iVar.copyOnWrite();
        C56364n nVar = (C56364n) iVar.instance;
        nVar.f150313b = 2;
        nVar.f150312a |= 1;
        String str4 = zVar.f44232a;
        iVar.copyOnWrite();
        C56364n nVar2 = (C56364n) iVar.instance;
        str4.getClass();
        nVar2.f150312a |= 524288;
        nVar2.f150319h = str4;
        C45631ak akVar = (C45631ak) C45632al.f120021r.createBuilder();
        C45625ae aeVar = (C45625ae) C45626af.f120002i.createBuilder();
        String str5 = zVar.f44232a;
        aeVar.copyOnWrite();
        C45626af afVar = (C45626af) aeVar.instance;
        str5.getClass();
        afVar.f120004a |= 2;
        afVar.f120006c = str5;
        akVar.mo49716f(aeVar);
        C58485gu f = e.mo55394f();
        akVar.copyOnWrite();
        C45632al alVar = (C45632al) akVar.instance;
        alVar.mo49722c();
        C62947c.addAll((Iterable) f, (List) alVar.f120029g);
        iVar.copyOnWrite();
        C56364n nVar3 = (C56364n) iVar.instance;
        C45632al alVar2 = (C45632al) akVar.build();
        alVar2.getClass();
        nVar3.f150314c = alVar2;
        nVar3.f150312a |= 16;
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar4 = (C61752n) mVar.instance;
        nVar4.f166810a |= 4;
        nVar4.f166811b = "Personal_contact";
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "person";
        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
        C63564a aVar = (C63564a) C63565b.f171933j.createBuilder();
        String str6 = zVar.f44232a;
        aVar.copyOnWrite();
        C63565b bVar = (C63565b) aVar.instance;
        str6.getClass();
        bVar.f171935a |= 1;
        bVar.f171936b = str6;
        String str7 = zVar.f44232a;
        aVar.copyOnWrite();
        C63565b bVar2 = (C63565b) aVar.instance;
        str7.getClass();
        bVar2.f171935a |= 8;
        bVar2.f171939e = str7;
        aVar.copyOnWrite();
        C63565b bVar3 = (C63565b) aVar.instance;
        bVar3.f171935a = 2 | bVar3.f171935a;
        bVar3.f171937c = true;
        aVar.mo59218c((C56364n) iVar.build());
        iVar2.copyOnWrite();
        C61748j jVar = (C61748j) iVar2.instance;
        C63565b bVar4 = (C63565b) aVar.build();
        bVar4.getClass();
        jVar.f166803b = bVar4;
        jVar.f166802a = 9;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar2.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        mVar.mo58184c(gVar);
        m31988b(mVar);
        return (C61752n) mVar.build();
    }

    /* renamed from: b */
    public static void m31988b(C61751m mVar) {
        C61753o oVar = (C61753o) C61754p.f166816a.createBuilder();
        C62940bt btVar = C64824f.f175668d;
        C64823e eVar = (C64823e) C64824f.f175667c.createBuilder();
        eVar.copyOnWrite();
        C64824f fVar = (C64824f) eVar.instance;
        fVar.f175671b = 1;
        fVar.f175670a = 1 | fVar.f175670a;
        oVar.mo58885m(btVar, (C64824f) eVar.build());
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        C61754p pVar = (C61754p) oVar.build();
        C61752n nVar2 = C61752n.f166808f;
        pVar.getClass();
        nVar.f166813d = pVar;
        nVar.f166810a |= 8;
    }
}
