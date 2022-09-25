package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.C1745d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15113ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15383k;
import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59728dm;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.l */
/* compiled from: PG */
public final class C109699l implements C15113ag {

    /* renamed from: f */
    private static final C59071e f305587f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.i.l");

    /* renamed from: a */
    public final Executor f305588a;

    /* renamed from: b */
    public final C14986h f305589b;

    /* renamed from: c */
    Window f305590c;

    /* renamed from: d */
    Window f305591d;

    /* renamed from: e */
    View f305592e;

    /* renamed from: g */
    private final C86124t f305593g;

    /* renamed from: h */
    private final C14647d f305594h;

    /* renamed from: i */
    private final C15383k f305595i;

    /* renamed from: j */
    private final Context f305596j;

    /* renamed from: k */
    private final C14638a f305597k;

    /* renamed from: l */
    private final C14113an f305598l;

    /* renamed from: m */
    private final C14115ap f305599m;

    /* renamed from: n */
    private final WindowManager f305600n;

    /* renamed from: o */
    private boolean f305601o = false;

    /* renamed from: p */
    private int f305602p;

    /* renamed from: q */
    private int f305603q;

    public C109699l(C86124t tVar, C14647d dVar, Context context, C15383k kVar, C14638a aVar, Executor executor, C14986h hVar, C14113an anVar, C14115ap apVar) {
        this.f305593g = tVar;
        this.f305594h = dVar;
        this.f305596j = C14649e.m30710a(context);
        this.f305595i = kVar;
        this.f305600n = C14649e.m30711b(context);
        this.f305597k = aVar;
        this.f305588a = executor;
        this.f305589b = hVar;
        this.f305598l = anVar;
        this.f305599m = apVar;
    }

