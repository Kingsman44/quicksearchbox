package androidx.media3.common.p136b;

/* renamed from: androidx.media3.common.b.g */
/* compiled from: PG */
public final class C2619g {

    /* renamed from: a */
    private boolean f7273a;

    public C2619g() {
    }

    public C2619g(byte[] bArr) {
    }

    /* renamed from: a */
    public final synchronized void mo6189a() {
        while (!this.f7273a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo6190b() {
        boolean z = false;
        while (!this.f7273a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo6191c() {
        return this.f7273a;
    }

    /* renamed from: d */
    public final synchronized boolean mo6192d() {
        if (this.f7273a) {
            return false;
        }
        this.f7273a = true;
        notifyAll();
        return true;
    }

    /* renamed from: e */
    public final synchronized void mo6193e() {
        this.f7273a = false;
    }
}
