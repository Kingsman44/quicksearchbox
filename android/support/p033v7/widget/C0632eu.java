package android.support.p033v7.widget;

import android.content.Context;
import android.support.p033v7.view.C0442j;
import android.support.p033v7.view.menu.C0450ad;
import android.support.p033v7.view.menu.C0477q;
import android.view.MenuInflater;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3376a.C43534b;

/* renamed from: android.support.v7.widget.eu */
/* compiled from: PG */
public final class C0632eu {

    /* renamed from: a */
    public final C0477q f2394a;

    /* renamed from: b */
    public final C0450ad f2395b;

    /* renamed from: c */
    public C0631et f2396c;

    /* renamed from: d */
    public C43534b f2397d;

    /* renamed from: e */
    private final Context f2398e;

    public C0632eu(Context context, View view, int i) {
        this.f2398e = context;
        C0477q qVar = new C0477q(context);
        this.f2394a = qVar;
        qVar.f1651b = new C0629er(this);
        C0450ad adVar = new C0450ad(context, qVar, view, false, R.attr.popupMenuStyle);
        this.f2395b = adVar;
        adVar.f1554b = i;
        adVar.f1555c = new C0630es(this);
    }

    /* renamed from: a */
    public final MenuInflater mo2856a() {
        return new C0442j(this.f2398e);
    }
}
