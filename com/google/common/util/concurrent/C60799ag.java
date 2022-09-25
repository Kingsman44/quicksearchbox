package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.ag */
/* compiled from: PG */
final class C60799ag implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60817ay f164858a;

    public C60799ag(C60817ay ayVar) {
        this.f164858a = ayVar;
    }

    public final void run() {
        this.f164858a.mo57278j(C60814av.WILL_CLOSE, C60814av.CLOSING);
        this.f164858a.mo57279k();
        this.f164858a.mo57278j(C60814av.CLOSING, C60814av.CLOSED);
    }
}
