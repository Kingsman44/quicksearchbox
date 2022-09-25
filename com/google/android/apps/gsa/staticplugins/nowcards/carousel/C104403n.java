package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91899a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.n */
/* compiled from: PG */
final class C104403n extends C90904ba {

    /* renamed from: a */
    public final boolean f290497a;

    /* renamed from: b */
    public final int f290498b;

    /* renamed from: c */
    final /* synthetic */ C104404o f290499c;

    /* renamed from: d */
    private final LoggingRequest f290500d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104403n(C104404o oVar, LoggingRequest loggingRequest, boolean z, int i) {
        super("LogLoggingRequest");
        this.f290499c = oVar;
        this.f290500d = loggingRequest;
        this.f290497a = z;
        this.f290498b = i;
    }

    public final void run() {
        LoggingRequest loggingRequest = this.f290500d;
        if (loggingRequest != null) {
            this.f290499c.f290314i.f290342l.mo85967b(loggingRequest);
        }
        C104404o oVar = this.f290499c;
        if (oVar.f290503A == this) {
            oVar.f290503A = null;
            Iterator it = oVar.f290519z.iterator();
            if (it.hasNext()) {
                C91899a aVar = (C91899a) it.next();
                throw null;
            }
        }
    }
}
