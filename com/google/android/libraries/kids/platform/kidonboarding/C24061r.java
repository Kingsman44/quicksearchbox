package com.google.android.libraries.kids.platform.kidonboarding;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import com.google.android.libraries.p11026am.C147762e;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.r */
/* compiled from: PG */
public final class C24061r extends C147762e {

    /* renamed from: a */
    private static final C59071e f65736a = C59071e.m91331h();

    /* renamed from: b */
    private final Fragment f65737b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24061r(C24059p pVar, Fragment fragment) {
        super(pVar);
        C69664n.m101061g(fragment, "fragment");
        this.f65737b = fragment;
    }

    /* renamed from: d */
    public final boolean mo29447d(WebResourceRequest webResourceRequest) {
        C69664n.m101061g(webResourceRequest, "request");
        Uri url = webResourceRequest.getUrl();
        C59071e eVar = f65736a;
        C59052c cVar = (C59052c) eVar.mo56226d();
        cVar.mo56379ah(new C59094n(48706));
        cVar.mo56389s("Attempted to load blocked URL: %s", url);
        if (URLUtil.isNetworkUrl(url.toString())) {
            try {
                C47709i.m84861a(this.f65737b, new Intent("android.intent.action.VIEW", url));
                return true;
            } catch (ActivityNotFoundException e) {
                C59052c cVar2 = (C59052c) ((C59052c) f65736a.mo56226d()).mo56382g(e);
                cVar2.mo56379ah(new C59094n(48708));
                cVar2.mo56389s("Cannot launch external URL: %s", url);
                return false;
            }
        } else {
            C59052c cVar3 = (C59052c) eVar.mo56226d();
            cVar3.mo56379ah(new C59094n(48707));
            cVar3.mo56389s("Cannot and should not open non-network URL: %s", url);
            return false;
        }
    }
}
