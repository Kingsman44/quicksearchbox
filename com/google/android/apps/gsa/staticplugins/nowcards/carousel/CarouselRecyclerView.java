package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.WrapContentHeightLinearLayoutManager;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class CarouselRecyclerView extends RecyclerView {

    /* renamed from: a */
    public WrapContentHeightLinearLayoutManager f290463a;

    /* renamed from: b */
    public C104407r f290464b;

    /* renamed from: c */
    public final List f290465c;

    /* renamed from: d */
    public boolean f290466d;

    /* renamed from: e */
    public C104412w f290467e;

    /* renamed from: f */
    public C104408s f290468f;

    public CarouselRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo94143a(boolean z) {
        this.f290466d = z;
        setTag(R.id.is_scrollable, Boolean.valueOf(z));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C104408s sVar = this.f290468f;
        if (sVar != null) {
            sVar.mo94149a(motionEvent);
        }
        if (this.f290466d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void onScrolled$ar$ds(int i) {
        C104412w wVar = this.f290467e;
        if (wVar != null) {
            wVar.mo94153L(i);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C104408s sVar = this.f290468f;
        if (sVar != null) {
            sVar.mo94149a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public CarouselRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f290465c = new ArrayList();
        this.f290466d = true;
    }
}
