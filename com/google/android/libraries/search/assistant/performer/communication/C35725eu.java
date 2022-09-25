package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import android.net.Uri;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.eu */
/* compiled from: PG */
public final /* synthetic */ class C35725eu implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f93636a;

    public /* synthetic */ C35725eu(String str) {
        this.f93636a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f93636a;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage("com.whatsapp");
        intent.setDataAndType(Uri.parse((String) obj), str);
        return intent;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
