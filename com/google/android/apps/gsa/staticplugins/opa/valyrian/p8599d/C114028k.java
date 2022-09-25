package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113715c;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113716d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113994cd;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113995ce;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114150t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.k */
/* compiled from: PG */
final class C114028k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public int f315681a = 0;

    /* renamed from: b */
    public ValueAnimator f315682b;

    /* renamed from: c */
    public final float f315683c;

    /* renamed from: d */
    final /* synthetic */ C86124t f315684d;

    /* renamed from: e */
    final /* synthetic */ View f315685e;

    /* renamed from: f */
    final /* synthetic */ C113715c f315686f;

    /* renamed from: g */
    final /* synthetic */ C113716d f315687g;

    /* renamed from: h */
    final /* synthetic */ C21370a f315688h;

    /* renamed from: i */
    final /* synthetic */ C22871g f315689i;

    /* renamed from: j */
    final /* synthetic */ View f315690j;

    /* renamed from: k */
    private long f315691k = 0;

    /* renamed from: l */
    private final int f315692l;

    /* renamed from: m */
    private boolean f315693m;

    public C114028k(C86124t tVar, View view, C113715c cVar, C113716d dVar, C21370a aVar, C22871g gVar, View view2) {
        this.f315684d = tVar;
        this.f315685e = view;
        this.f315686f = cVar;
        this.f315687g = dVar;
        this.f315688h = aVar;
        this.f315689i = gVar;
        this.f315690j = view2;
        this.f315692l = (int) tVar.mo79743a(C90014bt.f247720mV);
        this.f315683c = C91115n.m148870b(300.0f, view.getContext());
        this.f315693m = true;
    }

    /* renamed from: a */
    public final void mo100942a() {
        this.f315685e.getLayoutParams().height = -2;
        this.f315685e.requestLayout();
        this.f315682b = null;
        this.f315681a = this.f315685e.getHeight();
        this.f315691k = this.f315688h.mo26870b();
    }

    public final boolean onPreDraw() {
        TextView textView;
        Duration duration = C114034q.f315713a;
        this.f315685e.getHeight();
        C113995ce ceVar = (C113995ce) this.f315686f;
        C114071eg egVar = ceVar.f315635a;
        C114150t tVar = egVar.f315848af;
        if (tVar != null && tVar.mo101199i()) {
            this.f315681a = this.f315685e.getHeight();
            return true;
        } else if (egVar.f315982r.mo79746e(C90063do.f249383cW) && ((C113197da) ceVar.f315635a.f315893bc.mo27525b()).mo99910a()) {
            this.f315681a = this.f315685e.getHeight();
            return true;
        } else if (Math.abs(this.f315685e.getHeight() - this.f315681a) <= 2 || this.f315682b != null || ((textView = ((C113994cd) this.f315687g).f315634a.f315791A) != null && textView.isShown())) {
            return true;
        } else {
            int height = this.f315685e.getHeight();
            if (Math.abs(this.f315688h.mo26870b() - this.f315691k) < 100) {
                this.f315691k = this.f315688h.mo26870b();
                this.f315681a = height;
                return true;
            } else if (this.f315693m) {
                this.f315693m = false;
                this.f315681a = this.f315685e.getHeight();
                return true;
            } else {
                this.f315685e.getLayoutParams().height = this.f315681a;
                this.f315685e.requestLayout();
                this.f315689i.mo28208h("start animation", (long) this.f315692l, new C114025h(this));
                return false;
            }
        }
    }
}
