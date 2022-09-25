package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ac */
/* compiled from: PG */
public final /* synthetic */ class C105475ac implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C105486an f294219a;

    public /* synthetic */ C105475ac(C105486an anVar) {
        this.f294219a = anVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C105486an anVar = this.f294219a;
        anVar.f294245l = rect;
        anVar.mo94843m();
        if (anVar.f294237d) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anVar.f294242i.getLayoutParams();
            marginLayoutParams.rightMargin = rect.right;
            marginLayoutParams.leftMargin = rect.left;
            anVar.f294242i.setLayoutParams(marginLayoutParams);
        }
    }
}
