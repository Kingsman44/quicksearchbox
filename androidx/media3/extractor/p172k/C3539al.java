package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3329ad;

/* renamed from: androidx.media3.extractor.k.al */
/* compiled from: PG */
final class C3539al implements C3533af {

    /* renamed from: a */
    final /* synthetic */ C3541an f11077a;

    /* renamed from: b */
    private final C2603ab f11078b = new C2603ab(new byte[4], 4);

    public C3539al(C3541an anVar) {
        this.f11077a = anVar;
    }

    /* renamed from: a */
    public final void mo7454a(C2604ac acVar) {
        if (acVar.mo6139g() == 0 && (acVar.mo6139g() & 128) != 0) {
            acVar.mo6131A(acVar.f7235b + 6);
            int i = (acVar.f7236c - acVar.f7235b) / 4;
            for (int i2 = 0; i2 < i; i2++) {
                acVar.mo6154v(this.f11078b, 4);
                int d = this.f11078b.mo6119d(16);
                this.f11078b.mo6126k(3);
                if (d == 0) {
                    this.f11078b.mo6126k(13);
                } else {
                    int d2 = this.f11078b.mo6119d(13);
                    if (this.f11077a.f11087d.get(d2) == null) {
                        C3541an anVar = this.f11077a;
                        anVar.f11087d.put(d2, new C3534ag(new C3540am(anVar, d2)));
                        this.f11077a.f11091h++;
                    }
                }
            }
            C3541an anVar2 = this.f11077a;
            if (anVar2.f11084a != 2) {
                anVar2.f11087d.remove(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo7455b(C2609ah ahVar, C3329ad adVar, C3545ar arVar) {
    }
}
