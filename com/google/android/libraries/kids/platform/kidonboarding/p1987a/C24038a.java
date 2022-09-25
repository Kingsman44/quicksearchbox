package com.google.android.libraries.kids.platform.kidonboarding.p1987a;

import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4109av.p4112b.p4113a.C54607b;
import com.google.p4109av.p4114c.p4115a.p4116a.C54610c;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54615h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.a.a */
/* compiled from: PG */
public final class C24038a implements C24039b {

    /* renamed from: a */
    private static final C59071e f65701a = C59071e.m91331h();

    /* renamed from: b */
    private final C62921ba f65702b;

    /* renamed from: c */
    private final C69626l f65703c;

    public C24038a(C62921ba baVar, C69626l lVar) {
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f65702b = baVar;
        this.f65703c = lVar;
    }

    /* renamed from: a */
    public final void mo29433a(WebView webView) {
        C69664n.m101061g(webView, "webView");
        webView.addJavascriptInterface(this, "KidCreation");
    }

    @JavascriptInterface
    public final void handleOnKidCreationCancelation(String str) {
        C69664n.m101061g(str, "payload");
        C59052c cVar = (C59052c) f65701a.mo56224b();
        cVar.mo56379ah(new C59094n(48709));
        cVar.mo56386p("Received handleOnKidCreationCancelation from bridge.");
        C69626l lVar = this.f65703c;
        C54610c cVar2 = (C54610c) C54613f.f143382f.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C54615h a = C69664n.m101061g(cVar2, "builder");
        a.mo54146b(C54612e.CANCELED_BY_USER);
        lVar.mo5761a(a.mo54145a());
    }

    @JavascriptInterface
    public final void handleOnKidCreationComplete(String str) {
        C69664n.m101061g(str, "payload");
        C59052c cVar = (C59052c) f65701a.mo56224b();
        cVar.mo56379ah(new C59094n(48710));
        cVar.mo56386p("Received handleOnKidCreationComplete from bridge.");
        try {
            C54607b bVar = (C54607b) C62942bv.parseFrom((C62942bv) C54607b.f143366d, Base64.decode(str, 8), this.f65702b);
            C69664n.m101060f(bVar, "parseFrom(Base64.decode(…), extensionRegistryLite)");
            C69626l lVar = this.f65703c;
            C54610c cVar2 = (C54610c) C54613f.f143382f.createBuilder();
            C69664n.m101060f(cVar2, "newBuilder()");
            C54615h a = C69664n.m101061g(cVar2, "builder");
            a.mo54146b(C54612e.SUCCESS);
            String str2 = bVar.f143368a;
            C69664n.m101060f(str2, "result.getKidOid()");
            C69664n.m101061g(str2, "value");
            C54610c cVar3 = a.f143389a;
            cVar3.copyOnWrite();
            C54613f fVar = (C54613f) cVar3.instance;
            str2.getClass();
            fVar.f143384a |= 2;
            fVar.f143386c = str2;
            boolean z = bVar.f143369b;
            C54610c cVar4 = a.f143389a;
            cVar4.copyOnWrite();
            C54613f fVar2 = (C54613f) cVar4.instance;
            fVar2.f143384a |= 4;
            fVar2.f143387d = z;
            boolean z2 = bVar.f143370c;
            C54610c cVar5 = a.f143389a;
            cVar5.copyOnWrite();
            C54613f fVar3 = (C54613f) cVar5.instance;
            fVar3.f143384a = 8 | fVar3.f143384a;
            fVar3.f143388e = z2;
            lVar.mo5761a(a.mo54145a());
        } catch (C62974ct e) {
            C59052c cVar6 = (C59052c) ((C59052c) f65701a.mo56225c()).mo56382g(e);
            cVar6.mo56379ah(new C59094n(48711));
            cVar6.mo56386p("Could not parse result from payload.");
        }
    }

    @JavascriptInterface
    public final void handleOnKidCreationError(String str) {
        C69664n.m101061g(str, "payload");
        C59052c cVar = (C59052c) f65701a.mo56226d();
        cVar.mo56379ah(new C59094n(48712));
        cVar.mo56386p("Received handleOnKidCreationError from bridge.");
        C69626l lVar = this.f65703c;
        C54610c cVar2 = (C54610c) C54613f.f143382f.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C54615h a = C69664n.m101061g(cVar2, "builder");
        a.mo54146b(C54612e.UNRECOVERABLE_ERROR);
        lVar.mo5761a(a.mo54145a());
    }
}
