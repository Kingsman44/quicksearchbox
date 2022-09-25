package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.widget.ScrollView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.ag */
/* compiled from: PG */
public final class C83982ag {

    /* renamed from: c */
    private static final C59071e f228775c = C59071e.m91332i("com.google.android.apps.gsa.opaonboarding.ui.ag");

    /* renamed from: a */
    public final ScrollView f228776a;

    /* renamed from: b */
    public boolean f228777b;

    /* renamed from: d */
    private final OpaPageLayout f228778d;

    /* renamed from: e */
    private final C83981af f228779e;

    /* renamed from: f */
    private final int f228780f;

    public C83982ag(OpaPageLayout opaPageLayout, C83981af afVar, int i) {
        this.f228778d = opaPageLayout;
        this.f228779e = afVar;
        this.f228780f = i;
        this.f228776a = opaPageLayout.f228727b;
    }

    /* renamed from: a */
    public final void mo77412a() {
        C84012g a = this.f228778d.mo77369a();
        int i = this.f228780f;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                a.mo77475d(1);
                C84010e e = C84011f.m133882e();
                e.mo77375c(this.f228778d.getContext().getString(R.string.onboarding_action_scroll_down));
                ((C83958a) e).f228734b = new C83977ab(this);
                a.mo77472a(e.mo77373a());
            } else if (i2 == 1) {
                a.mo77475d(5);
                a.mo77474c(new C89943l(new C83978ac(this)));
            }
            this.f228776a.getViewTreeObserver().addOnScrollChangedListener(new C83979ad(this));
            this.f228776a.getViewTreeObserver().addOnGlobalLayoutListener(new C83980ae(this));
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77413b() {
        if (!this.f228777b && this.f228778d.f228728c.getBottom() <= this.f228776a.getBottom() + this.f228776a.getScrollY()) {
            ((C59052c) ((C59052c) f228775c.mo56224b()).mo56372aa(6919)).mo56386p("onScrolledToBottom");
            this.f228777b = true;
            this.f228779e.mo77411a();
        }
    }

    /* renamed from: c */
    public final void mo77414c() {
        this.f228776a.pageScroll(130);
    }
}
