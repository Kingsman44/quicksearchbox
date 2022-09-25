package com.google.android.libraries.web.contrib.contextmenu.p3364c;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.c.e */
/* compiled from: PG */
public final /* synthetic */ class C43453e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43454f f113519a;

    /* renamed from: b */
    public final /* synthetic */ C43448h f113520b;

    public /* synthetic */ C43453e(C43454f fVar, C43448h hVar) {
        this.f113519a = fVar;
        this.f113520b = hVar;
    }

    public final void onClick(View view) {
        C43454f fVar = this.f113519a;
        C43448h hVar = this.f113520b;
        if (hVar.mo46520b() != 0) {
            fVar.f113523c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
        hVar.mo46522d();
        C43449a aVar = fVar.f113525e;
        if (aVar.f113509a.isAdded()) {
            aVar.f113509a.dismiss();
        }
    }
}
