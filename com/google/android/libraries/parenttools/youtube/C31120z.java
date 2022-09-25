package com.google.android.libraries.parenttools.youtube;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.parenttools.youtube.z */
/* compiled from: PG */
final class C31120z extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C31093aa f83817a;

    public C31120z(C31093aa aaVar) {
        this.f83817a = aaVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a A[Catch:{ IllegalArgumentException -> 0x009f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m58039a(android.net.Uri r9) {
        /*
            r8 = this;
            com.google.android.libraries.parenttools.youtube.aa r0 = r8.f83817a
            java.lang.String r0 = r0.f83759b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r9.getScheme()
            java.lang.String r2 = r0.getScheme()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = r9.getHost()
            java.lang.String r3 = r0.getHost()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = r9.getPath()
            java.lang.String r0 = r0.getPath()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b5
            com.google.android.libraries.parenttools.youtube.ac r0 = com.google.android.libraries.parenttools.youtube.ParentToolsResult.m58007d()
            java.util.Set r1 = r9.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "EXIT_STATUS"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x003f
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch:{ IllegalArgumentException -> 0x009f }
            int r5 = r3.hashCode()     // Catch:{ IllegalArgumentException -> 0x009f }
            r6 = -1848781195(0xffffffff91cdd675, float:-3.2475466E-28)
            r7 = 2
            if (r5 == r6) goto L_0x0081
            r6 = -1715644859(0xffffffff99bd5645, float:-1.9576986E-23)
            if (r5 == r6) goto L_0x0077
            r6 = -889497983(0xffffffffcafb5681, float:-8235840.5)
            if (r5 == r6) goto L_0x006d
            goto L_0x008b
        L_0x006d:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_ONBOARDED"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x008b
            r3 = 2
            goto L_0x008c
        L_0x0077:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_UNKNOWN"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            goto L_0x008c
        L_0x0081:
            java.lang.String r5 = "PARENT_TOOLS_EXIT_STATUS_NOT_ONBOARDED"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x008b
            r3 = 1
            goto L_0x008c
        L_0x008b:
            r3 = -1
        L_0x008c:
            if (r3 == 0) goto L_0x009a
            if (r3 == r4) goto L_0x009b
            if (r3 != r7) goto L_0x0094
            r7 = 3
            goto L_0x009b
        L_0x0094:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x009f }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x009f }
            throw r3     // Catch:{ IllegalArgumentException -> 0x009f }
        L_0x009a:
            r7 = 1
        L_0x009b:
            r0.mo36840c(r7)     // Catch:{ IllegalArgumentException -> 0x009f }
            goto L_0x003f
        L_0x009f:
            r3 = move-exception
            java.lang.String r5 = "ParentToolsFragment"
            java.lang.String r6 = "EXIT_STATUS parameter value was not a valid enum name!"
            android.util.Log.e(r5, r6, r3)
            r0.mo36840c(r4)
            goto L_0x003f
        L_0x00ab:
            com.google.android.libraries.parenttools.youtube.ParentToolsResult r9 = r0.mo36838a()
            com.google.android.libraries.parenttools.youtube.aa r0 = r8.f83817a
            r0.mo36844g(r9, r4)
            return r4
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.parenttools.youtube.C31120z.m58039a(android.net.Uri):boolean");
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C31093aa aaVar = this.f83817a;
        aaVar.f83761d.setVisibility(8);
        aaVar.f83760c.setVisibility(0);
        C31117w wVar = (C31117w) aaVar.getActivity();
        if (wVar != null) {
            wVar.mo36833w();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", new Object[]{Integer.valueOf(i), str, str2}));
        if (i != -1) {
            this.f83817a.mo36842e(BuildConfig.FLAVOR);
        }
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Log.e("ParentToolsFragment", String.format("HTTP error reported from web, status code=%d, url=%s", new Object[]{Integer.valueOf(webResourceResponse.getStatusCode()), webResourceRequest.getUrl()}));
        this.f83817a.mo36842e(String.valueOf(webResourceResponse.getStatusCode()));
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.e("ParentToolsFragment", String.format("SSL error reported from web, url=%s", new Object[]{sslError.getUrl()}));
        this.f83817a.mo36842e(BuildConfig.FLAVOR);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m58039a(webResourceRequest.getUrl());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m58039a(Uri.parse(str));
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Log.e("ParentToolsFragment", String.format("Error reported from web, error code=%d, description=%s, url=%s", new Object[]{Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription(), webResourceRequest.getUrl()}));
        if (webResourceError.getErrorCode() != -1) {
            this.f83817a.mo36842e(BuildConfig.FLAVOR);
        }
    }
}
