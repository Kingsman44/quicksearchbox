package com.google.android.setupdesign.view;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.setupdesign.view.c */
/* compiled from: PG */
public final class C45323c extends C0640fb {

    /* renamed from: a */
    public View f118445a;

    /* renamed from: b */
    private final C0640fb f118446b;

    /* renamed from: c */
    private final C0642fd f118447c;

    public C45323c(C0640fb fbVar) {
        C45322b bVar = new C45322b(this);
        this.f118447c = bVar;
        this.f118446b = fbVar;
        fbVar.mObservable.registerObserver(bVar);
        setHasStableIds(fbVar.mHasStableIds);
    }

    public final int getItemCount() {
        int itemCount = this.f118446b.getItemCount();
        return this.f118445a != null ? itemCount + 1 : itemCount;
    }

    public final long getItemId(int i) {
        if (this.f118445a != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.f118446b.getItemId(i);
    }

    public final int getItemViewType(int i) {
        if (this.f118445a != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.f118446b.getItemViewType(i);
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        View view = this.f118445a;
        if (view != null) {
            i--;
        }
        if (!(ghVar instanceof C45324d)) {
            this.f118446b.onBindViewHolder(ghVar, i);
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.f118445a.getParent()).removeView(this.f118445a);
            }
            ((FrameLayout) ghVar.itemView).addView(this.f118445a);
        } else {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.f118446b.onCreateViewHolder(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new C45324d(frameLayout);
    }
}
