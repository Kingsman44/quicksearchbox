package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.an */
/* compiled from: PG */
public final /* synthetic */ class C117571an implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117578au f326353a;

    public /* synthetic */ C117571an(C117578au auVar) {
        this.f326353a = auVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117578au auVar = this.f326353a;
        Float f = (Float) obj;
        auVar.f326379q = (int) (((float) auVar.f326364b.getResources().getDisplayMetrics().widthPixels) / Float.valueOf(f.floatValue() > 0.0f ? f.floatValue() : 1.7777778f).floatValue());
        auVar.f326378p.getLayoutParams().height = auVar.f326379q;
    }
}
