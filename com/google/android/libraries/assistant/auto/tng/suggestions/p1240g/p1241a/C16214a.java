package com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.p1241a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.logging.p2185ve.C28439i;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16214a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16220g f47785a;

    /* renamed from: b */
    public final /* synthetic */ List f47786b;

    public /* synthetic */ C16214a(C16220g gVar, List list) {
        this.f47785a = gVar;
        this.f47786b = list;
    }

    public final Object call() {
        C16220g gVar = this.f47785a;
        List<C16143co> list = this.f47786b;
        C16220g.m33254g(gVar.f47800f, gVar.f47795a);
        C28439i f = gVar.mo22858f(false, gVar.f47795a);
        gVar.f47800f.put("root", f);
        for (C16143co coVar : list) {
            gVar.mo22859h(coVar.mo22804h(), false, coVar.mo22799c(), f, gVar.f47800f, gVar.f47795a);
        }
        gVar.f47795a.mo33922f();
        return null;
    }
}
