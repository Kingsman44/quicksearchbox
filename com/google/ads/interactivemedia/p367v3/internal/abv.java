package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.util.Base64;
import p3186j$.net.URLDecoder;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abv */
/* compiled from: PG */
public final class abv extends abr {

    /* renamed from: a */
    private acb f20221a;

    /* renamed from: b */
    private byte[] f20222b;

    /* renamed from: c */
    private int f20223c;

    /* renamed from: d */
    private int f20224d;

    public abv() {
        super(false);
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f20223c - this.f20224d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(aeu.m18536f(this.f20222b), this.f20224d, bArr, i, min);
        this.f20224d += min;
        mo14406i(min);
        return min;
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        mo14404g(acb);
        this.f20221a = acb;
        this.f20224d = (int) acb.f20245e;
        Uri uri = acb.f20241a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new C6886dt(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String[] z = aeu.m18556z(uri.getSchemeSpecificPart(), ",");
        if (z.length == 2) {
            String str = z[1];
            if (z[0].contains(";base64")) {
                try {
                    this.f20222b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new C6886dt(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f20222b = aeu.m18555y(URLDecoder.decode(str, apv.f21363a.name()));
            }
            long j = acb.f20246f;
            int length = j != -1 ? ((int) j) + this.f20224d : this.f20222b.length;
            this.f20223c = length;
            if (length > this.f20222b.length || this.f20224d > length) {
                this.f20222b = null;
                throw new aby();
            }
            mo14405h(acb);
            return ((long) this.f20223c) - ((long) this.f20224d);
        }
        String valueOf3 = String.valueOf(uri);
        String.valueOf(valueOf3).length();
        throw new C6886dt("Unexpected URI format: ".concat(String.valueOf(valueOf3)));
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        acb acb = this.f20221a;
        if (acb != null) {
            return acb.f20241a;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo14391f() {
        if (this.f20222b != null) {
            this.f20222b = null;
            mo14407j();
        }
        this.f20221a = null;
    }
}
