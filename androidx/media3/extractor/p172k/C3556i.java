package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.i */
/* compiled from: PG */
public final class C3556i implements C3557j {

    /* renamed from: a */
    private final List f11189a;

    /* renamed from: b */
    private final C3368bf[] f11190b;

    /* renamed from: c */
    private boolean f11191c;

    /* renamed from: d */
    private int f11192d;

    /* renamed from: e */
    private int f11193e;

    /* renamed from: f */
    private long f11194f = -9223372036854775807L;

    public C3556i(List list) {
        this.f11189a = list;
        this.f11190b = new C3368bf[list.size()];
    }

    /* renamed from: f */
    private final boolean m10275f(C2604ac acVar, int i) {
        if (acVar.f7236c - acVar.f7235b == 0) {
            return false;
        }
        if (acVar.mo6139g() != i) {
            this.f11191c = false;
        }
        this.f11192d--;
        return this.f11191c;
    }

    /* renamed from: a */
    public final void mo7466a(C2604ac acVar) {
        if (!this.f11191c) {
            return;
        }
        if (this.f11192d != 2 || m10275f(acVar, 32)) {
            if (this.f11192d != 1 || m10275f(acVar, 0)) {
                int i = acVar.f7235b;
                int i2 = acVar.f7236c - i;
                for (C3368bf c : this.f11190b) {
                    acVar.mo6131A(i);
                    c.mo6851c(acVar, i2);
                }
                this.f11193e += i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo7467b(C3329ad adVar, C3545ar arVar) {
        for (int i = 0; i < this.f11190b.length; i++) {
            C3542ao aoVar = (C3542ao) this.f11189a.get(i);
            arVar.mo7462a();
            arVar.mo7463b();
            C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 3);
            C2679w wVar = new C2679w();
            arVar.mo7463b();
            wVar.f7449a = arVar.f11109b;
            wVar.f7459k = "application/dvbsubs";
            wVar.f7461m = Collections.singletonList(aoVar.f11103b);
            wVar.f7451c = aoVar.f11102a;
            eZ.mo6850b(new C2680x(wVar));
            this.f11190b[i] = eZ;
        }
    }

    /* renamed from: c */
    public final void mo7468c() {
        if (this.f11191c) {
            if (this.f11194f != -9223372036854775807L) {
                for (C3368bf d : this.f11190b) {
                    d.mo6852d(this.f11194f, 1, this.f11193e, 0, (C3367be) null);
                }
            }
            this.f11191c = false;
        }
    }

    /* renamed from: d */
    public final void mo7469d(long j, int i) {
        if ((i & 4) != 0) {
            this.f11191c = true;
            if (j != -9223372036854775807L) {
                this.f11194f = j;
            }
            this.f11193e = 0;
            this.f11192d = 2;
        }
    }

    /* renamed from: e */
    public final void mo7470e() {
        this.f11191c = false;
        this.f11194f = -9223372036854775807L;
    }
}
