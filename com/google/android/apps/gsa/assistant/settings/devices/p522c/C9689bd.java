package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import com.google.android.apps.gsa.shared.util.C90736at;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.bd */
/* compiled from: PG */
public final /* synthetic */ class C9689bd implements C90736at {

    /* renamed from: a */
    public final /* synthetic */ C9692bg f33485a;

    public /* synthetic */ C9689bd(C9692bg bgVar) {
        this.f33485a = bgVar;
    }

    /* renamed from: a */
    public final void mo17700a(Object obj) {
        C9692bg bgVar = this.f33485a;
        String str = (String) obj;
        bgVar.f33496a.edit().putString("inputMode", str).remove("opa_sticky_input_modality").remove("opa_sticky_input_modality_expiration_timestamp").apply();
        bgVar.f33500e.mo105031a(str);
    }
}
