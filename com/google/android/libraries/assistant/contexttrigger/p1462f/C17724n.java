package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48893ah;
import com.google.assistant.p3803ag.p3807b.p3808a.C48897al;
import com.google.assistant.p3803ag.p3807b.p3808a.C48898am;
import com.google.assistant.p3803ag.p3807b.p3808a.C48899an;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashMap;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.n */
/* compiled from: PG */
public final /* synthetic */ class C17724n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17730t f50930a;

    /* renamed from: b */
    public final /* synthetic */ C48917s f50931b;

    public /* synthetic */ C17724n(C17730t tVar, C48917s sVar) {
        this.f50930a = tVar;
        this.f50931b = sVar;
    }

    public final C60870cx apply(Object obj) {
        C17730t tVar = this.f50930a;
        C48917s sVar = this.f50931b;
        Void voidR = (Void) obj;
        C17703ai aiVar = tVar.f50944g;
        C58976aa aaVar = C58975e.f156826a;
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        String str = uVar.f126591d;
        C17716h a = aiVar.f50902c.mo23448a(sVar, aiVar.f50904e);
        a.f50919c = 0;
        a.f50920d = new HashMap();
        C48898am amVar = (C48898am) C48899an.f126532g.createBuilder();
        C48893ah ahVar = (C48893ah) C48897al.f126526e.createBuilder();
        Optional a2 = a.mo23446a();
        C48952az azVar = a.f50918b.f126582c;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        a.mo23447b(azVar, ahVar);
        C48897al alVar = (C48897al) ahVar.build();
        amVar.copyOnWrite();
        C48899an anVar = (C48899an) amVar.instance;
        alVar.getClass();
        anVar.f126538e = alVar;
        anVar.f126534a |= 8;
        C48917s sVar2 = a.f50918b;
        amVar.copyOnWrite();
        C48899an anVar2 = (C48899an) amVar.instance;
        sVar2.getClass();
        anVar2.f126535b = sVar2;
        anVar2.f126534a |= 1;
        C17694a aVar = new C17694a((C48899an) amVar.build(), C58495hd.m89898l(a.f50920d), a2);
        return C47633f.m84733g(aiVar.f50900a.mo46039a(new C17701ag(sVar, aVar, C62953e.m95484i(aiVar.f50903d.mo26870b())), aiVar.f50901b)).mo51515h(new C17702ah(aVar), aiVar.f50901b);
    }
}
