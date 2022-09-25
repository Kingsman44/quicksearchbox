package com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared;

import android.content.Context;
import com.google.android.libraries.assistant.p1356b.p1357a.C16917a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.a */
/* compiled from: PG */
public final /* synthetic */ class C110115a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f306854a;

    public /* synthetic */ C110115a(Context context) {
        this.f306854a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f306854a;
        C59071e eVar = C16917a.f49471a;
        return Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.AMB_DEVICE_INTEGRATION"));
    }
}
