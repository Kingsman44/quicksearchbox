package com.google.android.libraries.search.assistant.p2570h.p2578b.p2580b;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2579a.C33463b;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c.C33468a;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2581c.C33469b;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.conversation.statedump.debugdataprovider.ConversationDebugDataProvider$getDebugData$1", mo61344c = "ConversationDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.h.b.b.b */
/* compiled from: PG */
final class C33466b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C46677o f89571a;

    /* renamed from: b */
    final /* synthetic */ C33467c f89572b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33466b(C46677o oVar, C33467c cVar, C69577g gVar) {
        super(2, gVar);
        this.f89571a = oVar;
        this.f89572b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33466b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (!this.f89571a.mo50698b().contains(C46667e.TEXT)) {
            C46669g gVar = C46675m.f121943k;
            C69664n.m101060f(gVar, "NO_DATA");
            return gVar;
        }
        C33469b bVar = new C33469b();
        for (C33463b bVar2 : this.f89572b.f89573a) {
            bVar.mo38874a(bVar2.f89565a.mo38875b("Configuration State:"));
        }
        String encodeToString = Base64.encodeToString(bVar.mo38875b("Conversation Engine:").mo38871a().toByteArray(), 2);
        C69664n.m101060f(encodeToString, "encodedStateString");
        bVar.mo38876c("Bundled Conversation Engine State:", encodeToString);
        C33468a b = bVar.mo38875b("Conversation Engine:");
        if (!b.mo38873c()) {
            C46663a aVar2 = new C46663a();
            aVar2.mo50684b(false);
            aVar2.mo50686d(C46667e.TEXT);
            aVar2.f121916a = C63088z.m96143E(b.mo38872b(BuildConfig.FLAVOR));
            C46669g a = aVar2.mo50683a();
            C69664n.m101060f(a, "builder()\n        .setCo…Tree()))\n        .build()");
            return a;
        }
        throw new IllegalStateException("PII detected in Conversation Engine state dump. This is not supported.");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33466b(this.f89571a, this.f89572b, gVar);
    }
}
