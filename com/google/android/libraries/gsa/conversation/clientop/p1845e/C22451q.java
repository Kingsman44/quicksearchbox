package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1837a.C22327h;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.q */
/* compiled from: PG */
final class C22451q implements C22327h {

    /* renamed from: a */
    private final C22720x f62002a;

    /* renamed from: b */
    private final SettableFuture f62003b;

    /* renamed from: c */
    private final boolean f62004c;

    /* renamed from: d */
    private final AtomicBoolean f62005d = new AtomicBoolean(false);

    public C22451q(C22720x xVar, SettableFuture settableFuture, boolean z) {
        this.f62002a = xVar;
        this.f62003b = settableFuture;
        this.f62004c = z;
    }

    /* renamed from: a */
    public final void mo27553a() {
        C52070ec ecVar;
        if (this.f62005d.getAndSet(false)) {
            this.f62002a.mo27823l();
        }
        SettableFuture settableFuture = this.f62003b;
        if (this.f62004c) {
            ecVar = C22402a.m41822b(C52235kf.CANCELLED, (String) null);
        } else {
            ecVar = C22402a.f61894b;
        }
        settableFuture.mo57356n(ecVar);
    }

    /* renamed from: b */
    public final void mo27554b() {
        if (this.f62005d.getAndSet(false)) {
            this.f62002a.mo27823l();
        }
        this.f62003b.mo57356n(this.f62004c ? C22402a.f61893a : C22402a.f61894b);
    }

    /* renamed from: c */
    public final void mo27555c(Throwable th) {
        C52070ec ecVar;
        C52070ec ecVar2;
        if (this.f62005d.getAndSet(false)) {
            this.f62002a.mo27823l();
        }
        if (th instanceof TimeoutException) {
            SettableFuture settableFuture = this.f62003b;
            if (this.f62004c) {
                ecVar2 = C22402a.m41822b(C52235kf.UNAVAILABLE, "Timed out waiting for TTS bytes.");
            } else {
                ecVar2 = C22402a.f61894b;
            }
            settableFuture.mo57356n(ecVar2);
            return;
        }
        String message = (th == null || th.getMessage() == null) ? "Error during TTS Playback" : th.getMessage();
        SettableFuture settableFuture2 = this.f62003b;
        if (this.f62004c) {
            ecVar = C22402a.m41822b(C52235kf.INTERNAL, message);
        } else {
            ecVar = C22402a.f61894b;
        }
        settableFuture2.mo57356n(ecVar);
    }

    /* renamed from: d */
    public final void mo27556d() {
        if (!this.f62005d.getAndSet(true)) {
            this.f62002a.mo27822k();
        }
    }
}
