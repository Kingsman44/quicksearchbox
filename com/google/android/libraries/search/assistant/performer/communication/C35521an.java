package com.google.android.libraries.search.assistant.performer.communication;

import android.net.Uri;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.an */
/* compiled from: PG */
public final /* synthetic */ class C35521an implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C35521an f93280a = new C35521an();

    private /* synthetic */ C35521an() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Uri.parse((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
