package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.p3340w.p3342b.C43211a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.q */
/* compiled from: PG */
public final class C31458q extends RequestFinishedInfo.Listener {

    /* renamed from: a */
    public static final C21370a f84720a = new C21375e();

    /* renamed from: b */
    private static final C59071e f84721b = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.f.q");

    /* renamed from: c */
    private final C21370a f84722c;

    public C31458q(Executor executor, C21370a aVar) {
        super(executor);
        this.f84722c = aVar;
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Map allHeaders;
        List list;
        if (!C31167ax.m58112a().mo36916h()) {
            ((C59052c) ((C59052c) f84721b.mo56226d()).mo56372aa(50411)).mo56386p("onRequestFinished is skipped as primes preconditions failed.");
        } else if (requestFinishedInfo == null) {
            ((C59052c) ((C59052c) f84721b.mo56226d()).mo56372aa(50410)).mo56386p("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
        } else {
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            if (metrics == null) {
                ((C59052c) ((C59052c) f84721b.mo56226d()).mo56372aa(50409)).mo56386p("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
                return;
            }
            if (requestFinishedInfo.getAnnotations() != null) {
                for (Object obj : requestFinishedInfo.getAnnotations()) {
                    if (obj instanceof C43211a) {
                        return;
                    }
                }
            }
            Date requestStart = metrics.getRequestStart();
            C31447f fVar = new C31447f((String) null, requestFinishedInfo.getUrl(), false, requestStart == null ? this.f84722c.mo26870b() : requestStart.getTime());
            UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
            if (!(responseInfo == null || (allHeaders = responseInfo.getAllHeaders()) == null || (list = (List) allHeaders.get("Content-Type")) == null || list.isEmpty())) {
                fVar.f84675k = (String) list.get(0);
            }
            Long receivedByteCount = metrics.getReceivedByteCount();
            if (receivedByteCount != null) {
                fVar.f84668d = receivedByteCount.intValue();
            }
            Long sentByteCount = metrics.getSentByteCount();
            if (sentByteCount != null) {
                fVar.f84669e = sentByteCount.intValue();
            }
            Long ttfbMs = metrics.getTtfbMs();
            if (ttfbMs != null) {
                fVar.f84666b = ttfbMs.longValue();
            }
            Long totalTimeMs = metrics.getTotalTimeMs();
            if (totalTimeMs != null) {
                fVar.f84667c = totalTimeMs.longValue();
            }
            UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
            if (responseInfo2 != null) {
                int httpStatusCode = responseInfo2.getHttpStatusCode();
                if (httpStatusCode >= 0) {
                    fVar.f84674j = httpStatusCode;
                }
                String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
                if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                    fVar.f84673i = negotiatedProtocol;
                }
            }
            int finishedReason = requestFinishedInfo.getFinishedReason();
            int i = 4;
            int i2 = 2;
            if (finishedReason != 0) {
                i2 = finishedReason != 1 ? finishedReason != 2 ? 1 : 4 : 3;
            }
            fVar.f84686v = i2;
            CronetException exception = requestFinishedInfo.getException();
            if (exception != null) {
                if (exception instanceof NetworkException) {
                    switch (((NetworkException) exception).getErrorCode()) {
                        case 1:
                            i = 3;
                            break;
                        case 2:
                            break;
                        case 3:
                            i = 5;
                            break;
                        case 4:
                            i = 6;
                            break;
                        case 5:
                            i = 7;
                            break;
                        case 6:
                            i = 8;
                            break;
                        case 7:
                            i = 9;
                            break;
                        case 8:
                            i = 10;
                            break;
                        case 9:
                            i = 11;
                            break;
                        case 10:
                            i = 12;
                            break;
                        case 11:
                            i = 13;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    fVar.f84679o = i - 1;
                } else if (exception instanceof CallbackException) {
                    fVar.f84679o = 1;
                } else {
                    fVar.f84679o = 0;
                }
                if (exception instanceof QuicException) {
                    fVar.f84680p = ((QuicException) exception).getQuicDetailedErrorCode();
                }
            }
            fVar.f84677m = 1;
            C31167ax.m58112a().mo36913d(fVar);
        }
    }
}
