package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ni */
/* compiled from: PG */
final class C7145ni extends C7154nr {

    /* renamed from: a */
    private C7063kh f23093a;

    /* renamed from: b */
    private C7144nh f23094b;

    /* renamed from: d */
    private static boolean m21234d(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16197a(boolean z) {
        super.mo16197a(z);
        if (z) {
            this.f23093a = null;
            this.f23094b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16198b(aee aee) {
        if (!m21234d(aee.mo14555i())) {
            return -1;
        }
        int i = (aee.mo14555i()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int j = asn.m19523j(aee, i);
            aee.mo14554h(0);
            return (long) j;
        }
        aee.mo14557k(4);
        aee.mo14546J();
        int j2 = asn.m19523j(aee, i);
        aee.mo14554h(0);
        return (long) j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16199c(aee aee, long j, C7152np npVar) {
        byte[] i = aee.mo14555i();
        C7063kh khVar = this.f23093a;
        if (khVar == null) {
            C7063kh khVar2 = new C7063kh(i, 17);
            this.f23093a = khVar2;
            npVar.f23116a = khVar2.mo16118c(Arrays.copyOfRange(i, 9, aee.mo14551e()), (C7243qz) null);
            return true;
        } else if ((i[0] & Byte.MAX_VALUE) == 3) {
            C7062kg s = atv.m19627s(aee);
            C7063kh e = khVar.mo16120e(s);
            this.f23093a = e;
            this.f23094b = new C7144nh(e, s);
            return true;
        } else if (!m21234d(i)) {
            return true;
        } else {
            C7144nh nhVar = this.f23094b;
            if (nhVar != null) {
                nhVar.mo16196c(j);
                npVar.f23117b = this.f23094b;
            }
            return false;
        }
    }
}
