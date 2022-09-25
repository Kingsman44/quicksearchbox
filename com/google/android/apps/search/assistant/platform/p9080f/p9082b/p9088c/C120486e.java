package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$openNewSession$1$2", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {100})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.e */
/* compiled from: PG */
final class C120486e extends C69572j implements C69630p {

    /* renamed from: a */
    int f335080a;

    /* renamed from: b */
    final /* synthetic */ C120498q f335081b;

    /* renamed from: c */
    final /* synthetic */ C71604be f335082c;

    /* renamed from: d */
    final /* synthetic */ C32534ai f335083d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120486e(C120498q qVar, C71604be beVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335081b = qVar;
        this.f335082c = beVar;
        this.f335083d = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120486e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335080a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                this.f335083d.mo38135c(th);
            }
        } else {
            C69714l.m101134b(obj);
            C120498q qVar = this.f335081b;
            C71604be beVar = this.f335082c;
            C32534ai aiVar = this.f335083d;
            this.f335080a = 1;
            Object a = C71423ax.m104196a(new C120497p(qVar, beVar, aiVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120486e(this.f335081b, this.f335082c, this.f335083d, gVar);
    }
}
