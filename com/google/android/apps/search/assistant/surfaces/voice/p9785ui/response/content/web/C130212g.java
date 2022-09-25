package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.net.Uri;
import com.google.common.base.C58809a;
import com.google.common.base.C58890d;
import java.util.List;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.g */
/* compiled from: PG */
public final class C130212g {

    /* renamed from: a */
    public static final /* synthetic */ int f356971a = 0;

    /* renamed from: b */
    private static final List f356972b = C69540x.m100947e("/search", "/m/search", "/webhp", "/s");

    static {
        C69531o.m100939p(new String[]{"http://google.com", "http://google.com/", "https://google.com", "https://google.com/", "http://www.google.com", "http://www.google.com/", "https://www.google.com", "https://www.google.com/"});
    }

    /* renamed from: a */
    public static final boolean m212588a(Uri uri) {
        String authority;
        String str;
        C69664n.m101061g(uri, "uri");
        if (m212589b(uri)) {
            return false;
        }
        C69664n.m101061g(uri, "uri");
        C130211f fVar = null;
        if (!m212589b(uri) && (authority = uri.getAuthority()) != null) {
            String a = C58809a.m90792a(authority);
            if (C69664n.m101066l(a, "www.google.com") || C69664n.m101066l(a, "google.com") || C69664n.m101066l(a, "www.google.com.hk") || C69664n.m101066l(a, "google.com.hk")) {
                fVar = new C130211f((String) null);
            } else {
                if (C69764m.m101230i(a, ".google.com")) {
                    str = C69764m.m101199s(a, ".google.com");
                } else if (C69764m.m101230i(a, ".google.com.hk")) {
                    str = C69764m.m101199s(a, ".google.com.hk");
                }
                fVar = new C130211f(C69764m.m101198r(str, "www."));
            }
        }
        return fVar != null && fVar.f356970a == null && C69540x.m100848ad(f356972b, uri.getPath());
    }

    /* renamed from: b */
    private static final boolean m212589b(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !C58890d.m90990e(scheme, "https") && !C58890d.m90990e(scheme, "http")) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            return (C69764m.m101187D(authority, '\\') == -1 && C69764m.m101187D(authority, ':') == -1 && C69764m.m101187D(authority, '@') == -1) ? false : true;
        }
        return false;
    }
}
