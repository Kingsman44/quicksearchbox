package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.n */
/* compiled from: PG */
public final /* synthetic */ class C77646n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77649q f213865a;

    public /* synthetic */ C77646n(C77649q qVar) {
        this.f213865a = qVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C77649q qVar = this.f213865a;
        C80562g gVar = (C80562g) ((C80563h) obj).toBuilder();
        String format = C77649q.f213868a.format(Long.valueOf(qVar.f213870b.mo57444a().toEpochMilli()));
        gVar.copyOnWrite();
        C80563h hVar = (C80563h) gVar.instance;
        format.getClass();
        hVar.f221130a |= 4;
        hVar.f221133d = format;
        return (C80563h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
