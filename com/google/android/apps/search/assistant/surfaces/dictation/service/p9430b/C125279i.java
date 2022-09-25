package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71354ah;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.async.FlowDelimiterKt$delimitedBy$1", mo61344c = "FlowDelimiter.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.i */
/* compiled from: PG */
public final class C125279i extends C69572j implements C69630p {

    /* renamed from: a */
    int f345610a;

    /* renamed from: b */
    final /* synthetic */ C71587n f345611b;

    /* renamed from: c */
    final /* synthetic */ C125276f f345612c;

    /* renamed from: d */
    private /* synthetic */ Object f345613d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125279i(C71587n nVar, C125276f fVar, C69577g gVar) {
        super(2, gVar);
        this.f345611b = nVar;
        this.f345612c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125279i) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71643cp cpVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f345610a != 0) {
            cpVar = (C71643cp) this.f345613d;
            try {
                C69714l.m101134b(obj);
            } catch (C71354ah unused) {
            }
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f345613d;
            C71643cp d = C71803m.m105043d(aoVar, (C69585o) null, C71424ay.UNDISPATCHED, new C125278h(this.f345612c, aoVar, (C69577g) null), 1);
            try {
                C71587n nVar = this.f345611b;
                C125277g gVar = new C125277g(aoVar);
                this.f345613d = d;
                this.f345610a = 1;
                if (nVar.mo38165mp(gVar, this) == aVar) {
                    return aVar;
                }
            } catch (C71354ah unused2) {
            }
            cpVar = d;
        }
        cpVar.mo62723u((CancellationException) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125279i iVar = new C125279i(this.f345611b, this.f345612c, gVar);
        iVar.f345613d = obj;
        return iVar;
    }
}
