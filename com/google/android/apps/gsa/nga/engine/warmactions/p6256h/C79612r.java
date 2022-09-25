package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import android.net.Uri;
import java.io.IOException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.r */
/* compiled from: PG */
public final /* synthetic */ class C79612r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79615u f218412a;

    public /* synthetic */ C79612r(C79615u uVar) {
        this.f218412a = uVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Boolean.valueOf(this.f218412a.f218417a.mo45894h((Uri) obj));
        } catch (IOException unused) {
            return false;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
