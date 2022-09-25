package com.google.android.libraries.lens.view.frozenimage;

import androidx.lifecycle.C2333ah;
import androidx.p119j.p120a.p121a.C2300b;
import com.google.android.libraries.lens.view.gallery.p2112e.C26409b;
import com.google.android.libraries.lens.view.gallery.p2112e.C26410c;
import com.google.android.libraries.lens.view.gallery.p2112e.C26414g;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.frozenimage.l */
/* compiled from: PG */
public final /* synthetic */ class C26280l implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26285q f71420a;

    public /* synthetic */ C26280l(C26285q qVar) {
        this.f71420a = qVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26285q qVar = this.f71420a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            qVar.f71432h = (C26416i) axVar.mo56107c();
            C26416i iVar = qVar.f71432h;
            FrozenImageView frozenImageView = qVar.f71430f;
            iVar.f71876g = frozenImageView;
            iVar.f71884o = false;
            frozenImageView.setImageBitmap(iVar.f71872c);
            qVar.f71430f.setVisibility(4);
            qVar.f71431g.mo124186l(1.0f);
            qVar.f71430f.getViewTreeObserver().addOnGlobalLayoutListener(new C26284p(qVar));
            qVar.f71430f.requestLayout();
            qVar.f71426b.mo31478g(true);
        } else if (qVar.f71432h != null) {
            qVar.f71426b.mo31478g(true);
            C26416i iVar2 = qVar.f71432h;
            iVar2.getClass();
            C26276h hVar = new C26276h(qVar);
            iVar2.f71870a.animate().cancel();
            iVar2.f71870a.setVisibility(0);
            iVar2.f71885p = hVar;
            iVar2.f71870a.animate().scaleX(iVar2.f71877h).scaleY(iVar2.f71877h).translationX(iVar2.f71878i - ((float) iVar2.f71873d[0])).translationY(iVar2.f71879j - ((float) iVar2.f71873d[1])).setDuration(300).setInterpolator(new C2300b()).setListener(new C26414g(new C26409b(iVar2))).setUpdateListener(new C26410c(iVar2)).start();
            qVar.f71432h = null;
        }
    }
}
