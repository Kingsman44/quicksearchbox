package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3329ad;

/* renamed from: androidx.media3.extractor.k.ag */
/* compiled from: PG */
public final class C3534ag implements C3546as {

    /* renamed from: a */
    private final C3533af f11058a;

    /* renamed from: b */
    private final C2604ac f11059b = new C2604ac(32);

    /* renamed from: c */
    private int f11060c;

    /* renamed from: d */
    private int f11061d;

    /* renamed from: e */
    private boolean f11062e;

    /* renamed from: f */
    private boolean f11063f;

    public C3534ag(C3533af afVar) {
        this.f11058a = afVar;
    }

    /* renamed from: a */
    public final void mo7456a(C2604ac acVar, int i) {
        int i2 = i & 1;
        int g = i2 != 0 ? acVar.f7235b + acVar.mo6139g() : -1;
        if (this.f11063f) {
            if (i2 != 0) {
                this.f11063f = false;
                acVar.mo6131A(g);
                this.f11061d = 0;
            } else {
                return;
            }
        }
        while (true) {
            int i3 = acVar.f7236c - acVar.f7235b;
            if (i3 > 0) {
                int i4 = this.f11061d;
                if (i4 < 3) {
                    if (i4 == 0) {
                        int g2 = acVar.mo6139g();
                        acVar.mo6131A(acVar.f7235b - 1);
                        if (g2 == 255) {
                            this.f11063f = true;
                            return;
                        }
                    }
                    int min = Math.min(acVar.f7236c - acVar.f7235b, 3 - this.f11061d);
                    acVar.mo6155w(this.f11059b.f7234a, this.f11061d, min);
                    int i5 = this.f11061d + min;
                    this.f11061d = i5;
                    if (i5 == 3) {
                        this.f11059b.mo6131A(0);
                        this.f11059b.mo6158z(3);
                        C2604ac acVar2 = this.f11059b;
                        acVar2.mo6131A(acVar2.f7235b + 1);
                        int g3 = this.f11059b.mo6139g();
                        int g4 = this.f11059b.mo6139g();
                        this.f11062e = (g3 & 128) != 0;
                        int i6 = (((g3 & 15) << 8) | g4) + 3;
                        this.f11060c = i6;
                        int length = this.f11059b.f7234a.length;
                        if (length < i6) {
                            this.f11059b.mo6153u(Math.min(4098, Math.max(i6, length + length)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3, this.f11060c - i4);
                    acVar.mo6155w(this.f11059b.f7234a, this.f11061d, min2);
                    int i7 = this.f11061d + min2;
                    this.f11061d = i7;
                    int i8 = this.f11060c;
                    if (i7 != i8) {
                        continue;
                    } else {
                        if (!this.f11062e) {
                            this.f11059b.mo6158z(i8);
                        } else if (C2612ak.m6974ax(this.f11059b.f7234a, i8) != 0) {
                            this.f11063f = true;
                            return;
                        } else {
                            this.f11059b.mo6158z(this.f11060c - 4);
                        }
                        this.f11059b.mo6131A(0);
                        this.f11058a.mo7454a(this.f11059b);
                        this.f11061d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo7457b(C2609ah ahVar, C3329ad adVar, C3545ar arVar) {
        this.f11058a.mo7455b(ahVar, adVar, arVar);
        this.f11063f = true;
    }

    /* renamed from: c */
    public final void mo7458c() {
        this.f11063f = true;
    }
}
