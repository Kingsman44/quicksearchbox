package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import android.app.Activity;
import android.app.KeyguardManager;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.k */
/* compiled from: PG */
public final class C107071k {

    /* renamed from: d */
    private static final C59071e f298116d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.k");

    /* renamed from: a */
    public final C22871g f298117a;

    /* renamed from: b */
    public boolean f298118b;

    /* renamed from: c */
    public KeyguardManager.KeyguardDismissCallback f298119c;

    /* renamed from: e */
    private final Activity f298120e;

    /* renamed from: f */
    private int f298121f;

    /* renamed from: g */
    private WindowInsets f298122g;

    public C107071k(Activity activity, C22871g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        activity.getLocalClassName();
        this.f298120e = activity;
        this.f298117a = gVar;
    }

    /* renamed from: h */
    private final void m177787h() {
        mo95767b();
        this.f298120e.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new C107067g(this));
    }

    /* renamed from: i */
    private final void m177788i() {
        WindowInsetsController windowInsetsController = this.f298120e.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        }
    }

    /* renamed from: j */
    private final void m177789j() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f298120e.getSystemService("keyguard");
        if (keyguardManager.isKeyguardLocked()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f298120e.getLocalClassName();
            keyguardManager.requestDismissKeyguard(this.f298120e, new C107070j(this));
        }
    }

    /* renamed from: a */
    public final void mo95766a() {
        this.f298120e.getWindow().addFlags(1153);
        this.f298120e.setShowWhenLocked(true);
    }

    /* renamed from: b */
    public final void mo95767b() {
        View decorView = this.f298120e.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 3846);
    }

    /* renamed from: c */
    public final void mo95768c() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f298120e.getWindow().setDecorFitsSystemWindows(false);
            WindowInsetsController windowInsetsController = this.f298120e.getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
            }
            m177788i();
            return;
        }
        m177787h();
    }

    /* renamed from: d */
    public final void mo95769d() {
        this.f298118b = false;
        this.f298121f = 0;
        this.f298122g = null;
        View decorView = this.f298120e.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 30) {
            decorView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            decorView.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m177788i();
        } else {
            m177787h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r3.isVisible(android.view.WindowInsets.Type.navigationBars()) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if ((r3 & 2) == 0) goto L_0x0044;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95770e(android.app.KeyguardManager.KeyguardDismissCallback r3) {
        /*
            r2 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.app.Activity r0 = r2.f298120e
            r0.getLocalClassName()
            r2.f298119c = r3
            r3 = 1
            r2.f298118b = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r3 < r0) goto L_0x0030
            android.app.Activity r3 = r2.f298120e
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            android.view.WindowInsets r3 = r3.getRootWindowInsets()
            r2.f298122g = r3
            if (r3 != 0) goto L_0x0025
            goto L_0x006b
        L_0x0025:
            int r1 = android.view.WindowInsets.Type.navigationBars()
            boolean r3 = r3.isVisible(r1)
            if (r3 == 0) goto L_0x006b
            goto L_0x0044
        L_0x0030:
            android.app.Activity r3 = r2.f298120e
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r3 = r3.getSystemUiVisibility()
            r2.f298121f = r3
            r3 = r3 & 2
            if (r3 != 0) goto L_0x006b
        L_0x0044:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r0) goto L_0x0065
            android.view.WindowInsets r3 = r2.f298122g
            if (r3 != 0) goto L_0x0061
            com.google.common.f.e r3 = f298116d
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "LockscreenActUtil"
            r3.mo56378ag(r0, r1)
            java.lang.String r0 = "systemUiInsets is null! Should not happen."
            r1 = 23469(0x5bad, float:3.2887E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0061:
            r2.mo95772g(r3)
            return
        L_0x0065:
            int r3 = r2.f298121f
            r2.mo95771f(r3)
            return
        L_0x006b:
            android.app.Activity r3 = r2.f298120e
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x0082
            com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.h r1 = new com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.h
            r1.<init>(r2)
            r3.setOnApplyWindowInsetsListener(r1)
            goto L_0x008a
        L_0x0082:
            com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.i r1 = new com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.i
            r1.<init>(r2)
            r3.setOnSystemUiVisibilityChangeListener(r1)
        L_0x008a:
            android.app.Activity r3 = r2.f298120e
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00ab
            android.view.WindowInsetsController r3 = r3.getWindowInsetsController()
            if (r3 == 0) goto L_0x00aa
            int r0 = android.view.WindowInsets.Type.statusBars()
            int r1 = android.view.WindowInsets.Type.navigationBars()
            r0 = r0 | r1
            r3.show(r0)
        L_0x00aa:
            return
        L_0x00ab:
            r0 = 256(0x100, float:3.59E-43)
            r3.setSystemUiVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k.mo95770e(android.app.KeyguardManager$KeyguardDismissCallback):void");
    }

    /* renamed from: f */
    public final void mo95771f(int i) {
        if (this.f298118b && this.f298119c != null && (i & 4) == 0) {
            m177789j();
        }
    }

    /* renamed from: g */
    public final void mo95772g(WindowInsets windowInsets) {
        if (windowInsets == null) {
            C59104x d = f298116d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LockscreenActUtil");
            ((C59052c) ((C59052c) d).mo56372aa(23466)).mo56386p("requestDismissKeyguardInternal: insets is null. Should not happen.");
        }
        if (this.f298118b && this.f298119c != null && windowInsets.isVisible(WindowInsets.Type.navigationBars())) {
            m177789j();
        }
    }
}
