package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a;

import com.google.android.libraries.assistant.p1484g.p1488b.p1489a.C17959a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18124f;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18125g;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18127i;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18128j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.s */
/* compiled from: PG */
public final class C18145s implements C17959a {

    /* renamed from: a */
    private final Supplier f51629a;

    /* renamed from: b */
    private final C58480gp f51630b = C58485gu.m89837e();

    /* renamed from: c */
    private final Function f51631c;

    public C18145s(Supplier supplier, Function function) {
        this.f51629a = supplier;
        this.f51631c = function;
    }

    /* renamed from: b */
    public final C18146t mo23506a() {
        return new C18130d(this.f51629a, this.f51630b.mo55394f(), this.f51631c);
    }

    /* renamed from: c */
    public final void mo23632c(C18125g gVar, Function function, BiConsumer biConsumer) {
        this.f51630b.mo55395g(new C18124f(gVar, function, biConsumer));
    }

    /* renamed from: d */
    public final void mo23633d(C18128j jVar, Function function, BiConsumer biConsumer) {
        this.f51630b.mo55395g(new C18127i(jVar, function, biConsumer));
    }
}
