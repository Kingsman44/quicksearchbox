package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bn */
/* compiled from: PG */
final class C15032bn extends C0648fj {

    /* renamed from: a */
    private final int f45066a;

    public C15032bn(int i) {
        this.f45066a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (recyclerView.mAdapter != null) {
            rect.bottom = this.f45066a;
        }
    }
}
