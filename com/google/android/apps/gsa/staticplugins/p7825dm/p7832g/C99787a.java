package com.google.android.apps.gsa.staticplugins.p7825dm.p7832g;

import android.databinding.C0118a;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84397a;
import com.google.android.apps.gsa.search.core.p6500ac.C84404h;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56718b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56720d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56722f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4306k.C56724h;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.g.a */
/* compiled from: PG */
public final class C99787a {

    /* renamed from: a */
    private static final C59071e f279183a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.g.a");

    /* renamed from: b */
    private final C89688a f279184b;

    /* renamed from: c */
    private final C84411o f279185c;

    /* renamed from: d */
    private final C84404h f279186d;

    public C99787a(C89688a aVar, C84411o oVar, C84404h hVar) {
        this.f279184b = aVar;
        this.f279185c = oVar;
        this.f279186d = hVar;
    }

    @JavascriptInterface
    public void sendConsentResult(String str, String str2, String str3) {
        C84410n a = this.f279185c.mo77963a(str2, str3, this.f279184b);
        try {
            C84404h hVar = this.f279186d;
            int a2 = C56718b.m88219a(((C56722f) C87556d.m142212a(str, C56722f.f151389b.getParserForType())).f151391a);
            if (a2 == 0) {
                a2 = 1;
            }
            hVar.mo77957a(a2);
            a.mo77962d("{}");
        } catch (C62974ct unused) {
            C59104x c = f279183a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SilkFpConsentApiImpl");
            C0118a.m96d(c, "Could not parse client input.", 32885, C58979ad.FULL);
            a.mo77959a(new C84397a());
        }
    }

    @JavascriptInterface
    public void sendLoadingResult(String str, String str2, String str3) {
        C84410n a = this.f279185c.mo77963a(str2, str3, this.f279184b);
        try {
            C84404h hVar = this.f279186d;
            int a2 = C56720d.m88220a(((C56724h) C87556d.m142212a(str, C56724h.f151393b.getParserForType())).f151395a);
            if (a2 == 0) {
                a2 = 1;
            }
            hVar.mo77958b(a2);
            a.mo77962d("{}");
        } catch (C62974ct unused) {
            C59104x c = f279183a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SilkFpConsentApiImpl");
            C0118a.m96d(c, "Could not parse client input.", 32886, C58979ad.FULL);
            a.mo77959a(new C84397a());
        }
    }
}
