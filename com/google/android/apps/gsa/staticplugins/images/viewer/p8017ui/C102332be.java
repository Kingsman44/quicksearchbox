package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.be */
/* compiled from: PG */
public final /* synthetic */ class C102332be implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RelatedContentHeader f285598a;

    public /* synthetic */ C102332be(RelatedContentHeader relatedContentHeader) {
        this.f285598a = relatedContentHeader;
    }

    public final void onClick(View view) {
        C102374p pVar = this.f285598a.f285505d;
        if (pVar.mo93176g()) {
            C102288a aVar = pVar.f285679a;
            ((C102289b) aVar).f285407a.mo28345s("viewAllRelatedImages", "ImagePageEventsDispatcher", new Bundle());
        }
    }
}
