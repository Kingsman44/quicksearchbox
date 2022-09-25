package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C117600v implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ C117558aa f326461a;

    public /* synthetic */ C117600v(C117558aa aaVar) {
        this.f326461a = aaVar;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        C117558aa aaVar = this.f326461a;
        if (motionEvent.getAction() != 0) {
            aaVar.mo103370e();
            return false;
        } else if (aaVar.f326322b != null) {
            return false;
        } else {
            aaVar.f326322b = aaVar.f326321a.mo83998a(aaVar.f63126Q);
            return false;
        }
    }
}
