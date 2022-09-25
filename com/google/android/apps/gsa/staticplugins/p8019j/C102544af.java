package com.google.android.apps.gsa.staticplugins.p8019j;

import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.search.assistant.proactive.C36335p;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51727by;
import com.google.assistant.p3897e.p3921j.C51792dh;
import com.google.assistant.p3897e.p3921j.C51796dl;
import com.google.assistant.p3897e.p3921j.C51797dm;
import com.google.assistant.p3897e.p3921j.C51798dn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.af */
/* compiled from: PG */
public final /* synthetic */ class C102544af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286183a;

    /* renamed from: b */
    public final /* synthetic */ C102549ak f286184b;

    public /* synthetic */ C102544af(C102550al alVar, C102549ak akVar) {
        this.f286183a = alVar;
        this.f286184b = akVar;
    }

    public final C60870cx apply(Object obj) {
        C51727by byVar;
        C102550al alVar = this.f286183a;
        C102549ak akVar = this.f286184b;
        C51714bl blVar = (C51714bl) obj;
        boolean b = C1793aj.m4937b(new C1800aq(alVar.f286202b).f5622a);
        C51792dh dhVar = (C51792dh) C51798dn.f135907e.createBuilder();
        if (b) {
            byVar = C51727by.NOTIFICATIONS_ENABLED;
        } else {
            byVar = C51727by.NOTIFICATIONS_DISABLED;
        }
        dhVar.copyOnWrite();
        C51798dn dnVar = (C51798dn) dhVar.instance;
        dnVar.f135910b = byVar.f135712d;
        dnVar.f135909a |= 1;
        ArrayList arrayList = new ArrayList();
        for (C36335p pVar : C36335p.values()) {
            C51796dl dlVar = (C51796dl) C51797dm.f135902d.createBuilder();
            C48980c cVar = pVar.f94899i;
            dlVar.copyOnWrite();
            C51797dm dmVar = (C51797dm) dlVar.instance;
            dmVar.f135905b = cVar.getNumber();
            dmVar.f135904a |= 1;
            boolean i = alVar.f286206f.mo40122i(pVar.name());
            dlVar.copyOnWrite();
            C51797dm dmVar2 = (C51797dm) dlVar.instance;
            dmVar2.f135904a |= 2;
            dmVar2.f135906c = i;
            arrayList.add((C51797dm) dlVar.build());
        }
        dhVar.mo53727a(arrayList);
        C60870cx g = C60922j.m93044g(alVar.f286206f.mo40116c(dhVar), new C102602y(blVar, dhVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return C60922j.m93045h(g, new C102542ad(alVar, blVar, akVar), C60826bg.f164896a);
    }
}
