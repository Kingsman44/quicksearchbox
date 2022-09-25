package androidx.media3.exoplayer.hls;

import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;
import com.google.common.p4575r.C60757n;
import java.io.EOFException;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.d */
/* compiled from: PG */
public final class C3164d implements C3173m {

    /* renamed from: a */
    public static final int[] f9388a = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: a */
    public static void m9228a(int i, List list) {
        if (C60757n.m92745f(f9388a, i, 0, 7) != -1) {
            Integer valueOf = Integer.valueOf(i);
            if (!list.contains(valueOf)) {
                list.add(valueOf);
            }
        }
    }

    /* renamed from: b */
    public static boolean m9229b(C3326aa aaVar, C3327ab abVar) {
        try {
            boolean e = aaVar.mo7155e(abVar);
            ((C3627q) abVar).f11568e = 0;
            return e;
        } catch (EOFException unused) {
            ((C3627q) abVar).f11568e = 0;
            return false;
        } catch (Throwable th) {
            ((C3627q) abVar).f11568e = 0;
            throw th;
        }
    }
}
