package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.Rect;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.h */
/* compiled from: PG */
final class C15088h extends C0648fj {

    /* renamed from: a */
    private final int f45271a;

    public C15088h(int i) {
        this.f45271a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (recyclerView.mAdapter != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            C0640fb fbVar = recyclerView.mAdapter;
            fbVar.getClass();
            if (childAdapterPosition != fbVar.getItemCount() - 1) {
                rect.bottom = this.f45271a;
            }
        }
    }
}
