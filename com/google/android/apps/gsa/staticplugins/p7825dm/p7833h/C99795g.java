package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6519al.p6684cz.C85272c;
import com.google.android.apps.gsa.search.shared.p6929g.C87555c;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.android.libraries.silk.p3238b.p3239a.C41748f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56730f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56739o;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.g */
/* compiled from: PG */
public final class C99795g implements C87555c {

    /* renamed from: a */
    private final C89688a f279194a;

    /* renamed from: b */
    private final C22871g f279195b;

    /* renamed from: c */
    private final C84411o f279196c;

    /* renamed from: d */
    private final C85272c f279197d;

    /* renamed from: e */
    private final C62921ba f279198e;

    public C99795g(C89688a aVar, C22871g gVar, C84411o oVar, C85272c cVar, C62921ba baVar) {
        this.f279194a = aVar;
        this.f279195b = gVar;
        this.f279196c = oVar;
        this.f279197d = cVar;
        this.f279198e = baVar;
    }

    @JavascriptInterface
    public void getCurrentLocation(String str, String str2) {
        C84411o oVar = this.f279196c;
        C89688a aVar = this.f279194a;
        Objects.requireNonNull(aVar);
        C84410n a = oVar.mo77963a(str, str2, new C99791c(aVar));
        new C90873ag(this.f279197d.mo78832a(), this.f279195b, "getCurrentLocation", new C99792d(a)).mo85223a(new C99793e(a));
    }

    @JavascriptInterface
    public void getCurrentLocationWithOptions(String str, String str2, String str3) {
        C84410n a = this.f279196c.mo77963a(str2, str3, this.f279194a);
        try {
            C56730f fVar = (C56730f) C41748f.m73220a(str, C56730f.f151413b.getParserForType(), this.f279198e);
            C85272c cVar = this.f279197d;
            int a2 = C56739o.m88221a(fVar.f151415a);
            if (a2 == 0) {
                a2 = 1;
            }
            C90873ag agVar = new C90873ag(cVar.mo78834c(a2), this.f279195b, "getCurrentLocation", new C99794f(a));
            Objects.requireNonNull(a);
            agVar.mo85223a(new C99790b(a));
        } catch (C62974ct unused) {
            a.mo77959a(new C41742a(C41749b.m73223b("Cannot parse deserializedRequest into proto.")));
        }
    }

    @JavascriptInterface
    public void getGeolocationPermissionState(String str, String str2) {
        C84410n a = this.f279196c.mo77963a(str, str2, this.f279194a);
        C90873ag agVar = new C90873ag(this.f279197d.mo78833b(), this.f279195b, "getGeolocationPermissionState", new C99789a(a));
        Objects.requireNonNull(a);
        agVar.mo85223a(new C99790b(a));
    }
}
