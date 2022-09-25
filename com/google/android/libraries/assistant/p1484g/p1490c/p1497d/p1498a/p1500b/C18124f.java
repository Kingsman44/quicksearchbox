package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18103d;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.b.f */
/* compiled from: PG */
public final class C18124f implements C18126h {

    /* renamed from: a */
    final /* synthetic */ C18125g f51604a;

    /* renamed from: b */
    private final Function f51605b;

    /* renamed from: c */
    private final BiConsumer f51606c;

    public C18124f(C18125g gVar, Function function, BiConsumer biConsumer) {
        this.f51604a = gVar;
        this.f51605b = function;
        this.f51606c = biConsumer;
    }

    /* renamed from: a */
    public final C18103d mo23619a() {
        return this.f51604a;
    }

    /* renamed from: b */
    public final void mo23620b(Bundle bundle, Object obj) {
        String string = bundle.getString(((C18119a) this.f51604a).f51593a);
        if (string != null) {
            this.f51606c.accept(obj, string);
        }
    }

    /* renamed from: c */
    public final void mo23621c(Object obj, Bundle bundle) {
        Optional optional = (Optional) this.f51605b.apply(obj);
        if (optional.isPresent()) {
            bundle.putString(((C18119a) this.f51604a).f51593a, (String) optional.get());
        }
    }
}
