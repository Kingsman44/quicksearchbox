package com.google.android.apps.search.podcasts.p10601r;

import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.b */
/* compiled from: PG */
public final class C140958b {

    /* renamed from: a */
    private static final C59071e f382719a = C59071e.m91331h();

    /* renamed from: b */
    private final boolean f382720b;

    public C140958b(boolean z) {
        this.f382720b = z;
    }

    /* renamed from: a */
    public final String mo116043a(String str) {
        C69664n.m101061g(str, "mediaUrl");
        Uri parse = Uri.parse(str);
        if (this.f382720b) {
            C69664n.m101060f(parse, "uri");
            if (C140990l.m228952a(parse)) {
                String builder = parse.buildUpon().scheme("https").toString();
                C69664n.m101060f(builder, "uri.buildUpon().scheme(\"https\").toString()");
                C59052c cVar = (C59052c) f382719a.mo56224b();
                cVar.mo56379ah(new C59094n(41654));
                cVar.mo56354G("http url %s updated to %s", str, builder);
                return builder;
            }
        }
        return str;
    }
}
