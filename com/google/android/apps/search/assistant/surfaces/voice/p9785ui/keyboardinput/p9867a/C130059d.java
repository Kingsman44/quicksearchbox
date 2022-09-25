package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.google.common.p4522b.C58495hd;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.completeserver.CompleteServerClientImpl$fetchSuggestions$1", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.d */
/* compiled from: PG */
public final class C130059d extends C69572j implements C69630p {

    /* renamed from: a */
    int f356642a;

    /* renamed from: b */
    final /* synthetic */ C130065j f356643b;

    /* renamed from: c */
    final /* synthetic */ String f356644c;

    /* renamed from: d */
    final /* synthetic */ C58495hd f356645d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130059d(C130065j jVar, String str, C58495hd hdVar, C69577g gVar) {
        super(2, gVar);
        this.f356643b = jVar;
        this.f356644c = str;
        this.f356645d = hdVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C130059d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f356642a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C130065j jVar = this.f356643b;
            String str = this.f356644c;
            C58495hd hdVar = this.f356645d;
            this.f356642a = 1;
            obj = jVar.mo109478b(str, hdVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C130059d(this.f356643b, this.f356644c, this.f356645d, gVar);
    }
}
