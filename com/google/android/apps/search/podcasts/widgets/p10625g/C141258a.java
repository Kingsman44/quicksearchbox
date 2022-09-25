package com.google.android.apps.search.podcasts.widgets.p10625g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.g.a */
/* compiled from: PG */
public final class C141258a extends C0569cl {

    /* renamed from: b */
    private final Rect f383500b = new Rect();

    public C141258a(Context context) {
        super(context, 1);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int i;
        int i2;
        C69664n.m101061g(canvas, "canvas");
        C69664n.m101061g(geVar, "state");
        C0653fo foVar = recyclerView.mLayout;
        GridLayoutManager gridLayoutManager = foVar instanceof GridLayoutManager ? (GridLayoutManager) foVar : null;
        int i3 = gridLayoutManager != null ? gridLayoutManager.mSpanCount : 1;
        C0640fb fbVar = recyclerView.mAdapter;
        int itemCount = fbVar != null ? fbVar.getItemCount() : 0;
        canvas.save();
        if (recyclerView.mClipToPadding) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (recyclerView.getChildAdapterPosition(childAt) < itemCount - i3) {
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.f383500b);
                int round = this.f383500b.bottom + Math.round(childAt.getTranslationY());
                Drawable drawable = this.f2212a;
                int intrinsicHeight = round - (drawable != null ? drawable.getIntrinsicHeight() : 0);
                Drawable drawable2 = this.f2212a;
                if (drawable2 != null) {
                    drawable2.setBounds(i2, intrinsicHeight, i, round);
                }
                Drawable drawable3 = this.f2212a;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
            }
        }
        canvas.restore();
    }
}
