package com.google.android.apps.search.podcasts.p10560d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4225bm.p4229c.C56113b;
import java.util.List;
import java.util.Set;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69755d;

/* renamed from: com.google.android.apps.search.podcasts.d.b */
/* compiled from: PG */
public final class C140195b {

    /* renamed from: a */
    public static final Set f380890a = C69531o.m100939p(new String[]{"/transfer", "/notify"});

    /* renamed from: b */
    private static final C59071e f380891b = C59071e.m91331h();

    /* renamed from: a */
    public static final C56113b m227863a(Uri uri) {
        String queryParameter = uri != null ? uri.getQueryParameter("ep") : null;
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                C69664n.m101058d(queryParameter);
                C56113b a = C56113b.m87894a(Integer.parseInt(queryParameter));
                if (a != null) {
                    return a;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return C56113b.DEEPLINK_TO_SHOW;
    }

    /* renamed from: b */
    public static final String m227864b(Uri uri) {
        C69664n.m101061g(uri, "deeplinkUri");
        String queryParameter = uri.getQueryParameter("episode");
        if (queryParameter == null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 4 && C69664n.m101066l("feed", pathSegments.get(0)) && C69664n.m101066l("episode", pathSegments.get(2))) {
                queryParameter = pathSegments.get(3);
            }
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(queryParameter, 10);
            C69664n.m101060f(decode, "decode(episodeGuidBase64…_WRAP or Base64.URL_SAFE)");
            return new String(decode, C69755d.f186125a);
        } catch (IllegalArgumentException unused) {
            C59052c cVar = (C59052c) f380891b.mo56225c();
            cVar.mo56379ah(new C59094n(41577));
            cVar.mo56386p("Invalid deeplink with malformed base64-encoded episode GUID.");
            return null;
        }
    }

    /* renamed from: c */
    public static final String m227865c(Uri uri) {
        C69664n.m101061g(uri, "deeplinkUri");
        String queryParameter = uri.getQueryParameter("feed");
        if (queryParameter == null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 2 && C69664n.m101066l("feed", pathSegments.get(0))) {
                queryParameter = pathSegments.get(1);
            }
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(queryParameter, 10);
            C69664n.m101060f(decode, "decode(feedUrlBase64, Ba…_WRAP or Base64.URL_SAFE)");
            return new String(decode, C69755d.f186125a);
        } catch (IllegalArgumentException unused) {
            C59052c cVar = (C59052c) f380891b.mo56225c();
            cVar.mo56379ah(new C59094n(41578));
            cVar.mo56386p("Invalid deeplink with malformed base64-encoded feed URL.");
            return null;
        }
    }

    /* renamed from: d */
    public static final boolean m227866d(Uri uri) {
        C69664n.m101061g(uri, "deeplinkUri");
        List<String> pathSegments = uri.getPathSegments();
        C69664n.m101060f(pathSegments, "pathSegments");
        return !pathSegments.isEmpty() && C69664n.m101066l("explore", pathSegments.get(0));
    }

    /* renamed from: e */
    public static final boolean m227867e(Uri uri) {
        C69664n.m101061g(uri, "deeplinkUri");
        List<String> pathSegments = uri.getPathSegments();
        C69664n.m101060f(pathSegments, "pathSegments");
        return !pathSegments.isEmpty() && C69664n.m101066l("subscribe-by-rss-feed", pathSegments.get(0));
    }
}
