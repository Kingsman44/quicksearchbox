package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioFocusPolicyImpl$releaseFocus$1", mo61344c = "AudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {71, 72})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.w */
/* compiled from: PG */
final class C120475w extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335060a;

    /* renamed from: b */
    int f335061b;

    /* renamed from: c */
    final /* synthetic */ C120476x f335062c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120475w(C120476x xVar, C69577g gVar) {
        super(2, gVar);
        this.f335062c = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120475w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335061b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C120477y yVar = new C120477y(new C71816z());
            C120440ar arVar = this.f335062c.f335064b;
            this.f335060a = yVar;
            this.f335061b = 1;
            Object a = arVar.mo104751a(yVar, this);
            obj2 = yVar;
            if (a == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            Object obj3 = this.f335060a;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C71816z zVar = ((C120477y) obj2).f335065a;
        this.f335060a = null;
        this.f335061b = 2;
        obj = zVar.mo62825a(this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120475w(this.f335062c, gVar);
    }
}
