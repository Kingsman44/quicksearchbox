package com.google.android.apps.search.googleapp.search.srp.external;

import android.net.Uri;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.d */
/* compiled from: PG */
final class C137831d implements C43714a {

    /* renamed from: a */
    final /* synthetic */ ExternalRequestObserver f374989a;

    public C137831d(ExternalRequestObserver externalRequestObserver) {
        this.f374989a = externalRequestObserver;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C137829b bVar;
        Uri parse = Uri.parse(lVar.f113296b);
        C137835h hVar = this.f374989a.f374982a;
        C69664n.m101060f(parse, "uri");
        C69664n.m101061g(parse, "uri");
        Instant ofEpochMilli = Instant.ofEpochMilli(hVar.f374995a.mo26870b());
        C46401p pVar = hVar.f374998d;
        C69664n.m101060f(ofEpochMilli, C42181t.f110467a);
        C69664n.m101061g(ofEpochMilli, "instant");
        C46370ah a = pVar.mo50378a(C62912at.f169862a);
        if (!(a == null || (bVar = (C137829b) a.f121384a) == null)) {
            C63042fg fgVar = bVar.f374988c;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (fgVar != null) {
                Duration between = Duration.between(C62949a.m95469d(fgVar), ofEpochMilli);
                if (between.compareTo(Duration.ofMillis(0)) >= 0 && between.compareTo(Duration.ofMillis(3000)) < 0) {
                    C59052c cVar = (C59052c) hVar.f374997c.mo56226d();
                    cVar.mo56379ah(new C59094n(41053));
                    cVar.mo56386p("Ignoring extra click from SRP");
                    return;
                }
            }
        }
        hVar.mo113990a(parse, C139851q.SRP, true, false);
    }
}
