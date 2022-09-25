package com.google.android.libraries.lens.view.frozenimage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.libraries.lens.view.gallery.p2112e.C26413f;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.p */
/* compiled from: PG */
final class C26284p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C26285q f71424a;

    public C26284p(C26285q qVar) {
        this.f71424a = qVar;
    }

    public final void onGlobalLayout() {
        this.f71424a.f71430f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C26416i iVar = this.f71424a.f71432h;
        if (iVar != null) {
            C26283o oVar = new C26283o(this);
            iVar.f71870a.animate().cancel();
            iVar.f71883n = 0.0f;
            ((View) iVar.f71870a.getParent()).getLocationInWindow(iVar.f71873d);
            C26416i.m48701a(iVar.f71871b, iVar.f71874e);
            ImageView imageView = iVar.f71876g;
            imageView.getClass();
            C26416i.m48701a(imageView, iVar.f71875f);
            iVar.f71885p = oVar;
            if (iVar.f71875f.width() <= 0 || iVar.f71875f.height() <= 0) {
                iVar.f71883n = 1.0f;
                iVar.mo31619c();
                return;
            }
            ViewGroup.LayoutParams layoutParams = iVar.f71870a.getLayoutParams();
            layoutParams.width = iVar.f71875f.width();
            layoutParams.height = iVar.f71875f.height();
            iVar.f71870a.setLayoutParams(layoutParams);
            iVar.f71870a.setVisibility(4);
            iVar.f71870a.getViewTreeObserver().addOnGlobalLayoutListener(new C26413f(iVar));
            iVar.f71870a.requestLayout();
        }
    }
}
