package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9598e;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127496a;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127497b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127498c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9604c.p9605a.C127499d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entry.api.impl.EntryPointServiceImpl$handleTriggeringClientResponse$2", mo61344c = "EntryPointServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {186, 190, 192})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.e.c */
/* compiled from: PG */
final class C127441c extends C69572j implements C69630p {

    /* renamed from: a */
    int f350894a;

    /* renamed from: b */
    final /* synthetic */ C127447i f350895b;

    /* renamed from: c */
    final /* synthetic */ C127475g f350896c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127441c(C127447i iVar, C127475g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f350895b = iVar;
        this.f350896c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127441c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f350894a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C127499d dVar = this.f350895b.f350913b;
            C34039bb bbVar = this.f350896c.f350986b;
            if (bbVar == null) {
                bbVar = C34039bb.f90716f;
            }
            C34038ba baVar = bbVar.f90721d;
            if (baVar == null) {
                baVar = C34038ba.f90707h;
            }
            String str = baVar.f90710b;
            C69664n.m101060f(str, "request.invocation.payload.selfInvocationId");
            C69664n.m101061g(str, "requestId");
            C127498c cVar = (C127498c) dVar.f351023a.remove(str);
            if (cVar == null) {
                C59052c cVar2 = (C59052c) C127447i.f350912a.mo56226d();
                cVar2.mo56379ah(new C59094n(37456));
                cVar2.mo56386p("Cannot find original request for self trigger, start MA error flow.");
                C127447i iVar = this.f350895b;
                C127475g gVar = this.f350896c;
                this.f350894a = 1;
                obj = iVar.mo108073h(gVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (cVar instanceof C127497b) {
                this.f350894a = 2;
                obj = this.f350895b.mo108072g(this.f350896c, (C127497b) cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (C127477i) obj;
            } else if (cVar instanceof C127496a) {
                this.f350894a = 3;
                obj = this.f350895b.mo108071f(this.f350896c, (C127496a) cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (C127477i) obj;
            } else {
                throw new C69677g();
            }
        } else if (i == 1) {
            C69714l.m101134b(obj);
        } else if (i != 2) {
            C69714l.m101134b(obj);
            return (C127477i) obj;
        } else {
            C69714l.m101134b(obj);
            return (C127477i) obj;
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127441c(this.f350895b, this.f350896c, gVar);
    }
}
