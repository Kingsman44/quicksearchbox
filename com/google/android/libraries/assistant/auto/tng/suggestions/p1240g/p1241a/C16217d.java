package com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.p1241a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.android.libraries.logging.p2185ve.C28439i;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C16217d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16220g f47790a;

    /* renamed from: b */
    public final /* synthetic */ List f47791b;

    public /* synthetic */ C16217d(C16220g gVar, List list) {
        this.f47790a = gVar;
        this.f47791b = list;
    }

    public final Object call() {
        C16220g gVar = this.f47790a;
        List<C16115bn> list = this.f47791b;
        C16220g.m33254g(gVar.f47801g, gVar.f47796b);
        C28439i f = gVar.mo22858f(true, gVar.f47796b);
        gVar.f47801g.put("root", f);
        for (C16115bn bnVar : list) {
            gVar.mo22859h(bnVar.mo22777e(), true, bnVar.mo22774b(), f, gVar.f47801g, gVar.f47796b);
        }
        gVar.f47796b.mo33922f();
        return null;
    }
}
