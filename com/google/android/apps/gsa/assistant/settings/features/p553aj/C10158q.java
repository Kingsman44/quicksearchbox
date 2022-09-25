package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.assistant.p3861at.C49875cf;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.q */
/* compiled from: PG */
public final /* synthetic */ class C10158q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10166y f34542a;

    /* renamed from: b */
    public final /* synthetic */ C49875cf f34543b;

    /* renamed from: c */
    public final /* synthetic */ String f34544c;

    public /* synthetic */ C10158q(C10166y yVar, C49875cf cfVar, String str) {
        this.f34542a = yVar;
        this.f34543b = cfVar;
        this.f34544c = str;
    }

    public final void onClick(View view) {
        C10166y yVar = this.f34542a;
        C49875cf cfVar = this.f34543b;
        String str = this.f34544c;
        C18509a aVar = (C18509a) yVar.f34556d.mo17428b();
        aVar.mo24024f("device_info");
        Intent a = aVar.mo24020b().mo24031a();
        a.putExtra("assistant_surface", cfVar.f129621v);
        a.putExtra("assistant_device_id", str);
        yVar.startActivityForResult(a, 0);
    }
}
