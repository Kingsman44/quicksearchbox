package com.google.android.libraries.lens.view.filters.carousel;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.k */
/* compiled from: PG */
final class C25955k extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C25961q f70542a;

    public C25955k(C25961q qVar) {
        this.f70542a = qVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C25961q qVar = this.f70542a;
        int i6 = qVar.f70558k;
        if (i6 >= 0) {
            View findViewByPosition = qVar.mo31143e().findViewByPosition(i6);
            if (findViewByPosition == null) {
                ((C59052c) ((C59052c) C25961q.f70548a.mo56225c()).mo56372aa(49360)).mo56387q("View for position %s was still null after scrolling", i6);
            } else {
                this.f70542a.mo31145g(findViewByPosition);
            }
            this.f70542a.f70558k = -1;
        } else if (i != 0) {
            if (qVar.mo31153o()) {
                qVar.mo31151m(qVar.f70560m);
                return;
            }
            int c = qVar.mo31141c();
            C25961q qVar2 = this.f70542a;
            qVar2.mo31150l(c);
            qVar2.mo31144f(c, true);
            this.f70542a.mo31152n(c);
            FilterTooltip filterTooltip = this.f70542a.f70551d;
            if (filterTooltip != null) {
                C25967w a = filterTooltip.mo17754z();
                a.f70581h += i;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.f70575b.getLayoutParams();
                if (a.f70580g) {
                    int i7 = a.f70582i;
                    int i8 = a.f70584k;
                    if (i7 > i8) {
                        i5 = (i7 - i8) - a.f70581h;
                    } else {
                        i5 = -a.f70581h;
                    }
                    i3 = Math.min(marginLayoutParams.rightMargin, i5);
                } else {
                    int i9 = a.f70583j;
                    if (i9 < 0) {
                        i4 = i9 - a.f70581h;
                    } else {
                        i4 = -a.f70581h;
                    }
                    i3 = Math.max(-marginLayoutParams.leftMargin, i4);
                }
                a.f70575b.setTranslationX((float) i3);
            }
            this.f70542a.f70553f.invalidate();
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C25961q qVar = this.f70542a;
        if (!qVar.mo31153o()) {
            C25960p pVar = qVar.f70557j;
            if (i == 1) {
                if (pVar != null) {
                    pVar.mo31137b();
                }
            } else if (i == 0) {
                if (pVar != null) {
                    pVar.mo31136a();
                }
                int c = this.f70542a.mo31141c();
                C25961q qVar2 = this.f70542a;
                qVar2.mo31150l(c);
                qVar2.mo31144f(c, false);
                this.f70542a.mo31147i(c);
            }
        }
    }
}
