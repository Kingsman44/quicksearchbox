package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import android.app.assist.AssistContent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ct */
/* compiled from: PG */
public final /* synthetic */ class C79237ct implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79237ct f217704a = new C79237ct();

    private /* synthetic */ C79237ct() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((AssistContent) obj).getWebUri();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
