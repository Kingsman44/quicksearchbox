package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.ac */
/* compiled from: PG */
public final /* synthetic */ class C10004ac implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10005ad f34195a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f34196b;

    public /* synthetic */ C10004ac(C10005ad adVar, C0392m mVar) {
        this.f34195a = adVar;
        this.f34196b = mVar;
    }

    public final void onClick(View view) {
        C10005ad adVar = this.f34195a;
        C0392m mVar = this.f34196b;
        adVar.f34197a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84235f(new C10023b(adVar.f34202f, 2), adVar.f34203g);
        mVar.dismiss();
    }
}
