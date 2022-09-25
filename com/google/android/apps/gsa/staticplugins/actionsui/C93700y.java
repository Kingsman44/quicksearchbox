package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.y */
/* compiled from: PG */
final class C93700y extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ CountDownView f261510a;

    public C93700y(CountDownView countDownView) {
        this.f261510a = countDownView;
    }

    /* renamed from: a */
    public final void mo84951a(View view) {
        Object tag = this.f261510a.getTag();
        int intValue = tag instanceof Integer ? ((Integer) tag).intValue() : 0;
        C93505k kVar = this.f261510a.f260751f;
        if (kVar != null) {
            ((C93503i) kVar.f260975a.f239232a).mo82050m(1, 3);
            kVar.f260975a.mo87830k(intValue);
        }
    }
}
