package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125049ad;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125092bt;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.KeyboardPreparer$bringKeyboardUpIfFieldIsFocused$2$changeKeyboardVisibilityResponse$1", mo61344c = "KeyboardPreparer.kt", mo61345d = "invokeSuspend", mo61346e = {159})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.ba */
/* compiled from: PG */
final class C125837ba extends C69572j implements C69630p {

    /* renamed from: a */
    int f346793a;

    /* renamed from: b */
    final /* synthetic */ C125850bn f346794b;

    /* renamed from: c */
    final /* synthetic */ C125049ad f346795c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125837ba(C125850bn bnVar, C125049ad adVar, C69577g gVar) {
        super(2, gVar);
        this.f346794b = bnVar;
        this.f346795c = adVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125837ba) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346793a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125092bt b = this.f346794b.f346848b.mo107507b();
            C125049ad adVar = this.f346795c;
            this.f346793a = 1;
            obj = b.mo106800b(adVar, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125837ba(this.f346794b, this.f346795c, gVar);
    }
}
