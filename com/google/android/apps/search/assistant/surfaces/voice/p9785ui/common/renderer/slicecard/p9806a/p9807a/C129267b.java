package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a;

import android.net.Uri;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.dataservice.impl.SliceCardDataServiceImpl$getSlice$1", mo61344c = "SliceCardDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.a.a.b */
/* compiled from: PG */
public final class C129267b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C129271f f355053a;

    /* renamed from: b */
    final /* synthetic */ Uri f355054b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129267b(C129271f fVar, Uri uri, C69577g gVar) {
        super(2, gVar);
        this.f355053a = fVar;
        this.f355054b = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129267b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        try {
            ConcurrentMap.EL.computeIfAbsent(this.f355053a.f355067g, this.f355054b, new C129266a(this.f355053a));
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C129271f.f355061a.mo56225c()).mo56382g(e);
            Uri uri = this.f355054b;
            cVar.mo56379ah(new C59094n(38225));
            cVar.mo56389s("Failed to bind to Slice %s", uri);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129267b(this.f355053a, this.f355054b, gVar);
    }
}
