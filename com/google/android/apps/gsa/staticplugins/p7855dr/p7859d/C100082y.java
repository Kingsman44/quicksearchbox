package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.y */
/* compiled from: PG */
public final /* synthetic */ class C100082y implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C100053at f279913a;

    public /* synthetic */ C100082y(C100053at atVar) {
        this.f279913a = atVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C100053at atVar = this.f279913a;
        atVar.f279808m = rect;
        atVar.mo91730q();
        C22939d dVar = atVar.f279818w;
        if (dVar != null && atVar.f279812q) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dVar.mo28297il().getLayoutParams();
            marginLayoutParams.leftMargin = atVar.f279808m.left;
            marginLayoutParams.rightMargin = atVar.f279808m.right;
        }
        atVar.mo91726k();
        atVar.f279802g.notifyObservers();
    }
}
