package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.y */
/* compiled from: PG */
public final /* synthetic */ class C117184y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C117100aa f325298a;

    public /* synthetic */ C117184y(C117100aa aaVar) {
        this.f325298a = aaVar;
    }

    public final void onClick(View view) {
        C117100aa aaVar = this.f325298a;
        Bitmap createBitmap = Bitmap.createBitmap(aaVar.f325101a.getWidth(), aaVar.f325101a.getHeight(), Bitmap.Config.ARGB_8888);
        aaVar.f325101a.draw(new Canvas(createBitmap));
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_SCREENSHOT", createBitmap);
        aaVar.f63126Q.mo28345s("CLICK", "FEEDBACK_BUTTON", bundle);
    }
}
