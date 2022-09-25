package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.q */
/* compiled from: PG */
public final class C106061q {

    /* renamed from: a */
    public final Activity f296098a;

    /* renamed from: b */
    public ViewTreeObserver.OnGlobalLayoutListener f296099b;

    /* renamed from: c */
    public boolean f296100c;

    /* renamed from: d */
    public boolean f296101d;

    /* renamed from: e */
    public boolean f296102e;

    /* renamed from: f */
    public int f296103f;

    public C106061q(Activity activity) {
        this.f296098a = activity;
    }

    /* renamed from: a */
    public final int mo95279a() {
        View decorView = this.f296098a.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return decorView.getRootView().getHeight() - rect.height();
    }

    /* renamed from: b */
    public final void mo95280b() {
        View findViewById = this.f296098a.findViewById(R.id.opa_top_level);
        findViewById.setFitsSystemWindows(false);
        findViewById.setPadding(0, 0, 0, 0);
        this.f296098a.getWindow().getDecorView().setSystemUiVisibility(5894);
        this.f296100c = true;
    }

    /* renamed from: c */
    public final void mo95281c() {
        this.f296098a.findViewById(R.id.opa_top_level).setFitsSystemWindows(true);
        this.f296098a.getWindow().getDecorView().setSystemUiVisibility(this.f296098a.getResources().getConfiguration().orientation == 2 ? 8208 : 8192);
        this.f296100c = false;
    }
}
