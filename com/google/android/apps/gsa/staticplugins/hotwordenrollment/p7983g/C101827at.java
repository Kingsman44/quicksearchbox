package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101636a;
import com.google.assistant.p3861at.C49960fj;
import com.google.assistant.p3861at.C49961fk;
import com.google.assistant.p3861at.C49965fo;
import com.google.assistant.p3861at.C49966fp;
import com.google.assistant.p3861at.C49967fq;
import com.google.assistant.p3861at.C49968fr;
import com.google.assistant.p3861at.C49969fs;
import com.google.assistant.p3861at.C49987gj;
import com.google.assistant.p3861at.C49988gk;
import com.google.assistant.p3861at.C49990gm;
import com.google.assistant.p3861at.C50439xc;
import com.google.assistant.p3861at.C50441xe;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.at */
/* compiled from: PG */
public final /* synthetic */ class C101827at implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101832ay f284015a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f284016b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f284017c;

    public /* synthetic */ C101827at(C101832ay ayVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f284015a = ayVar;
        this.f284016b = cxVar;
        this.f284017c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101832ay ayVar = this.f284015a;
        C60870cx cxVar = this.f284016b;
        C60870cx cxVar2 = this.f284017c;
        byte[] bArr = (byte[]) C60856cj.m92909r(cxVar);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128945a |= 512;
        acv2.f128954j = true;
        acu.copyOnWrite();
        acv acv3 = (acv) acu.instance;
        acv3.f128946b |= 8388608;
        acv3.f128934M = true;
        C49960fj fjVar = (C49960fj) C49961fk.f129885d.createBuilder();
        String str = ayVar.f284030j;
        fjVar.copyOnWrite();
        C49961fk fkVar = (C49961fk) fjVar.instance;
        str.getClass();
        fkVar.f129887a |= 8;
        fkVar.f129888b = str;
        if (ayVar.f284033m.mo92669c()) {
            C49987gj gjVar = (C49987gj) C49988gk.f129941e.createBuilder();
            s sVar = s.a;
            int ordinal = ayVar.f284031k.mo70884b().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C49967fq fqVar = C49967fq.f129898c;
                    gjVar.copyOnWrite();
                    C49988gk gkVar = (C49988gk) gjVar.instance;
                    fqVar.getClass();
                    gkVar.f129945c = fqVar;
                    gkVar.f129944b = 2;
                } else if (ordinal == 2) {
                    if (ayVar.f284031k.mo70888f().mo70866c() == 2 && ((C101636a) ayVar.f284029i.mo27525b()).mo92453a(1) == 3) {
                        C49966fp fpVar = (C49966fp) C49967fq.f129898c.createBuilder();
                        fpVar.copyOnWrite();
                        C49967fq fqVar2 = (C49967fq) fpVar.instance;
                        fqVar2.f129900a |= 1;
                        fqVar2.f129901b = true;
                        gjVar.copyOnWrite();
                        C49988gk gkVar2 = (C49988gk) gjVar.instance;
                        C49967fq fqVar3 = (C49967fq) fpVar.build();
                        fqVar3.getClass();
                        gkVar2.f129945c = fqVar3;
                        gkVar2.f129944b = 2;
                    } else {
                        C49968fr frVar = (C49968fr) C49969fs.f129902c.createBuilder();
                        String b = ayVar.f284031k.mo70888f().mo70865b();
                        frVar.copyOnWrite();
                        C49969fs fsVar = (C49969fs) frVar.instance;
                        b.getClass();
                        fsVar.f129904a |= 1;
                        fsVar.f129905b = b;
                        gjVar.copyOnWrite();
                        C49988gk gkVar3 = (C49988gk) gjVar.instance;
                        C49969fs fsVar2 = (C49969fs) frVar.build();
                        fsVar2.getClass();
                        gkVar3.f129945c = fsVar2;
                        gkVar3.f129944b = 3;
                    }
                }
            } else if (!ayVar.f284031k.mo70887e().mo70856e() || !ayVar.f284031k.mo70887e().mo70853a().mo70880d()) {
                C49965fo foVar = C49965fo.f129896a;
                gjVar.copyOnWrite();
                C49988gk gkVar4 = (C49988gk) gjVar.instance;
                foVar.getClass();
                gkVar4.f129945c = foVar;
                gkVar4.f129944b = 5;
            } else {
                C49990gm gmVar = C49990gm.f129947a;
                gjVar.copyOnWrite();
                C49988gk gkVar5 = (C49988gk) gjVar.instance;
                gmVar.getClass();
                gkVar5.f129945c = gmVar;
                gkVar5.f129944b = 7;
            }
            gjVar.copyOnWrite();
            C49988gk gkVar6 = (C49988gk) gjVar.instance;
            gkVar6.f129943a |= 16;
            gkVar6.f129946d = booleanValue;
            fjVar.copyOnWrite();
            C49961fk fkVar2 = (C49961fk) fjVar.instance;
            C49988gk gkVar7 = (C49988gk) gjVar.build();
            gkVar7.getClass();
            fkVar2.f129889c = gkVar7;
            fkVar2.f129887a |= 16;
        }
        C49961fk fkVar3 = (C49961fk) fjVar.build();
        acu.copyOnWrite();
        acv acv4 = (acv) acu.instance;
        fkVar3.getClass();
        acv4.f128943V = fkVar3;
        acv4.f128947c |= 8192;
        if (bArr != C101832ay.f284024d) {
            C50439xc xcVar = (C50439xc) C50441xe.f131276e.createBuilder();
            C63088z A = C63088z.m96139A(bArr);
            xcVar.copyOnWrite();
            C50441xe xeVar = (C50441xe) xcVar.instance;
            xeVar.f131278a |= 1;
            xeVar.f131279b = A;
            C50441xe xeVar2 = (C50441xe) xcVar.build();
            acu.copyOnWrite();
            acv acv5 = (acv) acu.instance;
            acv5.f128945a |= 1048576;
            acv5.f128963s = true;
            acu.copyOnWrite();
            acv acv6 = (acv) acu.instance;
            xeVar2.getClass();
            acv6.f128964t = xeVar2;
            acv6.f128945a |= C89885b.NOW_VALUE;
        }
        return C2169h.m6027a(new C101830aw(ayVar, (acv) acu.build()));
    }
}
