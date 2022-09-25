package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1223d;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16353b;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.d.c */
/* compiled from: PG */
public final /* synthetic */ class C16000c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58487gw f47409a;

    public /* synthetic */ C16000c(C58487gw gwVar) {
        this.f47409a = gwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58487gw gwVar = this.f47409a;
        C16353b bVar = (C16353b) obj;
        C58528ij ijVar = C16001d.f47410a;
        return Collection.EL.stream(gwVar.mo55277g(bVar.f48135a)).map(new C15998a(bVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
