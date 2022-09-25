package org.chromium.net.impl;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.cs */
/* compiled from: PG */
public final class C72513cs extends UrlResponseInfo {

    /* renamed from: a */
    public final int f192951a;

    /* renamed from: b */
    public final boolean f192952b;

    /* renamed from: c */
    public final String f192953c;

    /* renamed from: d */
    public final AtomicLong f192954d;

    /* renamed from: e */
    public final C72512cr f192955e;

    /* renamed from: f */
    private final List f192956f;

    /* renamed from: g */
    private final String f192957g;

    /* renamed from: h */
    private final String f192958h;

    public C72513cs(List list, int i, String str, List list2, boolean z, String str2, String str3, long j) {
        this.f192956f = Collections.unmodifiableList(list);
        this.f192951a = i;
        this.f192957g = str;
        this.f192955e = new C72512cr(Collections.unmodifiableList(list2));
        this.f192952b = z;
        this.f192953c = str2;
        this.f192958h = str3;
        this.f192954d = new AtomicLong(j);
    }

    public final Map getAllHeaders() {
        return this.f192955e.getAsMap();
    }

    public final List getAllHeadersAsList() {
        return this.f192955e.f192949a;
    }

    public final int getHttpStatusCode() {
        return this.f192951a;
    }

    public final String getHttpStatusText() {
        return this.f192957g;
    }

    public final String getNegotiatedProtocol() {
        return this.f192953c;
    }

    public final String getProxyServer() {
        return this.f192958h;
    }

    public final long getReceivedByteCount() {
        return this.f192954d.get();
    }

    public final String getUrl() {
        List list = this.f192956f;
        return (String) list.get(list.size() - 1);
    }

    public final List getUrlChain() {
        return this.f192956f;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List list = this.f192956f;
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), (String) list.get(list.size() - 1), this.f192956f.toString(), Integer.valueOf(this.f192951a), this.f192957g, this.f192955e.f192949a.toString(), Boolean.valueOf(this.f192952b), this.f192953c, this.f192958h, Long.valueOf(this.f192954d.get())});
    }

    public final boolean wasCached() {
        return this.f192952b;
    }
}
