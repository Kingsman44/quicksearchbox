package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C103844ax implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103844ax f289096a = new C103844ax();

    private /* synthetic */ C103844ax() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58974d dVar = C103868bu.f289129a;
        return ((String) obj).replaceAll("^[0-9]+_[0-9]+_", BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
