package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.t */
/* compiled from: PG */
public final class C104409t extends C0648fj {

    /* renamed from: a */
    private final int f290533a;

    /* renamed from: b */
    private final int f290534b;

    /* renamed from: c */
    private final int f290535c;

    public C104409t(int i, int i2, int i3) {
        this.f290533a = i;
        this.f290534b = i2;
        this.f290535c = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean h = C91115n.m148876h(recyclerView);
        if (childAdapterPosition == 0) {
            childAdapterPosition = 0;
            if (h) {
                rect.right = this.f290533a;
            } else {
                rect.left = this.f290533a;
            }
        }
        if (childAdapterPosition != this.f290535c - 1) {
            return;
        }
        if (h) {
            rect.left = this.f290534b;
        } else {
            rect.right = this.f290534b;
        }
    }
}
