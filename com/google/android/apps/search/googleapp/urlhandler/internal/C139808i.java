package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.p031v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.apps.search.googleapp.urlhandler.optimizer.C139846f;
import com.google.android.apps.search.googleapp.urlhandler.p10528a.C139782b;
import com.google.android.apps.search.googleapp.urlhandler.p10528a.C139785e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.i */
/* compiled from: PG */
public final class C139808i {

    /* renamed from: a */
    public final C46439e f379994a;

    /* renamed from: b */
    public final C139809j f379995b;

    /* renamed from: c */
    public final C139846f f379996c;

    /* renamed from: d */
    public final C139782b f379997d;

    /* renamed from: e */
    public final C139785e f379998e;

    /* renamed from: f */
    public final C139814o f379999f;

    /* renamed from: g */
    public final C139820u f380000g;

    /* renamed from: h */
    public final boolean f380001h;

    /* renamed from: i */
    private final Fragment f380002i;

    public C139808i(Fragment fragment, C46439e eVar, C139809j jVar, C139846f fVar, C139782b bVar, C139785e eVar2, C139820u uVar, boolean z, C139814o oVar) {
        this.f380002i = fragment;
        this.f379994a = eVar;
        this.f379995b = jVar;
        this.f379996c = fVar;
        this.f379997d = bVar;
        this.f379998e = eVar2;
        this.f380000g = uVar;
        this.f380001h = z;
        this.f379999f = oVar;
    }

    /* renamed from: a */
    public final int mo115283a() {
        Context requireContext = this.f380002i.requireContext();
        WindowManager windowManager = (WindowManager) requireContext.getSystemService(WindowManager.class);
        windowManager.getClass();
        int i = requireContext.getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            return i == 2 ? bounds.width() : bounds.height();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return i == 2 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    /* renamed from: b */
    public final boolean mo115284b() {
        return this.f380002i.getActivity() == null;
    }
}
