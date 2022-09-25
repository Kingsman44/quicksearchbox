package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.ChipsCarousel;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bl */
/* compiled from: PG */
public final /* synthetic */ class C81760bl implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81807z f223617a;

    public /* synthetic */ C81760bl(C81807z zVar) {
        this.f223617a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81807z zVar = this.f223617a;
        C81806y yVar = (C81806y) obj;
        zVar.f223742a.f223564q.setPadding(0, yVar.mo75275j(), 0, 0);
        zVar.f223742a.f223564q.mo75249c(true);
        C81775c cVar = zVar.f223742a.f223561n;
        cVar.setPadding(cVar.getPaddingLeft(), yVar.mo75266c(), zVar.f223742a.f223561n.getPaddingRight(), zVar.f223742a.f223561n.getPaddingBottom());
        zVar.f223742a.f223552e.setPadding(0, 0, 0, yVar.mo75271g());
        zVar.f223742a.f223551d.setMinimumHeight(yVar.mo75272h());
        int m = yVar.mo75278m();
        int i = m - 1;
        if (m != 0) {
            if (i == 0) {
                TranscriptionViewContainer transcriptionViewContainer = zVar.f223742a.f223557j;
                int i2 = transcriptionViewContainer.f223527d;
                transcriptionViewContainer.setPadding(0, i2, 0, i2);
            } else if (i == 1) {
                TranscriptionViewContainer transcriptionViewContainer2 = zVar.f223742a.f223557j;
                transcriptionViewContainer2.setPadding(0, transcriptionViewContainer2.f223528e, 0, 0);
            } else if (i == 2) {
                TranscriptionViewContainer transcriptionViewContainer3 = zVar.f223742a.f223557j;
                transcriptionViewContainer3.setPadding(0, transcriptionViewContainer3.f223530g, 0, 0);
            } else if (i == 3) {
                TranscriptionViewContainer transcriptionViewContainer4 = zVar.f223742a.f223557j;
                transcriptionViewContainer4.setPadding(0, transcriptionViewContainer4.f223529f, 0, 0);
            }
            zVar.f223742a.f223548a.mo4829H(yVar.mo75268e());
            zVar.f223742a.f223549b.setMinimumHeight(yVar.mo75265b());
            ChipsCarousel chipsCarousel = zVar.f223742a.f223559l;
            chipsCarousel.setPadding(chipsCarousel.getPaddingLeft(), yVar.mo75267d(), chipsCarousel.getPaddingRight(), chipsCarousel.getPaddingBottom());
            ChipsCarousel chipsCarousel2 = zVar.f223742a.f223563p;
            int a = yVar.mo75264a();
            ViewGroup.LayoutParams layoutParams = chipsCarousel2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.topMargin != a) {
                    marginLayoutParams.topMargin = a;
                    chipsCarousel2.requestLayout();
                }
            }
            SingleTrySayingView singleTrySayingView = zVar.f223742a.f223555h;
            int i3 = yVar.mo75274i();
            int i4 = singleTrySayingView.f223507e;
            singleTrySayingView.setPadding(i4, i3, i4, singleTrySayingView.getPaddingBottom());
            SingleGreetingView singleGreetingView = zVar.f223742a.f223560m;
            int f = yVar.mo75270f();
            int i5 = singleGreetingView.f223498c;
            singleGreetingView.setPadding(i5, f, i5, singleGreetingView.getPaddingBottom());
            int l = yVar.mo75277l();
            int i6 = l - 1;
            if (l != 0) {
                if (i6 == 0) {
                    zVar.f223742a.f223560m.mo75253c(true);
                    zVar.f223742a.f223560m.mo75252b(false);
                } else if (i6 == 1) {
                    zVar.f223742a.f223560m.mo75253c(false);
                    zVar.f223742a.f223560m.mo75252b(true);
                }
                Collection.EL.stream(zVar.f223742a.f223565r).forEach(new C81804w(yVar));
                Collection.EL.stream(zVar.f223742a.f223566s).forEach(new C81805x(yVar));
                return;
            }
            throw null;
        }
        throw null;
    }
}
