package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73843bj;
import com.google.android.libraries.assistant.p1535p.C18509a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.av */
/* compiled from: PG */
public final /* synthetic */ class C9667av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9670ay f33437a;

    /* renamed from: b */
    public final /* synthetic */ C73843bj f33438b;

    public /* synthetic */ C9667av(C9670ay ayVar, C73843bj bjVar) {
        this.f33437a = ayVar;
        this.f33438b = bjVar;
    }

    public final void onClick(View view) {
        C9670ay ayVar = this.f33437a;
        C73843bj bjVar = this.f33438b;
        C18509a aVar = (C18509a) ayVar.f33441b.mo17428b();
        aVar.mo24024f("poncho");
        ayVar.startActivityForResult(aVar.mo24020b().mo24031a().putExtra("device_id", bjVar.mo65325a()), 100);
    }
}
