package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85331i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.ai */
/* compiled from: PG */
public final class C115431ai {
    /* renamed from: a */
    public static C60870cx m191421a(C85349r rVar, C52174hz hzVar, C85350s sVar) {
        C52583xc xcVar;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C60870cx h = C60922j.m93045h(C85331i.m136801c(rVar, (xcVar.f138065a & 64) != 0), new C115427ae(hzVar, sVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: b */
    public static C60870cx m191422b(C85349r rVar, C52174hz hzVar, C85350s sVar) {
        C60870cx a = m191421a(rVar, hzVar, sVar);
        return C60856cj.m92893b(a).mo57334a(new C115424ab(a, hzVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public static C60870cx m191423c(C86124t tVar, C52174hz hzVar, C85349r rVar, C85350s sVar) {
        if (tVar.mo79746e(C90125fw.f250937p)) {
            return C60856cj.m92900i(false);
        }
        if (!tVar.mo79746e(C90125fw.f250919ai)) {
            return C60856cj.m92900i(false);
        }
        if (!tVar.mo79746e(C90125fw.f250886C)) {
            return C60856cj.m92900i(true);
        }
        C60870cx g = C60922j.m93044g(m191421a(rVar, hzVar, sVar), new C115425ac(tVar, hzVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
