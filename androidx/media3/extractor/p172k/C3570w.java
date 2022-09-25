package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3343ar;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.w */
/* compiled from: PG */
public final class C3570w implements C3557j {

    /* renamed from: a */
    private final C2604ac f11346a;

    /* renamed from: b */
    private final C3343ar f11347b;

    /* renamed from: c */
    private final String f11348c;

    /* renamed from: d */
    private C3368bf f11349d;

    /* renamed from: e */
    private String f11350e;

    /* renamed from: f */
    private int f11351f;

    /* renamed from: g */
    private int f11352g;

    /* renamed from: h */
    private boolean f11353h;

    /* renamed from: i */
    private boolean f11354i;

    /* renamed from: j */
    private long f11355j;

    /* renamed from: k */
    private int f11356k;

    /* renamed from: l */
    private long f11357l;

    public C3570w() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo7466a(C2604ac acVar) {
        C2601a.m6829a(this.f11349d);
        while (true) {
            int i = acVar.f7236c;
            int i2 = acVar.f7235b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f11351f;
                if (i4 == 0) {
                    byte[] bArr = acVar.f7234a;
                    while (true) {
                        if (i2 >= i) {
                            acVar.mo6131A(i);
                            break;
                        }
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f11354i && (b & 224) == 224;
                        this.f11354i = z;
                        if (z2) {
                            acVar.mo6131A(i2 + 1);
                            this.f11354i = false;
                            this.f11346a.f7234a[1] = bArr[i2];
                            this.f11352g = 2;
                            this.f11351f = 1;
                            break;
                        }
                        i2++;
                    }
                } else if (i4 != 1) {
                    int min = Math.min(i3, this.f11356k - this.f11352g);
                    this.f11349d.mo6851c(acVar, min);
                    int i5 = this.f11352g + min;
                    this.f11352g = i5;
                    int i6 = this.f11356k;
                    if (i5 >= i6) {
                        long j = this.f11357l;
                        if (j != -9223372036854775807L) {
                            this.f11349d.mo6852d(j, 1, i6, 0, (C3367be) null);
                            this.f11357l += this.f11355j;
                        }
                        this.f11352g = 0;
                        this.f11351f = 0;
                    }
                } else {
                    int min2 = Math.min(i3, 4 - this.f11352g);
                    acVar.mo6155w(this.f11346a.f7234a, this.f11352g, min2);
                    int i7 = this.f11352g + min2;
                    this.f11352g = i7;
                    if (i7 >= 4) {
                        this.f11346a.mo6131A(0);
                        if (!this.f11347b.mo7335a(this.f11346a.mo6134b())) {
                            this.f11352g = 0;
                            this.f11351f = 1;
                        } else {
                            C3343ar arVar = this.f11347b;
                            this.f11356k = arVar.f10086c;
                            if (!this.f11353h) {
                                int i8 = arVar.f10090g;
                                int i9 = arVar.f10087d;
                                this.f11355j = (((long) i8) * 1000000) / ((long) i9);
                                C2679w wVar = new C2679w();
                                wVar.f7449a = this.f11350e;
                                wVar.f7459k = arVar.f10085b;
                                wVar.f7460l = 4096;
                                wVar.f7472x = arVar.f10088e;
                                wVar.f7473y = i9;
                                wVar.f7451c = this.f11348c;
                                this.f11349d.mo6850b(new C2680x(wVar));
                                this.f11353h = true;
                            }
                            this.f11346a.mo6131A(0);
                            this.f11349d.mo6851c(this.f11346a, 4);
                            this.f11351f = 2;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        this.f11350e = arVar.f11109b;
        arVar.mo7463b();
        this.f11349d = adVar.mo6987eZ(arVar.f11108a, 1);
    }

    /* renamed from: c */
    public final void mo7468c() {
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f11357l = j;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11351f = 0;
        this.f11352g = 0;
        this.f11354i = false;
        this.f11357l = -9223372036854775807L;
    }

    public C3570w(String str) {
        this.f11351f = 0;
        C2604ac acVar = new C2604ac(4);
        this.f11346a = acVar;
        acVar.f7234a[0] = -1;
        this.f11347b = new C3343ar();
        this.f11357l = -9223372036854775807L;
        this.f11348c = str;
    }
}
