package com.google.android.libraries.gsa.conversation.p1855h.p1857b;

import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.h.b.a */
/* compiled from: PG */
public final class C22698a {
    /* renamed from: a */
    public static C51183n m42264a(List list) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C58759qy qyVar = new C58759qy("mic.UPDATE");
        C51182m mVar = (C51182m) C51183n.f133226e.createBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        C51174e eVar = null;
        C51174e eVar2 = null;
        C51174e eVar3 = null;
        while (it.hasNext()) {
            C52083ep epVar = (C52083ep) it.next();
            if (m42266c(epVar, "tts.OUTPUT")) {
                if (eVar == null) {
                    arrayList.add(Integer.valueOf(i));
                    eVar = (C51174e) C51175f.f133205f.createBuilder();
                    eVar.copyOnWrite();
                    C51175f fVar = (C51175f) eVar.instance;
                    fVar.f133207a |= 1;
                    fVar.f133208b = i;
                    i++;
                }
                eVar.mo53531b(epVar.f136694d);
            } else if (m42266c(epVar, "chat_message.SEND")) {
                if (eVar2 == null) {
                    arrayList.add(Integer.valueOf(i));
                    eVar2 = (C51174e) C51175f.f133205f.createBuilder();
                    eVar2.copyOnWrite();
                    C51175f fVar2 = (C51175f) eVar2.instance;
                    fVar2.f133207a |= 1;
                    fVar2.f133208b = i;
                    i++;
                }
                eVar2.mo53531b(epVar.f136694d);
            } else {
                if (!qyVar.isEmpty()) {
                    if (epVar.f136692b == 4) {
                        eiVar = (C52076ei) epVar.f136693c;
                    } else {
                        eiVar = C52076ei.f136664f;
                    }
                    if ((eiVar.f136666a & 32) != 0) {
                        if (epVar.f136692b == 4) {
                            eiVar2 = (C52076ei) epVar.f136693c;
                        } else {
                            eiVar2 = C52076ei.f136664f;
                        }
                        C51809dy dyVar = eiVar2.f136668c;
                        if (dyVar == null) {
                            dyVar = C51809dy.f135933f;
                        }
                        if (qyVar.f156534a.equals(dyVar.f135936b)) {
                            if (eVar3 == null) {
                                eVar3 = (C51174e) C51175f.f133205f.createBuilder();
                                eVar3.copyOnWrite();
                                C51175f fVar3 = (C51175f) eVar3.instance;
                                fVar3.f133207a |= 1;
                                fVar3.f133208b = i;
                                i++;
                            }
                            eVar3.mo53531b(epVar.f136694d);
                        }
                    }
                }
                arrayList.add(Integer.valueOf(i));
                C51174e eVar4 = (C51174e) C51175f.f133205f.createBuilder();
                eVar4.copyOnWrite();
                C51175f fVar4 = (C51175f) eVar4.instance;
                fVar4.f133207a |= 1;
                fVar4.f133208b = i;
                eVar4.mo53531b(epVar.f136694d);
                mVar.mo53548c(eVar4);
                i++;
            }
        }
        if (eVar != null) {
            mVar.mo53548c(eVar);
        }
        if (eVar2 != null) {
            mVar.mo53548c(eVar2);
        }
        m42265b(mVar, arrayList);
        if (eVar3 != null) {
            mVar.mo53548c(eVar3);
            m42265b(mVar, C58485gu.m89846n(Integer.valueOf(((C51175f) eVar3.instance).f133208b)));
        }
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.SEND_RESPONSE;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.FINISH;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        mVar.mo53550e(iVar2);
        return (C51183n) mVar.build();
    }

    /* renamed from: b */
    private static void m42265b(C51182m mVar, List list) {
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.START_BBS;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        iVar.mo53542a(list);
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.JOIN_BBS;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        iVar2.mo53542a(list);
        mVar.mo53550e(iVar2);
    }

    /* renamed from: c */
    private static boolean m42266c(C52083ep epVar, String str) {
        C52076ei eiVar;
        C52076ei eiVar2;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        if ((eiVar.f136666a & 32) == 0) {
            return false;
        }
        if (epVar.f136692b == 4) {
            eiVar2 = (C52076ei) epVar.f136693c;
        } else {
            eiVar2 = C52076ei.f136664f;
        }
        C51809dy dyVar = eiVar2.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        return str.equals(dyVar.f135936b);
    }
}
