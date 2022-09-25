package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.gsa.assistant.shared.p5812e.C73859r;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bp */
/* compiled from: PG */
public final class C103153bp {

    /* renamed from: i */
    private static final C59071e f287861i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bp");

    /* renamed from: a */
    public final Context f287862a;

    /* renamed from: b */
    public final C73859r f287863b;

    /* renamed from: c */
    public final WindowManager f287864c;

    /* renamed from: d */
    public final C81449a f287865d;

    /* renamed from: e */
    public final C86124t f287866e;

    /* renamed from: f */
    public Optional f287867f;

    /* renamed from: g */
    public Optional f287868g = Optional.empty();

    /* renamed from: h */
    public Runnable f287869h = C103150bm.f287858a;

    public C103153bp(Context context, C73859r rVar, C81449a aVar, C86124t tVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                context = context.createDisplayContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(2038, (Bundle) null);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f287861i.mo56225c()).mo56382g(e)).mo56372aa(21466)).mo56386p("Exception in createWindowContext");
            }
            this.f287862a = context;
        } else {
            this.f287862a = context;
        }
        this.f287863b = rVar;
        WindowManager windowManager = (WindowManager) this.f287862a.getSystemService("window");
        windowManager.getClass();
        this.f287864c = windowManager;
        this.f287867f = Optional.empty();
        this.f287865d = aVar;
        this.f287866e = tVar;
    }

    /* renamed from: a */
    public final void mo93669a(C103152bo boVar, Runnable runnable) {
        this.f287863b.mo65340c(boVar);
        if (!this.f287867f.isPresent() || ((View) this.f287867f.get()).getWindowToken() == null) {
            runnable.run();
            return;
        }
        ((View) this.f287867f.get()).animate().translationY(2000.0f).setDuration(500).withEndAction(runnable).start();
        this.f287864c.removeView((View) this.f287867f.get());
        this.f287869h.run();
    }
}
