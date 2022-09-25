package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p3055n.C39654ch;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66905dv;
import com.google.speech.p5218j.C66906dw;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ab */
/* compiled from: PG */
public final /* synthetic */ class C120835ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120844ak f336009a;

    /* renamed from: b */
    public final /* synthetic */ C39654ch f336010b;

    public /* synthetic */ C120835ab(C120844ak akVar, C39654ch chVar) {
        this.f336009a = akVar;
        this.f336010b = chVar;
    }

    public final C60870cx apply(Object obj) {
        C120844ak akVar = this.f336009a;
        C39654ch chVar = this.f336010b;
        Void voidR = (Void) obj;
        if (!akVar.f336031m) {
            return C60866ct.f164955a;
        }
        C66905dv dvVar = (C66905dv) C66906dw.f181875e.createBuilder();
        dvVar.copyOnWrite();
        C66906dw dwVar = (C66906dw) dvVar.instance;
        dwVar.f181878b = 1;
        dwVar.f181877a |= 1;
        dvVar.copyOnWrite();
        C66906dw dwVar2 = (C66906dw) dvVar.instance;
        dwVar2.f181879c = 1;
        dwVar2.f181877a |= 16;
        dvVar.copyOnWrite();
        C66906dw dwVar3 = (C66906dw) dvVar.instance;
        dwVar3.f181877a |= 64;
        dwVar3.f181880d = true;
        C66906dw dwVar4 = (C66906dw) dvVar.build();
        chVar.copyOnWrite();
        C39655ci ciVar = (C39655ci) chVar.instance;
        C39655ci ciVar2 = C39655ci.f104377j;
        dwVar4.getClass();
        ciVar.f104387h = dwVar4;
        ciVar.f104380a |= 64;
        return C47633f.m84733g(akVar.f336030l.mo41362a(new C58759qy("https://www.googleapis.com/auth/googlenow"), false)).mo51515h(new C120838ae(chVar), akVar.f336026h);
    }
}
