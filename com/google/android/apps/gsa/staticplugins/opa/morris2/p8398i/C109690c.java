package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.graphics.Rect;
import android.os.Build;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14651g;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15113ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15383k;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.c */
/* compiled from: PG */
public final class C109690c implements C15113ag {

    /* renamed from: b */
    private static final C59071e f305520b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.i.c");

    /* renamed from: a */
    public final Executor f305521a;

    /* renamed from: c */
    private final Optional f305522c;

    /* renamed from: d */
    private final C14638a f305523d;

    /* renamed from: e */
    private final AtomicBoolean f305524e = new AtomicBoolean(false);

    /* renamed from: f */
    private final C86124t f305525f;

    /* renamed from: g */
    private final C15383k f305526g;

    /* renamed from: h */
    private Window f305527h = null;

    public C109690c(Optional optional, C14638a aVar, Executor executor, C86124t tVar, C15383k kVar) {
        ((C14651g) optional.get()).setUiEnabled(true);
        this.f305527h = ((C14651g) optional.get()).mo17595b();
        this.f305522c = optional;
        this.f305523d = aVar;
        this.f305521a = executor;
        this.f305525f = tVar;
        this.f305526g = kVar;
    }

    /* renamed from: a */
    public final int mo21981a() {
        if (this.f305527h == null) {
            C59104x c = f305520b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.AL.WindowCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(25135)).mo56386p("#getStatusBarHeight bailing out since Window was null.");
            return 0;
        }
        Rect rect = new Rect();
        this.f305527h.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21982b(ViewGroup viewGroup) {
    }

    /* renamed from: c */
    public final void mo21983c() {
        C58976aa aaVar = C58975e.f156826a;
        Window window = this.f305527h;
        if (window == null) {
            C59104x c = f305520b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.AL.WindowCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(25137)).mo56386p("#hideWindow: Bailing out since Window was null.");
            return;
        }
        window.setLayout(1, 1);
        ((C14651g) this.f305522c.get()).mo17599f();
        this.f305524e.set(false);
        Window window2 = this.f305527h;
        window2.getClass();
        window2.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21984d(ViewGroup viewGroup) {
    }

    /* renamed from: e */
    public final void mo21985e(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305527h != null) {
            if (!this.f305525f.mo79746e(C90051dc.f248801aI) || Build.VERSION.SDK_INT != 30 || !this.f305525f.mo79745c(C90051dc.f248906ch).contains(C58890d.m90988c(Build.MANUFACTURER))) {
                Window window = this.f305527h;
                window.getClass();
                window.setLayout(-1, -1);
            }
            int i = true != this.f305525f.mo79746e(C90051dc.f248873bb) ? 139067432 : 138936352;
            Window window2 = this.f305527h;
            window2.getClass();
            window2.addFlags(i);
            if (this.f305525f.mo79746e(C90051dc.f248873bb)) {
                Window window3 = this.f305527h;
                window3.getClass();
                window3.clearFlags(C89885b.S3REQUEST_BUILD_PINHOLE_UPDATE_COOKIES_FAILED_VALUE);
            }
            if (this.f305523d.mo21579m()) {
                Window window4 = this.f305527h;
                window4.getClass();
                window4.clearFlags(67108864);
                Window window5 = this.f305527h;
                window5.getClass();
                window5.setStatusBarColor(0);
            }
            Window window6 = this.f305527h;
            window6.getClass();
            window6.getDecorView().setOnSystemUiVisibilityChangeListener(new C109689b(this));
            mo98009i();
            Window window7 = this.f305527h;
            window7.getClass();
            WindowManager.LayoutParams attributes = window7.getAttributes();
            try {
                Object obj = attributes.getClass().getField("privateFlags").get(attributes);
                if (obj != null) {
                    attributes.getClass().getField("privateFlags").set(attributes, Integer.valueOf(((Integer) obj).intValue() | 64));
                }
            } catch (IllegalAccessException | NoSuchFieldException | RuntimeException e) {
                C59104x c = f305520b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.AL.WindowCtrl");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25139)).mo56386p("Failed to disable window resize animation.");
            }
            ((C14651g) this.f305522c.get()).setUiEnabled(true);
            ((C14651g) this.f305522c.get()).setContentView(viewGroup);
            viewGroup.setVisibility(0);
            this.f305524e.set(true);
            mo21988h(false);
            return;
        }
        C59104x c2 = f305520b.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "Morris.AL.WindowCtrl");
        ((C59052c) ((C59052c) c2).mo56372aa(25140)).mo56386p("#initializeWindow: Bailing out since Window was null.");
    }

    /* renamed from: f */
    public final /* synthetic */ void mo21986f(int i, boolean z) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21987g(int i) {
    }

    /* renamed from: h */
    public final void mo21988h(boolean z) {
        if (this.f305523d.mo21579m()) {
            boolean z2 = true;
            if (!z) {
                Optional a = this.f305523d.mo21569a();
                if (!a.isPresent() || a.get() != C17825k.NIGHT_MODE_STATUS_NIGHT) {
                    z2 = false;
                }
            }
            Window window = this.f305527h;
            window.getClass();
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i = z2 ? systemUiVisibility & -8193 : systemUiVisibility | 8192;
            if (systemUiVisibility != i) {
                Window window2 = this.f305527h;
                window2.getClass();
                window2.getDecorView().setSystemUiVisibility(i);
            }
        }
    }

    /* renamed from: i */
    public final void mo98009i() {
        if (!this.f305525f.mo79746e(C90051dc.f248854bI) || !this.f305526g.mo22276b()) {
            Window window = this.f305527h;
            window.getClass();
            Window window2 = this.f305527h;
            window2.getClass();
            window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4866);
            return;
        }
        Window window3 = this.f305527h;
        window3.getClass();
        window3.addFlags(LinearLayoutManager.INVALID_OFFSET);
        Window window4 = this.f305527h;
        window4.getClass();
        window4.clearFlags(134217728);
        Window window5 = this.f305527h;
        window5.getClass();
        window5.setNavigationBarColor(0);
    }
}
