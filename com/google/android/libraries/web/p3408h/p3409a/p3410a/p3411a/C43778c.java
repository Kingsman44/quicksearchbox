package com.google.android.libraries.web.p3408h.p3409a.p3410a.p3411a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43782b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43783c;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71557dg;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.h.a.a.a.c */
/* compiled from: PG */
public final class C43778c implements C43783c {

    /* renamed from: a */
    public final C71547cx f114154a = C71557dg.m104447e(0, 0, (C71387t) null, 7);

    /* renamed from: b */
    public final AtomicReference f114155b = new AtomicReference(C43782b.UNESTABLISHED);

    /* renamed from: c */
    public final AtomicReference f114156c;

    /* renamed from: d */
    private final C71422aw f114157d;

    public C43778c(C43775a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "channelName");
        this.f114157d = awVar;
        new LinkedHashMap();
        this.f114156c = new AtomicReference();
    }

    /* renamed from: a */
    public final C43782b mo46795a() {
        Object obj = this.f114155b.get();
        C69664n.m101060f(obj, "mutableState.get()");
        return (C43782b) obj;
    }

    /* renamed from: b */
    public final void mo46796b(C43968o oVar, C69615a aVar) {
        if (mo46795a() == C43782b.UNESTABLISHED) {
            AtomicReference atomicReference = this.f114156c;
            C43779d dVar = new C43779d(oVar, aVar);
            while (!atomicReference.compareAndSet((Object) null, dVar)) {
                if (atomicReference.get() != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            this.f114155b.set(C43782b.ACTIVE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: c */
    public final void mo46797c(String str, C69615a aVar) {
        C69664n.m101061g(str, "rawMessage");
        C69664n.m101061g(aVar, "createMessageSender");
        C19559g.m37304c();
        if (mo46795a() != C43782b.CLOSED) {
            if (!(mo46795a() == C43782b.INACTIVE || mo46795a() == C43782b.ACTIVE)) {
                mo46796b((C43968o) aVar.mo5672a(), C43776a.f114150a);
            }
            C71803m.m105043d(this.f114157d, (C69585o) null, (C71424ay) null, new C43777b(this, str, (C69577g) null), 3);
        }
    }
}
