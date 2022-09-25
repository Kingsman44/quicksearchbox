package com.google.android.apps.search.podcasts.p10550b.p10553c;

import android.net.Uri;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10601r.C140990l;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60866ct;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.b.c.b */
/* compiled from: PG */
public final class C140050b {

    /* renamed from: a */
    public C140049a f380622a;

    /* renamed from: b */
    private final C46778cv f380623b;

    /* renamed from: c */
    private final boolean f380624c;

    public C140050b(C46778cv cvVar, boolean z) {
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f380623b = cvVar;
        this.f380624c = z;
    }

    /* renamed from: a */
    public final void mo115418a(String str, String str2) {
        C69664n.m101061g(str, "showTitle");
        C69664n.m101061g(str2, "mediaUrl");
        if (this.f380624c && !C69764m.m101229h(str) && !C69764m.m101229h(str2)) {
            Uri parse = Uri.parse(str2);
            C69664n.m101060f(parse, "parse(mediaUrl)");
            if (C140990l.m228952a(parse)) {
                this.f380622a = new C140049a(str, str2);
                this.f380623b.mo50787a(C60866ct.f164955a, C140192a.f380885a);
            }
        }
    }
}
