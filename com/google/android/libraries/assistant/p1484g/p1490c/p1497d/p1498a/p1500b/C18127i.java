package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18103d;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.b.i */
/* compiled from: PG */
public final class C18127i implements C18126h {

    /* renamed from: a */
    final /* synthetic */ C18128j f51607a;

    /* renamed from: b */
    private final Function f51608b;

    /* renamed from: c */
    private final BiConsumer f51609c;

    public C18127i(C18128j jVar, Function function, BiConsumer biConsumer) {
        this.f51607a = jVar;
        this.f51608b = function;
        this.f51609c = biConsumer;
    }

    /* renamed from: a */
    public final C18103d mo23619a() {
        return this.f51607a;
    }

    /* renamed from: b */
    public final void mo23620b(Bundle bundle, Object obj) {
        C18120b bVar = (C18120b) this.f51607a;
        String str = bVar.f51598a;
        Object a = bVar.f51599b.mo23617a(bundle, str);
        if (a != null) {
            this.f51609c.accept(obj, a);
            return;
        }
        throw new C18123e(str);
    }

    /* renamed from: c */
    public final void mo23621c(Object obj, Bundle bundle) {
        C18120b bVar = (C18120b) this.f51607a;
        bVar.f51600c.mo23618a(bundle, bVar.f51598a, this.f51608b.apply(obj));
    }
}
