package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.lifecycle.C2383n;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136513p;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136514q;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136521x;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47583cg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.ak */
/* compiled from: PG */
public final class C136439ak {

    /* renamed from: a */
    public static final C59071e f371445a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.b.ak");

    /* renamed from: n */
    private static final Duration f371446n = Duration.ofSeconds(5);

    /* renamed from: b */
    public final Context f371447b;

    /* renamed from: c */
    public final C136490i f371448c;

    /* renamed from: d */
    public final boolean f371449d;

    /* renamed from: e */
    public final boolean f371450e;

    /* renamed from: f */
    public ScheduledFuture f371451f;

    /* renamed from: g */
    public C136531i f371452g;

    /* renamed from: h */
    public Window f371453h;

    /* renamed from: i */
    public C136443b f371454i = C136443b.m221737b().mo112996b();

    /* renamed from: j */
    public final C136453f f371455j;

    /* renamed from: k */
    public final C136895e f371456k;

    /* renamed from: l */
    public int f371457l;

    /* renamed from: m */
    public C136432ad f371458m;

    /* renamed from: o */
    private final ScheduledExecutorService f371459o;

    /* renamed from: p */
    private float f371460p = -1.0f;

    public C136439ak(Context context, ScheduledExecutorService scheduledExecutorService, C136490i iVar, C21370a aVar, C136895e eVar, boolean z, boolean z2) {
        this.f371447b = context;
        this.f371459o = scheduledExecutorService;
        this.f371448c = iVar;
        this.f371455j = new C136453f("OverlayBinderCompat", 100, aVar);
        this.f371456k = eVar;
        this.f371449d = z;
        this.f371450e = z2;
    }

