package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.bg */
/* compiled from: PG */
public final /* synthetic */ class C102334bg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RelatedContentHeader f285600a;

    /* renamed from: b */
    public final /* synthetic */ String f285601b;

    public /* synthetic */ C102334bg(RelatedContentHeader relatedContentHeader, String str) {
        this.f285600a = relatedContentHeader;
        this.f285601b = str;
    }

    public final void onClick(View view) {
        RelatedContentHeader relatedContentHeader = this.f285600a;
        String str = this.f285601b;
        C102374p pVar = relatedContentHeader.f285505d;
        if (pVar.mo93176g()) {
            C102288a aVar = pVar.f285679a;
            Bundle bundle = new Bundle();
            bundle.putString("query", str);
            ((C102289b) aVar).f285407a.mo28345s("openImageSearchQuery_java.lang.String", "ImagePageEventsDispatcher", bundle);
        }
    }
}
