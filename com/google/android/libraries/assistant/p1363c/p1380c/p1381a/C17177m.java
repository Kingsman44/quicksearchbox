package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import com.google.protobuf.C63088z;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C17177m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17178n f49898a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f49899b;

    public /* synthetic */ C17177m(C17178n nVar, C63088z zVar) {
        this.f49898a = nVar;
        this.f49899b = zVar;
    }

    public final void run() {
        C17178n nVar = this.f49898a;
        C63088z zVar = this.f49899b;
        while (!zVar.mo59173M()) {
            C17174j jVar = nVar.f49902c;
            int length = jVar.f49888a.length - jVar.f49889b;
            if (zVar.mo59031d() <= length) {
                zVar.mo59171K(jVar.f49888a, jVar.f49889b);
                jVar.mo23217a(zVar.mo59031d());
                zVar = C63088z.f170246b;
            } else {
                zVar.mo59039k(0, length).mo59171K(jVar.f49888a, jVar.f49889b);
                jVar.mo23217a(length);
                zVar = zVar.mo59039k(length, zVar.mo59031d());
            }
            C17174j jVar2 = nVar.f49902c;
            byte[] bArr = jVar2.f49888a;
            if (bArr.length == jVar2.f49889b) {
                GoogleEndpointer.GoogleEndpointerResult process = nVar.f49901b.process(bArr);
                C17174j jVar3 = nVar.f49902c;
                jVar3.f49889b = 0;
                C17176l lVar = nVar.f49903d;
                Duration a = lVar.mo23218a(jVar3.f49890c);
                int i = lVar.f49894d;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                lVar.mo23219b(process, a);
                            } else if (i2 != 3) {
                                throw new AssertionError("Impossible state: ".concat(C17175k.m34322a(i)));
                            }
                        } else if (C67363a.NO_SPEECH.equals(process.getEvent())) {
                            lVar.f49894d = 3;
                            lVar.f49892b = Duration.ofMillis(process.getEventTimestampMs());
                            lVar.mo23219b(process, a);
                        }
                    } else if (C67363a.SPEECH.equals(process.getEvent())) {
                        lVar.f49895e.f334491a.mo23226b(Duration.ofMillis(process.getEventTimestampMs()));
                        lVar.f49894d = 2;
                    }
                    if (a.minus(lVar.f49893c).compareTo(C17176l.f49891a) >= 0) {
                        lVar.f49895e.mo104684a(a);
                        lVar.f49893c = a;
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}
