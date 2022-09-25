package com.google.android.apps.gsa.staticplugins.opa.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.C2332ag;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bi */
/* compiled from: PG */
public final class C113793bi {

    /* renamed from: a */
    public static final C59071e f315153a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.bi");

    /* renamed from: g */
    private static final PathInterpolator f315154g = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: h */
    private static final C91107f f315155h = new C91107f(0.4f, 0.0f, 0.0f, 1.0f);

    /* renamed from: b */
    public final Activity f315156b;

    /* renamed from: c */
    public final C2332ag f315157c;

    /* renamed from: d */
    public int f315158d;

    /* renamed from: e */
    C60870cx f315159e;

    /* renamed from: f */
    public boolean f315160f = false;

    /* renamed from: i */
    private final C86124t f315161i;

    /* renamed from: j */
    private final C22871g f315162j;

    /* renamed from: k */
    private final C81517a f315163k;

    /* renamed from: l */
    private final int f315164l;

    /* renamed from: m */
    private Integer f315165m = null;

    public C113793bi(Activity activity, int i, C86124t tVar, C22871g gVar, C81517a aVar) {
        C113792bh bhVar;
        this.f315156b = activity;
        this.f315158d = i;
        this.f315161i = tVar;
        this.f315162j = gVar;
        if (i != 0) {
            bhVar = C113792bh.HIDDEN;
        } else {
            bhVar = C113792bh.SHOWN;
        }
        this.f315157c = new C2332ag(bhVar);
        this.f315163k = aVar;
        this.f315164l = (int) tVar.mo79743a(C90029ch.f248228aO);
    }

    /* renamed from: g */
    private final boolean m188372g() {
        return (this.f315163k.mo75125b() == 2 || this.f315161i.mo79746e(C90029ch.f248283bq)) && this.f315156b.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: a */
    public final void mo100641a(boolean z) {
        this.f315165m = Integer.valueOf(this.f315156b.getWindow().getDecorView().getSystemUiVisibility());
        this.f315156b.getWindow().getDecorView().setSystemUiVisibility(true != z ? 514 : 4610);
    }

    /* renamed from: b */
    public final void mo100642b(View view) {
        if (this.f315158d != 0) {
            ((C59052c) ((C59052c) f315153a.mo56224b()).mo56372aa(28432)).mo56386p("Hiding Opa content");
            float f = this.f315156b.getWindow().getAttributes().dimAmount;
            this.f315156b.getWindow().setDimAmount(0.0f);
            view.setVisibility(8);
            if (this.f315158d == 1) {
                mo100641a(false);
            }
            C60870cx cxVar = this.f315159e;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f315159e = null;
            }
            this.f315157c.mo5708l(C113792bh.HIDDEN);
        }
    }

    /* renamed from: c */
    public final void mo100643c(View view, boolean z) {
        int i;
        if (view.getVisibility() == 8) {
            ((C59052c) ((C59052c) f315153a.mo56224b()).mo56372aa(28434)).mo56386p("Showing Opa content");
            if (z) {
                i = 0;
            } else {
                i = (int) this.f315161i.mo79743a(C90014bt.f247450hQ);
            }
            if (i == 0) {
                mo100644d(view, z);
            } else if (this.f315159e == null) {
                this.f315159e = this.f315162j.mo28208h("restoreOpaActivityContent", (long) i, new C113789be(this, view, z));
            }
        }
    }

    /* renamed from: d */
    public final void mo100644d(View view, boolean z) {
        int i;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (view.getVisibility() == 8) {
            ((C59052c) ((C59052c) f315153a.mo56224b()).mo56372aa(28436)).mo56386p("#restoreOpaActivityContent");
            view.setVisibility(0);
            if (z) {
                i = 0;
            } else {
                i = (int) this.f315161i.mo79743a(C90014bt.f247521ii);
            }
            if (i == 0) {
                mo100646f();
            } else {
                if (!m188372g()) {
                    view.setTranslationY(((float) this.f315156b.getResources().getDisplayMetrics().heightPixels) * 0.9f);
                }
                view.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                if (m188372g()) {
                    animatorSet.setStartDelay(150);
                    objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) this.f315164l, 0.0f}).setDuration(500);
                    objectAnimator.setInterpolator(f315155h);
                    objectAnimator2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.2f, 1.0f}).setDuration(500);
                } else {
                    long j = (long) i;
                    objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f}).setDuration(j);
                    objectAnimator.setInterpolator(f315154g);
                    objectAnimator2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f}).setDuration(j);
                }
                animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
                animatorSet.addListener(new C113790bf(this, view));
                animatorSet.start();
            }
            this.f315159e = null;
        }
    }

    /* renamed from: e */
    public final void mo100645e() {
        if (this.f315165m != null) {
            this.f315156b.getWindow().getDecorView().setSystemUiVisibility(this.f315165m.intValue());
        }
        this.f315165m = null;
    }

    /* renamed from: f */
    public final void mo100646f() {
        mo100645e();
        TypedValue typedValue = new TypedValue();
        this.f315156b.getResources().getValue(R.integer.opa_background_dim_amount, typedValue, true);
        this.f315156b.getWindow().setDimAmount(typedValue.getFloat());
        this.f315157c.mo5708l(C113792bh.SHOWN);
    }
}
