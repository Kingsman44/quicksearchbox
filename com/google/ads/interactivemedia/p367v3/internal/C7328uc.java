package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uc */
final /* synthetic */ class C7328uc implements Runnable {

    /* renamed from: a */
    private final C7332ug f23878a;

    /* renamed from: b */
    private final C7333uh f23879b;

    /* renamed from: c */
    private final C7313to f23880c;

    /* renamed from: d */
    private final C7318tt f23881d;

    /* renamed from: e */
    private final IOException f23882e;

    /* renamed from: f */
    private final boolean f23883f;

    public C7328uc(C7332ug ugVar, C7333uh uhVar, C7313to toVar, C7318tt ttVar, IOException iOException, boolean z) {
        this.f23878a = ugVar;
        this.f23879b = uhVar;
        this.f23880c = toVar;
        this.f23881d = ttVar;
        this.f23882e = iOException;
        this.f23883f = z;
    }

    public final void run() {
        C7332ug ugVar = this.f23878a;
        this.f23879b.mo15715X(ugVar.f23893a, ugVar.f23894b, this.f23880c, this.f23881d, this.f23882e, this.f23883f);
    }
}
