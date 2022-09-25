package com.google.android.libraries.p11026am;

import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.am.g */
/* compiled from: PG */
public class C147764g {

    /* renamed from: a */
    private static final Pattern f398709a = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    static {
        C58974d.m91134h("UrlChecker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29446a(String str) {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo124438c(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String uri2 = C147763f.m240840a(uri).toString();
        if (f398709a.matcher(uri2).find()) {
            C147763f.m240841b(uri);
            return false;
        } else if ((!C58837ba.m90859h(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return mo29446a(uri2);
        } else {
            C147763f.m240841b(uri);
            return false;
        }
    }
}
