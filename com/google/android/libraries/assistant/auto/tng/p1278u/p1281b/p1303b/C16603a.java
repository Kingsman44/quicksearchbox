package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b;

import android.app.ActivityManager;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66600bz;
import com.google.speech.p5208h.C66603ca;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66654du;
import com.google.speech.p5208h.C66656dw;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.b.a */
/* compiled from: PG */
public final class C16603a {

    /* renamed from: a */
    private static final AtomicBoolean f48677a = new AtomicBoolean(true);

    /* renamed from: a */
    public static C66606cd m33662a() {
        if (ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness() || !f48677a.get()) {
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
