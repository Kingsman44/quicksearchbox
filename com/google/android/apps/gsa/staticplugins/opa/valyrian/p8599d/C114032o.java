package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113715c;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113996cf;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113997cg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114150t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.o */
/* compiled from: PG */
final class C114032o implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public int f315697a = 0;

    /* renamed from: b */
    public ValueAnimator f315698b;

    /* renamed from: c */
    final /* synthetic */ C86124t f315699c;

    /* renamed from: d */
    final /* synthetic */ View f315700d;

    /* renamed from: e */
    final /* synthetic */ C113715c f315701e;

    /* renamed from: f */
    final /* synthetic */ C113716d f315702f;

    /* renamed from: g */
    final /* synthetic */ C21370a f315703g;

    /* renamed from: h */
    final /* synthetic */ C22871g f315704h;

    /* renamed from: i */
    final /* synthetic */ View f315705i;

    /* renamed from: j */
    final /* synthetic */ int f315706j;

    /* renamed from: k */
    private long f315707k = 0;

    /* renamed from: l */
    private final long f315708l;

    /* renamed from: m */
    private final int f315709m;

    /* renamed from: n */
    private boolean f315710n;

    public C114032o(C86124t tVar, View view, C113715c cVar, C113716d dVar, C21370a aVar, C22871g gVar, View view2, int i) {
        this.f315699c = tVar;
        this.f315700d = view;
        this.f315701e = cVar;
        this.f315702f = dVar;
        this.f315703g = aVar;
        this.f315704h = gVar;
        this.f315705i = view2;
        this.f315706j = i;
        this.f315708l = TimeUnit.SECONDS.toMillis(tVar.mo79743a(C90014bt.f247721mW));
        this.f315709m = (int) tVar.mo79743a(C90014bt.f247720mV);
        this.f315710n = true;
    }

    /* renamed from: a */
    public final void mo100946a() {
        this.f315700d.getLayoutParams().height = -2;
        this.f315700d.requestLayout();
        this.f315698b = null;
        this.f315697a = this.f315700d.getHeight();
        this.f315707k = this.f315703g.mo26870b();
    }

    public final boolean onPreDraw() {
        TextView textView;
        Duration duration = C114034q.f315713a;
        this.f315700d.getHeight();
        C113997cg cgVar = (C113997cg) this.f315701e;
        C114071eg egVar = cgVar.f315637a;
        C114150t tVar = egVar.f315848af;
        if (tVar != null && tVar.mo101199i()) {
            this.f315697a = this.f315700d.getHeight();
            return true;
        } else if (egVar.f315982r.mo79746e(C90063do.f249383cW) && ((C113197da) cgVar.f315637a.f315893bc.mo27525b()).mo99910a()) {
            this.f315697a = this.f315700d.getHeight();
            return true;
        } else if (Math.abs(this.f315700d.getHeight() - this.f315697a) <= 2 || this.f315698b != null || ((textView = ((C113996cf) this.f315702f).f315636a.f315791A) != null && textView.isShown())) {
            return true;
        } else {
            int height = this.f315700d.getHeight();
            if (Math.abs(this.f315703g.mo26870b() - this.f315707k) < this.f315708l) {
                this.f315707k = this.f315703g.mo26870b();
                this.f315697a = height;
                return true;
            } else if (this.f315710n) {
                this.f315710n = false;
                this.f315697a = this.f315700d.getHeight();
                return true;
            } else {
                this.f315700d.getLayoutParams().height = this.f315697a;
                this.f315700d.requestLayout();
                this.f315704h.mo28208h("start animation", (long) this.f315709m, new C114030m(this));
                return false;
            }
        }
    }
}
