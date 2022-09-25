package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.t */
/* compiled from: PG */
public final /* synthetic */ class C106425t implements Function {

    /* renamed from: a */
    public final /* synthetic */ Context f296861a;

    public /* synthetic */ C106425t(Context context) {
        this.f296861a = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return PendingIntent.getActivity(this.f296861a, 0, C147798a.m240896b((Intent) obj, 201326592, 0), 201326592);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
