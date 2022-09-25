package com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b;

import android.app.ActivityManager;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66600bz;
import com.google.speech.p5208h.C66603ca;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66654du;
import com.google.speech.p5208h.C66656dw;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.z.c.h.b.a */
/* compiled from: PG */
public final class C118919a {

    /* renamed from: a */
    public static final AtomicBoolean f331656a = new AtomicBoolean(false);

    /* renamed from: a */
    public static C66606cd m197403a() {
        if (ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness() || f331656a.get()) {
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

    /* renamed from: b */
    public static C66607ce m197404b(byte[] bArr, int i) {
        C66606cd a = m197403a();
        a.mo58885m(C66676j.f181379d, m197407e(bArr, i));
        return (C66607ce) a.build();
    }

    /* renamed from: c */
    public static C66607ce m197405c() {
        C66606cd a = m197403a();
        a.copyOnWrite();
        C66607ce ceVar = (C66607ce) a.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        ceVar.f181193a |= 8;
        ceVar.f181197e = true;
        return (C66607ce) a.build();
    }

    /* renamed from: d */
    public static C66607ce m197406d(byte[] bArr, int i) {
        C66606cd a = m197403a();
        a.mo58885m(C66676j.f181380e, m197407e(bArr, i));
        return (C66607ce) a.build();
    }

    /* renamed from: e */
    private static C66676j m197407e(byte[] bArr, int i) {
        C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
        C63088z D = C63088z.m96142D(bArr, 0, i);
        iVar.copyOnWrite();
        C66676j jVar = (C66676j) iVar.instance;
        jVar.f181382a |= 1;
        jVar.f181383b = D;
        return (C66676j) iVar.build();
    }
}
