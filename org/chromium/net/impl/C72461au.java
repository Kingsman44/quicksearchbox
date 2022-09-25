package org.chromium.net.impl;

import android.util.Log;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* renamed from: org.chromium.net.impl.au */
/* compiled from: PG */
public final class C72461au extends C72529k {

    /* renamed from: c */
    private static final String f192816c = "au";

    /* renamed from: a */
    public final int f192817a;

    /* renamed from: b */
    public final C72539u f192818b;

    /* renamed from: d */
    private final String f192819d;

    /* renamed from: e */
    private final ExecutorService f192820e;

    public C72461au(C72533o oVar) {
        int hashCode = hashCode();
        this.f192817a = hashCode;
        int a = oVar.mo64274a(9);
        this.f192819d = oVar.f193001e;
        this.f192820e = new ThreadPoolExecutor(10, 20, 50, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C72459as(a));
        C72539u a2 = C72540v.m107236a(oVar.f192997a);
        this.f192818b = a2;
        try {
            a2.mo58625b(hashCode, new C72536r(oVar), new C72538t(getVersionString().split("/")[1].split("@")[0]), 4);
        } catch (RuntimeException e) {
            Log.e(f192816c, "Error while trying to log JavaCronetEngine creation: ", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ExperimentalBidirectionalStream mo64182a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        throw null;
    }

    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void bindToNetwork(long j) {
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }

    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new C72460at();
    }

    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    public final int getEffectiveConnectionType() {
        return 0;
    }

    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    public final int getHttpRttMs() {
        return -1;
    }

    public final int getTransportRttMs() {
        return -1;
    }

    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat(C72456ap.m107161a());
    }

    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new C72511cq(str, callback, executor, this);
    }

    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void shutdown() {
        this.f192820e.shutdown();
    }

    public final void startNetLogToDisk(String str, boolean z, int i) {
    }

    public final void startNetLogToFile(String str, boolean z) {
    }

    public final void stopNetLog() {
    }

    /* renamed from: b */
    public final C72510cp mo64183b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j) {
        if (j == -1) {
            return new C72499ce(this, callback, this.f192820e, executor, str, this.f192819d, z3, z4, i2, z5, i3);
        }
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }

    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }
}
