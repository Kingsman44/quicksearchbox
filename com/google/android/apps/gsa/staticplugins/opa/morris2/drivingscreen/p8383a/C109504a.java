package com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.p8383a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15113ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15383k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.a.a */
/* compiled from: PG */
public final class C109504a implements C15113ag {

    /* renamed from: a */
    private static final C59071e f305003a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.a.a");

    /* renamed from: b */
    private final Window f305004b;

    /* renamed from: c */
    private final Activity f305005c;

    /* renamed from: d */
    private final C86124t f305006d;

    /* renamed from: e */
    private final C15383k f305007e;

    public C109504a(Optional optional, C86124t tVar, C15383k kVar) {
        Activity activity = (Activity) optional.get();
        this.f305005c = activity;
        this.f305004b = activity.getWindow();
        this.f305006d = tVar;
        this.f305007e = kVar;
    }

    /* renamed from: a */
    public final int mo21981a() {
        if (this.f305004b == null) {
            C59104x c = f305003a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DS.WindowCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(24815)).mo56386p("#getStatusBarHeight bailing out since Window was null.");
            return 0;
        }
        Rect rect = new Rect();
        this.f305004b.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21982b(ViewGroup viewGroup) {
    }

    /* renamed from: c */
    public final void mo21983c() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21984d(ViewGroup viewGroup) {
    }

    /* renamed from: e */
    public final void mo21985e(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305004b == null) {
            C59104x c = f305003a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DS.WindowCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(24818)).mo56386p("Bailing out since Window was null.");
            return;
        }
        if (this.f305006d.mo79746e(C90051dc.f248783R)) {
            Window window = this.f305004b;
            window.getClass();
            window.addFlags(128);
        }
        if (this.f305006d.mo79746e(C90051dc.f248786U)) {
            Window window2 = this.f305004b;
            window2.getClass();
            window2.addFlags(524288);
        }
        if (this.f305006d.mo79746e(C90051dc.f248782Q)) {
            Window window3 = this.f305004b;
            window3.getClass();
            window3.addFlags(4194304);
        }
        Window window4 = this.f305004b;
        window4.getClass();
        window4.clearFlags(67108864);
        Window window5 = this.f305004b;
        window5.getClass();
        window5.setStatusBarColor(0);
        Window window6 = this.f305004b;
        window6.getClass();
        window6.setNavigationBarColor(0);
        Window window7 = this.f305004b;
        window7.getClass();
        Window window8 = this.f305004b;
        window8.getClass();
        window8.getDecorView().setSystemUiVisibility(window7.getDecorView().getSystemUiVisibility() & -8193);
        Window window9 = this.f305004b;
        window9.getClass();
        int systemUiVisibility = window9.getDecorView().getSystemUiVisibility() | 5888;
        if (this.f305006d.mo79746e(C90051dc.f248854bI) && !this.f305007e.mo22276b()) {
            systemUiVisibility |= 2;
        }
        Window window10 = this.f305004b;
        window10.getClass();
        window10.getDecorView().setSystemUiVisibility(systemUiVisibility);
        this.f305005c.setContentView(viewGroup);
        viewGroup.setVisibility(0);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo21986f(int i, boolean z) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21987g(int i) {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo21988h(boolean z) {
    }
}
