package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79572d;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.e */
/* compiled from: PG */
public final /* synthetic */ class C79547e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79550h f218270a;

    public /* synthetic */ C79547e(C79550h hVar) {
        this.f218270a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C90048d dVar = (C90048d) obj;
        return this.f218270a.f218274b.mo85405j(dVar) ? Optional.ofNullable((C79572d) C79550h.f218273a.get(dVar)) : Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
