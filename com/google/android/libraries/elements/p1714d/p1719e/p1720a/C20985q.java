package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66138bq;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69863ac;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69868c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.q */
/* compiled from: PG */
public final class C20985q implements C21312s {

    /* renamed from: a */
    private final C68214a f58819a;

    /* renamed from: b */
    private final C70128t f58820b;

    public C20985q(C68214a aVar, C70128t tVar) {
        this.f58819a = aVar;
        this.f58820b = tVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66138bq.f179846e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C69794a aVar;
        C66138bq bqVar = (C66138bq) obj;
        if ((bqVar.f179848a & 2) != 0) {
            C21313t tVar = (C21313t) this.f58819a.mo27525b();
            CommandOuterClass$Command commandOuterClass$Command = bqVar.f179850c;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            aVar = tVar.mo26125b(commandOuterClass$Command, rVar, 1);
        } else {
            aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
        }
        float f = bqVar.f179849b;
        if (f <= 0.0f) {
            return aVar;
        }
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        C70128t tVar2 = this.f58820b;
        C69841j.m101337b(timeUnit, "unit is null");
        double d = (double) f;
        Double.isNaN(d);
        C69863ac acVar = new C69863ac((long) (d * 1000000.0d), timeUnit, tVar2);
        C69822d dVar2 = C70101a.f186847o;
        C69841j.m101337b(aVar, "next is null");
        C69868c cVar = new C69868c(acVar, aVar);
        C69822d dVar3 = C70101a.f186847o;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return cVar;
        }
        C70128t tVar3 = C69797b.f186184a;
        C69795a.m101266a(tVar3);
        return cVar.mo61451i(tVar3);
    }
}
