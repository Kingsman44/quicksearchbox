package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13848b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.x */
/* compiled from: PG */
final class C13893x {

    /* renamed from: a */
    public final C13848b f42315a;

    /* renamed from: b */
    public final Runnable f42316b;

    /* renamed from: c */
    public boolean f42317c = false;

    /* renamed from: d */
    public boolean f42318d = false;

    /* renamed from: e */
    public boolean f42319e = false;

    /* renamed from: f */
    private final Executor f42320f;

    public C13893x(C13848b bVar, Runnable runnable, Executor executor) {
        this.f42315a = bVar;
        this.f42316b = runnable;
        this.f42320f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo21344a(C13725ai aiVar) {
        C67464l lVar;
        C67464l lVar2;
        C67464l lVar3;
        C67238p pVar = aiVar.f41858b;
        if (pVar == null) {
            pVar = C67238p.f182736e;
        }
        if (pVar.f182740b == 2) {
            C67238p pVar2 = aiVar.f41858b;
            if (pVar2 == null) {
                pVar2 = C67238p.f182736e;
            }
            if (pVar2.f182740b == 2) {
                lVar3 = (C67464l) pVar2.f182741c;
            } else {
                lVar3 = C67464l.f183356e;
            }
            C67463k a = C67463k.m97475a(lVar3.f183359b);
            if (a == null) {
                a = C67463k.START_OF_SPEECH;
            }
            if (a.equals(C67463k.END_OF_SPEECH)) {
                return C60856cj.m92903l(C47810es.m84977q(new C13891v(this)), this.f42320f);
            }
        }
        C67238p pVar3 = aiVar.f41858b;
        if ((pVar3 == null ? C67238p.f182736e : pVar3).f182740b == 2) {
            if (pVar3 == null) {
                pVar3 = C67238p.f182736e;
            }
            if (pVar3.f182740b == 2) {
                lVar2 = (C67464l) pVar3.f182741c;
            } else {
                lVar2 = C67464l.f183356e;
            }
            C67463k a2 = C67463k.m97475a(lVar2.f183359b);
            if (a2 == null) {
                a2 = C67463k.START_OF_SPEECH;
            }
            if (a2.equals(C67463k.START_OF_SPEECH)) {
                return C60856cj.m92903l(C47810es.m84977q(new C13890u(this)), this.f42320f);
            }
        }
        C67238p pVar4 = aiVar.f41858b;
        if ((pVar4 == null ? C67238p.f182736e : pVar4).f182740b == 2) {
            if (pVar4 == null) {
                pVar4 = C67238p.f182736e;
            }
            if (pVar4.f182740b == 2) {
                lVar = (C67464l) pVar4.f182741c;
            } else {
                lVar = C67464l.f183356e;
            }
            C67463k a3 = C67463k.m97475a(lVar.f183359b);
            if (a3 == null) {
                a3 = C67463k.START_OF_SPEECH;
            }
            if (a3.equals(C67463k.END_OF_AUDIO)) {
                return C60856cj.m92903l(C47810es.m84977q(new C13892w(this)), this.f42320f);
            }
        }
        return C60866ct.f164955a;
    }
}
