package com.google.android.apps.gsa.staticplugins.opa.imageviewer;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107138e;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.imageviewer.g */
/* compiled from: PG */
public final class C109285g {

    /* renamed from: a */
    public final Context f304425a;

    /* renamed from: b */
    public final C108230ba f304426b;

    /* renamed from: c */
    public final C91189au f304427c;

    /* renamed from: d */
    public final C22871g f304428d;

    /* renamed from: e */
    public final ViewStub f304429e;

    /* renamed from: f */
    public View f304430f;

    /* renamed from: g */
    public ViewPager f304431g;

    /* renamed from: h */
    public boolean f304432h;

    /* renamed from: i */
    public Runnable f304433i;

    /* renamed from: j */
    public final C107129a f304434j;

    public C109285g(C108230ba baVar, ViewStub viewStub, C91189au auVar, C22871g gVar, Context context, C107129a aVar) {
        this.f304425a = context;
        this.f304426b = baVar;
        this.f304427c = auVar;
        this.f304429e = viewStub;
        this.f304428d = gVar;
        this.f304434j = aVar;
    }

    /* renamed from: a */
    public final boolean mo97744a() {
        if (!this.f304432h) {
            return false;
        }
        View view = this.f304430f;
        view.getClass();
        view.animate().setDuration(250).alpha(0.0f).setListener(new C109284f(this)).start();
        this.f304432h = false;
        Runnable runnable = this.f304433i;
        if (runnable == null) {
            return true;
        }
        ((C107138e) runnable).f298216a.mo95805k();
        return true;
    }
}
