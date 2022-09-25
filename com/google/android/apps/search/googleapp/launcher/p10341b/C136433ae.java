package com.google.android.apps.search.googleapp.launcher.p10341b;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2383n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.launcher.C136421a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136425b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136428d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10343b.C136445b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136450c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136454g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136471g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136524b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136529g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136538o;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136539p;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136540q;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136504g;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136515r;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136516s;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136521x;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10922ab.C146706b;
import com.google.android.libraries.p10922ab.C146710f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.material.p3505b.C44534d;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47583cg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47853m;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59706cu;
import com.google.common.p4552o.C59708cw;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.ae */
/* compiled from: PG */
public final class C136433ae extends C146706b implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f371414a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.b.ae");

    /* renamed from: b */
    public static final Duration f371415b = Duration.ofMillis(100);

    /* renamed from: c */
    public static final Duration f371416c = Duration.ofMillis(200);

    /* renamed from: d */
    public final int f371417d;

    /* renamed from: e */
    public final C136439ak f371418e;

    /* renamed from: f */
    public C2383n f371419f = C2383n.CREATED;

    /* renamed from: g */
    public C136443b f371420g = C136443b.m221737b().mo112996b();

    /* renamed from: h */
    public ScheduledFuture f371421h;

    /* renamed from: i */
    public ScheduledFuture f371422i;

    /* renamed from: j */
    public final C136425b f371423j;

    /* renamed from: k */
    public final ScheduledExecutorService f371424k;

    /* renamed from: l */
    public UUID f371425l;

    /* renamed from: m */
    public boolean f371426m = false;

    /* renamed from: n */
    public boolean f371427n = false;

    /* renamed from: o */
    private final int f371428o;

    /* renamed from: p */
    private final int f371429p;

    /* renamed from: q */
    private final Context f371430q;

    /* renamed from: r */
    private final C47853m f371431r;

    /* renamed from: s */
    private final C136445b f371432s;

    /* renamed from: t */
    private final Executor f371433t;

    /* renamed from: u */
    private final boolean f371434u;

    /* renamed from: v */
    private final C21370a f371435v;

    /* renamed from: w */
    private final boolean f371436w;

    public C136433ae(int i, int i2, int i3, Context context, C47853m mVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C136439ak akVar, C136425b bVar, C136445b bVar2, boolean z, C21370a aVar, boolean z2) {
        this.f371417d = i;
        this.f371428o = i2;
        this.f371429p = i3;
        this.f371430q = context;
        this.f371431r = mVar;
        this.f371433t = executor;
        this.f371424k = scheduledExecutorService;
        this.f371418e = akVar;
        this.f371423j = bVar;
        this.f371432s = bVar2;
        this.f371434u = z;
        this.f371435v = aVar;
        this.f371436w = z2;
    }

    /* renamed from: H */
    public static boolean m221688H(C136455h hVar) {
        return (hVar.f371508a & 1) != 0 && ((long) hVar.f371509b.mo59031d()) <= 1048576;
    }

    /* renamed from: L */
    static int m221689L(int i) {
        try {
            return C136421a.m221661a(i & 3);
        } catch (NoSuchElementException unused) {
            ((C59052c) ((C59052c) f371414a.mo56226d()).mo56372aa(40736)).mo56386p("Invalid animation type value. Using AnimationType.NONE instead.");
            return 1;
        }
    }

    /* renamed from: a */
    static int m221690a(int i) {
        return (i >> 2) & 2047;
    }

    /* renamed from: c */
    static C136456d m221691c(Bundle bundle) {
        return new C136486h(C136421a.m221661a(bundle.getInt("overlay_animation_type")), bundle.getInt("overlay_animation_duration", 0));
    }

    /* renamed from: d */
    public static C136455h m221692d(Bitmap bitmap, String str) {
        Optional optional;
        if (bitmap != null) {
            C63087y v = C63088z.m96150v();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
            bitmap.recycle();
            optional = Optional.m71637of(v.mo59165b());
        } else {
            optional = Optional.empty();
        }
        C136454g gVar = (C136454g) C136455h.f371506d.createBuilder();
        if (optional.isPresent()) {
            C63088z zVar = (C63088z) optional.get();
            gVar.copyOnWrite();
            C136455h hVar = (C136455h) gVar.instance;
            zVar.getClass();
            hVar.f371508a |= 1;
            hVar.f371509b = zVar;
        }
        if (str != null) {
            gVar.copyOnWrite();
            C136455h hVar2 = (C136455h) gVar.instance;
            hVar2.f371508a |= 2;
            hVar2.f371510c = str;
        }
        return (C136455h) gVar.build();
    }

    /* renamed from: A */
    public final void mo28072A(Bundle bundle) {
        if (!this.f371427n) {
            Bitmap bitmap = (Bitmap) bundle.getParcelable("partner_overlay_icon");
            String string = bundle.getString("partner_overlay_product_name");
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "updateClientOptions");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136552s(this, bitmap, string)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: B */
    public final synchronized void mo113020B(C136443b bVar) {
        this.f371418e.mo113039c(bVar, this.f371419f);
        this.f371420g = bVar;
    }

    /* renamed from: C */
    public final void mo28073C(WindowManager.LayoutParams layoutParams, C146710f fVar, int i) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "windowAttached");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136550q(this, layoutParams, i, fVar)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: D */
    public final void mo28074D(Bundle bundle, C146710f fVar) {
        Throwable th;
        Bundle bundle2 = bundle;
        if (!this.f371427n) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) bundle2.getParcelable("layout_params");
            Configuration configuration = (Configuration) bundle2.getParcelable("configuration");
            if (bundle2.containsKey("is_background_dark")) {
                if (configuration == null) {
                    configuration = new Configuration(this.f371430q.getResources().getConfiguration());
                }
                configuration.uiMode = (true != bundle2.getBoolean("is_background_dark", false) ? 16 : 32) | (configuration.uiMode & -49);
            }
            Configuration configuration2 = configuration;
            int i = bundle2.getInt("client_options", 3);
            Bitmap bitmap = (Bitmap) bundle2.getParcelable("partner_overlay_icon");
            String string = bundle2.getString("partner_overlay_product_name");
            boolean z = bundle2.getBoolean("google_overlay_is_default", true);
            int i2 = bundle2.getInt("override_bottom_inset", -1);
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "windowAttached2");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136548o(this, layoutParams, configuration2, i, fVar, bitmap, string, bundle, z, i2)));
                a.close();
                return;
            } catch (Throwable th2) {
                C136544k.m221927a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: E */
    public final void mo113021E(WindowManager.LayoutParams layoutParams, Configuration configuration, int i, C146710f fVar, C136455h hVar, C136451d dVar, boolean z, int i2) {
        UUID uuid;
        Bitmap bitmap;
        C146710f fVar2;
        C136428d dVar2;
        Bitmap bitmap2;
        C136538o oVar;
        C136428d dVar3;
        C136428d dVar4;
        WindowManager.LayoutParams layoutParams2 = layoutParams;
        Configuration configuration2 = configuration;
        C146710f fVar3 = fVar;
        int i3 = i & 11;
        C136423a b = C136443b.m221737b();
        if ((i3 & 1) != 0) {
            b.mo113003i(true);
        }
        if ((i3 & 2) != 0) {
            b.mo113002h(true);
        }
        if ((i3 & 8) != 0) {
            b.mo113005k(true);
        }
        C136455h hVar2 = hVar;
        b.mo113006l(1 == (hVar2.f371508a & 1));
        b.mo113001g(z);
        b.mo113000f(i2);
        if (b.mo112999e()) {
            C136425b bVar = this.f371423j;
            uuid = UUID.randomUUID();
            if (bVar.f371399b) {
                bVar.mo113014i(uuid, C37182a.f97746E.mo40806d());
                bVar.mo113008b(bVar.mo113007a(uuid), C37182a.f97773aE.mo40779c());
            }
        } else if (b.mo112997c()) {
            C136425b bVar2 = this.f371423j;
            uuid = UUID.randomUUID();
            if (bVar2.f371399b) {
                bVar2.mo113014i(uuid, C37182a.f97746E.mo40806d());
                bVar2.mo113008b(bVar2.mo113007a(uuid), C37182a.f97745D.mo40779c());
            }
        } else {
            C136425b bVar3 = this.f371423j;
            uuid = UUID.randomUUID();
            if (bVar3.f371399b) {
                bVar3.mo113014i(uuid, C37182a.f97746E.mo40806d());
                bVar3.mo113008b(bVar3.mo113007a(uuid), C37182a.f97818ax.mo40779c());
            }
        }
        boolean z2 = b.mo112999e() && (!this.f371434u || !m221688H(hVar));
        if (z2) {
            C136425b bVar4 = this.f371423j;
            if (bVar4.f371399b && (dVar4 = (C136428d) bVar4.f371398a.get(uuid)) != null) {
                bVar4.mo113008b(dVar4, C37182a.f97774aF.mo40779c());
            }
            b.mo113006l(false);
            b.mo113003i(true);
        }
        mo113020B(b.mo112996b());
        C136425b bVar5 = this.f371423j;
        C136443b bVar6 = this.f371420g;
        if (bVar5.f371399b && (dVar3 = (C136428d) bVar5.f371398a.get(uuid)) != null) {
            C59706cu cuVar = dVar3.f371407d;
            boolean e = bVar6.mo113044e();
            cuVar.copyOnWrite();
            C59708cw cwVar = (C59708cw) cuVar.instance;
            C59708cw cwVar2 = C59708cw.f160195j;
            cwVar.f160197a |= 16;
            cwVar.f160201e = e;
            boolean f = bVar6.mo113045f();
            cuVar.copyOnWrite();
            C59708cw cwVar3 = (C59708cw) cuVar.instance;
            cwVar3.f160197a |= 1;
            cwVar3.f160198b = f;
            boolean h = bVar6.mo113047h();
            cuVar.copyOnWrite();
            C59708cw cwVar4 = (C59708cw) cuVar.instance;
            cwVar4.f160197a |= 32;
            cwVar4.f160202f = h;
            boolean d = bVar6.mo113043d();
            cuVar.copyOnWrite();
            C59708cw cwVar5 = (C59708cw) cuVar.instance;
            cwVar5.f160197a |= 64;
            cwVar5.f160203g = d;
        }
        try {
            C136473g gVar = new C136473g(this.f371417d, this.f371428o, b.mo112996b());
            C136439ak akVar = this.f371418e;
            C136432ad adVar = new C136432ad(this, fVar3);
            if (z2) {
                hVar2 = C136455h.f371506d;
            }
            akVar.f371455j.mo113057a("windowAttached start");
            ScheduledFuture scheduledFuture = akVar.f371451f;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                akVar.f371451f.cancel(false);
                akVar.f371451f = null;
            }
            Bundle bundle = new Bundle();
            akVar.mo113038b(true, bundle);
            akVar.f371458m = adVar;
            if (!akVar.f371454i.mo113045f()) {
                bitmap = null;
            } else if (layoutParams2 != null) {
                Context context = akVar.f371447b;
                if (Build.VERSION.SDK_INT >= 31 && !C58890d.m90990e(Build.MANUFACTURER, "xiaomi")) {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                    if (displayManager == null) {
                        ((C59052c) ((C59052c) C136439ak.f371445a.mo56226d()).mo56372aa(40749)).mo56386p("No display manager for application context");
                    } else {
                        Context createDisplayContext = context.createDisplayContext(displayManager.getDisplay(0));
                        if (createDisplayContext.getDisplay() == null) {
                            ((C59052c) ((C59052c) C136439ak.f371445a.mo56226d()).mo56372aa(40748)).mo56386p("No display context can be created from application context");
                        } else {
                            context = createDisplayContext.createWindowContext(2038, (Bundle) null);
                        }
                    }
                }
                if (configuration2 != null) {
                    context = context.createConfigurationContext(configuration2);
                }
                context.setTheme(2132150848);
                Window window = new Dialog(context, 2132150848).getWindow();
                if (window != null) {
                    if (C44534d.m78715b()) {
                        oVar = new C136538o(C44534d.m78716c(new ContextThemeWrapper(context, 2132150848)), window);
                    } else {
                        oVar = new C136538o(context, window, (byte[]) null);
                    }
                    akVar.f371455j.mo113057a(String.format(Locale.US, "initWindow in windowAttached, enableDisableTouchOnOverlayCreation: %b", new Object[]{Boolean.valueOf(akVar.f371449d)}));
                    boolean z3 = akVar.f371449d;
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(0);
                    window.addFlags(LinearLayoutManager.INVALID_OFFSET);
                    window.setWindowManager((WindowManager) null, layoutParams2.token, "Acetone", true);
                    layoutParams2.type = 4;
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    layoutParams2.flags |= 8650752;
                    layoutParams2.dimAmount = 0.0f;
                    layoutParams2.gravity = 3;
                    window.setAttributes(layoutParams2);
                    window.clearFlags(1048576);
                    if (z3) {
                        window.addFlags(24);
                    }
                    Bundle bundle2 = bundle.getBundle("windowHierarchy");
                    if (bundle2 != null) {
                        akVar.f371455j.mo113057a("Window attach: restore window hierarchy");
                        window.restoreHierarchyState(bundle2);
                    }
                    akVar.f371453h = window;
                    View inflate = LayoutInflater.from(oVar).inflate(R.layout.googleapp_fragment_container_view, (ViewGroup) null);
                    window.setContentView(inflate);
                    window.getWindowManager().addView(window.getDecorView(), window.getAttributes());
                    window.setNavigationBarContrastEnforced(false);
                    window.setStatusBarContrastEnforced(false);
                    if (Build.VERSION.SDK_INT >= 30) {
                        window.setDecorFitsSystemWindows(false);
                    } else {
                        window.findViewById(16908290).setSystemUiVisibility(1792);
                    }
                    int a = akVar.f371454i.mo113042a();
                    if (Build.VERSION.SDK_INT >= 30 && a >= 0) {
                        C2043bi.m5555ai(window.getDecorView(), new C136434af(a));
                    }
                    C136435ag agVar = new C136435ag(akVar);
                    oVar.f371748c = oVar.f371746a.getWindowManager();
                    oVar.f371747b = oVar.f371746a.getDecorView();
                    oVar.f371749d = agVar;
                    C136531i iVar = new C136531i();
                    iVar.mo51130t(window, inflate, inflate.getContext());
                    iVar.mo19987jP(true != akVar.f371450e ? null : bundle);
                    C136438aj ajVar = new C136438aj(akVar, adVar);
                    iVar.f371726w = ajVar;
                    iVar.f371717n = hVar2;
                    iVar.f371720q = Optional.m71637of(uuid);
                    boolean z4 = !iVar.f371715l && bundle.getBoolean("is_sliding_panel_open", false);
                    C136539p pVar = (C136539p) C136540q.f371751d.createBuilder();
                    C136450c cVar = (C136450c) C136451d.f371493e.createBuilder(dVar);
                    boolean isPresent = iVar.f371713j.isPresent();
                    cVar.copyOnWrite();
                    C136451d dVar5 = (C136451d) cVar.instance;
                    dVar5.f371495a |= 4;
                    dVar5.f371498d = isPresent;
                    pVar.copyOnWrite();
                    C136540q qVar = (C136540q) pVar.instance;
                    C136451d dVar6 = (C136451d) cVar.build();
                    dVar6.getClass();
                    qVar.f371755c = dVar6;
                    qVar.f371753a |= 2;
                    pVar.copyOnWrite();
                    C136540q qVar2 = (C136540q) pVar.instance;
                    qVar2.f371753a |= 1;
                    qVar2.f371754b = z4;
                    C136540q qVar3 = (C136540q) pVar.build();
                    iVar.f371716m.mo113057a("onWindowAttached");
                    C136508k j = iVar.mo113158j();
                    if (!iVar.f371715l || j == null) {
                        C136504g b2 = C136508k.m221836b(qVar3);
                        C0154a aVar = new C0154a(iVar.mo51122q());
                        aVar.mo689v(inflate.getId(), b2, "sliding_fragment");
                        aVar.mo509f();
                        b2.mo17754z().mo113111j(iVar.f122878z, new C136529g(iVar, ajVar));
                        if (iVar.f371713j.isPresent()) {
                            C136508k a2 = b2.mo17754z();
                            Fragment a3 = ((C136471g) iVar.f371713j.get()).mo113077a();
                            C58838bb.m90884s(a2.f371625b.getChildFragmentManager().f634a.mo670b(R.id.googleapp_loading_view) == null, "Must call removeLoadingFragment() before adding a new one");
                            C0154a aVar2 = new C0154a(a2.f371625b.getChildFragmentManager());
                            bitmap = null;
                            aVar2.mo689v(R.id.googleapp_loading_view, a3, (String) null);
                            aVar2.mo509f();
                            View view = b2.mo17754z().f371625b.getView();
                            if (view != null) {
                                View findViewById = view.findViewById(R.id.googleapp_loading_view);
                                View findViewById2 = view.findViewById(R.id.googleapp_content_view);
                                findViewById.setVisibility(0);
                                findViewById2.setVisibility(4);
                            }
                            iVar.f371722s = Optional.m71637of(gVar);
                            akVar.f371452g = iVar;
                        }
                    } else {
                        iVar.f371716m.mo113057a("onWindowAttached, restoring state");
                        j.mo113111j(iVar.f122878z, new C136529g(iVar, ajVar));
                        C136524b bVar7 = (C136524b) j.mo113103a();
                        if (bVar7 != null) {
                            bVar7.mo17754z().f371732e = iVar.f122878z;
                        }
                    }
                    bitmap = null;
                    iVar.f371722s = Optional.m71637of(gVar);
                    akVar.f371452g = iVar;
                } else {
                    akVar.f371455j.mo113057a("Window attach failed: Window creation failed");
                    throw new IllegalStateException("Window attach failed: Window creation failed");
                }
            } else {
                akVar.f371455j.mo113057a("Window attach failed: Layout params are null");
                throw new IllegalArgumentException("Window attach failed: Layout params are null");
            }
            C136453f fVar4 = akVar.f371455j;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(akVar.f371453h == null);
            objArr[1] = Boolean.valueOf(akVar.f371452g == null);
            fVar4.mo113057a(String.format(locale, "window attached completed isNull(overlayWindow)=%s isNull(fragmentHost)=%s", objArr));
            if (this.f371420g.mo113048i()) {
                Window window2 = this.f371418e.f371453h;
                if (window2 != null) {
                    Context context2 = window2.getContext();
                    bitmap2 = BitmapFactory.decodeResource(context2.getResources(), true != C136439ak.m221728f(context2) ? R.drawable.partner_to_google_switch_light_mode_button : R.drawable.partner_to_google_switch_dark_mode_button);
                } else {
                    bitmap2 = bitmap;
                }
                fVar2 = fVar;
                if (!(fVar2 == null || bitmap2 == null || this.f371417d < 10)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("google_overlay_icon", bitmap2);
                    ((C59052c) ((C59052c) f371414a.mo56224b()).mo56372aa(40737)).mo56386p("SharedMinusOne sent SwitcherIcon");
                    try {
                        fVar2.mo28130c(bundle3);
                    } catch (RemoteException e2) {
                        ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e2)).mo56372aa(40738)).mo56386p("Failed to update SharedOverlay Resource");
                    }
                }
            } else {
                fVar2 = fVar;
            }
            try {
                mo113030s(fVar2, mo113023b());
                this.f371426m = false;
                if (this.f371420g.mo113045f() || this.f371420g.mo113048i()) {
                    C136425b bVar8 = this.f371423j;
                    if (bVar8.f371399b && (dVar2 = (C136428d) bVar8.f371398a.get(uuid)) != null) {
                        bVar8.mo113008b(dVar2, C37182a.f97961dh.mo40779c());
                        return;
                    }
                    return;
                }
                this.f371423j.mo113009c(uuid);
            } catch (RemoteException e3) {
                ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e3)).mo56372aa(40740)).mo56386p("Unable to send status update to the client");
                this.f371423j.mo113011f(uuid, 3);
            }
        } catch (IllegalArgumentException e4) {
            ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e4)).mo56372aa(40741)).mo56386p("Invalid arguments");
            this.f371423j.mo113011f(uuid, 1);
        } catch (IllegalStateException e5) {
            ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e5)).mo56372aa(40742)).mo56386p("Illegal state occurred");
            this.f371423j.mo113011f(uuid, 2);
        } catch (WindowManager.BadTokenException e6) {
            ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e6)).mo56372aa(40743)).mo56386p("Window attach failed: Bad token exception occurred");
            this.f371423j.mo113011f(uuid, 1);
            mo28075F(false);
        } catch (RuntimeException e7) {
            ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e7)).mo56372aa(40744)).mo56386p("Window attach failed with the RuntimeException");
            this.f371423j.mo113011f(uuid, 6);
        }
    }

    /* renamed from: F */
    public final void mo28075F(boolean z) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "windowDetached");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136547n(this, z)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: G */
    public final boolean mo28076G() {
        return true;
    }

    @Deprecated
    /* renamed from: I */
    public final boolean mo28077I() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154 A[Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157 A[Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0180 A[Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28078J(byte[] r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1.f371427n
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.android.apps.search.googleapp.launcher.b.a.b r0 = r1.f371423j
            java.util.UUID r3 = java.util.UUID.randomUUID()
            boolean r4 = r0.f371399b
            if (r4 == 0) goto L_0x0028
            com.google.android.libraries.search.b.i.f r4 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97820az
            com.google.android.libraries.search.b.i.h r4 = r4.mo40806d()
            r0.mo113014i(r3, r4)
            com.google.android.apps.search.googleapp.launcher.b.a.d r4 = r0.mo113007a(r3)
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97819ay
            com.google.android.libraries.search.b.i.a r5 = r5.mo40779c()
            r0.mo113008b(r4, r5)
        L_0x0028:
            com.google.android.apps.search.googleapp.launcher.b.ak r4 = r1.f371418e     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.launcher.b.b r0 = r4.f371454i     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            boolean r0 = r0.mo113047h()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r5 = 1
            if (r0 == 0) goto L_0x01ad
            com.google.android.apps.search.googleapp.h.p r0 = com.google.android.apps.search.googleapp.p10310h.C136135p.f370764b     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r6 = r0
            com.google.android.apps.search.googleapp.h.o r6 = (com.google.android.apps.search.googleapp.p10310h.C136134o) r6     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            com.google.android.apps.search.googleapp.launcher.b.g.h r8 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136481h.f371584b     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            r9 = r17
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r9, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            com.google.android.apps.search.googleapp.launcher.b.g.h r0 = (com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136481h) r0     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            com.google.android.apps.search.googleapp.launcher.b.g.f r0 = r0.f371586a     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            if (r0 != 0) goto L_0x0054
            com.google.android.apps.search.googleapp.launcher.b.g.f r0 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136479f.f371574i     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
        L_0x0054:
            int r8 = r0.f371576a     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            r9 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r9
            r9 = 2
            if (r8 == 0) goto L_0x0088
            int r8 = r0.f371583h     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            int r8 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136483j.m221798a(r8)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            if (r8 != 0) goto L_0x0065
            r8 = 1
        L_0x0065:
            int r8 = r8 + -1
            if (r8 == r5) goto L_0x0081
            if (r8 == r9) goto L_0x007a
            r10 = 3
            if (r8 == r10) goto L_0x0073
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            goto L_0x008c
        L_0x0073:
            java.lang.String r8 = "and.gsa.launcher.shelf.appssearch"
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            goto L_0x008c
        L_0x007a:
            java.lang.String r8 = "and.gsa.launcher.allapps.appssearch"
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            goto L_0x008c
        L_0x0081:
            java.lang.String r8 = "and.gsa.launcher.homescreen.appssearch"
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            goto L_0x008c
        L_0x0088:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
        L_0x008c:
            int r8 = r0.f371582g     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            int r8 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136485l.m221799a(r8)     // Catch:{ ct -> 0x0138, NullPointerException -> 0x0136 }
            if (r8 != 0) goto L_0x0096
        L_0x0094:
            r8 = 0
            goto L_0x0099
        L_0x0096:
            if (r8 != r9) goto L_0x0094
            r8 = 1
        L_0x0099:
            com.google.protobuf.cq r10 = r0.f371578c     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
        L_0x009f:
            boolean r11 = r10.hasNext()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r11 == 0) goto L_0x00f1
            java.lang.Object r11 = r10.next()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.launcher.b.g.d r11 = (com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136477d) r11     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.h.n r12 = com.google.android.apps.search.googleapp.p10310h.C136133n.f370758e     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.h.m r12 = (com.google.android.apps.search.googleapp.p10310h.C136132m) r12     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            java.lang.String r13 = r11.f371570a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r12.copyOnWrite()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.h.n r14 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r14     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r13.getClass()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            int r15 = r14.f370760a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r15 = r15 | r9
            r14.f370760a = r15     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r14.f370762c = r13     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            java.lang.String r13 = r11.f371572c     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r12.copyOnWrite()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.h.n r14 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r14     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r13.getClass()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            int r15 = r14.f370760a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r15 = r15 | r5
            r14.f370760a = r15     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r14.f370761b = r13     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            java.lang.String r11 = r11.f371571b     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r12.copyOnWrite()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.h.n r13 = (com.google.android.apps.search.googleapp.p10310h.C136133n) r13     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r11.getClass()     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            int r14 = r13.f370760a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r14 = r14 | 4
            r13.f370760a = r14     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r13.f370763d = r11     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r6.mo112791a(r12)     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            goto L_0x009f
        L_0x00f1:
            com.google.android.apps.search.googleapp.pixelsuggest.f r9 = new com.google.android.apps.search.googleapp.pixelsuggest.f     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.launcher.b.g.b r10 = r0.f371577b     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r10 != 0) goto L_0x00f9
            com.google.android.apps.search.googleapp.launcher.b.g.b r10 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136475b.f371563c     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
        L_0x00f9:
            int r10 = r10.f371566b     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r9.<init>(r10)     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            boolean r10 = r0.f371581f     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r10 == 0) goto L_0x0128
            java.lang.String r10 = "preview_bitmap"
            r11 = r18
            android.os.Parcelable r10 = r11.getParcelable(r10)     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r10 == 0) goto L_0x0128
            com.google.android.apps.search.googleapp.pixelsuggest.e r11 = r4.f371456k     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r11.f372595b = r10     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.launcher.b.g.b r10 = r0.f371580e     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r10 != 0) goto L_0x0118
            com.google.android.apps.search.googleapp.launcher.b.g.b r10 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136475b.f371563c     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
        L_0x0118:
            int r10 = r10.f371565a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r9.f372598b = r10     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            com.google.android.apps.search.googleapp.launcher.b.g.b r0 = r0.f371579d     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            if (r0 != 0) goto L_0x0122
            com.google.android.apps.search.googleapp.launcher.b.g.b r0 = com.google.android.apps.search.googleapp.launcher.p10341b.p10349g.C136475b.f371563c     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
        L_0x0122:
            int r0 = r0.f371565a     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r9.f372599c = r0     // Catch:{ ct -> 0x0134, NullPointerException -> 0x0132 }
            r10 = 1
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            com.google.android.apps.search.googleapp.pixelsuggest.e r0 = r4.f371456k     // Catch:{ ct -> 0x0130, NullPointerException -> 0x012e }
            r0.f372594a = r9     // Catch:{ ct -> 0x0130, NullPointerException -> 0x012e }
            goto L_0x0149
        L_0x012e:
            r0 = move-exception
            goto L_0x013b
        L_0x0130:
            r0 = move-exception
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            goto L_0x013a
        L_0x0134:
            r0 = move-exception
            goto L_0x013a
        L_0x0136:
            r0 = move-exception
            goto L_0x0139
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            r8 = 0
        L_0x013a:
            r10 = 0
        L_0x013b:
            com.google.common.f.e r9 = com.google.android.apps.search.googleapp.launcher.p10341b.C136439ak.f371445a     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.common.f.x r9 = r9.mo56225c()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            java.lang.String r11 = "Bad config in startSearchParams"
            r12 = 40766(0x9f3e, float:5.7125E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r0)).mo56372aa(r12)).mo56386p(r11)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
        L_0x0149:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.h.i r9 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            if (r8 == 0) goto L_0x0157
            com.google.android.apps.search.googleapp.u.t r8 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            goto L_0x0159
        L_0x0157:
            com.google.android.apps.search.googleapp.u.t r8 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
        L_0x0159:
            r9.mo112776k(r8)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.h.p r6 = (com.google.android.apps.search.googleapp.p10310h.C136135p) r6     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r9.mo112773h(r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.h.j r6 = r9.mo112766a()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r0, r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r6 = 268468224(0x10008000, float:2.5342157E-29)
            r0.setFlags(r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.launcher.b.ah r6 = new com.google.android.apps.search.googleapp.launcher.b.ah     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r6.<init>(r0)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r7.ifPresent(r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            if (r10 == 0) goto L_0x0185
            r6 = 65536(0x10000, float:9.18355E-41)
            r0.addFlags(r6)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
        L_0x0185:
            com.google.android.apps.search.googleapp.launcher.b.c.f r6 = r4.f371455j     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            java.lang.String r7 = "Starting Search activity"
            r6.mo113057a(r7)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            android.content.Context r4 = r4.f371447b     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.apps.tiktok.tracing.C47810es.m84979s(r4, r0)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.launcher.b.a.b r0 = r1.f371423j     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            boolean r4 = r0.f371399b     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            if (r4 == 0) goto L_0x01ac
            android.util.LruCache r4 = r0.f371398a     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.launcher.b.a.d r4 = (com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136428d) r4     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            if (r4 == 0) goto L_0x01ac
            com.google.android.libraries.search.b.i.f r6 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97820az     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.libraries.search.b.i.h r6 = r6.mo40806d()     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r0.mo113013h(r4, r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
        L_0x01ac:
            return r5
        L_0x01ad:
            com.google.android.apps.search.googleapp.launcher.b.c.f r0 = r4.f371455j     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            java.lang.String r4 = "Pixel suggest mode is disabled"
            r0.mo113057a(r4)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            com.google.android.apps.search.googleapp.launcher.b.a.b r0 = r1.f371423j     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            r0.mo113012g(r3, r5)     // Catch:{ ActivityNotFoundException -> 0x01c1, RuntimeException -> 0x01ba }
            return r2
        L_0x01ba:
            com.google.android.apps.search.googleapp.launcher.b.a.b r0 = r1.f371423j
            r4 = 6
            r0.mo113012g(r3, r4)
            goto L_0x01c7
        L_0x01c1:
            com.google.android.apps.search.googleapp.launcher.b.a.b r0 = r1.f371423j
            r4 = 5
            r0.mo113012g(r3, r4)
        L_0x01c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.launcher.p10341b.C136433ae.mo28078J(byte[], android.os.Bundle):boolean");
    }

    /* renamed from: K */
    public final void mo113022K(int i) {
        C136428d dVar;
        UUID uuid = this.f371425l;
        if (uuid != null) {
            C136425b bVar = this.f371423j;
            if (bVar.f371399b && (dVar = (C136428d) bVar.f371398a.get(uuid)) != null) {
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 1) {
                    C59706cu cuVar = dVar.f371407d;
                    cuVar.copyOnWrite();
                    C59708cw cwVar = (C59708cw) cuVar.instance;
                    C59708cw cwVar2 = C59708cw.f160195j;
                    cwVar.f160204h = 1;
                    cwVar.f160197a |= 128;
                } else if (i2 == 2) {
                    C59706cu cuVar2 = dVar.f371407d;
                    cuVar2.copyOnWrite();
                    C59708cw cwVar3 = (C59708cw) cuVar2.instance;
                    C59708cw cwVar4 = C59708cw.f160195j;
                    cwVar3.f160204h = 2;
                    cwVar3.f160197a |= 128;
                } else if (i2 == 3) {
                    C59706cu cuVar3 = dVar.f371407d;
                    cuVar3.copyOnWrite();
                    C59708cw cwVar5 = (C59708cw) cuVar3.instance;
                    C59708cw cwVar6 = C59708cw.f160195j;
                    cwVar5.f160204h = 3;
                    cwVar5.f160197a |= 128;
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo113023b() {
        boolean f = this.f371420g.mo113045f();
        if (this.f371420g.mo113044e()) {
            f |= true;
        }
        if (this.f371420g.mo113047h()) {
            f |= true;
        }
        if (this.f371417d < 11) {
            return f ? 1 : 0;
        }
        if (this.f371420g.mo113046g()) {
            return f | true ? 1 : 0;
        }
        return f;
    }

    public final void close() {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "close");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136430ab(this)));
                this.f371427n = true;
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final String mo28081e() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo28082f(int i) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "closeOverlay");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136553t(this, i)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo28083g(Bundle bundle) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "closeOverlay2");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136559z(this, bundle)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo113025h(C136456d dVar) {
        if (this.f371426m) {
            C136425b bVar = this.f371423j;
            UUID randomUUID = UUID.randomUUID();
            if (bVar.f371399b) {
                bVar.mo113014i(randomUUID, C37182a.f97749H.mo40806d());
                C136428d a = bVar.mo113007a(randomUUID);
                a.mo113016a(dVar);
                bVar.mo113008b(a, C37182a.f97748G.mo40779c());
            }
            mo113034y(randomUUID);
        }
        this.f371418e.mo113037a(dVar);
    }

    /* renamed from: i */
    public final void mo28084i() {
        if (!this.f371427n) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f371435v.mo26870b());
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "endScroll");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136554u(this, ofEpochMilli)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo113026j() {
        UUID uuid = this.f371425l;
        if (uuid != null) {
            this.f371423j.mo113010d(uuid);
        }
    }

    /* renamed from: k */
    public final void mo113027k() {
        C136428d dVar;
        UUID uuid = this.f371425l;
        if (uuid != null) {
            C136425b bVar = this.f371423j;
            if (bVar.f371399b && (dVar = (C136428d) bVar.f371398a.get(uuid)) != null) {
                bVar.mo113013h(dVar, C37182a.f97749H.mo40806d(), C62722b.OK);
            }
        }
    }

    /* renamed from: l */
    public final void mo113028l(C146710f fVar) {
        try {
            if (this.f371417d >= 10) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("overlay_animation_complete", true);
                fVar.mo28130c(bundle);
            }
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f371414a.mo56225c()).mo56382g(e)).mo56372aa(40739)).mo56386p("Unable to send status update to the client");
        }
    }

    /* renamed from: m */
    public final void mo28085m() {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "onPause");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136557x(this)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: n */
    public final void mo28086n() {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "onResume");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136556w(this)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: o */
    public final void mo28087o(float f) {
        if (!this.f371427n) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f371435v.mo26870b());
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "onScroll");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136549p(this, f, ofEpochMilli)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (!this.f371436w) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (Binder.getCallingUid() == this.f371429p) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ((C59052c) ((C59052c) f371414a.mo56225c()).mo56372aa(40745)).mo56386p("Invalid caller Package. ensureValidCaller failed!");
        return false;
    }

    /* renamed from: p */
    public final void mo28088p(int i) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "openOverlay");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136551r(this, i)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: q */
    public final void mo28089q(Bundle bundle) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "openOverlay2");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136546m(this, bundle)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: r */
    public final void mo113029r(C136456d dVar, boolean z) {
        C136508k j;
        C136512o c;
        C136425b bVar = this.f371423j;
        UUID randomUUID = UUID.randomUUID();
        if (bVar.f371399b) {
            bVar.mo113014i(randomUUID, C37182a.f97749H.mo40806d());
            C136428d a = bVar.mo113007a(randomUUID);
            a.mo113016a(dVar);
            bVar.mo113008b(a, C37182a.f97747F.mo40779c());
        }
        mo113034y(randomUUID);
        C136439ak akVar = this.f371418e;
        C136486h hVar = (C136486h) dVar;
        akVar.f371455j.mo113057a(String.format(Locale.US, "openOverlay animationType=%d animationDuration=%d isLayerModeEnabled=%s", new Object[]{Integer.valueOf(hVar.f371591b - 1), Integer.valueOf(hVar.f371590a), Boolean.valueOf(z)}));
        C136531i iVar = akVar.f371452g;
        if (iVar != null && (j = iVar.mo113158j()) != null && j.f371636m != 2 && (c = j.mo113104c()) != null) {
            C136521x a2 = c.mo17754z();
            int i = hVar.f371590a;
            if (i <= 0) {
                i = 750;
            }
            a2.f371663H = 2;
            int i2 = hVar.f371591b - 1;
            if (i2 == 0) {
                a2.mo113152t();
            } else if (i2 != 3) {
                a2.mo113143k(i);
            } else if (a2.f371667d.getMeasuredWidth() == 0) {
                a2.mo113152t();
            } else {
                a2.mo113140h();
                a2.f371668e.setAlpha(0.0f);
                a2.f371668e.setScaleX(0.92f);
                a2.f371668e.setScaleY(0.92f);
                a2.mo113147o();
                a2.f371668e.animate().setDuration((long) i).scaleX(1.0f).scaleY(1.0f).setInterpolator(C136521x.f371655c).setUpdateListener(new C47583cg(a2.f371684u, new C136515r(a2), "SlidingPanel fade-in")).alpha(1.0f).withEndAction(new C136516s(a2));
            }
        }
    }

    /* renamed from: s */
    public final void mo113030s(C146710f fVar, int i) {
        if (this.f371417d >= 10) {
            Bundle bundle = new Bundle();
            bundle.putInt("service_status", i);
            C136439ak akVar = this.f371418e;
            Context context = akVar.f371447b;
            Window window = akVar.f371453h;
            if (window != null) {
                context = window.getContext();
            }
            bundle.putParcelable("minus_one_thumbnail_image_960_540", Icon.createWithResource(context, true != C136439ak.m221728f(context) ? R.drawable.minus_one_thumbnail_light_mode : R.drawable.minus_one_thumbnail_dark_mode));
            bundle.putString("minus_one_product_name", this.f371418e.f371447b.getString(R.string.googleapp_minus_one_product_name));
            fVar.mo28130c(bundle);
            return;
        }
        fVar.mo28129b(i);
    }

    /* renamed from: t */
    public final void mo28091t(boolean z) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "requestVoiceDetection");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136555v(this, z)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: u */
    public final void mo28092u(int i) {
        if (!this.f371427n) {
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "setActivityState");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136558y(this, i)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: v */
    public final synchronized void mo113031v(C2383n nVar) {
        boolean a = this.f371419f.mo5788a(C2383n.STARTED);
        boolean a2 = this.f371419f.mo5788a(C2383n.RESUMED);
        boolean a3 = nVar.mo5788a(C2383n.STARTED);
        boolean a4 = nVar.mo5788a(C2383n.RESUMED);
        if (!a && a3) {
            C136439ak akVar = this.f371418e;
            akVar.f371455j.mo113057a("onStart");
            C136531i iVar = akVar.f371452g;
            if (iVar != null) {
                iVar.mo51128g();
            }
        }
        if (!a2 && a4) {
            C136439ak akVar2 = this.f371418e;
            akVar2.f371455j.mo113057a("onResume");
            if (akVar2.f371454i.mo113044e()) {
                akVar2.f371448c.mo113085a();
            }
            C136531i iVar2 = akVar2.f371452g;
            if (iVar2 != null) {
                iVar2.mo51127f();
            }
            this.f371432s.mo113051c(this.f371417d, this.f371428o, this.f371420g);
        }
        if (a2 && !a4) {
            C136439ak akVar3 = this.f371418e;
            akVar3.f371455j.mo113057a("onPause");
            if (akVar3.f371454i.mo113044e()) {
                akVar3.f371448c.mo113086b();
            }
            C136531i iVar3 = akVar3.f371452g;
            if (iVar3 != null) {
                iVar3.mo51126e();
            }
        }
        if (a && !a3) {
            C136439ak akVar4 = this.f371418e;
            akVar4.f371455j.mo113057a("onStop");
            C136531i iVar4 = akVar4.f371452g;
            if (iVar4 != null) {
                iVar4.mo22016h();
            }
        }
        this.f371419f = nVar;
    }

    /* renamed from: w */
    public final void mo113032w(boolean z) {
        C136423a c = C136443b.m221738c(this.f371420g);
        c.mo113001g(z);
        mo113020B(c.mo112996b());
    }

    /* renamed from: x */
    public final void mo113033x(float f) {
        C136428d dVar;
        UUID uuid = this.f371425l;
        if (uuid != null) {
            C136425b bVar = this.f371423j;
            double d = (double) f;
            if (bVar.f371399b && (dVar = (C136428d) bVar.f371398a.get(uuid)) != null) {
                C59706cu cuVar = dVar.f371407d;
                cuVar.copyOnWrite();
                C59708cw cwVar = (C59708cw) cuVar.instance;
                C59708cw cwVar2 = C59708cw.f160195j;
                cwVar.f160197a |= 256;
                cwVar.f160205i = (double) ((float) d);
            }
        }
    }

    /* renamed from: y */
    public final void mo113034y(UUID uuid) {
        UUID uuid2 = this.f371425l;
        if (uuid2 != null) {
            this.f371423j.mo113010d(uuid2);
        }
        this.f371425l = uuid;
    }

    /* renamed from: z */
    public final void mo28093z() {
        if (!this.f371427n) {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f371435v.mo26870b());
            C47573bx a = this.f371431r.mo51699a("OverlayBinder", "startScroll");
            try {
                this.f371433t.execute(C47810es.m84977q(new C136545l(this, ofEpochMilli)));
                a.close();
                return;
            } catch (Throwable th) {
                C136544k.m221927a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
