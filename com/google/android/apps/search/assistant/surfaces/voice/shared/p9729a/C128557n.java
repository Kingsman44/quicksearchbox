package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.n */
/* compiled from: PG */
public final class C128557n implements C46852f {

    /* renamed from: a */
    private final C128559p f353497a;

    /* renamed from: b */
    private final Set f353498b = new LinkedHashSet();

    public C128557n(C128559p pVar) {
        C69664n.m101061g(pVar, "delegate");
        this.f353497a = pVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C69664n.m101061g(th, "error");
        this.f353497a.mo107983a(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Object obj2;
        C58485gu guVar = (C58485gu) obj;
        C69664n.m101061g(guVar, "events");
        Iterator it = guVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C128548e eVar = (C128548e) obj2;
            if (eVar.mo108512a() == C128558o.PENDING && !this.f353498b.contains(eVar)) {
                break;
            }
        }
        C128548e eVar2 = (C128548e) obj2;
        if (eVar2 != null) {
            this.f353497a.mo107984b(eVar2);
            this.f353498b.add(eVar2);
        }
    }
}
