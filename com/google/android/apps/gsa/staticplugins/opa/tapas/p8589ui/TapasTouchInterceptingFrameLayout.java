package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.TapasTouchInterceptingFrameLayout */
/* compiled from: PG */
public class TapasTouchInterceptingFrameLayout extends TouchInterceptingFrameLayout {

    /* renamed from: c */
    public C68214a f314286c;

    /* renamed from: d */
    public C38802e f314287d;

    /* renamed from: e */
    private boolean f314288e = false;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.TapasTouchInterceptingFrameLayout$a */
    /* compiled from: PG */
    public interface C113517a {
        /* renamed from: qO */
        void mo100255qO(TapasTouchInterceptingFrameLayout tapasTouchInterceptingFrameLayout);
    }

    public TapasTouchInterceptingFrameLayout(Context context) {
        super(context);
        mo100253a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo100253a() {
        ((C113517a) C47266f.m84076a(getContext(), C113517a.class)).mo100255qO(this);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f314288e) {
            if (((C58833ax) this.f314286c.mo27525b()).mo56113h()) {
                ((C89922b) ((C58833ax) this.f314286c.mo27525b()).mo56107c()).mo83757a();
            }
            this.f314287d.mo41633g();
            this.f314288e = true;
        }
    }

    public TapasTouchInterceptingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo100253a();
    }

    public TapasTouchInterceptingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo100253a();
    }
}
