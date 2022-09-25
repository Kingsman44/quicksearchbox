package org.chromium.net.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* renamed from: org.chromium.net.impl.k */
/* compiled from: PG */
public abstract class C72529k extends ExperimentalCronetEngine {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ExperimentalBidirectionalStream mo64182a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C72510cp mo64183b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j);

    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new C72511cq(str, callback, executor, this);
    }
}
