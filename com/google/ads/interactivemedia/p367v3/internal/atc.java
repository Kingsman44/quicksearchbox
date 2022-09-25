package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atc */
/* compiled from: PG */
final class atc extends asv {
    private atc() {
    }

    public /* synthetic */ atc(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo15379a(ath ath, Thread thread) {
        ath.f21533b = thread;
    }

    /* renamed from: b */
    public final void mo15380b(ath ath, ath ath2) {
        ath.f21534c = ath2;
    }

    /* renamed from: c */
    public final boolean mo15381c(ati ati, ath ath, ath ath2) {
        synchronized (ati) {
            if (ati.f21541g != ath) {
                return false;
            }
            ati.f21541g = ath2;
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo15382d(ati ati, asz asz, asz asz2) {
        synchronized (ati) {
            if (ati.f21540f != asz) {
                return false;
            }
            ati.f21540f = asz2;
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo15383e(ati ati, Object obj, Object obj2) {
        synchronized (ati) {
            if (ati.f21539e != obj) {
                return false;
            }
            ati.f21539e = obj2;
            return true;
        }
    }
}