    /* renamed from: k */
    private final WindowManager.LayoutParams m182609k() {
        IBinder t = this.f305594h.mo21607t();
        if (t == null) {
            return null;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.token = t;
        layoutParams.gravity = 81;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.type = 2;
        layoutParams.format = -3;
        layoutParams.flags = -2142699232;
        try {
            Object obj = layoutParams.getClass().getField("privateFlags").get(layoutParams);
            if (obj != null) {
                layoutParams.getClass().getField("privateFlags").set(layoutParams, Integer.valueOf(((Integer) obj).intValue() | 64));
            }
        } catch (IllegalAccessException | NoSuchFieldException | RuntimeException e) {
            C59104x c = f305587f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25158)).mo56386p("Failed to disable window resize animation.");
        }
        return layoutParams;
    }

    /* renamed from: l */
    private final void m182610l(Window window) {
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new C109696i(this, window));
    }

    /* renamed from: a */
    public final int mo21981a() {
        int i = this.f305602p;
        if (i > 0) {
            return i;
        }
        if (this.f305591d == null) {
            return 0;
        }
        Rect rect = new Rect();
        Window window = this.f305591d;
        window.getClass();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        this.f305602p = i2;
        return i2;
    }

    /* renamed from: b */
    public final void mo21982b(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305591d != null) {
            this.f305599m.mo21430d(C37182a.f98005eY.mo40813g(), this.f305594h.mo21608v());
            Window window = this.f305591d;
            window.getClass();
            if (window.getDecorView().isAttachedToWindow()) {
                WindowManager windowManager = this.f305600n;
                Window window2 = this.f305591d;
                window2.getClass();
                windowManager.removeView(window2.getDecorView());
            } else {
                C59104x c = f305587f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
                C59052c cVar = (C59052c) c;
                cVar.mo56378ag(C38505d.f101864b, 188446832);
                cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.MORRIS_DECOR_VIEW_NOT_ATTACHED_VALUE));
                ((C59052c) cVar.mo56372aa(25160)).mo56386p("#hideSecondaryWindow: view is not attached to window.");
            }
            viewGroup.setVisibility(8);
            Window window3 = this.f305591d;
            window3.getClass();
            window3.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
        }
    }

    /* renamed from: c */
    public final void mo21983c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305590c != null) {
            this.f305599m.mo21430d(C37182a.f98004eX.mo40813g(), this.f305594h.mo21608v());
            Window window = this.f305590c;
            window.getClass();
            if (window.getDecorView().isAttachedToWindow()) {
                WindowManager windowManager = this.f305600n;
                Window window2 = this.f305590c;
                window2.getClass();
                windowManager.removeView(window2.getDecorView());
            } else {
                C59104x c = f305587f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
                C59052c cVar = (C59052c) c;
                cVar.mo56378ag(C38505d.f101864b, 188446832);
                cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.MORRIS_DECOR_VIEW_NOT_ATTACHED_VALUE));
                ((C59052c) cVar.mo56372aa(25162)).mo56386p("#hideWindow: view is not attached to window.");
            }
            this.f305601o = false;
            Window window3 = this.f305590c;
            window3.getClass();
            window3.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
            this.f305603q = 0;
        }
    }

    /* renamed from: d */
    public final void mo21984d(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        WindowManager.LayoutParams k = m182609k();
        if (k != null) {
            this.f305598l.mo21424b(C37182a.f98012ef.mo40813g());
            this.f305591d = new Dialog(this.f305596j, R.style.MorrisTheme).getWindow();
            k.height = -1;
            k.flags |= 16;
            Window window = this.f305591d;
            window.getClass();
            window.setAttributes(k);
            Window window2 = this.f305591d;
            window2.getClass();
            window2.setContentView(viewGroup);
            try {
                WindowManager windowManager = this.f305600n;
                Window window3 = this.f305591d;
                window3.getClass();
                windowManager.addView(window3.getDecorView(), k);
                viewGroup.setVisibility(0);
                Window window4 = this.f305591d;
                window4.getClass();
                mo98018i(window4);
                Window window5 = this.f305591d;
                window5.getClass();
                window5.setStatusBarColor(0);
                Window window6 = this.f305591d;
                window6.getClass();
                window6.setNavigationBarColor(0);
                mo21988h(false);
                Window window7 = this.f305591d;
                window7.getClass();
                m182610l(window7);
            } catch (WindowManager.BadTokenException unused) {
                C59104x c = f305587f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(25164)).mo56386p("#initializeSecondaryWindow: BadTokenException");
                this.f305591d = null;
                this.f305599m.mo21431e(C37182a.f98078fs.mo40813g());
                C14647d dVar = this.f305594h;
                Optional of = Optional.m71637of(C59728dm.UNKNOWN_SHOW_MORRIS_UI_RESULT);
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
                kxVar.copyOnWrite();
                ((C14485kz) kxVar.instance).f43774a = 15;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14485kz kzVar = (C14485kz) kxVar.build();
                kzVar.getClass();
                lfVar.f43799b = kzVar;
                lfVar.f43798a = 1;
                dVar.mo21591A(of, (C14492lf) gtVar.build());
            }
        }
    }

    /* renamed from: e */
    public final void mo21985e(ViewGroup viewGroup) {
        WindowManager.LayoutParams k;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f305601o && (k = m182609k()) != null) {
            this.f305598l.mo21424b(C37182a.f98011ee.mo40813g());
            k.gravity = 49;
            Dialog dialog = new Dialog(this.f305596j, R.style.MorrisTheme);
            dialog.setOnKeyListener(new C109698k(this));
            Window window = dialog.getWindow();
            this.f305590c = window;
            window.getClass();
            window.setAttributes(k);
            Window window2 = this.f305590c;
            window2.getClass();
            window2.setContentView(viewGroup);
            try {
                WindowManager windowManager = this.f305600n;
                Window window3 = this.f305590c;
                window3.getClass();
                windowManager.addView(window3.getDecorView(), k);
                viewGroup.setVisibility(0);
                this.f305601o = true;
                this.f305592e = viewGroup.findViewById(R.id.space_holder);
                Window window4 = this.f305590c;
                window4.getClass();
                mo98018i(window4);
                Window window5 = this.f305590c;
                window5.getClass();
                window5.setStatusBarColor(0);
                Window window6 = this.f305590c;
                window6.getClass();
                window6.setNavigationBarColor(0);
                Window window7 = this.f305590c;
                window7.getClass();
                m182610l(window7);
            } catch (WindowManager.BadTokenException unused) {
                C59104x c = f305587f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(25166)).mo56386p("#initializeWindow: BadTokenException");
                this.f305590c = null;
            }
        }
    }

    /* renamed from: f */
    public final void mo21986f(int i, boolean z) {
        if (this.f305590c != null) {
            C58976aa aaVar = C58975e.f156826a;
            int d = C15352z.m31952d(this.f305596j, this.f305603q) - i;
            Window window = this.f305590c;
            window.getClass();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.y != d) {
                int i2 = attributes.y;
                attributes.y = d;
                if (attributes.y == 0) {
                    attributes.flags &= -513;
                } else {
                    attributes.flags |= 512;
                }
                C1745d dVar = new C1745d(0, i);
                if (i2 == 0) {
                    mo98019j(attributes);
                    View view = this.f305592e;
                    view.getClass();
                    view.setLayoutParams(dVar);
                    return;
                }
                View view2 = this.f305592e;
                view2.getClass();
                view2.setLayoutParams(dVar);
                if (z) {
                    this.f305588a.execute(C47810es.m84977q(new C109695h(this, attributes)));
                } else {
                    mo98019j(attributes);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo21987g(int i) {
        this.f305603q = i;
    }

    /* renamed from: h */
    public final void mo21988h(boolean z) {
        if (this.f305591d != null && this.f305597k.mo21579m()) {
            boolean z2 = true;
            if (!z) {
                Optional a = this.f305597k.mo21569a();
                if (!a.isPresent() || a.get() != C17825k.NIGHT_MODE_STATUS_NIGHT) {
                    z2 = false;
                }
            }
            Window window = this.f305591d;
            window.getClass();
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i = z2 ? systemUiVisibility & -8193 : systemUiVisibility | 8192;
            if (systemUiVisibility != i) {
                Window window2 = this.f305591d;
                window2.getClass();
                window2.getDecorView().setSystemUiVisibility(i);
            }
        }
    }

    /* renamed from: i */
    public final void mo98018i(Window window) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility() | 5888;
        if (this.f305593g.mo79746e(C90051dc.f248854bI) && !this.f305595i.mo22276b()) {
            systemUiVisibility |= 2;
        }
        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* renamed from: j */
    public final void mo98019j(WindowManager.LayoutParams layoutParams) {
        Window window = this.f305590c;
        window.getClass();
        window.setAttributes(layoutParams);
        try {
            WindowManager windowManager = this.f305600n;
            Window window2 = this.f305590c;
            window2.getClass();
            windowManager.updateViewLayout(window2.getDecorView(), layoutParams);
        } catch (IllegalArgumentException unused) {
            C59104x c = f305587f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.TokenWindowCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(25170)).mo56386p("#updateWindowParams: view is not attached to window.");
            Window window3 = this.f305590c;
            window3.getClass();
            window3.getDecorView().setVisibility(8);
            Window window4 = this.f305591d;
            window4.getClass();
            window4.getDecorView().setVisibility(8);
            this.f305599m.mo21431e(C37182a.f98079ft.mo40813g());
            C14647d dVar = this.f305594h;
            Optional of = Optional.m71637of(C59728dm.UNKNOWN_SHOW_MORRIS_UI_RESULT);
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
            kxVar.copyOnWrite();
            ((C14485kz) kxVar.instance).f43774a = 14;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14485kz kzVar = (C14485kz) kxVar.build();
            kzVar.getClass();
            lfVar.f43799b = kzVar;
            lfVar.f43798a = 1;
            dVar.mo21591A(of, (C14492lf) gtVar.build());
        }
    }
}
