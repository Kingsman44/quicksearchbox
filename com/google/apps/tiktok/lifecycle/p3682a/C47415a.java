package com.google.apps.tiktok.lifecycle.p3682a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import kotlinx.coroutines.C71613bn;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71592s;
import kotlinx.coroutines.p5574b.C71598y;

/* renamed from: com.google.apps.tiktok.lifecycle.a.a */
/* compiled from: PG */
public final class C47415a {

    /* renamed from: a */
    public final C71389v f123166a = C71392y.m104158a(0, (C71387t) null, 6);

    /* renamed from: a */
    public final /* synthetic */ C71587n mo51258a() {
        return C71598y.m104524d(C71592s.m104510d(this.f123166a), C71613bn.f191048b);
    }

    /* renamed from: b */
    public final void mo51259b(Object obj) {
        if (!C19559g.m37305d(Thread.currentThread())) {
            throw new IllegalStateException("sendRequest() may only be called from the main thread.");
        } else if (!C71348ab.m103985c(this.f123166a.mo62730w(obj))) {
            throw new IllegalStateException("A MainThreadRequestChannel was unable to send its request without blocking/suspending the main thread. This either means that no coroutine has consumed this channel, or that the coroutine didn't immediately dispose of the previous request. See `MainThreadRequestChannel.consumeAsFlow()` for options for consuming main thread requests.");
        }
    }
}
