package org.chromium.net;

import android.net.ProxyInfo;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;

/* renamed from: org.chromium.net.v */
/* compiled from: PG */
final class C72557v {

    /* renamed from: a */
    public static final C72557v f193077a = new C72557v(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, new String[0]);

    /* renamed from: b */
    public final String f193078b;

    /* renamed from: c */
    public final int f193079c;

    /* renamed from: d */
    public final String f193080d;

    /* renamed from: e */
    public final String[] f193081e;

    public C72557v(String str, int i, String str2, String[] strArr) {
        this.f193078b = str;
        this.f193079c = i;
        this.f193080d = str2;
        this.f193081e = strArr;
    }

    /* renamed from: a */
    public static C72557v m107247a(ProxyInfo proxyInfo) {
        String str = null;
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        if (host == null) {
            host = BuildConfig.FLAVOR;
        }
        int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals(pacFileUrl)) {
            str = pacFileUrl.toString();
        }
        return new C72557v(host, port, str, proxyInfo.getExclusionList());
    }
}
