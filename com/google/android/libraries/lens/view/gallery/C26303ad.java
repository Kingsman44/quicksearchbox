package com.google.android.libraries.lens.view.gallery;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.lens.view.gallery.p2111d.C26363i;

/* renamed from: com.google.android.libraries.lens.view.gallery.ad */
/* compiled from: PG */
final class C26303ad extends C0648fj {

    /* renamed from: a */
    final /* synthetic */ C26299ac f71520a;

    public C26303ad(C26299ac acVar) {
        this.f71520a = acVar;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        C26363i iVar = this.f71520a.f71469A;
        iVar.getClass();
        int b = iVar.f71683e.mo31563b(recyclerView.getChildAdapterPosition(view));
        if (b == 0) {
            rect.left = iVar.f71681c;
            rect.right = iVar.f71681c;
            rect.top = iVar.f71681c;
            rect.bottom = iVar.f71681c;
        } else if (b != 1 && b == 2 && !iVar.f71683e.f71734c.mo31560h()) {
            rect.top = iVar.f71682d;
        }
    }
}
