package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bk */
/* compiled from: PG */
public final /* synthetic */ class C9927bk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9935bs f34030a;

    public /* synthetic */ C9927bk(C9935bs bsVar) {
        this.f34030a = bsVar;
    }

    public final void onClick(View view) {
        C9935bs bsVar = this.f34030a;
        C9922bf bfVar = bsVar.f34042b;
        C18509a aVar = (C18509a) bsVar.f34051k.mo17428b();
        aVar.mo24024f("privacy_advisor");
        aVar.mo24023e("settings_main_v2");
        bfVar.startActivityForResult(aVar.mo24020b().mo24031a(), 0);
    }
}