    /* renamed from: f */
    public static boolean m221728f(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: a */
    public final void mo113037a(C136456d dVar) {
        C136508k j;
        C136486h hVar = (C136486h) dVar;
        this.f371455j.mo113057a(String.format(Locale.US, "closeOverlay animationType=%d animationDuration=%d", new Object[]{Integer.valueOf(hVar.f371591b - 1), Integer.valueOf(hVar.f371590a)}));
        C136531i iVar = this.f371452g;
        if (iVar != null && (j = iVar.mo113158j()) != null && j.f371636m == 2) {
            C136512o c = j.mo113104c();
            if (c != null) {
                C136521x a = c.mo17754z();
                int i = hVar.f371590a;
                if (i <= 0) {
                    i = 750;
                }
                a.f371663H = 2;
                int i2 = hVar.f371591b - 1;
                if (i2 == 0) {
                    a.mo113135c(0);
                } else if (i2 != 3) {
                    a.mo113135c(i);
                } else {
                    a.mo113138f();
                    a.f371668e.animate().setDuration((long) i).setInterpolator(C136521x.f371655c).setUpdateListener(new C47583cg(a.f371684u, new C136513p(a), "SlidingPanel fade-out")).alpha(0.0f).withEndAction(new C136514q(a));
                }
            }
            Window window = j.f371631h;
            if (window != null) {
                j.mo113106e(window);
            }
        }
    }

    /* renamed from: b */
    public final void mo113038b(boolean z, Bundle bundle) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f371455j.mo113057a(String.format(Locale.US, "onDestroy: isRecreating=%s", new Object[]{valueOf}));
        C136432ad adVar = this.f371458m;
        if (adVar != null) {
            C136433ae aeVar = adVar.f371413b;
            if (!aeVar.f371427n) {
                if (!z) {
                    try {
                        aeVar.mo113030s(adVar.f371412a, 0);
                    } catch (RemoteException e) {
                        ((C59052c) ((C59052c) ((C59052c) C136433ae.f371414a.mo56225c()).mo56382g(e)).mo56372aa(40733)).mo56386p("Unable to send status update to the client");
                    }
                }
                adVar.f371413b.mo113031v(C2383n.DESTROYED);
            }
        }
        if (z && bundle != null) {
            this.f371455j.mo113057a("onDestroy: saving state");
            this.f371460p = -1.0f;
            Window window = this.f371453h;
            if (window != null) {
                bundle.putParcelable("windowHierarchy", window.saveHierarchyState());
            }
            C136531i iVar = this.f371452g;
            if (iVar != null) {
                C136508k j = iVar.mo113158j();
                if (j != null) {
                    bundle.putBoolean("is_sliding_panel_open", j.mo113109h());
                }
                if (this.f371450e) {
                    this.f371452g.mo51132v(bundle);
                }
            }
        }
        Window window2 = this.f371453h;
        if (window2 != null) {
            try {
                this.f371453h.getWindowManager().removeView(window2.getDecorView());
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) f371445a.mo56225c()).mo56382g(e2)).mo56372aa(40755)).mo56386p("Error removing overlay window");
                this.f371455j.mo113057a("onDestroy: Error removing overlay window");
            }
            this.f371453h = null;
        }
        C136531i iVar2 = this.f371452g;
        if (iVar2 != null) {
            iVar2.mo51129jQ();
            this.f371452g = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo113039c(C136443b bVar, C2383n nVar) {
        this.f371455j.mo113057a(String.format(Locale.US, "setServiceOptions: acetoneOptions=%s", new Object[]{bVar}));
        if (this.f371454i.mo113045f() != bVar.mo113045f()) {
            this.f371455j.mo113057a("setServiceOptions: Destroy view");
            mo113038b(true, (Bundle) null);
        }
        boolean e = bVar.mo113044e();
        if (this.f371454i.mo113044e() != e) {
            if (!e) {
                this.f371448c.mo113086b();
            } else if (nVar.mo5788a(C2383n.RESUMED)) {
                this.f371448c.mo113085a();
            }
        }
        this.f371454i = bVar;
    }

    /* renamed from: d */
    public final void mo113040d(float f) {
        Window window = this.f371453h;
        if (window != null) {
            float f2 = this.f371460p;
            this.f371460p = f;
            char c = 65535;
            if (f2 != -1.0f || f >= 0.5f) {
                if (f2 != -1.0f || f < 0.5f) {
                    if (f2 <= 0.5f || f > 0.5f) {
                        if (f2 >= 0.5f || f < 0.5f) {
                            c = 0;
                        }
                    }
                }
                c = 1;
            }
            if (c != 0) {
                int i = this.f371457l & 8192;
                boolean f3 = m221728f(window.getContext());
                if (c <= 0 ? i != 0 : !f3) {
                    Window window2 = this.f371453h;
                    if (Build.VERSION.SDK_INT >= 30) {
                        WindowInsetsController insetsController = window2.getInsetsController();
                        if (insetsController != null) {
                            insetsController.setSystemBarsAppearance(8, 8);
                            insetsController.setSystemBarsAppearance(16, 16);
                            return;
                        }
                        return;
                    }
                    View findViewById = window2.findViewById(16908290);
                    findViewById.setSystemUiVisibility(findViewById.getSystemUiVisibility() | 8208);
                    return;
                }
                Window window3 = this.f371453h;
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowInsetsController insetsController2 = window3.getInsetsController();
                    if (insetsController2 != null) {
                        insetsController2.setSystemBarsAppearance(0, 8);
                        insetsController2.setSystemBarsAppearance(0, 16);
                        return;
                    }
                    return;
                }
                View findViewById2 = window3.findViewById(16908290);
                findViewById2.setSystemUiVisibility(findViewById2.getSystemUiVisibility() & -8209);
            }
        }
    }

    /* renamed from: e */
    public final void mo113041e(boolean z) {
        this.f371455j.mo113057a(String.format(Locale.US, "windowDetached isChangingConfiguration=%s", new Object[]{Boolean.valueOf(z)}));
        this.f371451f = this.f371459o.schedule(new C136437ai(this, z), z ? f371446n.toMillis() : 0, TimeUnit.MILLISECONDS);
    }
}
