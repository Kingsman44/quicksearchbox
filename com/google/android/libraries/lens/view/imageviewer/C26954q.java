package com.google.android.libraries.lens.view.imageviewer;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.libraries.web.p3420k.C43861g;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.q */
/* compiled from: PG */
public final /* synthetic */ class C26954q implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C26955r f73466a;

    public /* synthetic */ C26954q(C26955r rVar) {
        this.f73466a = rVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C43861g gVar;
        C26955r rVar = this.f73466a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        C26940d a = rVar.mo32344a();
        if (a != null && (gVar = (C43861g) a.mo17754z().f73442b.getChildFragmentManager().f634a.mo671c("image-viewer-web-fragment-tag")) != null && gVar.mo17754z().mo46876d()) {
            return true;
        }
        rVar.f73467a.dismiss();
        return true;
    }
}
