package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.graphics.Paint;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30910aj;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bp */
/* compiled from: PG */
final class C30745bp implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C30746bq f82980a;

    public C30745bp(C30746bq bqVar) {
        this.f82980a = bqVar;
    }

    public final void onGlobalLayout() {
        boolean h = this.f82980a.mo36446h();
        C30746bq bqVar = this.f82980a;
        boolean z = false;
        if (bqVar.f82982d) {
            bqVar.mo36450m(false);
            if (h) {
                this.f82980a.mo36444a();
                this.f82980a.f82981c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        if (h || C30910aj.m57700a(bqVar.getContext())) {
            z = true;
        }
        this.f82980a.mo36450m(z);
        if (z) {
            this.f82980a.f82981c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C30746bq bqVar2 = this.f82980a;
            bqVar2.f82986h = true;
            bqVar2.mo36445g();
            bqVar2.f82981c.mo4475e(0.0f);
            bqVar2.f82984f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            MaterialCardView materialCardView = bqVar2.f82981c;
            C44779j jVar = new C44779j(new C44785p());
            jVar.mo48126X(Paint.Style.FILL);
            C30905ae.m57696b(jVar, bqVar2.f82983e.f82732a);
            C2043bi.m5530X(materialCardView, jVar);
            C1756o oVar = new C1756o();
            oVar.mo4890j(bqVar2.getContext(), R.layout.account_menu_popover_full_screen);
            oVar.mo4888h((ConstraintLayout) bqVar2.f82975a);
            ((ConstraintLayout) bqVar2.f82975a).setBackgroundColor(bqVar2.f82983e.f82732a);
            bqVar2.f82985g.setVisibility(8);
            bqVar2.f82981c.requestLayout();
        }
    }
}
