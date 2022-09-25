package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30905ae;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.r */
/* compiled from: PG */
public final class C30273r extends C0648fj {

    /* renamed from: a */
    private final Drawable f81867a;

    /* renamed from: b */
    private final Rect f81868b = new Rect();

    /* renamed from: c */
    private final int f81869c;

    /* renamed from: d */
    private final View f81870d;

    public C30273r(View view, int i) {
        this.f81870d = view;
        Context context = view.getContext();
        int a = C30899a.m57682a(view.getContext(), R.attr.ogLightGrey);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.og_list_divider);
        C30905ae.m57696b(c, a);
        this.f81867a = c;
        this.f81869c = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        if (recyclerView.getChildAt(0) == view) {
            rect.set(0, this.f81867a.getIntrinsicHeight(), 0, 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        if (recyclerView.getChildCount() != 0) {
            View childAt = recyclerView.getChildAt(0);
            RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.f81868b);
            int round = this.f81868b.top + Math.round(childAt.getTranslationY());
            int intrinsicHeight = this.f81867a.getIntrinsicHeight() + round;
            if (C2043bi.m5577f(this.f81870d) == 1) {
                this.f81867a.setBounds(0, round, recyclerView.getWidth() - this.f81869c, intrinsicHeight);
            } else {
                this.f81867a.setBounds(this.f81869c, round, recyclerView.getWidth(), intrinsicHeight);
            }
            this.f81867a.draw(canvas);
        }
    }
}
