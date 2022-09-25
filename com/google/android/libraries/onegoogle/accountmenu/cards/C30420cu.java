package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cu */
/* compiled from: PG */
public final class C30420cu extends C0648fj {

    /* renamed from: a */
    private final Drawable f82210a;

    /* renamed from: b */
    private final Rect f82211b = new Rect();

    /* renamed from: c */
    private final int f82212c;

    public C30420cu(Context context, int i) {
        int a = C30899a.m57682a(context, R.attr.ogLightGrey);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.og_list_divider);
        C30905ae.m57696b(c, a);
        this.f82210a = c;
        this.f82212c = i;
    }

    /* renamed from: a */
    private final void m56641a(RecyclerView recyclerView, View view, Canvas canvas, int i) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, this.f82211b);
        int round = this.f82211b.top + Math.round(view.getTranslationY());
        this.f82210a.setBounds(i, round, recyclerView.getWidth(), this.f82210a.getIntrinsicHeight() + round);
        this.f82210a.draw(canvas);
    }

    /* renamed from: b */
    private static int m56642b(View view, RecyclerView recyclerView) {
        C0640fb fbVar = recyclerView.mAdapter;
        if (fbVar == null) {
            return 1;
        }
        C58838bb.m90883r(fbVar instanceof C30419ct);
        return ((C30419ct) fbVar).mo35951c(recyclerView, view);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int b = m56642b(view, recyclerView);
        if (b == 0) {
            throw null;
        } else if (b != 1) {
            rect.set(0, this.f82210a.getIntrinsicHeight(), 0, 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int b = m56642b(childAt, recyclerView);
            int i2 = b - 1;
            if (b != 0) {
                if (i2 == 1) {
                    m56641a(recyclerView, childAt, canvas, 0);
                } else if (i2 == 2) {
                    m56641a(recyclerView, childAt, canvas, this.f82212c);
                }
                i++;
            } else {
                throw null;
            }
        }
    }
}
