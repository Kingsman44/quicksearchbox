package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.u */
/* compiled from: PG */
public final class C104410u extends C0648fj {

    /* renamed from: a */
    private final int f290536a;

    /* renamed from: b */
    private final int f290537b;

    /* renamed from: c */
    private final int f290538c;

    /* renamed from: d */
    private final int f290539d;

    /* renamed from: e */
    private final Paint f290540e;

    /* renamed from: f */
    private final Paint f290541f;

    /* renamed from: g */
    private int f290542g;

    public C104410u(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f290536a = i;
        this.f290537b = i2;
        this.f290538c = i4;
        this.f290539d = i3;
        this.f290540e = m172628a(i5);
        this.f290541f = m172628a(i6);
    }

    /* renamed from: a */
    private static Paint m172628a(int i) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        rect.bottom = this.f290539d;
    }

    public final void onDrawOver$ar$ds(Canvas canvas, RecyclerView recyclerView) {
        int i;
        Paint paint;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.mLayout;
        linearLayoutManager.getClass();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1) {
            findFirstVisibleItemPosition = this.f290542g;
        } else {
            this.f290542g = findFirstVisibleItemPosition;
        }
        C0640fb fbVar = recyclerView.mAdapter;
        if (fbVar != null) {
            int itemCount = fbVar.getItemCount();
            float width = (((float) recyclerView.getWidth()) - ((float) ((itemCount - 1) * this.f290538c))) / 2.0f;
            float height = (float) (recyclerView.getHeight() - this.f290539d);
            if (C2043bi.m5577f(recyclerView) == 1) {
                findFirstVisibleItemPosition = (itemCount - findFirstVisibleItemPosition) - 1;
            }
            for (int i2 = 0; i2 < itemCount; i2++) {
                if (i2 == findFirstVisibleItemPosition) {
                    i = this.f290536a;
                } else {
                    i = this.f290537b;
                }
                float f = (float) i;
                if (i2 == findFirstVisibleItemPosition) {
                    paint = this.f290540e;
                } else {
                    paint = this.f290541f;
                }
                canvas.drawCircle(width, height, f, paint);
                width += (float) this.f290538c;
            }
        }
    }
}
