package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ab */
/* compiled from: PG */
public final /* synthetic */ class C9888ab implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9889ac f33936a;

    public /* synthetic */ C9888ab(C9889ac acVar) {
        this.f33936a = acVar;
    }

    public final void onClick(View view) {
        C9889ac acVar = this.f33936a;
        C9974r rVar = acVar.f33938b;
        C18509a aVar = (C18509a) acVar.f33941e.mo17428b();
        aVar.mo24024f("device_hub");
        aVar.mo24023e("settings_main_v2");
        rVar.startActivityForResult(aVar.mo24020b().mo24031a(), 0);
    }
}
