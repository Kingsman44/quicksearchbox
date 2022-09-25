package com.google.android.libraries.lens.view.gallery;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.p2112e.C26408a;

/* renamed from: com.google.android.libraries.lens.view.gallery.v */
/* compiled from: PG */
final class C26435v extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71927a;

    public C26435v(C26299ac acVar) {
        this.f71927a = acVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i != 0) {
            this.f71927a.f71506n.mo31547b();
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C26299ac acVar = this.f71927a;
        if (acVar.f71477I != null) {
            C0673gh findViewHolderForAdapterPosition = acVar.f71474F.findViewHolderForAdapterPosition(0);
            float f = 0.0f;
            if (findViewHolderForAdapterPosition == null) {
                acVar.f71477I.mo31607a(-1);
                C26408a aVar = acVar.f71477I;
                aVar.f71847b = 0.0f;
                aVar.invalidateSelf();
                C26298ab abVar = acVar.f71515w;
                abVar.f71466a = 0.0f;
                abVar.mo31500a();
                return;
            }
            acVar.f71477I.mo31607a(findViewHolderForAdapterPosition.itemView.getBottom());
            float paddingTop = (float) (acVar.f71474F.getPaddingTop() - findViewHolderForAdapterPosition.itemView.getTop());
            acVar.f71473E.setTranslationY(Math.min((-paddingTop) + acVar.f71474F.getTranslationY(), (float) acVar.mo31501a()) + ((float) acVar.f71516x));
            float f2 = ((float) acVar.f71483O) * 0.6f;
            float f3 = (paddingTop < 0.0f || paddingTop >= f2) ? 0.0f : 1.0f - (paddingTop / f2);
            C26298ab abVar2 = acVar.f71515w;
            abVar2.f71466a = f3;
            abVar2.mo31500a();
            acVar.f71474F.setAlpha(1.0f);
            View findViewById = acVar.f71495c.requireView().findViewById(R.id.lens_gallery_floating_permission_button);
            if (findViewById != null) {
                if (acVar.mo31513m()) {
                    f = Math.max(0.0f, ((float) acVar.f71517y) - paddingTop);
                }
                findViewById.setTranslationY(f);
            }
        }
    }
}
