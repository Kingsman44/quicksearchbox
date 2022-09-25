package com.google.android.libraries.search.assistant.p2697j;

import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.j.a */
/* compiled from: PG */
final class C34724a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C69648ae f92149a;

    /* renamed from: b */
    final /* synthetic */ C69615a f92150b;

    /* renamed from: c */
    final /* synthetic */ C2164c f92151c;

    public C34724a(C69648ae aeVar, C69615a aVar, C2164c cVar) {
        this.f92149a = aeVar;
        this.f92150b = aVar;
        this.f92151c = cVar;
    }

    public final void run() {
        C60870cx cxVar;
        Object obj;
        Object obj2 = this.f92149a.f186027a;
        if (obj2 == null) {
            C69664n.m101065k("future");
            cxVar = null;
        } else {
            cxVar = (C60870cx) obj2;
        }
        cxVar.cancel(false);
        try {
            this.f92150b.mo5672a();
            obj = C69788q.f186170a;
        } catch (Throwable th) {
            obj = C69714l.m101133a(th);
        }
        C2164c cVar = this.f92151c;
        if (C69702k.m101125b(obj)) {
            C69788q qVar = (C69788q) obj;
            cVar.mo5437b(C69788q.f186170a);
        }
        C2164c cVar2 = this.f92151c;
        Throwable a = C69702k.m101124a(obj);
        if (a != null) {
            cVar2.mo5439d(a);
        }
    }
}
