package com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bh.a.e */
/* compiled from: PG */
public final class C108070e implements C88522b {

    /* renamed from: a */
    public final Activity f300636a;

    /* renamed from: b */
    public final Application.ActivityLifecycleCallbacks f300637b;

    /* renamed from: c */
    public final ComponentCallbacks f300638c;

    /* renamed from: d */
    public ViewGroup f300639d;

    /* renamed from: e */
    public int f300640e;

    /* renamed from: f */
    private View f300641f;

    /* renamed from: g */
    private View f300642g;

    /* renamed from: h */
    private int f300643h;

    /* renamed from: i */
    private int f300644i;

    public C108070e(Activity activity) {
        this.f300636a = activity;
        C108068c cVar = new C108068c(this);
        this.f300637b = cVar;
        C108069d dVar = new C108069d(this);
        this.f300638c = dVar;
        this.f300643h = C1878d.m5128a(activity, R.color.chatui_scrim_background_opaque);
        this.f300644i = C1878d.m5128a(activity, R.color.chatui_status_bar_opaque_v2);
        this.f300640e = activity.getApplication().getResources().getConfiguration().orientation;
        Application application = activity.getApplication();
        application.registerActivityLifecycleCallbacks(cVar);
        application.registerComponentCallbacks(dVar);
    }

    /* renamed from: h */
    private final void m179428h(LayoutInflater layoutInflater) {
        C58838bb.m90884s(this.f300639d == null, "inflate has already been called");
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.tablet_decorator_view, (ViewGroup) null);
        this.f300639d = viewGroup;
        this.f300641f = viewGroup.findViewById(R.id.tablet_caption_bar);
        Window window = this.f300636a.getWindow();
        window.setStatusBarColor(0);
        window.setNavigationBarColor(-16777216);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility((decorView.getSystemUiVisibility() | 9472) & -17);
        DisplayMetrics displayMetrics = this.f300636a.getApplicationContext().getResources().getDisplayMetrics();
        this.f300636a.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        C2043bi.m5555ai(this.f300639d, new C108067b(this));
        this.f300639d.setBackgroundColor(this.f300643h);
        View childAt = this.f300639d.getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.width = min;
        childAt.setLayoutParams(layoutParams);
        int identifier = this.f300636a.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            int dimensionPixelSize = this.f300636a.getResources().getDimensionPixelSize(identifier);
            ViewGroup.LayoutParams layoutParams2 = this.f300641f.getLayoutParams();
            layoutParams2.height = dimensionPixelSize;
            this.f300641f.setLayoutParams(layoutParams2);
        }
        mo82144f(this.f300644i);
    }

    /* renamed from: a */
    public final int mo82139a() {
        return this.f300644i;
    }

    /* renamed from: b */
    public final View mo82140b(int i) {
        LayoutInflater from = LayoutInflater.from(this.f300636a);
        C58838bb.m90884s(this.f300639d == null, "decorate has already been called");
        m179428h(from);
        ViewStub viewStub = (ViewStub) this.f300639d.findViewById(R.id.decorator_content_stub);
        viewStub.setLayoutResource(i);
        this.f300642g = viewStub.inflate();
        return this.f300639d;
    }

    /* renamed from: c */
    public final View mo82141c(View view) {
        C58838bb.m90884s(this.f300639d == null, "decorate has already been called");
        m179428h(LayoutInflater.from(this.f300636a));
        ViewGroup viewGroup = (ViewGroup) this.f300639d.getChildAt(0);
        View findViewById = viewGroup.findViewById(R.id.decorator_content_stub);
        int indexOfChild = viewGroup.indexOfChild(findViewById);
        this.f300642g = view;
        view.setLayoutParams(findViewById.getLayoutParams());
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(this.f300642g, indexOfChild);
        return this.f300639d;
    }

    /* renamed from: d */
    public final View mo82142d() {
        return this.f300639d;
    }

    /* renamed from: e */
    public final void mo82143e(int i) {
        this.f300643h = i;
        ViewGroup viewGroup = this.f300639d;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i);
        }
    }

    /* renamed from: f */
    public final void mo82144f(int i) {
        this.f300644i = i;
        View view = this.f300641f;
        if (view != null) {
            view.setBackgroundColor(i);
            mo96426g();
        }
    }

    /* renamed from: g */
    public final void mo96426g() {
        int i;
        View decorView = this.f300636a.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (this.f300640e != 2 && C1924a.m5183b(this.f300644i) < 0.5d) {
            i = systemUiVisibility & -8193;
        } else {
            i = systemUiVisibility | 8192;
        }
        decorView.setSystemUiVisibility(i);
    }
}
