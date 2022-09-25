package androidx.media3.exoplayer.p145h;

import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.h.ax */
/* compiled from: PG */
public final /* synthetic */ class C3041ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3065bc f8806a;

    /* renamed from: b */
    public final /* synthetic */ C3066bd f8807b;

    /* renamed from: c */
    public final /* synthetic */ C3027aj f8808c;

    /* renamed from: d */
    public final /* synthetic */ C3032ao f8809d;

    /* renamed from: e */
    public final /* synthetic */ IOException f8810e;

    /* renamed from: f */
    public final /* synthetic */ boolean f8811f;

    public /* synthetic */ C3041ax(C3065bc bcVar, C3066bd bdVar, C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        this.f8806a = bcVar;
        this.f8807b = bdVar;
        this.f8808c = ajVar;
        this.f8809d = aoVar;
        this.f8810e = iOException;
        this.f8811f = z;
    }

    public final void run() {
        C3065bc bcVar = this.f8806a;
        this.f8807b.mo6408eR(bcVar.f8907a, bcVar.f8908b, this.f8808c, this.f8809d, this.f8810e, this.f8811f);
    }
}
