package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.s */
/* compiled from: PG */
final class C30775s extends C0648fj {

    /* renamed from: a */
    public int f83069a = 0;

    /* renamed from: b */
    private final Drawable f83070b;

    /* renamed from: c */
    private final Rect f83071c = new Rect();

    /* renamed from: d */
    private final int f83072d;

    public C30775s(Drawable drawable, int i) {
        drawable.getClass();
        this.f83070b = drawable;
        this.f83072d = i;
    }

    /* renamed from: b */
    private static boolean m57477b(C0640fb fbVar, int i) {
        return i >= 0 && fbVar.getItemViewType(i) == 2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (m57476a(recyclerView, view) == 0) {
            super.getItemOffsets(rect, view, recyclerView, geVar);
        } else {
            rect.top = this.f83070b.getIntrinsicHeight();
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int a = m57476a(recyclerView, childAt);
            if (a != 0) {
                int i2 = a == 2 ? this.f83072d : 0;
                int width = recyclerView.getWidth();
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.f83071c);
                int round = this.f83071c.top + Math.round(childAt.getTranslationY());
                this.f83070b.setBounds(i2, round, width, this.f83070b.getIntrinsicHeight() + round);
                this.f83070b.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private final int m57476a(RecyclerView recyclerView, View view) {
        C0640fb fbVar = recyclerView.mAdapter;
        if (fbVar != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (m57477b(fbVar, childAdapterPosition) && !m57477b(fbVar, childAdapterPosition - 1)) {
                return 1;
            }
        }
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return this.f83069a;
        }
        return 0;
    }
}
