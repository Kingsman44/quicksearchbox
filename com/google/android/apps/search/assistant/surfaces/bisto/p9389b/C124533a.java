package com.google.android.apps.search.assistant.surfaces.bisto.p9389b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60105ky;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.b.a */
/* compiled from: PG */
public final /* synthetic */ class C124533a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f343603a;

    /* renamed from: b */
    public final /* synthetic */ C60105ky f343604b;

    public /* synthetic */ C124533a(String str, C60105ky kyVar) {
        this.f343603a = str;
        this.f343604b = kyVar;
    }

    public final Object apply(Object obj) {
        String str = this.f343603a;
        C60105ky kyVar = this.f343604b;
        Bundle bundle = new Bundle();
        return new Intent().setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.OobeActivity")).putExtra("key_device_id", str).putExtra("oobe_trigger", kyVar.f162530s).putExtra("mode", 0).putExtra("deeplink_context", bundle).putExtra("model_id", ((C124679cr) obj).f343964g);
    }
}
