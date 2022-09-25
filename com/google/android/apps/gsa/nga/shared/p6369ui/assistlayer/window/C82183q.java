package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.q */
/* compiled from: PG */
public final /* synthetic */ class C82183q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C82183q f224615a = new C82183q();

    private /* synthetic */ C82183q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59071e eVar = C82192z.f224625b;
        if (((Boolean) obj).booleanValue()) {
            return C82166bp.FOCUSABLE;
        }
        return C82166bp.NOT_FOCUSABLE;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
