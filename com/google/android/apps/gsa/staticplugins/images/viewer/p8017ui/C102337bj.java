package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bj */
/* compiled from: PG */
public final /* synthetic */ class C102337bj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102338bk f285605a;

    /* renamed from: b */
    public final /* synthetic */ int f285606b;

    public /* synthetic */ C102337bj(C102338bk bkVar, int i) {
        this.f285605a = bkVar;
        this.f285606b = i;
    }

    public final void onClick(View view) {
        C102338bk bkVar = this.f285605a;
        int i = this.f285606b;
        C102374p pVar = bkVar.f285607a.f285505d;
        if (pVar.mo93176g()) {
            C102288a aVar = pVar.f285679a;
            Bundle bundle = new Bundle();
            bundle.putInt("index", Integer.valueOf(i).intValue());
            ((C102289b) aVar).f285407a.mo28345s("openRelatedImage_int", "ImagePageEventsDispatcher", bundle);
        }
    }
}
