package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.az */
/* compiled from: PG */
final class C12929az {

    /* renamed from: a */
    public static final C67190ah f40245a;

    /* renamed from: b */
    public final C12154a f40246b;

    /* renamed from: c */
    public final ScheduledExecutorService f40247c;

    /* renamed from: d */
    public final C69464a f40248d;

    /* renamed from: e */
    public boolean f40249e = false;

    static {
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        ahVar.f182622a |= 1;
        ahVar.f182625d = "Hello, to use your voice and have a safe drive, tap here or press the steering wheel mic anytime. Try now by saying tell me a joke";
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = "en-US";
        f40245a = (C67190ah) aeVar.build();
    }

    public C12929az(C12154a aVar, ScheduledExecutorService scheduledExecutorService, C69464a aVar2) {
        this.f40246b = aVar;
        this.f40247c = scheduledExecutorService;
        this.f40248d = aVar2;
    }
}
