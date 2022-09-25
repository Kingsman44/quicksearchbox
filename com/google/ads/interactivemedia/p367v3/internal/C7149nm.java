package com.google.ads.interactivemedia.p367v3.internal;

import java.io.EOFException;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nm */
/* compiled from: PG */
final class C7149nm {

    /* renamed from: a */
    public int f23106a;

    /* renamed from: b */
    public int f23107b;

    /* renamed from: c */
    public long f23108c;

    /* renamed from: d */
    public int f23109d;

    /* renamed from: e */
    public int f23110e;

    /* renamed from: f */
    public int f23111f;

    /* renamed from: g */
    public final int[] f23112g = new int[PrivateKeyType.INVALID];

    /* renamed from: h */
    private final aee f23113h = new aee((int) PrivateKeyType.INVALID);

    /* renamed from: e */
    private static boolean m21253e(C7050jv jvVar, byte[] bArr, int i, boolean z) {
        try {
            return jvVar.mo16093f(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo16205a() {
        this.f23106a = 0;
        this.f23107b = 0;
        this.f23108c = 0;
        this.f23109d = 0;
        this.f23110e = 0;
        this.f23111f = 0;
    }

    /* renamed from: b */
    public final boolean mo16206b(C7050jv jvVar) {
        return mo16207c(jvVar, -1);
    }

    /* renamed from: c */
    public final boolean mo16207c(C7050jv jvVar, long j) {
        ary.m19462o(jvVar.mo16099l() == jvVar.mo16098k());
        while (true) {
            if ((j == -1 || jvVar.mo16099l() + 4 < j) && m21253e(jvVar, this.f23113h.mo14555i(), 4, true)) {
                this.f23113h.mo14547a(4);
                if (this.f23113h.mo14566t() == 1332176723) {
                    jvVar.mo16097j();
                    return true;
                }
                jvVar.mo16091d(1);
            }
        }
        do {
            if ((j != -1 && jvVar.mo16099l() >= j) || jvVar.mo16101n() == -1) {
                return false;
            }
            break;
        } while (jvVar.mo16101n() == -1);
        return false;
    }

    /* renamed from: d */
    public final boolean mo16208d(C7050jv jvVar, boolean z) {
        mo16205a();
        this.f23113h.mo14547a(27);
        if (!m21253e(jvVar, this.f23113h.mo14555i(), 27, z) || this.f23113h.mo14566t() != 1332176723) {
            return false;
        }
        int n = this.f23113h.mo14560n();
        this.f23106a = n;
        if (n == 0) {
            this.f23107b = this.f23113h.mo14560n();
            this.f23108c = this.f23113h.mo14571y();
            this.f23113h.mo14567u();
            this.f23113h.mo14567u();
            this.f23113h.mo14567u();
            int n2 = this.f23113h.mo14560n();
            this.f23109d = n2;
            this.f23110e = n2 + 27;
            this.f23113h.mo14547a(n2);
            jvVar.mo16094g(this.f23113h.mo14555i(), 0, this.f23109d);
            for (int i = 0; i < this.f23109d; i++) {
                this.f23112g[i] = this.f23113h.mo14560n();
                this.f23111f += this.f23112g[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C6886dt("unsupported bit stream revision");
        }
    }
}
