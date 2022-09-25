package com.google.android.libraries.assistant.p1528m.p1529a;

import android.os.SystemClock;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.m.a.n */
/* compiled from: PG */
public final class C18429n {

    /* renamed from: a */
    final AtomicReference f52293a = new AtomicReference(C18422g.NO_CONTENT);

    /* renamed from: b */
    public final SettableFuture f52294b = new SettableFuture();

    /* renamed from: c */
    String f52295c;

    /* renamed from: d */
    public String f52296d;

    /* renamed from: e */
    public String f52297e;

    /* renamed from: f */
    final /* synthetic */ C18431p f52298f;

    public C18429n(C18431p pVar) {
        this.f52298f = pVar;
    }

    /* renamed from: a */
    public final C18422g mo23950a() {
        return (C18422g) this.f52293a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23951b(boolean z) {
        if (!this.f52294b.isDone()) {
            this.f52294b.mo57356n((Object) null);
            this.f52298f.mo23955e();
            if (z) {
                this.f52298f.f52312d.mo23931g(C18425j.TIMEOUT_READY);
            }
        }
    }

    /* renamed from: c */
    public final void mo23952c(String str) {
        this.f52293a.set(C18422g.HAS_CONTENT);
        this.f52296d = str;
        this.f52298f.f52311c.postAtTime(new C18428m(this), SystemClock.uptimeMillis() + 10000);
    }
}
