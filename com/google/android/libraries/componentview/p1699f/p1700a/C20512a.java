package com.google.android.libraries.componentview.p1699f.p1700a;

import android.view.View;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;

/* renamed from: com.google.android.libraries.componentview.f.a.a */
/* compiled from: PG */
public abstract class C20512a implements View.OnClickListener {

    /* renamed from: a */
    private final C20601ca f57624a;

    /* renamed from: b */
    private final String f57625b;

    public C20512a(C20601ca caVar, String str) {
        this.f57624a = caVar;
        this.f57625b = str;
    }

    /* renamed from: a */
    public abstract void mo25134a();

    public final void onClick(View view) {
        try {
            mo25134a();
        } catch (Exception e) {
            C20601ca caVar = this.f57624a;
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_CLICK_EXCEPTION);
            eVar.f57821a = e;
            eVar.f57824d = this.f57625b;
            caVar.mo25487b(eVar.mo25531a());
        }
    }
}
