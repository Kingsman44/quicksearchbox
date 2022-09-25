package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.p9033a;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import java.io.EOFException;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.d.a.i */
/* compiled from: PG */
final class C119745i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C119747k f333573a;

    /* renamed from: b */
    final /* synthetic */ Throwable f333574b;

    public C119745i(C119747k kVar, Throwable th) {
        this.f333573a = kVar;
        this.f333574b = th;
    }

    public final void run() {
        Throwable th;
        C119747k kVar = this.f333573a;
        C32534ai aiVar = kVar.f333578b;
        if (kVar.f333579c || this.f333574b != null) {
            th = this.f333574b;
        } else {
            th = new EOFException("Connection closed, but no TTS end-of-data received");
        }
        aiVar.mo38135c(th);
    }
}
