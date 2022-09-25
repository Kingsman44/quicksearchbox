package com.google.android.apps.search.assistant.surfaces.dictation.service.p9473o;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125898e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9455b.C125901h;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.languagedownload.LanguageDownloadManager$requestLanguageDownload$2", mo61344c = "LanguageDownloadManager.kt", mo61345d = "invokeSuspend", mo61346e = {59})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.o.e */
/* compiled from: PG */
final class C126167e extends C69572j implements C69630p {

    /* renamed from: a */
    int f347652a;

    /* renamed from: b */
    final /* synthetic */ C126170h f347653b;

    /* renamed from: c */
    final /* synthetic */ String f347654c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126167e(C126170h hVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f347653b = hVar;
        this.f347654c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126167e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f347652a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Duration duration = C126170h.f347661a;
            C69664n.m101060f(duration, "PENDING_REQUEST_TIMEOUT");
            this.f347652a = 1;
            if (C60942a.m93084b(duration, this) == aVar) {
                return aVar;
            }
        }
        C126170h hVar = this.f347653b;
        Duration duration2 = C126170h.f347661a;
        C125901h hVar2 = hVar.f347663b;
        String str = this.f347654c;
        C69664n.m101061g(str, "languageTag");
        hVar2.mo107157b(new C125898e(str));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126167e(this.f347653b, this.f347654c, gVar);
    }
}
