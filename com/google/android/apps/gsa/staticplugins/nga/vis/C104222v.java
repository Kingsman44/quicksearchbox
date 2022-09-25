package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81560c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81567j;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.v */
/* compiled from: PG */
public final /* synthetic */ class C104222v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104222v f289894a = new C104222v();

    private /* synthetic */ C104222v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String string = ((Bundle) obj).getString("key_type");
        if (C58837ba.m90859h(string)) {
            return new C81567j(C81560c.UNKNOWN);
        }
        return new C81567j(C81560c.m129672a(string));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
