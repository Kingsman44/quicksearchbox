package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.ae */
/* compiled from: PG */
public final /* synthetic */ class C82128ae implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C82128ae f224533a = new C82128ae();

    private /* synthetic */ C82128ae() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(Collection.EL.stream((C58485gu) obj).anyMatch(C82135al.f224541a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
