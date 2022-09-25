package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.v */
/* compiled from: PG */
public final /* synthetic */ class C123074v implements Function {

    /* renamed from: a */
    public final /* synthetic */ PackageManager f340635a;

    public /* synthetic */ C123074v(PackageManager packageManager) {
        this.f340635a = packageManager;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        PackageManager packageManager = this.f340635a;
        PackageInfo packageInfo = (PackageInfo) obj;
        C59071e eVar = C123078z.f340639a;
        return new C123058f(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString(), packageInfo.packageName);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
