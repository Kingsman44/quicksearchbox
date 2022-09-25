package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0669gd;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.p329g.p331b.C6317s;
import com.facebook.litho.widget.C6497db;
import com.facebook.litho.widget.C6498dc;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.e.a.f */
/* compiled from: PG */
final class C20974f implements View.OnAttachStateChangeListener, C0657fs {

    /* renamed from: a */
    public final RecyclerView f58790a;

    /* renamed from: b */
    public C20973e f58791b;

    /* renamed from: c */
    public C20971c f58792c;

    /* renamed from: d */
    private final C6317s f58793d;

    /* renamed from: e */
    private boolean f58794e = false;

    public C20974f(RecyclerView recyclerView, C6317s sVar) {
        this.f58790a = recyclerView;
        this.f58793d = sVar;
    }

    /* renamed from: a */
    public final int mo26084a() {
        C0640fb fbVar = this.f58790a.mAdapter;
        if (fbVar != null) {
            return fbVar.getItemCount();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo26085b(int i, boolean z) {
        C0653fo foVar;
        RecyclerView recyclerView = this.f58790a;
        if (recyclerView.mIsAttached) {
            int i2 = 1;
            if (!this.f58794e) {
                recyclerView.mOnItemTouchListeners.add(this);
                this.f58790a.addOnAttachStateChangeListener(this);
                this.f58794e = true;
            }
            C6317s sVar = this.f58793d;
            if (sVar != null) {
                RecyclerView a = sVar.mo13573a();
                if (a != null && (foVar = a.mLayout) != null && !a.isLayoutSuppressed()) {
                    if (z) {
                        Context context = a.getContext();
                        int i3 = sVar.f18689a;
                        if (i3 == -1) {
                            i2 = 6;
                        } else if (i3 != 1) {
                            if (i3 != Integer.MAX_VALUE) {
                                switch (i3) {
                                    case 2147483646:
                                        break;
                                    default:
                                        i2 = 2;
                                        break;
                                }
                            }
                        } else {
                            i2 = 8;
                        }
                        C0669gd b = C6498dc.m17608b(context, 0, i2);
                        b.f2449g = i;
                        foVar.startSmoothScroll(b);
                    } else if (sVar.f18689a == -1) {
                        C6497db dbVar = sVar.f19252b;
                        if (dbVar != null) {
                            C0653fo foVar2 = dbVar.f19266p.mLayout;
                            if (!(foVar2 instanceof LinearLayoutManager)) {
                                sVar.mo13575c(i);
                            } else {
                                ((LinearLayoutManager) foVar2).scrollToPositionWithOffset(i, 0);
                            }
                        }
                    } else {
                        sVar.mo13575c(i);
                    }
                }
            } else if (z) {
                this.f58790a.smoothScrollToPosition(i);
            } else {
                this.f58790a.scrollToPosition(i);
            }
        }
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        C20971c cVar = this.f58792c;
        if (cVar == null || !cVar.f58783d.get()) {
            return false;
        }
        cVar.mo26082a();
        return false;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent$ar$ds(MotionEvent motionEvent) {
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        C20973e eVar = this.f58791b;
        if (eVar != null) {
            C20971c cVar = eVar.f58788a;
            RecyclerView recyclerView = eVar.f58789b;
            Map map = C20975g.f58795a;
            cVar.mo26082a();
            C20975g.f58796b.remove(recyclerView);
        }
        this.f58790a.removeOnItemTouchListener(this);
        this.f58790a.removeOnAttachStateChangeListener(this);
        this.f58794e = false;
    }
}
