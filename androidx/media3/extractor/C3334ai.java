package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.metadata.id3.C3605i;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.ai */
/* compiled from: PG */
public final class C3334ai {
    /* renamed from: b */
    public static C3336ak m9655b(C2604ac acVar) {
        acVar.mo6131A(acVar.f7235b + 1);
        int h = acVar.mo6140h();
        long j = ((long) acVar.f7235b) + ((long) h);
        int i = h / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m = acVar.mo6145m();
            if (m == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m;
            jArr2[i2] = acVar.mo6145m();
            acVar.mo6131A(acVar.f7235b + 2);
            i2++;
        }
        int i3 = acVar.f7235b;
        acVar.mo6131A(i3 + ((int) (j - ((long) i3))));
        return new C3336ak(jArr, jArr2);
    }

    /* renamed from: a */
    public static Metadata m9654a(C3327ab abVar, boolean z) {
        Metadata a = new C3341ap().mo7334a(abVar, z ? null : C3605i.f11500a);
        if (a == null || a.f7056a.length == 0) {
            return null;
        }
        return a;
    }
}
