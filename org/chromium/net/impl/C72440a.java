package org.chromium.net.impl;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* renamed from: org.chromium.net.impl.a */
/* compiled from: PG */
public final class C72440a extends ExperimentalBidirectionalStream.Builder {

    /* renamed from: a */
    private final C72529k f192771a;

    /* renamed from: b */
    private final String f192772b;

    /* renamed from: c */
    private final BidirectionalStream.Callback f192773c;

    /* renamed from: d */
    private final Executor f192774d;

    /* renamed from: e */
    private final ArrayList f192775e = new ArrayList();

    /* renamed from: f */
    private String f192776f = "POST";

    /* renamed from: g */
    private int f192777g = 3;

    /* renamed from: h */
    private boolean f192778h;

    /* renamed from: i */
    private Collection f192779i;

    /* renamed from: j */
    private boolean f192780j;

    /* renamed from: k */
    private int f192781k;

    /* renamed from: l */
    private boolean f192782l;

    /* renamed from: m */
    private int f192783m;

    /* renamed from: n */
    private long f192784n = -1;

    public C72440a(String str, BidirectionalStream.Callback callback, Executor executor, C72529k kVar) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (callback == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.f192772b = str;
            this.f192773c = callback;
            this.f192774d = executor;
            this.f192771a = kVar;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.f192779i == null) {
                this.f192779i = new ArrayList();
            }
            this.f192779i.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    /* renamed from: b */
    public final void mo64192b(String str) {
        if (str != null) {
            this.f192776f = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    public final ExperimentalBidirectionalStream.Builder bindToNetwork(long j) {
        this.f192784n = j;
        return this;
    }

    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.f192780j = true;
        this.f192781k = i;
        return this;
    }

    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.f192782l = true;
        this.f192783m = i;
        return this;
    }

    /* renamed from: a */
    public final void mo64191a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.f192775e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    public final ExperimentalBidirectionalStream build() {
        return this.f192771a.mo64182a(this.f192772b, this.f192773c, this.f192774d, this.f192776f, this.f192775e, this.f192777g, this.f192778h, this.f192779i, this.f192780j, this.f192781k, this.f192782l, this.f192783m, this.f192784n);
    }
}
