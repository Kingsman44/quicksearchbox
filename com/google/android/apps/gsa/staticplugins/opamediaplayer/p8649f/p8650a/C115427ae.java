package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85344m;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85331i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C115427ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C52174hz f320251a;

    /* renamed from: b */
    public final /* synthetic */ C85350s f320252b;

    public /* synthetic */ C115427ae(C52174hz hzVar, C85350s sVar) {
        this.f320251a = hzVar;
        this.f320252b = sVar;
    }

    public final C60870cx apply(Object obj) {
        C52583xc xcVar;
        C52174hz hzVar = this.f320251a;
        C85350s sVar = this.f320252b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return C60856cj.m92900i((String) axVar.mo56107c());
        }
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        String str = xcVar.f138073i;
        if (!str.isEmpty()) {
            return C60856cj.m92900i(str);
        }
        C119103al a = C85331i.m136799a(hzVar, false);
        C85346o oVar = new C85346o("SPEAKR_DEFAULT_SESSION", sVar);
        C60870cx h = C60922j.m93045h(C60922j.m93044g(oVar.f231139b.mo78878m(oVar.f231138a, a), new C85344m(oVar), C60826bg.f164896a), C115428af.f320253a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
