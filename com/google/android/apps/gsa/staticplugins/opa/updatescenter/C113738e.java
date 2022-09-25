package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50630af;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50631ag;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50660w;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.e */
/* compiled from: PG */
public final /* synthetic */ class C113738e implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C113738e f314983a = new C113738e();

    private /* synthetic */ C113738e() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && ((Boolean) axVar.mo56107c()).booleanValue()) {
            return C50638an.f131726h;
        }
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = true;
        C50660w wVar = (C50660w) C50662y.f131783c.createBuilder();
        C50630af afVar = (C50630af) C50631ag.f131717c.createBuilder();
        afVar.copyOnWrite();
        C50631ag agVar = (C50631ag) afVar.instance;
        agVar.f131719a = 1;
        agVar.f131720b = "default-first-badge";
        wVar.copyOnWrite();
        C50631ag agVar2 = (C50631ag) afVar.build();
        agVar2.getClass();
        ((C50662y) wVar.instance).f131785a = agVar2;
        amVar.mo53414c(wVar);
        return (C50638an) amVar.build();
    }
}
