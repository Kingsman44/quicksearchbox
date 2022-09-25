package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pc */
/* compiled from: PG */
public final class C7193pc implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f23450a = 0;

    /* renamed from: b */
    private final aes f23451b = new aes(0);

    /* renamed from: c */
    private final SparseArray f23452c = new SparseArray();

    /* renamed from: d */
    private final aee f23453d = new aee(4096);

    /* renamed from: e */
    private final C7189oz f23454e = new C7189oz();

    /* renamed from: f */
    private boolean f23455f;

    /* renamed from: g */
    private boolean f23456g;

    /* renamed from: h */
    private boolean f23457h;

    /* renamed from: i */
    private long f23458i;

    /* renamed from: j */
    private C7056ka f23459j;

    /* renamed from: k */
    private boolean f23460k;

    /* renamed from: l */
    private C7198ph f23461l;

    static {
        int i = C7191pa.f23441b;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23459j = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        if (this.f23451b.mo14600d() == -9223372036854775807L || !(this.f23451b.mo14598b() == 0 || this.f23451b.mo14598b() == j2)) {
            this.f23451b.mo14601e();
            this.f23451b.mo14597a(j2);
        }
        C7198ph phVar = this.f23461l;
        if (phVar != null) {
            phVar.mo16082b(j2);
        }
        for (int i = 0; i < this.f23452c.size(); i++) {
            ((C7192pb) this.f23452c.valueAt(i)).mo16270a();
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        byte[] bArr = new byte[14];
        jvVar.mo16094g(bArr, 0, 14);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jvVar.mo16096i(bArr[13] & 7);
        jvVar.mo16094g(bArr, 0, 3);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        C7171oh ohVar;
        ary.m19466s(this.f23459j);
        long m = jvVar.mo16100m();
        if (m != -1 && !this.f23454e.mo16260a()) {
            return this.f23454e.mo16263e(jvVar, klVar);
        }
        if (!this.f23460k) {
            this.f23460k = true;
            if (this.f23454e.mo16262c() != -9223372036854775807L) {
                C7198ph phVar = new C7198ph(this.f23454e.mo16261b(), this.f23454e.mo16262c(), m);
                this.f23461l = phVar;
                this.f23459j.mo16115am(phVar.mo16081a());
            } else {
                this.f23459j.mo16115am(new C7069kn(this.f23454e.mo16262c()));
            }
        }
        C7198ph phVar2 = this.f23461l;
        if (phVar2 != null && phVar2.mo16083c()) {
            return phVar2.mo16084d(jvVar, klVar);
        }
        jvVar.mo16097j();
        long k = m != -1 ? m - jvVar.mo16098k() : -1;
        if ((k != -1 && k < 4) || !jvVar.mo16093f(this.f23453d.mo14555i(), 0, 4, true)) {
            return -1;
        }
        this.f23453d.mo14554h(0);
        int v = this.f23453d.mo14568v();
        if (v == 441) {
            return -1;
        }
        if (v == 442) {
            jvVar.mo16094g(this.f23453d.mo14555i(), 0, 10);
            this.f23453d.mo14554h(9);
            jvVar.mo16091d((this.f23453d.mo14560n() & 7) + 14);
            return 0;
        } else if (v == 443) {
            jvVar.mo16094g(this.f23453d.mo14555i(), 0, 2);
            this.f23453d.mo14554h(0);
            jvVar.mo16091d(this.f23453d.mo14561o() + 6);
            return 0;
        } else if ((v >> 8) != 1) {
            jvVar.mo16091d(1);
            return 0;
        } else {
            int i = v & PrivateKeyType.INVALID;
            C7192pb pbVar = (C7192pb) this.f23452c.get(i);
            if (!this.f23455f) {
                if (pbVar == null) {
                    if (i == 189) {
                        ohVar = new C7160nx();
                        this.f23456g = true;
                        this.f23458i = jvVar.mo16099l();
                    } else if ((i & 224) == 192) {
                        ohVar = new C7184ou((String) null);
                        this.f23456g = true;
                        this.f23458i = jvVar.mo16099l();
                    } else if ((i & 240) == 224) {
                        ohVar = new C7173oj((C7209ps) null);
                        this.f23457h = true;
                        this.f23458i = jvVar.mo16099l();
                    } else {
                        ohVar = null;
                    }
                    if (ohVar != null) {
                        ohVar.mo16216b(this.f23459j, new C7207pq(i, 256));
                        pbVar = new C7192pb(ohVar, this.f23451b);
                        this.f23452c.put(i, pbVar);
                    }
                }
                long j = 1048576;
                if (this.f23456g && this.f23457h) {
                    j = this.f23458i + 8192;
                }
                if (jvVar.mo16099l() > j) {
                    this.f23455f = true;
                    this.f23459j.mo16114al();
                }
            }
            jvVar.mo16094g(this.f23453d.mo14555i(), 0, 2);
            this.f23453d.mo14554h(0);
            int o = this.f23453d.mo14561o() + 6;
            if (pbVar == null) {
                jvVar.mo16091d(o);
            } else {
                this.f23453d.mo14547a(o);
                jvVar.mo16090c(this.f23453d.mo14555i(), 0, o);
                this.f23453d.mo14554h(6);
                pbVar.mo16271b(this.f23453d);
                aee aee = this.f23453d;
                aee.mo14552f(aee.mo14556j());
            }
            return 0;
        }
    }
}
