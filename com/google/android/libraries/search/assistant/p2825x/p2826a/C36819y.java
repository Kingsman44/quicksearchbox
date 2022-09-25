package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71608bi;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$onQuickPhraseEvent$cleanupFuture$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {316})
/* renamed from: com.google.android.libraries.search.assistant.x.a.y */
/* compiled from: PG */
final class C36819y extends C69572j implements C69630p {

    /* renamed from: a */
    int f95959a;

    /* renamed from: b */
    final /* synthetic */ C36808o f95960b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f95961c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36819y(C36808o oVar, C69648ae aeVar, C69577g gVar) {
        super(2, gVar);
        this.f95960b = oVar;
        this.f95961c = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36819y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C34053bp bpVar = null;
        if (this.f95959a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C36808o oVar = this.f95960b;
                Object obj2 = this.f95961c.f186027a;
                if (obj2 == null) {
                    C69664n.m101065k("invocationToken");
                } else {
                    bpVar = (C34053bp) obj2;
                }
                C59071e eVar = C36808o.f95913a;
                oVar.mo40414h(bpVar);
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            long millis = C36808o.f95914b.toMillis();
            this.f95959a = 1;
            if (C71608bi.m104551c(millis, this) == aVar) {
                return aVar;
            }
        }
        C36808o oVar2 = this.f95960b;
        Object obj3 = this.f95961c.f186027a;
        if (obj3 == null) {
            C69664n.m101065k("invocationToken");
        } else {
            bpVar = (C34053bp) obj3;
        }
        C59071e eVar2 = C36808o.f95913a;
        oVar2.mo40414h(bpVar);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36819y(this.f95960b, this.f95961c, gVar);
    }
}
