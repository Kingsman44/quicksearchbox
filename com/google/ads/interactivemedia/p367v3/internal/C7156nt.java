package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nt */
/* compiled from: PG */
final class C7156nt extends C7154nr {

    /* renamed from: a */
    private C7155ns f23135a;

    /* renamed from: b */
    private int f23136b;

    /* renamed from: c */
    private boolean f23137c;

    /* renamed from: d */
    private C7077kv f23138d;

    /* renamed from: e */
    private C7075kt f23139e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16197a(boolean z) {
        super.mo16197a(z);
        if (z) {
            this.f23135a = null;
            this.f23138d = null;
            this.f23139e = null;
        }
        this.f23136b = 0;
        this.f23137c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16198b(aee aee) {
        int i;
        int i2 = 0;
        if ((aee.mo14555i()[0] & 1) == 1) {
            return -1;
        }
        byte b = aee.mo14555i()[0];
        C7155ns nsVar = this.f23135a;
        if (!nsVar.f23133c[(b >> 1) & (PrivateKeyType.INVALID >>> (8 - nsVar.f23134d))].f22641a) {
            i = nsVar.f23131a.f22646e;
        } else {
            i = nsVar.f23131a.f22647f;
        }
        if (this.f23137c) {
            i2 = (this.f23136b + i) / 4;
        }
        long j = (long) i2;
        if (aee.mo14556j() < aee.mo14551e() + 4) {
            aee.mo14548b(Arrays.copyOf(aee.mo14555i(), aee.mo14551e() + 4));
        } else {
            aee.mo14552f(aee.mo14551e() + 4);
        }
        byte[] i3 = aee.mo14555i();
        i3[aee.mo14551e() - 4] = (byte) ((int) (j & 255));
        i3[aee.mo14551e() - 3] = (byte) ((int) ((j >>> 8) & 255));
        i3[aee.mo14551e() - 2] = (byte) ((int) ((j >>> 16) & 255));
        i3[aee.mo14551e() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f23137c = true;
        this.f23136b = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo16199c(aee aee, long j, C7152np npVar) {
        aee aee2 = aee;
        if (this.f23135a != null) {
            return false;
        }
        C7155ns nsVar = null;
        if (this.f23138d == null) {
            atv.m19623o(1, aee2, false);
            aee.mo14539C();
            int n = aee.mo14560n();
            int C = aee.mo14539C();
            int w = aee.mo14569w();
            int i = w <= 0 ? -1 : w;
            int w2 = aee.mo14569w();
            int i2 = w2 <= 0 ? -1 : w2;
            aee.mo14569w();
            int n2 = aee.mo14560n();
            double pow = Math.pow(2.0d, (double) (n2 & 15));
            double pow2 = Math.pow(2.0d, (double) ((n2 & 240) >> 4));
            aee.mo14560n();
            this.f23138d = new C7077kv(n, C, i, i2, (int) pow, (int) pow2, Arrays.copyOf(aee.mo14555i(), aee.mo14551e()));
        } else if (this.f23139e == null) {
            this.f23139e = atv.m19622n(aee2, true, true);
        } else {
            byte[] bArr = new byte[aee.mo14551e()];
            System.arraycopy(aee.mo14555i(), 0, bArr, 0, aee.mo14551e());
            C7076ku[] p = atv.m19624p(aee2, this.f23138d.f22642a);
            nsVar = new C7155ns(this.f23138d, bArr, p, atv.m19621m(p.length - 1));
        }
        this.f23135a = nsVar;
        if (nsVar == null) {
            return true;
        }
        C7077kv kvVar = nsVar.f23131a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(kvVar.f22648g);
        arrayList.add(this.f23135a.f23132b);
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("audio/vorbis");
        cxVar.mo15605G(kvVar.f22645d);
        cxVar.mo15624Z(kvVar.f22644c);
        cxVar.mo15606H(kvVar.f22642a);
        cxVar.mo15631af(kvVar.f22643b);
        cxVar.mo15618T(arrayList);
        npVar.f23116a = cxVar.mo15625a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo16213i(long j) {
        super.mo16213i(j);
        int i = 0;
        this.f23137c = j != 0;
        C7077kv kvVar = this.f23138d;
        if (kvVar != null) {
            i = kvVar.f22646e;
        }
        this.f23136b = i;
    }
}
