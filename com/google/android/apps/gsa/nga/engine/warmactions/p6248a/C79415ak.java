package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import java.util.Collections;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C79415ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79570b f218055a;

    public /* synthetic */ C79415ak(C79570b bVar) {
        this.f218055a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.ofNullable((C79583o) Collections.unmodifiableMap(((C79569ab) obj).f218319b).get(Integer.valueOf(this.f218055a.f218339o)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
