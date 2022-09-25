package com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b;

import android.webkit.CookieManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.C16895b;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61283g;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.p5639e.C72245b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.w.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C16896a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16899d f49399a;

    /* renamed from: b */
    public final /* synthetic */ CookieManager f49400b;

    public /* synthetic */ C16896a(C16899d dVar, CookieManager cookieManager) {
        this.f49399a = dVar;
        this.f49400b = cookieManager;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C16899d dVar = this.f49399a;
        CookieManager cookieManager = this.f49400b;
        C61283g gVar = (C61283g) obj;
        if (gVar.f165752a == 1) {
            String str2 = (String) gVar.f165753b;
            C59104x b = C16899d.f49402a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ClassicAgsaZwiebackDebugTaskImpl");
            ((C59052c) ((C59052c) b).mo56372aa(46426)).mo56389s("New NID is: %s", str2);
            C16895b bVar = dVar.f49403b;
            if (str2 == null) {
                ((C59052c) ((C59052c) C16895b.f49395a.mo56224b()).mo56372aa(46424)).mo56386p("Nid passed in is null, failed to create cookie.");
                str = BuildConfig.FLAVOR;
            } else {
                long epochMilli = bVar.f49398d.mo57444a().plus(C16895b.f49396b).toEpochMilli();
                C72245b bVar2 = C16895b.f49397c;
                StringBuffer stringBuffer = new StringBuffer(bVar2.mo63602h().mo63605b());
                bVar2.mo63603i(stringBuffer, epochMilli, (C72132a) null);
                str = new C58827ar("; ").mo56097d(C58485gu.m89848p("NID=".concat(str2), "expires=".concat(stringBuffer.toString()), "path=/; domain=.google.com"));
            }
            cookieManager.setCookie("https://www.google.com", str);
            C32221c cVar = dVar.f49405d;
            cVar.getClass();
            return cVar.mo38006f(str2);
        }
        C59104x d = C16899d.f49402a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClassicAgsaZwiebackDebugTaskImpl");
        ((C59052c) ((C59052c) d).mo56372aa(46427)).mo56386p("No updated token received.");
        throw new IllegalArgumentException("Cookie does not have Zwieback NID with it");
    }
}
