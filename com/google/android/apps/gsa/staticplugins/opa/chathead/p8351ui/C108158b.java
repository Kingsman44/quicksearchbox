package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.graphics.Point;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.b */
/* compiled from: PG */
public final /* synthetic */ class C108158b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300819a;

    public /* synthetic */ C108158b(C108185z zVar) {
        this.f300819a = zVar;
    }

    public final void run() {
        C108185z zVar = this.f300819a;
        Point point = new Point();
        zVar.f300867d.getDefaultDisplay().getSize(point);
        zVar.f300868e.x = 0;
        zVar.f300868e.y = (int) ((((float) point.y) * 0.33333334f) - ((float) (point.y / 2)));
        zVar.mo96536u(true);
    }
}
