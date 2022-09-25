package com.google.android.libraries.lens.view.gallery.p2112e;

import android.view.ViewTreeObserver;
import androidx.p119j.p120a.p121a.C2300b;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.f */
/* compiled from: PG */
public final class C26413f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C26416i f71866a;

    public C26413f(C26416i iVar) {
        this.f71866a = iVar;
    }

    public final void onGlobalLayout() {
        this.f71866a.f71870a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C26416i iVar = this.f71866a;
        iVar.f71870a.setVisibility(0);
        iVar.f71871b.setVisibility(4);
        iVar.f71870a.setImageBitmap(iVar.f71872c);
        iVar.f71877h = Math.max(((float) iVar.f71874e.width()) / ((float) iVar.f71875f.width()), ((float) iVar.f71874e.height()) / ((float) iVar.f71875f.height()));
        iVar.f71878i = (float) ((iVar.f71874e.centerX() - iVar.f71875f.centerX()) + iVar.f71875f.left);
        float centerY = (float) ((iVar.f71874e.centerY() - iVar.f71875f.centerY()) + iVar.f71875f.top);
        iVar.f71879j = centerY;
        iVar.mo31622f(iVar.f71878i, centerY, iVar.f71877h);
        iVar.f71880k = 1.0f;
        iVar.f71881l = (float) iVar.f71875f.left;
        iVar.f71882m = (float) iVar.f71875f.top;
        iVar.mo31621e(0.0f);
        iVar.f71870a.animate().setDuration(225).setInterpolator(new C2300b()).setListener(new C26414g(new C26411d(iVar))).setUpdateListener(new C26412e(iVar)).start();
    }
}
