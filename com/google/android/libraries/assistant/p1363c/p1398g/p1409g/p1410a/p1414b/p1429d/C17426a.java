package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1429d;

import android.app.ActivityManager;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66600bz;
import com.google.speech.p5208h.C66603ca;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66654du;
import com.google.speech.p5208h.C66656dw;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.d.a */
/* compiled from: PG */
public final class C17426a {
    /* renamed from: a */
    public static C66606cd m34712a() {
        if (ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness()) {
            C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
            cdVar.copyOnWrite();
            C66607ce ceVar = (C66607ce) cdVar.instance;
            ceVar.f181193a |= 2;
            ceVar.f181195c = false;
            C62940bt btVar = C66603ca.f181184b;
            C66600bz bzVar = (C66600bz) C66603ca.f181183a.createBuilder();
            C62940bt btVar2 = C66656dw.f181332d;
            C66654du duVar = (C66654du) C66656dw.f181331c.createBuilder();
            duVar.copyOnWrite();
            C66656dw dwVar = (C66656dw) duVar.instance;
            dwVar.f181335b = 1;
            dwVar.f181334a = 1 | dwVar.f181334a;
            bzVar.mo58885m(btVar2, (C66656dw) duVar.build());
            cdVar.mo58885m(btVar, (C66603ca) bzVar.build());
            return cdVar;
        }
        C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar2.copyOnWrite();
        C66607ce ceVar2 = (C66607ce) cdVar2.instance;
        ceVar2.f181193a |= 2;
        ceVar2.f181195c = true;
        return cdVar2;
    }
}
