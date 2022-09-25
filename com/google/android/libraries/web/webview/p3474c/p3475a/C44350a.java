package com.google.android.libraries.web.webview.p3474c.p3475a;

import android.net.Uri;
import java.util.Collection;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.web.webview.c.a.a */
/* compiled from: PG */
public final class C44350a {
    /* renamed from: a */
    public static final boolean m78300a(String str) {
        C69664n.m101061g(str, "<this>");
        String encodedFragment = Uri.parse(str).getEncodedFragment();
        if (encodedFragment == null) {
            return false;
        }
        List<String> E = C69764m.m101188E(encodedFragment, new String[]{"&"});
        if ((E instanceof Collection) && E.isEmpty()) {
            return false;
        }
        for (String l : E) {
            if (C69664n.m101066l(l, "webViewReplace")) {
                return true;
            }
        }
        return false;
    }
}
