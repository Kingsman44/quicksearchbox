package org.chromium.net.impl;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.impl.co */
/* compiled from: PG */
public final class C72509co extends RequestFinishedInfo {

    /* renamed from: a */
    private final String f192922a;

    /* renamed from: b */
    private final Collection f192923b;

    /* renamed from: c */
    private final RequestFinishedInfo.Metrics f192924c;

    /* renamed from: d */
    private final int f192925d;

    /* renamed from: e */
    private final UrlResponseInfo f192926e;

    /* renamed from: f */
    private final CronetException f192927f;

    public C72509co(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f192922a = str;
        this.f192923b = collection;
        this.f192924c = metrics;
        this.f192925d = i;
        this.f192926e = urlResponseInfo;
        this.f192927f = cronetException;
    }

    public final Collection getAnnotations() {
        Collection collection = this.f192923b;
        return collection == null ? Collections.emptyList() : collection;
    }

    public final CronetException getException() {
        return this.f192927f;
    }

    public final int getFinishedReason() {
        return this.f192925d;
    }

    public final RequestFinishedInfo.Metrics getMetrics() {
        return this.f192924c;
    }

    public final UrlResponseInfo getResponseInfo() {
        return this.f192926e;
    }

    public final String getUrl() {
        return this.f192922a;
    }
}
