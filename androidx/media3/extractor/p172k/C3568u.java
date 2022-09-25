package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.u */
/* compiled from: PG */
public final class C3568u implements C3557j {

    /* renamed from: a */
    private final C2604ac f11319a = new C2604ac(10);

    /* renamed from: b */
    private C3368bf f11320b;

    /* renamed from: c */
    private boolean f11321c;

    /* renamed from: d */
    private long f11322d = -9223372036854775807L;

    /* renamed from: e */
    private int f11323e;

    /* renamed from: f */
    private int f11324f;

    /* renamed from: a */
    public final void mo7466a(C2604ac acVar) {
        C2601a.m6829a(this.f11320b);
        if (this.f11321c) {
            int i = acVar.f7236c - acVar.f7235b;
            int i2 = this.f11324f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(acVar.f7234a, acVar.f7235b, this.f11319a.f7234a, this.f11324f, min);
                if (this.f11324f + min == 10) {
                    this.f11319a.mo6131A(0);
                    if (this.f11319a.mo6139g() == 73 && this.f11319a.mo6139g() == 68 && this.f11319a.mo6139g() == 51) {
                        C2604ac acVar2 = this.f11319a;
                        acVar2.mo6131A(acVar2.f7235b + 3);
                        this.f11323e = this.f11319a.mo6138f() + 10;
                    } else {
                        C2633u.m7050e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f11321c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f11323e - this.f11324f);
            this.f11320b.mo6851c(acVar, min2);
            this.f11324f += min2;
        }
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        arVar.mo7462a();
        arVar.mo7463b();
        C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 5);
        this.f11320b = eZ;
        C2679w wVar = new C2679w();
        arVar.mo7463b();
        wVar.f7449a = arVar.f11109b;
        wVar.f7459k = "application/id3";
        eZ.mo6850b(new C2680x(wVar));
    }

    /* renamed from: c */
    public final void mo7468c() {
        int i;
        C2601a.m6829a(this.f11320b);
        if (this.f11321c && (i = this.f11323e) != 0 && this.f11324f == i) {
            long j = this.f11322d;
            if (j != -9223372036854775807L) {
                this.f11320b.mo6852d(j, 1, i, 0, (C3367be) null);
            }
            this.f11321c = false;
        }
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if ((i & 4) != 0) {
            this.f11321c = true;
            if (j != -9223372036854775807L) {
                this.f11322d = j;
            }
            this.f11323e = 0;
            this.f11324f = 0;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11321c = false;
        this.f11322d = -9223372036854775807L;
    }
}
