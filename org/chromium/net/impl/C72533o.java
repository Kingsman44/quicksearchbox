package org.chromium.net.impl;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: org.chromium.net.impl.o */
/* compiled from: PG */
public abstract class C72533o extends ICronetEngineBuilder {

    /* renamed from: n */
    private static final Pattern f192996n = Pattern.compile("^[0-9\\.]*$");

    /* renamed from: a */
    public final Context f192997a;

    /* renamed from: b */
    public final List f192998b = new LinkedList();

    /* renamed from: c */
    public final List f192999c = new LinkedList();

    /* renamed from: d */
    public boolean f193000d;

    /* renamed from: e */
    public String f193001e;

    /* renamed from: f */
    public String f193002f;

    /* renamed from: g */
    public boolean f193003g;

    /* renamed from: h */
    public boolean f193004h;

    /* renamed from: i */
    public boolean f193005i;

    /* renamed from: j */
    public C72530l f193006j;

    /* renamed from: k */
    public long f193007k;

    /* renamed from: l */
    public String f193008l;

    /* renamed from: m */
    public boolean f193009m;

    /* renamed from: o */
    private int f193010o = 20;

    public C72533o(Context context) {
        this.f192997a = context.getApplicationContext();
        this.f193003g = true;
        this.f193004h = true;
        this.f193005i = false;
        mo64277e(0, 0);
        this.f193009m = false;
        this.f193000d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo64274a(int i) {
        int i2 = this.f193010o;
        return i2 == 20 ? i : i2;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        mo64275c(str, set, z, date);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        mo64276d(str, i, i2);
        return this;
    }

    /* renamed from: b */
    public C72516cv mo64255b() {
        return null;
    }

    /* renamed from: d */
    public final void mo64276d(String str, int i, int i2) {
        if (!str.contains("/")) {
            this.f192998b.add(new C72532n(str, i, i2));
            return;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final void mo64277e(int i, long j) {
        C72530l a = C72530l.m107225a(i);
        if (a.f192987e == 1 && this.f193002f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.f193006j = a;
        this.f193007k = j;
    }

    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.f193005i = z;
        return this;
    }

    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.f193004h = z;
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        mo64277e(i, j);
        return this;
    }

    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.f193009m = z;
        return this;
    }

    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f193000d = z;
        return this;
    }

    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.f193003g = z;
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    /* renamed from: f */
    public void mo64256f(CronetEngine.Builder.LibraryLoader libraryLoader) {
    }

    /* renamed from: g */
    public final void mo64278g(String str) {
        if (new File(str).isDirectory()) {
            this.f193002f = str;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    public final String getDefaultUserAgent() {
        return C72514ct.m107222a(this.f192997a);
    }

    /* renamed from: h */
    public final void mo64279h(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.f193010o = i;
    }

    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.f193008l = str;
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        mo64256f(libraryLoader);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        mo64278g(str);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        mo64279h(i);
        return this;
    }

    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.f193001e = str;
        return this;
    }

    /* renamed from: c */
    public final void mo64275c(String str, Set set, boolean z, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        } else if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        } else if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        } else if (f192996n.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        } else if (str.length() <= 255) {
            try {
                String ascii = IDN.toASCII(str, 2);
                HashMap hashMap = new HashMap();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    if (bArr == null || bArr.length != 32) {
                        throw new IllegalArgumentException("Public key pin is invalid");
                    }
                    hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                }
                this.f192999c.add(new C72531m(ascii, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]), z, date));
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
        } else {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }
}
