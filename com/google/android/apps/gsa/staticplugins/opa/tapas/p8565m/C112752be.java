package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.be */
/* compiled from: PG */
final class C112752be extends C0648fj {

    /* renamed from: a */
    private final Rect f312535a = new Rect();

    /* renamed from: b */
    private final Optional f312536b;

    /* renamed from: c */
    private final int f312537c;

    public C112752be(Context context) {
        this.f312536b = Optional.ofNullable(C1877c.m5125a(context, R.drawable.contact_disambig_item_divider_background));
        this.f312537c = context.getResources().getDimensionPixelSize(R.dimen.contact_disambig_item_divider_margin_start);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        if (!this.f312536b.isEmpty()) {
            canvas.save();
            int width = recyclerView.getWidth();
            for (int i = 0; i < recyclerView.getChildCount() - 1; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.getDecoratedBoundsWithMarginsInt(childAt, this.f312535a);
                int round = this.f312535a.bottom + Math.round(childAt.getTranslationY());
                ((Drawable) this.f312536b.get()).setBounds(this.f312537c, round - ((Drawable) this.f312536b.get()).getIntrinsicHeight(), width, round);
                ((Drawable) this.f312536b.get()).draw(canvas);
            }
            canvas.restore();
        }
    }
}
