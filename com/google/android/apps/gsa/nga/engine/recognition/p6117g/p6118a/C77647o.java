package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import java.text.SimpleDateFormat;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.o */
/* compiled from: PG */
public final /* synthetic */ class C77647o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77647o f213866a = new C77647o();

    private /* synthetic */ C77647o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        SimpleDateFormat simpleDateFormat = C77649q.f213868a;
        C80562g gVar = (C80562g) ((C80563h) obj).toBuilder();
        gVar.copyOnWrite();
        C80563h hVar = (C80563h) gVar.instance;
        hVar.f221130a |= 16384;
        hVar.f221145p = true;
        return (C80563h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
