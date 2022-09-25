package com.google.android.apps.gsa.shared.p7030bj;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.chromium.net.NetError;

/* renamed from: com.google.android.apps.gsa.shared.bj.b */
/* compiled from: PG */
public final class C89689b {

    /* renamed from: a */
    private static final C59071e f242818a = C59071e.m91332i("com.google.android.apps.gsa.shared.bj.b");

    /* renamed from: a */
    public static int m146069a(int i) {
        switch (i) {
            case NetError.ERR_SOCKET_NOT_CONNECTED:
                return C89885b.WEBVIEW_ERROR_TOO_MANY_REQUESTS_VALUE;
            case NetError.ERR_UPLOAD_FILE_CHANGED:
                return C89885b.WEBVIEW_ERROR_FILE_NOT_FOUND_VALUE;
            case NetError.ERR_OUT_OF_MEMORY:
                return C89885b.WEBVIEW_ERROR_FILE_VALUE;
            case NetError.ERR_INSUFFICIENT_RESOURCES:
                return C89885b.WEBVIEW_ERROR_BAD_URL_VALUE;
            case NetError.ERR_NOT_IMPLEMENTED:
                return C89885b.WEBVIEW_ERROR_FAILED_SSL_HANDSHAKE_VALUE;
            case NetError.ERR_ACCESS_DENIED:
                return C89885b.WEBVIEW_ERROR_UNSUPPORTED_SCHEME_VALUE;
            case NetError.ERR_UNEXPECTED:
                return C89885b.WEBVIEW_ERROR_REDIRECT_LOOP_VALUE;
            case NetError.ERR_FILE_TOO_BIG:
                return C89885b.WEBVIEW_ERROR_TIMEOUT_VALUE;
            case NetError.ERR_TIMED_OUT:
                return C89885b.WEBVIEW_ERROR_IO_VALUE;
            case -6:
                return C89885b.WEBVIEW_ERROR_CONNECT_VALUE;
            case -5:
                return C89885b.WEBVIEW_ERROR_PROXY_AUTHENTICATION_VALUE;
            case -4:
                return C89885b.WEBVIEW_ERROR_AUTHENTICATION_VALUE;
            case -3:
                return C89885b.WEBVIEW_ERROR_UNSUPPORTED_AUTH_SCHEME_VALUE;
            case -2:
                return C89885b.WEBVIEW_ERROR_HOST_LOOKUP_VALUE;
            case -1:
                return C89885b.WEBVIEW_ERROR_UNKNOWN_VALUE;
            default:
                ((C59052c) ((C59052c) f242818a.mo56226d()).mo56372aa(11475)).mo56386p("Unrecognized android.webkit.WebViewClient error code.");
                int i2 = C90755l.f253831a;
                return C89885b.WEBVIEW_UNRECOGNIZED_ERROR_CODE_VALUE;
        }
    }
}
