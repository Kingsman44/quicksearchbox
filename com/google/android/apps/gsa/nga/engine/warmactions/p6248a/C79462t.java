package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4544a.C59347c;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.t */
/* compiled from: PG */
public final /* synthetic */ class C79462t implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79462t f218141a = new C79462t();

    private /* synthetic */ C79462t() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79569ab abVar = (C79569ab) obj;
        C58974d dVar = C79418an.f218059a;
        int i = abVar.f218318a;
        Objects.requireNonNull(abVar);
        C79414aj ajVar = new C79414aj(abVar);
        boolean z = true;
        if (1 != (i & 1)) {
            z = false;
        }
        return C59347c.m92237b(z, ajVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
