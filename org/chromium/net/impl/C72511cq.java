package org.chromium.net.impl;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: org.chromium.net.impl.cq */
/* compiled from: PG */
public final class C72511cq extends ExperimentalUrlRequest.Builder {

    /* renamed from: a */
    private static final String f192928a = "cq";

    /* renamed from: b */
    private final C72529k f192929b;

    /* renamed from: c */
    private final String f192930c;

    /* renamed from: d */
    private final UrlRequest.Callback f192931d;

    /* renamed from: e */
    private final Executor f192932e;

    /* renamed from: f */
    private String f192933f;

    /* renamed from: g */
    private final ArrayList f192934g = new ArrayList();

    /* renamed from: h */
    private boolean f192935h;

    /* renamed from: i */
    private boolean f192936i;

    /* renamed from: j */
    private int f192937j = 3;

    /* renamed from: k */
    private Collection f192938k;

    /* renamed from: l */
    private UploadDataProvider f192939l;

    /* renamed from: m */
    private Executor f192940m;

    /* renamed from: n */
    private boolean f192941n;

    /* renamed from: o */
    private boolean f192942o;

    /* renamed from: p */
    private int f192943p;

    /* renamed from: q */
    private boolean f192944q;

    /* renamed from: r */
    private int f192945r;

    /* renamed from: s */
    private RequestFinishedInfo.Listener f192946s;

    /* renamed from: t */
    private long f192947t = -1;

    /* renamed from: u */
    private int f192948u = 0;

    public C72511cq(String str, UrlRequest.Callback callback, Executor executor, C72529k kVar) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (callback == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.f192930c = str;
            this.f192931d = callback;
            this.f192932e = executor;
            this.f192929b = kVar;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    /* renamed from: a */
    public final C72510cp build() {
        C72529k kVar = this.f192929b;
        C72529k kVar2 = kVar;
        C72510cp b = kVar2.mo64183b(this.f192930c, this.f192931d, this.f192932e, this.f192937j, this.f192938k, this.f192935h, this.f192936i, this.f192941n, this.f192942o, this.f192943p, this.f192944q, this.f192945r, this.f192946s, this.f192948u, this.f192947t);
        String str = this.f192933f;
        if (str != null) {
            b.mo64179g(str);
        }
        ArrayList arrayList = this.f192934g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            b.mo64173a((String) pair.first, (String) pair.second);
        }
        UploadDataProvider uploadDataProvider = this.f192939l;
        if (uploadDataProvider != null) {
            b.mo64180h(uploadDataProvider, this.f192940m);
        }
        return b;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.f192938k == null) {
                this.f192938k = new ArrayList();
            }
            this.f192938k.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public final /* synthetic */ ExperimentalUrlRequest.Builder bindToNetwork(long j) {
        this.f192947t = j;
        return this;
    }

    public final /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        this.f192936i = true;
        return this;
    }

    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        if (str != null) {
            this.f192933f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public final /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        this.f192948u = i;
        return this;
    }

    public final /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f192946s = listener;
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.f192942o = true;
        this.f192943p = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.f192944q = true;
        this.f192945r = i;
        return this;
    }

    /* renamed from: c */
    public final void mo64261c(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor != null) {
            if (this.f192933f == null) {
                this.f192933f = "POST";
            }
            this.f192939l = uploadDataProvider;
            this.f192940m = executor;
        } else {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
    }

    /* renamed from: b */
    public final void mo64260b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else if ("Accept-Encoding".equalsIgnoreCase(str)) {
            Log.w(f192928a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        } else {
            this.f192934g.add(Pair.create(str, str2));
        }
    }
}
