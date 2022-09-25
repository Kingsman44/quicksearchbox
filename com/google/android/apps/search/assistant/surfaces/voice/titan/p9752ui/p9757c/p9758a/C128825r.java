package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.p9758a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128806c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.contentprovider.impl.VoicePlateUiContentProviderImpl$stopInteraction$1", mo61344c = "VoicePlateUiContentProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {165})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.a.r */
/* compiled from: PG */
final class C128825r extends C69572j implements C69630p {

    /* renamed from: a */
    int f354095a;

    /* renamed from: b */
    final /* synthetic */ C128826s f354096b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128825r(C128826s sVar, C69577g gVar) {
        super(2, gVar);
        this.f354096b = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128825r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354095a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128806c cVar = this.f354096b.f354099c;
            this.f354095a = 1;
            if (cVar.mo108628d(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128825r(this.f354096b, gVar);
    }
}
