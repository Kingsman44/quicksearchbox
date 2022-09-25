package com.google.android.libraries.web.webview.p3478d.p3479a;

import android.net.Uri;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.browser.internal.p3352a.C43288g;
import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.webview.p3474c.p3475a.C44350a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.d.a.b */
/* compiled from: PG */
final class C44396b implements C43288g {

    /* renamed from: a */
    final /* synthetic */ C44401g f115410a;

    public C44396b(C44401g gVar) {
        this.f115410a = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46393a(C43854a aVar) {
        C69664n.m101061g(aVar, "callback");
    }

    /* renamed from: b */
    public final C43257h mo46394b(C43257h hVar) {
        String str;
        C69664n.m101061g(hVar, "loadUrlParams");
        if (!this.f115410a.f115418c || !hVar.mo46362k()) {
            return hVar;
        }
        C43255f o = hVar.mo46367o();
        String f = hVar.mo46356f();
        C69664n.m101060f(f, "loadUrlParams.url()");
        C69664n.m101061g(f, "<this>");
        if (!C44350a.m78300a(f)) {
            Uri parse = Uri.parse(f);
            String encodedFragment = parse.getEncodedFragment();
            if (encodedFragment == null) {
                str = "webViewReplace";
            } else {
                str = encodedFragment.concat("&webViewReplace");
            }
            f = parse.buildUpon().encodedFragment(str).toString();
            C69664n.m101060f(f, "uri.buildUpon().encodedF…WithIsReplace).toString()");
        }
        o.mo46349j(f);
        C43257h k = o.mo46365k();
        C69664n.m101060f(k, "loadUrlParams\n          …ent())\n          .build()");
        return k;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo46395c(boolean z, C69626l lVar) {
        throw new UnsupportedOperationException("setIsEmbedded only supported on WebLayer.");
    }

    /* renamed from: d */
    public final boolean mo46396d() {
        return this.f115410a.f115421f.mo46945l();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo46397e() {
    }

    /* renamed from: f */
    public final void mo46398f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final void mo46399g() {
    }
}
