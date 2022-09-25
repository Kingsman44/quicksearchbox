package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ar */
/* compiled from: PG */
public final /* synthetic */ class C102318ar implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102319as f285558a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f285559b;

    public /* synthetic */ C102318ar(C102319as asVar, ArrayList arrayList) {
        this.f285558a = asVar;
        this.f285559b = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C102319as asVar = this.f285558a;
        String str = (String) this.f285559b.get(i);
        if (str.equals(asVar.f285562i.getResources().getString(R.string.images_visit_site))) {
            C102331bd bdVar = asVar.f285562i.f285454a.f285685g;
            bdVar.f285593a.mo93134a(bdVar.f285597e);
            ImageViewerPage imageViewerPage = asVar.f285562i;
            imageViewerPage.f285454a.mo93173d(C102374p.m169701a(imageViewerPage.f285455b));
        } else if (str.equals(asVar.f285562i.getResources().getString(R.string.images_longpress_menu_download))) {
            C102331bd bdVar2 = asVar.f285562i.f285454a.f285685g;
            bdVar2.f285593a.mo93134a(bdVar2.f285595c);
            C102374p pVar = asVar.f285562i.f285454a;
            if (pVar.mo93176g()) {
                C102288a aVar = pVar.f285679a;
                ((C102289b) aVar).f285407a.mo28345s("downloadImageToLocalStorage", "ImagePageEventsDispatcher", new Bundle());
            }
        } else if (str.equals(asVar.f285562i.getResources().getString(R.string.images_longpress_menu_share))) {
            C102331bd bdVar3 = asVar.f285562i.f285454a.f285685g;
            bdVar3.f285593a.mo93134a(bdVar3.f285596d);
            asVar.f285562i.f285454a.mo93174e();
        }
        dialogInterface.dismiss();
    }
}
