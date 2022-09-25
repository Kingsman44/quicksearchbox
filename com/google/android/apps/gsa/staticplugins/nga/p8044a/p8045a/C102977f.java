package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.f */
/* compiled from: PG */
public final class C102977f {

    /* renamed from: a */
    public final Context f287549a;

    /* renamed from: b */
    public final AccessibilityManager f287550b;

    /* renamed from: c */
    public final C68214a f287551c;

    /* renamed from: d */
    public final Object f287552d = new Object();

    /* renamed from: e */
    public final List f287553e = new ArrayList();

    /* renamed from: f */
    public C58881cr f287554f;

    /* renamed from: g */
    private final C22871g f287555g;

    public C102977f(Context context, AccessibilityManager accessibilityManager, C68214a aVar, C22871g gVar) {
        this.f287549a = context;
        this.f287550b = accessibilityManager;
        this.f287551c = aVar;
        this.f287554f = mo93550a();
        this.f287555g = gVar;
        accessibilityManager.addAccessibilityStateChangeListener(new C102945c(this));
        accessibilityManager.addTouchExplorationStateChangeListener(new C102972d(this));
    }

    /* renamed from: a */
    public final C58881cr mo93550a() {
        return C58886cw.m90973a(new C102918b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo93551b() {
        this.f287555g.mo28212l("[NGA] notifyAccessibilityStatusChanged", new C102891a(this));
    }
}
