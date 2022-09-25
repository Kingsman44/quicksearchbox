package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113980bz;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113991ca;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ap */
/* compiled from: PG */
public final class C114111ap extends C0648fj {

    /* renamed from: a */
    private final Context f316283a;

    /* renamed from: b */
    private final C113716d f316284b;

    /* renamed from: c */
    private final C113716d f316285c;

    /* renamed from: d */
    private final boolean f316286d;

    /* renamed from: e */
    private final boolean f316287e;

    /* renamed from: f */
    private final Drawable f316288f;

    public C114111ap(C113716d dVar, C113716d dVar2, boolean z, Context context, C104149a aVar, boolean z2) {
        this.f316283a = context;
        this.f316284b = dVar;
        this.f316285c = dVar2;
        this.f316286d = z;
        this.f316287e = z2;
        this.f316288f = aVar.mo93971b() ? C108435ip.m180256a(aVar, context).getDrawable(R.drawable.item_decoration) : null;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        if (recyclerView.getChildViewHolder(view).mItemViewType == -3) {
            if (((C113980bz) this.f316284b).f315615a.f315801K.f316068a.getVisibility() == 0) {
                rect.bottom += this.f316283a.getResources().getDimensionPixelOffset(true != this.f316286d ? R.dimen.valyrian_header_height : R.dimen.dm_valyrian_header_height);
                rect.bottom -= this.f316283a.getResources().getDimensionPixelSize(true != this.f316287e ? R.dimen.initial_position_placeholder_height : R.dimen.initial_position_placeholder_height_v2);
            }
            ViewGroup viewGroup = ((C113991ca) this.f316285c).f315631b.f315818aB;
            if (viewGroup != null && viewGroup.getVisibility() != 8) {
                rect.bottom += this.f316285c.mo100572a();
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        if (this.f316288f != null) {
            C0653fo foVar = recyclerView.mLayout;
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null && foVar != null && recyclerView.getChildViewHolder(childAt).mItemViewType == -3) {
                Drawable drawable = this.f316288f;
                drawable.getClass();
                drawable.setBounds(foVar.getDecoratedLeft(childAt), foVar.getDecoratedTop(childAt), foVar.getDecoratedRight(childAt), foVar.getDecoratedBottom(childAt));
                Drawable drawable2 = this.f316288f;
                drawable2.getClass();
                drawable2.draw(canvas);
            }
        }
    }
}
