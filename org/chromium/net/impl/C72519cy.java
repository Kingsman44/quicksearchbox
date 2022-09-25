package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: org.chromium.net.impl.cy */
/* compiled from: PG */
public final class C72519cy extends RequestFinishedInfo.Listener {

    /* renamed from: a */
    public final RequestFinishedInfo.Listener f192965a;

    public C72519cy(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.f192965a = listener;
    }

    public final Executor getExecutor() {
        return this.f192965a.getExecutor();
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.f192965a.onRequestFinished(requestFinishedInfo);
    }
}
