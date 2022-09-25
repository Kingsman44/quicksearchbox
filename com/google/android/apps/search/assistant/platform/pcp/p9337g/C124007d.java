package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123771ck;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.assistant.p3994s.p3995a.C53126ci;
import com.google.assistant.p3994s.p3995a.C53127cj;
import com.google.assistant.p3994s.p3995a.C53128ck;
import com.google.assistant.p3994s.p3995a.C53131cn;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.d */
/* compiled from: PG */
public final /* synthetic */ class C124007d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124012i f342518a;

    public /* synthetic */ C124007d(C124012i iVar) {
        this.f342518a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C124012i iVar = this.f342518a;
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        for (C53126ci ciVar : (List) obj) {
            Instant a = iVar.f342529e.mo57444a();
            Integer b = C124089bo.m203514b(Integer.valueOf(ciVar.f139233c));
            ArrayList<C123744bk> arrayList = new ArrayList<>();
            if (ciVar.f139235e.size() > 0) {
                for (C53132co coVar : ciVar.f139235e) {
                    C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
                    String str = ciVar.f139232b;
                    bjVar.copyOnWrite();
                    C123744bk bkVar = (C123744bk) bjVar.instance;
                    str.getClass();
                    bkVar.f341806a |= 4;
                    bkVar.f341812g = str;
                    int intValue = b.intValue();
                    bjVar.copyOnWrite();
                    C123744bk bkVar2 = (C123744bk) bjVar.instance;
                    bkVar2.f341806a |= 1;
                    bkVar2.f341810e = intValue;
                    if ((coVar.f139252a & 64) != 0) {
                        String str2 = coVar.f139257f;
                        bjVar.copyOnWrite();
                        C123744bk bkVar3 = (C123744bk) bjVar.instance;
                        str2.getClass();
                        bkVar3.f341806a |= 2;
                        bkVar3.f341811f = str2;
                    }
                    C123771ck ckVar = (C123771ck) C123772cl.f341902h.createBuilder();
                    if ((coVar.f139252a & 128) != 0) {
                        C63088z zVar = coVar.f139258g;
                        ckVar.copyOnWrite();
                        C123772cl clVar = (C123772cl) ckVar.instance;
                        zVar.getClass();
                        clVar.f341904a |= 32;
                        clVar.f341910g = zVar;
                    }
                    if ((coVar.f139252a & 2) != 0) {
                        C53424nj njVar = coVar.f139254c;
                        if (njVar == null) {
                            njVar = C53424nj.f140199d;
                        }
                        ckVar.copyOnWrite();
                        C123772cl clVar2 = (C123772cl) ckVar.instance;
                        njVar.getClass();
                        clVar2.f341907d = njVar;
                        clVar2.f341904a |= 4;
                    }
                    C53131cn cnVar = coVar.f139259h;
                    if (cnVar == null) {
                        cnVar = C53131cn.f139246c;
                    }
                    if ((cnVar.f139248a & 2) != 0) {
                        C53131cn cnVar2 = coVar.f139259h;
                        if (cnVar2 == null) {
                            cnVar2 = C53131cn.f139246c;
                        }
                        String str3 = cnVar2.f139249b;
                        ckVar.copyOnWrite();
                        C123772cl clVar3 = (C123772cl) ckVar.instance;
                        str3.getClass();
                        clVar3.f341904a |= 16;
                        clVar3.f341909f = str3;
                    }
                    if ((coVar.f139252a & 1024) != 0) {
                        C53128ck ckVar2 = coVar.f139261j;
                        if (ckVar2 == null) {
                            ckVar2 = C53128ck.f139238f;
                        }
                        C123612ae.m202971e(bjVar, (C53127cj) ckVar2.toBuilder(), a);
                    }
                    if ((coVar.f139252a & 512) != 0) {
                        C53308jb jbVar = coVar.f139260i;
                        if (jbVar == null) {
                            jbVar = C53308jb.f139794f;
                        }
                        if ((jbVar.f139796a & 4) != 0) {
                            int i = jbVar.f139799d;
                            ckVar.copyOnWrite();
                            C123772cl clVar4 = (C123772cl) ckVar.instance;
                            clVar4.f341904a |= 1;
                            clVar4.f341905b = i;
                        }
                        if ((jbVar.f139796a & 1) != 0) {
                            C63204j jVar = jbVar.f139797b;
                            if (jVar == null) {
                                jVar = C63204j.f170749e;
                            }
                            ckVar.copyOnWrite();
                            C123772cl clVar5 = (C123772cl) ckVar.instance;
                            jVar.getClass();
                            clVar5.f341906c = jVar;
                            clVar5.f341904a |= 2;
                        }
                        if ((jbVar.f139796a & 2) != 0) {
                            boolean z = jbVar.f139798c;
                            ckVar.copyOnWrite();
                            C123772cl clVar6 = (C123772cl) ckVar.instance;
                            clVar6.f341904a |= 8;
                            clVar6.f341908e = z;
                        }
                    }
                    if (!C123772cl.f341902h.equals(ckVar.build())) {
                        bjVar.copyOnWrite();
                        C123744bk bkVar4 = (C123744bk) bjVar.instance;
                        C123772cl clVar7 = (C123772cl) ckVar.build();
                        clVar7.getClass();
                        bkVar4.f341816k = clVar7;
                        bkVar4.f341807b |= 8;
                    }
                    arrayList.add(C123612ae.m202968b(bjVar, ciVar));
                }
            } else {
                C123743bj bjVar2 = (C123743bj) C123744bk.f341804l.createBuilder();
                String str4 = ciVar.f139232b;
                bjVar2.copyOnWrite();
                C123744bk bkVar5 = (C123744bk) bjVar2.instance;
                str4.getClass();
                bkVar5.f341806a |= 4;
                bkVar5.f341812g = str4;
                int intValue2 = b.intValue();
                bjVar2.copyOnWrite();
                C123744bk bkVar6 = (C123744bk) bjVar2.instance;
                bkVar6.f341806a |= 1;
                bkVar6.f341810e = intValue2;
                arrayList.add(C123612ae.m202968b(bjVar2, ciVar));
            }
            for (C123744bk c : arrayList) {
                blVar.mo106126c(c);
            }
        }
        return C60856cj.m92900i((C123746bm) blVar.build());
    }
}
