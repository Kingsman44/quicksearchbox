package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.za */
/* compiled from: PG */
final class C7461za implements C7073kr {

    /* renamed from: a */
    private static final C6864cy f24485a;

    /* renamed from: b */
    private final C7248rd f24486b = new C7248rd();

    /* renamed from: c */
    private final C7073kr f24487c;

    /* renamed from: d */
    private final C6864cy f24488d;

    /* renamed from: e */
    private C6864cy f24489e;

    /* renamed from: f */
    private byte[] f24490f;

    /* renamed from: g */
    private int f24491g;

    static {
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("application/id3");
        f24485a = cxVar.mo15625a();
        C6863cx cxVar2 = new C6863cx();
        cxVar2.mo15630ae("application/x-emsg");
        cxVar2.mo15625a();
    }

    public C7461za(C7073kr krVar, int i) {
        this.f24487c = krVar;
        if (i == 1) {
            this.f24488d = f24485a;
            this.f24490f = new byte[0];
            this.f24491g = 0;
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown metadataType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    private final void m22591g(int i) {
        byte[] bArr = this.f24490f;
        if (bArr.length < i) {
            this.f24490f = Arrays.copyOf(bArr, i + (i >> 1));
        }
    }

    /* renamed from: a */
    public final void mo16102a(C6864cy cyVar) {
        this.f24489e = cyVar;
        this.f24487c.mo16102a(this.f24488d);
    }

    /* renamed from: b */
    public final void mo16103b(long j, int i, int i2, int i3, C7072kq kqVar) {
        ary.m19467t(this.f24489e);
        int i4 = this.f24491g - i3;
        aee aee = new aee(Arrays.copyOfRange(this.f24490f, i4 - i2, i4));
        byte[] bArr = this.f24490f;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f24491g = i3;
        if (!aeu.m18533c(this.f24489e.f21812l, this.f24488d.f21812l)) {
            if ("application/x-emsg".equals(this.f24489e.f21812l)) {
                C7247rc c = C7248rd.m21690c(aee);
                C6864cy a = c.mo16359a();
                if (a == null || !aeu.m18533c(this.f24488d.f21812l, a.f21812l)) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f24488d.f21812l, c.mo16359a()}));
                    return;
                }
                aee = new aee((byte[]) ary.m19467t(c.mo16359a() != null ? c.f23686e : null));
            } else {
                String valueOf = String.valueOf(this.f24489e.f21812l);
                Log.w("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                return;
            }
        }
        int d = aee.mo14550d();
        this.f24487c.mo16105d(aee, d);
        this.f24487c.mo16103b(j, i, d, i3, kqVar);
    }

    /* renamed from: c */
    public final int mo16104c(abu abu, int i, boolean z) {
        return atv.m19625q(this, abu, i, z);
    }

    /* renamed from: d */
    public final void mo16105d(aee aee, int i) {
        atv.m19626r(this, aee, i);
    }

    /* renamed from: e */
    public final int mo16106e(abu abu, int i, boolean z) {
        m22591g(this.f24491g + i);
        int a = abu.mo14388a(this.f24490f, this.f24491g, i);
        if (a != -1) {
            this.f24491g += a;
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: f */
    public final void mo16107f(aee aee, int i) {
        m22591g(this.f24491g + i);
        aee.mo14559m(this.f24490f, this.f24491g, i);
        this.f24491g += i;
    }
}
