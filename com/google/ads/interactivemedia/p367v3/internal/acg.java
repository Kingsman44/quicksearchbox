package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acg */
/* compiled from: PG */
public final class acg implements abx {

    /* renamed from: a */
    private final Context f20282a;

    /* renamed from: b */
    private final List f20283b = new ArrayList();

    /* renamed from: c */
    private final abx f20284c;

    /* renamed from: d */
    private abx f20285d;

    /* renamed from: e */
    private abx f20286e;

    /* renamed from: f */
    private abx f20287f;

    /* renamed from: g */
    private abx f20288g;

    /* renamed from: h */
    private abx f20289h;

    /* renamed from: i */
    private abx f20290i;

    /* renamed from: j */
    private abx f20291j;

    /* renamed from: k */
    private abx f20292k;

    public acg(Context context, abx abx) {
        this.f20282a = context.getApplicationContext();
        ary.m19467t(abx);
        this.f20284c = abx;
    }

    /* renamed from: g */
    private final abx m18225g() {
        if (this.f20286e == null) {
            abl abl = new abl(this.f20282a);
            this.f20286e = abl;
            m18226h(abl);
        }
        return this.f20286e;
    }

    /* renamed from: h */
    private final void m18226h(abx abx) {
        for (int i = 0; i < this.f20283b.size(); i++) {
            abx.mo14402b((adh) this.f20283b.get(i));
        }
    }

    /* renamed from: i */
    private static final void m18227i(abx abx, adh adh) {
        if (abx != null) {
            abx.mo14402b(adh);
        }
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        abx abx = this.f20292k;
        ary.m19467t(abx);
        return abx.mo14388a(bArr, i, i2);
    }

    /* renamed from: b */
    public final void mo14402b(adh adh) {
        ary.m19467t(adh);
        this.f20284c.mo14402b(adh);
        this.f20283b.add(adh);
        m18227i(this.f20285d, adh);
        m18227i(this.f20286e, adh);
        m18227i(this.f20287f, adh);
        m18227i(this.f20288g, adh);
        m18227i(this.f20289h, adh);
        m18227i(this.f20290i, adh);
        m18227i(this.f20291j, adh);
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        abx abx;
        ary.m19464q(this.f20292k == null);
        String scheme = acb.f20241a.getScheme();
        if (aeu.m18532b(acb.f20241a)) {
            String path = acb.f20241a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20285d == null) {
                    acl acl = new acl();
                    this.f20285d = acl;
                    m18226h(acl);
                }
                this.f20292k = this.f20285d;
            } else {
                this.f20292k = m18225g();
            }
        } else if ("asset".equals(scheme)) {
            this.f20292k = m18225g();
        } else if ("content".equals(scheme)) {
            if (this.f20287f == null) {
                abt abt = new abt(this.f20282a);
                this.f20287f = abt;
                m18226h(abt);
            }
            this.f20292k = this.f20287f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f20288g == null) {
                try {
                    abx abx2 = (abx) Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f20288g = abx2;
                    m18226h(abx2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f20288g == null) {
                    this.f20288g = this.f20284c;
                }
            }
            this.f20292k = this.f20288g;
        } else if ("udp".equals(scheme)) {
            if (this.f20289h == null) {
                adj adj = new adj();
                this.f20289h = adj;
                m18226h(adj);
            }
            this.f20292k = this.f20289h;
        } else if ("data".equals(scheme)) {
            if (this.f20290i == null) {
                abv abv = new abv();
                this.f20290i = abv;
                m18226h(abv);
            }
            this.f20292k = this.f20290i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f20291j == null) {
                    adf adf = new adf(this.f20282a);
                    this.f20291j = adf;
                    m18226h(adf);
                }
                abx = this.f20291j;
            } else {
                abx = this.f20284c;
            }
            this.f20292k = abx;
        }
        return this.f20292k.mo14389c(acb);
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        abx abx = this.f20292k;
        if (abx == null) {
            return null;
        }
        return abx.mo14390d();
    }

    /* renamed from: e */
    public final Map mo14403e() {
        abx abx = this.f20292k;
        return abx == null ? Collections.emptyMap() : abx.mo14403e();
    }

    /* renamed from: f */
    public final void mo14391f() {
        abx abx = this.f20292k;
        if (abx != null) {
            try {
                abx.mo14391f();
            } finally {
                this.f20292k = null;
            }
        }
    }
}
