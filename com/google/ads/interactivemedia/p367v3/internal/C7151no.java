package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.no */
/* compiled from: PG */
final class C7151no extends C7154nr {

    /* renamed from: a */
    private static final byte[] f23114a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: b */
    private boolean f23115b;

    /* renamed from: d */
    public static boolean m21261d(aee aee) {
        if (aee.mo14550d() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        aee.mo14559m(bArr, 0, 8);
        return Arrays.equals(bArr, f23114a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16197a(boolean z) {
        super.mo16197a(z);
        if (z) {
            this.f23115b = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16198b(aee aee) {
        byte b;
        byte[] i = aee.mo14555i();
        byte b2 = i[0] & 255;
        byte b3 = b2 & 3;
        if (b3 != 0) {
            b = 2;
            if (!(b3 == 1 || b3 == 2)) {
                b = i[1] & 63;
            }
        } else {
            b = 1;
        }
        int i2 = b2 >> 3;
        int i3 = i2 & 3;
        return mo16212h(((long) b) * ((long) (i2 >= 16 ? 2500 << i3 : i2 >= 12 ? 10000 << (i3 & 1) : i3 == 3 ? 60000 : 10000 << i3)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16199c(aee aee, long j, C7152np npVar) {
        boolean z = true;
        if (!this.f23115b) {
            byte[] copyOf = Arrays.copyOf(aee.mo14555i(), aee.mo14551e());
            byte b = copyOf[9];
            List h = C7135mz.m21205h(copyOf);
            C6863cx cxVar = new C6863cx();
            cxVar.mo15630ae("audio/opus");
            cxVar.mo15606H(b & 255);
            cxVar.mo15631af(48000);
            cxVar.mo15618T(h);
            npVar.f23116a = cxVar.mo15625a();
            this.f23115b = true;
            return true;
        }
        if (aee.mo14568v() != 1332770163) {
            z = false;
        }
        aee.mo14554h(0);
        return z;
    }
}
