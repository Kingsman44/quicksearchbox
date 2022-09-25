package com.google.android.apps.gsa.search.shared.actions;

import com.google.assistant.p3879aw.p3880a.C50593b;
import com.google.assistant.p3879aw.p3881b.C50598ad;
import com.google.assistant.p3879aw.p3881b.C50607j;
import com.google.assistant.p3879aw.p3881b.C50609l;
import com.google.assistant.p3879aw.p3881b.C50611n;
import com.google.assistant.p3879aw.p3881b.C50613p;
import com.google.assistant.p3879aw.p3881b.C50619v;
import com.google.assistant.p3879aw.p3881b.C50623z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.b */
/* compiled from: PG */
public final class C87399b {
    /* renamed from: a */
    public static boolean m141527a(ActionData actionData) {
        int a;
        byte[] r = actionData.mo81106r();
        if (r != null) {
            try {
                C50598ad adVar = (C50598ad) C62942bv.parseFrom((C62942bv) C50598ad.f131652c, r);
                if ((adVar.f131654a & 16) != 0) {
                    C50623z zVar = adVar.f131655b;
                    if (zVar == null) {
                        zVar = C50623z.f131700b;
                    }
                    for (C50619v vVar : zVar.f131702a) {
                        if ((vVar.f131694a & 32) != 0) {
                            C50611n nVar = vVar.f131695b;
                            if (nVar == null) {
                                nVar = C50611n.f131679b;
                            }
                            for (C50609l lVar : nVar.f131681a) {
                                C50613p pVar = lVar.f131677a;
                                if (pVar == null) {
                                    pVar = C50613p.f131682d;
                                }
                                if ((pVar.f131684a & 1) != 0) {
                                    C50613p pVar2 = lVar.f131677a;
                                    if (pVar2 == null) {
                                        pVar2 = C50613p.f131682d;
                                    }
                                    C63070h hVar = pVar2.f131685b;
                                    if (hVar == null) {
                                        hVar = C63070h.f170215c;
                                    }
                                    C50607j jVar = (C50607j) C62942bv.parseFrom((C62942bv) C50607j.f131671c, hVar.f170218b);
                                    if (!((jVar.f131673a & 1) == 0 || (a = C50593b.m85858a(jVar.f131674b)) == 0 || a != 6)) {
                                        return true;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
