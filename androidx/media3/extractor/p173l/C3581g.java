package androidx.media3.extractor.p173l;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.l.g */
/* compiled from: PG */
final class C3581g {
    /* renamed from: a */
    public static C3580f m10365a(int i, C3327ab abVar, C2604ac acVar) {
        C3580f a = C3580f.m10364a(abVar, acVar);
        while (true) {
            int i2 = a.f11412a;
            if (i2 == i) {
                return a;
            }
            C2633u.m7050e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.f11413b + 8;
            if (j <= 2147483647L) {
                ((C3627q) abVar).mo7639q((int) j);
                a = C3580f.m10364a(abVar, acVar);
            } else {
                int i3 = a.f11412a;
                throw C2599az.m6822d("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }

    /* renamed from: b */
    public static boolean m10366b(C3327ab abVar) {
        C2604ac acVar = new C2604ac(8);
        int i = C3580f.m10364a(abVar, acVar).f11412a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((C3627q) abVar).mo7320o(acVar.f7234a, 0, 4, false);
        acVar.mo6131A(0);
        int b = acVar.mo6134b();
        if (b == 1463899717) {
            return true;
        }
        C2633u.m7048c("WavHeaderReader", "Unsupported form type: " + b);
        return false;
    }
}
