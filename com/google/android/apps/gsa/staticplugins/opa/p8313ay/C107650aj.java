package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.assistant.shared.p.m;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73899g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.C108797ea;
import com.google.android.apps.gsa.staticplugins.opa.C109040fj;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113982a;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.aj */
/* compiled from: PG */
final class C107650aj implements C73899g {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299482a;

    public C107650aj(C107656ap apVar) {
        this.f299482a = apVar;
    }

    /* renamed from: a */
    public final void mo65407a() {
        ((C113982a) this.f299482a.f299591n.mo27525b()).mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_OTHER);
    }

    /* renamed from: b */
    public final void mo65408b(e eVar) {
        m l = this.f299482a.mo96183l();
        if (l != null) {
            C107656ap apVar = this.f299482a;
            View view = apVar.f299603z;
            if (!(view == null || apVar.f299512U == null)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                apVar.f299512U.setVisibility(8);
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.setMarginStart(0);
                View view2 = apVar.f299603z;
                view2.getClass();
                view2.setLayoutParams(marginLayoutParams);
                if (apVar.f299512U.getParent() != null) {
                    View view3 = apVar.f299603z;
                    view3.getClass();
                    ((View) apVar.f299512U.getParent()).setBackground(view3.getBackground());
                }
            }
            l.h(eVar);
        }
        this.f299482a.mo96106E();
    }

    /* renamed from: c */
    public final void mo65409c() {
        m l = this.f299482a.mo96183l();
        if (l != null) {
            C107656ap apVar = this.f299482a;
            int length = C107656ap.f299491b.length;
            if (length > 0) {
                apVar.mo96184m().setHint(C107656ap.f299491b[new Random().nextInt(length)]);
            }
            C107656ap apVar2 = this.f299482a;
            if (apVar2.f299512U != null && apVar2.mo96132aE()) {
                ImageView imageView = apVar2.f299512U;
                imageView.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.height = apVar2.mo96179g();
                marginLayoutParams.width = apVar2.mo96179g();
                marginLayoutParams.setMarginStart(apVar2.mo96178f());
            }
            View view = apVar2.f299603z;
            if (!(view == null || apVar2.f299512U == null)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                apVar2.f299512U.setVisibility(0);
                View view2 = apVar2.f299603z;
                view2.getClass();
                Drawable background = view2.getBackground();
                apVar2.f299512U.setBackground(background);
                if (apVar2.f299512U.getParent() != null) {
                    ((View) apVar2.f299512U.getParent()).setBackground(background);
                }
                int f = apVar2.mo96178f() + apVar2.mo96179g();
                marginLayoutParams2.leftMargin = f;
                marginLayoutParams2.setMarginStart(f);
                View view3 = apVar2.f299603z;
                view3.getClass();
                view3.setLayoutParams(marginLayoutParams2);
            }
            C107658ar arVar = this.f299482a.f299595r;
            if (arVar != null) {
                C109040fj fjVar = ((C108797ea) arVar).f302536a;
                fjVar.f303238X.mo96190r(fjVar.f303449n);
            }
            l.v(this.f299482a.mo96184m().getText().toString());
            l.r();
        }
    }
}
