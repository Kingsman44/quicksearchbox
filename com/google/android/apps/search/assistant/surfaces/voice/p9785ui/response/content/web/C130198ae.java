package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import android.net.Uri;
import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ae */
/* compiled from: PG */
public final class C130198ae {
    /* renamed from: a */
    public static final boolean m212560a(C43367l lVar) {
        C69664n.m101061g(lVar, "request");
        Uri parse = Uri.parse(lVar.f113296b);
        C69664n.m101060f(parse, "uri");
        if (!C130212g.m212588a(parse)) {
            return false;
        }
        C69664n.m101061g(parse, "uri");
        C69664n.m101061g(parse, "uri");
        String queryParameter = parse.getQueryParameter("q");
        if (!C130212g.m212588a(parse) || queryParameter == null || C69764m.m101229h(queryParameter)) {
            queryParameter = null;
        }
        return queryParameter != null;
    }
}
