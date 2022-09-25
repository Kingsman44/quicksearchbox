package com.google.android.libraries.gsa.actionusermodel;

import android.text.TextUtils;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.r */
/* compiled from: PG */
public final /* synthetic */ class C22146r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61090a;

    public /* synthetic */ C22146r(C22153y yVar) {
        this.f61090a = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String l = C22063au.m41309l((String) obj, this.f61090a.mo27366h());
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        throw new IllegalArgumentException("Invalid provider package name.");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
