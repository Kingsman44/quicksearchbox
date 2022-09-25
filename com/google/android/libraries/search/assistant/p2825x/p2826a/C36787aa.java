package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import kotlinx.coroutines.p5574b.C71547cx;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$removeSodaEventsForToken$future$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {394})
/* renamed from: com.google.android.libraries.search.assistant.x.a.aa */
/* compiled from: PG */
final class C36787aa extends C69572j implements C69626l {

    /* renamed from: a */
    Object f95852a;

    /* renamed from: b */
    int f95853b;

    /* renamed from: c */
    final /* synthetic */ C34053bp f95854c;

    /* renamed from: d */
    final /* synthetic */ C36808o f95855d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36787aa(C34053bp bpVar, C36808o oVar, C69577g gVar) {
        super(1, gVar);
        this.f95854c = bpVar;
        this.f95855d = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C36787aa(this.f95854c, this.f95855d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95853b != 0) {
            obj2 = this.f95852a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34053bp bpVar = this.f95854c;
            if (bpVar == null && (bpVar = this.f95855d.f95920h) == null) {
                return C69788q.f186170a;
            }
            C59052c cVar = (C59052c) C36808o.f95913a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "QuickPhrases.Manager");
            C61301b a = C34711b.m63445a(bpVar);
            cVar.mo56379ah(new C59094n(52356));
            cVar.mo56389s("Removing Soda events for token %s.", a);
            C71547cx cxVar = (C71547cx) this.f95855d.f95921i.get(bpVar);
            if (cxVar != null) {
                this.f95852a = bpVar;
                this.f95853b = 1;
                if (cxVar.mo20883a((Object) null, this) == aVar) {
                    return aVar;
                }
            }
            obj2 = bpVar;
        }
        this.f95855d.f95921i.remove(obj2);
        if (C69664n.m101066l(obj2, this.f95855d.f95920h)) {
            this.f95855d.f95920h = null;
        }
        return C69788q.f186170a;
    }
}
