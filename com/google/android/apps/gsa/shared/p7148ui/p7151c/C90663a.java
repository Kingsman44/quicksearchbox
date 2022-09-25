package com.google.android.apps.gsa.shared.p7148ui.p7151c;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.C2179h;
import androidx.drawerlayout.widget.C2180i;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.ui.c.a */
/* compiled from: PG */
public class C90663a extends C90666d {

    /* renamed from: i */
    public int f253544i;

    public C90663a(Context context) {
        super(context);
    }

    /* renamed from: A */
    public final void mo84960A() {
        int x = this.f253544i + mo82635x();
        if (this.f253549l.bottomMargin != x) {
            this.f253549l.bottomMargin = x;
            this.f253548k.setLayoutParams(this.f253549l);
        }
    }

    /* renamed from: a */
    public final void mo5487a(View view) {
        if (view == this.f253548k) {
            Iterator it = this.f253552o.iterator();
            if (it.hasNext()) {
                C90664b bVar = (C90664b) it.next();
                throw null;
            }
        }
        if (view == this.f253548k) {
            mo5464m(1);
        }
    }

    /* renamed from: b */
    public final void mo5488b(View view) {
        if (view == this.f253548k) {
            Iterator it = this.f253552o.iterator();
            if (it.hasNext()) {
                C90664b bVar = (C90664b) it.next();
                throw null;
            }
        }
        if (view == this.f253548k) {
            mo5464m(2);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getY() > ((float) (getHeight() - this.f253549l.bottomMargin))) {
            return false;
        }
        return onInterceptTouchEvent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo82635x() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo84961z(Context context) {
        List list;
        this.f253548k = new FrameLayout(context);
        this.f253549l = new C2180i((byte[]) null);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f253554q = ViewConfiguration.get(context).getScaledTouchSlop();
        float dimensionPixelOffset = (float) context.getResources().getDimensionPixelOffset(R.dimen.drawer_edge_size);
        this.f253550m = dimensionPixelOffset;
        this.f253551n = dimensionPixelOffset + dimensionPixelOffset;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.drawer_min_padding_offset);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.drawer_max_width);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.drawer_right_padding);
        C91115n.m148873e(this.f253549l, 0, 0, dimensionPixelOffset3 - dimensionPixelOffset2, 0);
        if (displayMetrics.widthPixels > dimensionPixelOffset3 + dimensionPixelSize) {
            this.f253549l.width = dimensionPixelSize;
        }
        this.f253548k.setLayoutParams(this.f253549l);
        this.f253548k.setBackgroundResource(R.color.qp_drawer_background);
        this.f253548k.setOnTouchListener(new C90665c());
        C2179h hVar = this.f6157c;
        if (!(hVar == null || (list = this.f6158d) == null)) {
            list.remove(hVar);
        }
        if (this.f6158d == null) {
            this.f6158d = new ArrayList();
        }
        this.f6158d.add(this);
        this.f6157c = this;
        FrameLayout frameLayout = this.f253548k;
        frameLayout.getClass();
        frameLayout.setFitsSystemWindows(true);
    }

    public C90663a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C90663a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
