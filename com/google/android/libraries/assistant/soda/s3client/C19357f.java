package com.google.android.libraries.assistant.soda.s3client;

import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.f */
/* compiled from: PG */
public final /* synthetic */ class C19357f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C19358g f54168a;

    public /* synthetic */ C19357f(C19358g gVar) {
        this.f54168a = gVar;
    }

    public final void run() {
        C19358g gVar = this.f54168a;
        synchronized (gVar.f54170a) {
            SodaTransportSession sodaTransportSession = gVar.f54172c;
            if (sodaTransportSession != null) {
                sodaTransportSession.mo24485a(2);
            }
        }
        synchronized (gVar.f54170a) {
            while (!gVar.f54171b.isEmpty()) {
                gVar.mo24494e((C66607ce) gVar.f54171b.removeFirst());
            }
        }
    }
}
