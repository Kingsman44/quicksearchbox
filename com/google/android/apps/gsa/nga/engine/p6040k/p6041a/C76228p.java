package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import android.content.Intent;
import android.net.Uri;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50580b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.p */
/* compiled from: PG */
public final /* synthetic */ class C76228p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76228p f211240a = new C76228p();

    private /* synthetic */ C76228p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50580b bVar = (C50580b) obj;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(bVar.f131625b));
        if (!bVar.f131624a.isEmpty()) {
            intent.setPackage(bVar.f131624a);
        }
        return intent;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
