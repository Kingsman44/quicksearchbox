package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard.p9806a.p9807a;

import android.net.Uri;
import androidx.slice.C4113l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.dataservice.impl.SliceCardDataServiceImpl$unregisterSliceCallback$1", mo61344c = "SliceCardDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.a.a.e */
/* compiled from: PG */
public final class C129270e extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ Uri f355059a;

    /* renamed from: b */
    final /* synthetic */ C129271f f355060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129270e(Uri uri, C129271f fVar, C69577g gVar) {
        super(2, gVar);
        this.f355059a = uri;
        this.f355060b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129270e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C129271f.f355061a.mo56224b();
        Uri uri = this.f355059a;
        cVar.mo56379ah(new C59094n(38227));
        cVar.mo56389s("Unregistered callback for Slice %s", uri);
        C4113l lVar = (C4113l) this.f355060b.f355067g.remove(this.f355059a);
        if (lVar != null) {
            C129271f fVar = this.f355060b;
            Uri uri2 = this.f355059a;
            fVar.f355064d.mo8630e(uri2, lVar);
            fVar.f355066f.remove(uri2);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129270e(this.f355059a, this.f355060b, gVar);
    }
}
