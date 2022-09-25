package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C103851bd implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103851bd f289105a = new C103851bd();

    private /* synthetic */ C103851bd() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        File file = (File) obj;
        C58974d dVar = C103868bu.f289129a;
        try {
            return (Iterable) DesugarArrays.stream((T[]) file.getName().replaceAll("\\..*", BuildConfig.FLAVOR).split("_")).map(C103835ao.f289087a).collect(C58370cn.f155946a);
        } catch (NumberFormatException unused) {
            return C58485gu.m89845m();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
