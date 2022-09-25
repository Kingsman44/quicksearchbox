package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.widget.PopupWindow;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.ao */
/* compiled from: PG */
public final /* synthetic */ class C137086ao implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C137087ap f373039a;

    /* renamed from: b */
    public final /* synthetic */ C137007dh f373040b;

    public /* synthetic */ C137086ao(C137087ap apVar, C137007dh dhVar) {
        this.f373039a = apVar;
        this.f373040b = dhVar;
    }

    public final void onDismiss() {
        C137087ap apVar = this.f373039a;
        C137007dh dhVar = this.f373040b;
        if ((dhVar.f372871a & 8) != 0) {
            apVar.mo113503a();
            apVar.f373042a.mo113457n(dhVar);
        }
    }
}
