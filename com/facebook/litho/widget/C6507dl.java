package com.facebook.litho.widget;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.C6106aq;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: com.facebook.litho.widget.dl */
/* compiled from: PG */
final class C6507dl extends C0658ft {

    /* renamed from: a */
    public C6497db f19290a;

    /* renamed from: b */
    public C0653fo f19291b;

    /* renamed from: c */
    private final C6417ac f19292c;

    /* renamed from: d */
    private View f19293d;

    /* renamed from: e */
    private int f19294e = -1;

    public C6507dl(C6417ac acVar) {
        this.f19292c = acVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int c = ((C6474cf) this.f19292c).f19210c.mo13481c();
        if (c != -1) {
            int i3 = c;
            while (true) {
                if (i3 < 0) {
                    i3 = -1;
                    break;
                } else if (this.f19292c.mo13501k(i3)) {
                    break;
                } else {
                    i3--;
                }
            }
            ComponentTree j = this.f19292c.mo13500j(c);
            View view = this.f19293d;
            if (!(view == null || j == null || view == j.getLithoView())) {
                this.f19293d.setTranslationY(0.0f);
                this.f19293d = null;
            }
            if (i3 == -1 || j == null) {
                this.f19290a.mo13582q();
                this.f19294e = -1;
            } else if (c == i3) {
                LithoView lithoView = j.getLithoView();
                if (lithoView == null) {
                    C6106aq.m15891b(2, "StickyHeaderControllerImpl:FirstVisibleStickyHeaderNull", "First visible sticky header item is null, RV.hasPendingAdapterUpdates: " + this.f19290a.f19266p.hasPendingAdapterUpdates() + ", first visible component: " + j.mo12709e() + ", hasMounted: " + j.f17918u + ", isReleased: " + j.mo12723s());
                } else {
                    int i4 = i3 + 1;
                    if (!this.f19292c.mo13502l(i4) || !this.f19292c.mo13501k(i4)) {
                        lithoView.setTranslationY((float) (-lithoView.getTop()));
                    }
                }
                this.f19293d = lithoView;
                this.f19290a.mo13582q();
                this.f19294e = -1;
            } else {
                int i5 = 0;
                if (this.f19290a.f19265o.getVisibility() == 8 || i3 != this.f19294e) {
                    ComponentTree j2 = this.f19292c.mo13500j(i3);
                    LithoView lithoView2 = j2.getLithoView();
                    if (!(lithoView2 == null || lithoView2.getWindowToken() == null)) {
                        lithoView2.onStartTemporaryDetach();
                    }
                    C6497db dbVar = this.f19290a;
                    if (j2.getLithoView() != null) {
                        LithoView lithoView3 = j2.getLithoView();
                        lithoView3.f17944t = lithoView3.f17938n;
                    }
                    dbVar.f19265o.mo12729B(j2);
                    dbVar.mo13583r(dbVar.getWidth());
                    C6497db dbVar2 = this.f19290a;
                    dbVar2.f19265o.setVisibility(0);
                    dbVar2.f19265o.mo12649u();
                }
                int e = ((C6474cf) this.f19292c).f19210c.mo13483e();
                while (true) {
                    if (c > e) {
                        break;
                    } else if (this.f19292c.mo13501k(c)) {
                        i5 = Math.min((this.f19291b.findViewByPosition(c).getTop() - this.f19290a.f19265o.getBottom()) + this.f19290a.getPaddingTop(), 0);
                        break;
                    } else {
                        c++;
                    }
                }
                this.f19290a.f19265o.setTranslationY((float) i5);
                this.f19294e = i3;
            }
        }
    }
}
