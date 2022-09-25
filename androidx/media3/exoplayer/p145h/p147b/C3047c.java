package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3636z;

/* renamed from: androidx.media3.exoplayer.h.b.c */
/* compiled from: PG */
public final class C3047c {

    /* renamed from: a */
    public final C3094ce[] f8827a;

    /* renamed from: b */
    private final int[] f8828b;

    public C3047c(int[] iArr, C3094ce[] ceVarArr) {
        this.f8828b = iArr;
        this.f8827a = ceVarArr;
    }

    /* renamed from: a */
    public final void mo6982a(long j) {
        for (C3094ce x : this.f8827a) {
            x.mo7087x(j);
        }
    }

    /* renamed from: b */
    public final C3368bf mo6983b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f8828b;
            if (i2 >= iArr.length) {
                C2633u.m7048c("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new C3636z();
            } else if (i == iArr[i2]) {
                return this.f8827a[i2];
            } else {
                i2++;
            }
        }
    }
}
