package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.C16665d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16698n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16702r;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16724al;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.r */
/* compiled from: PG */
public final /* synthetic */ class C12824r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12830x f40032a;

    /* renamed from: b */
    public final /* synthetic */ Optional f40033b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f40034c;

    public /* synthetic */ C12824r(C12830x xVar, Optional optional, C51809dy dyVar) {
        this.f40032a = xVar;
        this.f40033b = optional;
        this.f40034c = dyVar;
    }

    public final Object apply(Object obj) {
        C16662b bVar;
        C12830x xVar = this.f40032a;
        Optional optional = this.f40033b;
        C51809dy dyVar = this.f40034c;
        C16665d dVar = (C16665d) obj;
        if (xVar.mo20803b((C51953ff) optional.get())) {
            Optional b = dVar.mo22953b();
            if (!b.isPresent() || ((C58485gu) b.get()).isEmpty()) {
                return C12788a.f39968c;
            }
        }
        C16698n nVar = xVar.f40042c;
        C16724al alVar = xVar.f40043d;
        C69464a aVar = (C69464a) nVar.f48868b.get(dyVar.f135936b);
        if (aVar == null || aVar.mo17428b() == null) {
            ((C59052c) ((C59052c) C16698n.f48867a.mo56226d()).mo56372aa(46774)).mo56389s("ClientOp cannot be handled by FormRender, clientOp = %s", dyVar.f135936b);
            nVar.f48869c.mo19974a(C37179a.f97483bB.mo40815i(C62722b.INVALID_ARGUMENT));
            bVar = null;
        } else {
            nVar.f48869c.mo19974a(C37179a.f97483bB.mo40815i(C62722b.OK));
            bVar = ((C16702r) aVar.mo17428b()).mo22976a(alVar, dyVar, dVar);
        }
        if (bVar == null) {
            return C12788a.f39966a;
        }
        xVar.f40041b.mo20751d(bVar);
        if (((Boolean) xVar.f40044e.mo17428b()).booleanValue()) {
            return C12788a.f39969d;
        }
        return C12788a.f39968c;
    }
}
