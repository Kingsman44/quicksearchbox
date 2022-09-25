package com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a;

import com.google.android.apps.gsa.assistant.shared.f.a.b;
import com.google.android.apps.gsa.assistant.shared.f.a.g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z.a.f */
/* compiled from: PG */
public final /* synthetic */ class C114537f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f317628a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f317629b;

    public /* synthetic */ C114537f(String str, Boolean bool) {
        this.f317628a = str;
        this.f317629b = bool;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f317628a;
        Boolean bool = this.f317629b;
        b builder = ((g) obj).toBuilder();
        builder.a(str, bool.booleanValue());
        return C60856cj.m92900i(builder.build());
    }
}
