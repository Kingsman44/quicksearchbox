package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110186h;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110400d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110421h;
import com.google.android.apps.gsa.staticplugins.opa.util.C113867cv;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.l */
/* compiled from: PG */
public final class C110415l {

    /* renamed from: a */
    public static final C59071e f307749a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.l");

    /* renamed from: b */
    public final Activity f307750b;

    /* renamed from: c */
    public final Context f307751c;

    /* renamed from: d */
    public final C113867cv f307752d;

    /* renamed from: e */
    public final LinearLayout f307753e;

    /* renamed from: f */
    public final int f307754f;

    /* renamed from: g */
    public final int f307755g;

    /* renamed from: h */
    public final int f307756h;

    /* renamed from: i */
    public final int f307757i;

    /* renamed from: j */
    public final List f307758j = new ArrayList();

    /* renamed from: k */
    private final C110421h f307759k;

    /* renamed from: l */
    private final C110186h f307760l;

    /* renamed from: m */
    private final View f307761m;

    public C110415l(Activity activity, Context context, C2391v vVar, C86124t tVar, C113867cv cvVar, C110400d dVar, C110421h hVar, C110186h hVar2, LinearLayout linearLayout, View view, int i) {
        C28292j a;
        this.f307750b = activity;
        this.f307751c = context;
        this.f307752d = cvVar;
        this.f307759k = hVar;
        this.f307760l = hVar2;
        this.f307753e = linearLayout;
        linearLayout.setOnClickListener(new C89943l(new C110412i(dVar, context)));
        this.f307761m = view;
        this.f307757i = i;
        this.f307754f = m183878d(R.dimen.notification_icon_size);
        this.f307755g = m183878d(R.dimen.notification_icon_right_margin);
        this.f307756h = (int) tVar.mo79743a(C90014bt.f247804o);
        hVar2.mo5704e(vVar, new C110413j(this));
        View[] viewArr = {linearLayout, view};
        for (int i2 = 0; i2 < 2; i2++) {
            View view2 = viewArr[i2];
            if (!(view2 == null || (a = C28295m.m52915a(view2)) == null)) {
                this.f307758j.add(C28293k.m52908e(a, new C28293k[0]));
            }
        }
    }

    /* renamed from: a */
    public static void m183876a(View view) {
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
            if (C28295m.m52915a(view) != null) {
                C89949q.m146521e(C28285c.m52881h(3, C28295m.m52916b(view), (View) null), false);
            }
        }
    }

    /* renamed from: c */
    public static void m183877c(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            if (C28295m.m52915a(view) != null) {
                C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(view), (View) null), false);
            }
        }
    }

    /* renamed from: d */
    private final int m183878d(int i) {
        return (int) this.f307750b.getResources().getDimension(i);
    }

    /* renamed from: b */
    public final void mo98651b() {
        Account a;
        if (C36619a.m65148d(this.f307759k.f307773a)) {
            m183877c(this.f307753e);
        } else {
            this.f307760l.mo98461b();
            m183876a(this.f307753e);
        }
        if (this.f307761m != null) {
            C110421h hVar = this.f307759k;
            if (hVar.f307774b.mo79746e(C90014bt.f247841q) && !C36619a.m65148d(hVar.f307773a) && (a = hVar.f307775c.a()) != null && !hVar.f307776d.f(a.name) && !hVar.mo98658d()) {
                C83395k.m132733d(this.f307751c);
                View view = this.f307761m;
                view.getClass();
                view.setOnClickListener(new C89943l(new C110414k(this)));
                View view2 = this.f307761m;
                view2.getClass();
                m183877c(view2);
                return;
            }
            View view3 = this.f307761m;
            view3.getClass();
            m183876a(view3);
        }
    }
}
