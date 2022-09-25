package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConnectionManagerApaCallbacks$logOnFailure$1", mo61344c = "ConnectionManagerApaCallbacks.kt", mo61345d = "invokeSuspend", mo61346e = {198})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.i */
/* compiled from: PG */
final class C126956i extends C69572j implements C69630p {

    /* renamed from: a */
    int f349575a;

    /* renamed from: b */
    final /* synthetic */ C71643cp f349576b;

    /* renamed from: c */
    final /* synthetic */ String f349577c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126956i(C71643cp cpVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f349576b = cpVar;
        this.f349577c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126956i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349575a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception unused) {
                C59052c cVar = (C59052c) C126962o.f349593a.mo56225c();
                String str = this.f349577c;
                cVar.mo56379ah(new C59094n(37308));
                cVar.mo56386p(str);
            }
        } else {
            C69714l.m101134b(obj);
            C71643cp cpVar = this.f349576b;
            this.f349575a = 1;
            if (cpVar.mo62869o(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126956i(this.f349576b, this.f349577c, gVar);
    }
}
