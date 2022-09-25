package com.google.android.gms.car.p10760f;

import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.car.C143091ac;
import com.google.android.gms.car.C143092ad;
import com.google.android.gms.car.C143093ae;
import com.google.android.gms.car.C143097ai;
import com.google.android.gms.car.C143102an;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.C143143c;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143163cs;
import com.google.android.gms.car.C143171d;
import com.google.android.gms.car.C143179df;
import com.google.android.gms.car.C143180dg;
import com.google.android.gms.car.C143181dh;
import com.google.android.gms.car.C143182di;
import com.google.android.gms.car.C143193dj;
import com.google.android.gms.car.C143207dx;
import com.google.android.gms.car.C143341z;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.p10750a.p10751a.C142982af;
import com.google.android.gms.car.p10750a.p10751a.C143059db;
import com.google.android.gms.car.p10760f.p10762b.C143264a;
import com.google.android.gms.car.p10760f.p10762b.C143265b;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.common.C143701ac;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58838bb;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.gms.car.f.bb */
/* compiled from: PG */
public final class C143268bb implements KeyEvent.Callback, C143097ai, C143092ad, C143193dj {

    /* renamed from: a */
    public static final SparseArray f388432a;

    /* renamed from: A */
    public boolean f388433A;

    /* renamed from: B */
    public final C143341z f388434B;

    /* renamed from: C */
    public final boolean f388435C;

    /* renamed from: D */
    public Object f388436D;

    /* renamed from: E */
    public DrawingSpec f388437E;

    /* renamed from: F */
    public boolean f388438F;

    /* renamed from: G */
    public boolean f388439G;

    /* renamed from: H */
    public final Queue f388440H;

    /* renamed from: I */
    public final Object f388441I;

    /* renamed from: J */
    public boolean f388442J;

    /* renamed from: K */
    public final KeyEvent.DispatcherState f388443K;

    /* renamed from: L */
    public volatile int f388444L;

    /* renamed from: M */
    final C143181dh f388445M;

    /* renamed from: N */
    public C143269bc f388446N;

    /* renamed from: O */
    public C143150cf f388447O;

    /* renamed from: P */
    private boolean f388448P;

    /* renamed from: Q */
    private boolean f388449Q;

    /* renamed from: R */
    private ComponentName f388450R;

    /* renamed from: S */
    private ComponentCallbacks f388451S;

    /* renamed from: T */
    private final C143308w f388452T;

    /* renamed from: b */
    public final Pair f388453b;

    /* renamed from: c */
    public C143260ax f388454c;

    /* renamed from: d */
    public final Semaphore f388455d;

    /* renamed from: e */
    public final Runnable f388456e;

    /* renamed from: f */
    public final IBinder.DeathRecipient f388457f;

    /* renamed from: g */
    public Service f388458g;

    /* renamed from: h */
    public Context f388459h;

    /* renamed from: i */
    public Class f388460i;

    /* renamed from: j */
    public C143091ac f388461j;

    /* renamed from: k */
    public CarRegionId f388462k;

    /* renamed from: l */
    public C143207dx f388463l;

    /* renamed from: m */
    public C143179df f388464m;

    /* renamed from: n */
    public C143102an f388465n;

    /* renamed from: o */
    public Intent f388466o;

    /* renamed from: p */
    public Bundle f388467p;

    /* renamed from: q */
    public Configuration f388468q;

    /* renamed from: r */
    public boolean f388469r;

    /* renamed from: s */
    public int f388470s;

    /* renamed from: t */
    public volatile boolean f388471t;

    /* renamed from: u */
    public View f388472u;

    /* renamed from: v */
    public String f388473v;

    /* renamed from: w */
    public C143284br f388474w;

    /* renamed from: x */
    public C143093ae f388475x;

    /* renamed from: y */
    public final Rect f388476y;

    /* renamed from: z */
    public final C143059db f388477z;

    static {
        SparseArray sparseArray = new SparseArray(7);
        f388432a = sparseArray;
        sparseArray.put(0, "INITIALIZING");
        sparseArray.put(1, "CREATED");
        sparseArray.put(2, "STOPPED");
        sparseArray.put(3, "STARTED");
        sparseArray.put(4, "PAUSED");
        sparseArray.put(5, "RESUMED");
        sparseArray.put(6, "FINISHED");
    }

    public C143268bb() {
        this((byte[]) null);
    }

    /* renamed from: A */
    private final void m232419A() {
        C143059db dbVar = this.f388477z;
        if (dbVar != null) {
            C143308w wVar = this.f388452T;
            try {
                dbVar.mo117926h(CarDisplayId.f388291a).mo117972c(wVar);
            } catch (C143111aw | IllegalStateException e) {
                C143316a.m232514d(5, "CAR.CLIENT", e, "Couldn't unregister listener: %s", wVar);
            }
        }
        if (this.f388451S != null) {
            C143179df dfVar = this.f388464m;
            if (dfVar != null) {
                ((ContextWrapper) dfVar.mo118141a()).getBaseContext().unregisterComponentCallbacks(this.f388451S);
            }
            this.f388451S = null;
        }
        C143179df dfVar2 = this.f388464m;
        if (dfVar2 != null) {
            dfVar2.f388258f = false;
            dfVar2.dismiss();
            HandlerThread handlerThread = dfVar2.f388238M;
            if (handlerThread != null) {
                handlerThread.quit();
                dfVar2.f388238M = null;
            }
            dfVar2.f388239N = null;
            this.f388464m = null;
        }
        if (this.f388439G) {
            this.f388439G = false;
            m232420B();
        }
    }

    /* renamed from: B */
    private final void m232420B() {
        for (Runnable a : this.f388440H) {
            C143181dh.m232308a(Looper.getMainLooper(), a);
        }
        this.f388440H.clear();
    }

    /* renamed from: e */
    public static String m232421e(int i) {
        SparseArray sparseArray = f388432a;
        if (sparseArray.get(i) == null) {
            return "Unknown";
        }
        return (String) sparseArray.get(i);
    }

    /* renamed from: w */
    public static final C143091ac m232422w(ClassLoader classLoader, String str) {
        try {
            return (C143091ac) classLoader.loadClass(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("Exception while instantiating class ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: x */
    private final int m232423x(String str, int i) {
        try {
            return this.f388477z.mo117925g(str, i);
        } catch (C143111aw e) {
            C143316a.m232514d(5, "CAR.PROJECTION.CAHI", e, "Unable to connect to car service to get %s. Using default value %s", str, Integer.valueOf(i));
            return i;
        }
    }

    /* renamed from: y */
    private final void m232424y(boolean z, Runnable runnable) {
        Set set;
        boolean z2;
        int i;
        int i2;
        int i3;
        C143285bs bsVar;
        int i4;
        Runnable runnable2 = runnable;
        if (this.f388463l != null) {
            C143179df dfVar = this.f388464m;
            if (dfVar == null || dfVar.getDisplay() != this.f388463l.f388308a.getDisplay()) {
                m232419A();
                boolean p = this.f388477z.mo117934p(C143264a.FULLSCREEN_PRESENTATION);
                C143059db dbVar = this.f388477z;
                C143265b bVar = C143265b.SUPPORTS_FOCUS_IN_NON_FOCUSED_WINDOWS_WHITELIST;
                String str = (String) dbVar.f388031f.mo118276b(new C142982af(dbVar, bVar), bVar.f388427e);
                if (!TextUtils.isEmpty(str)) {
                    List<String> asList = Arrays.asList(str.split(","));
                    HashSet hashSet = new HashSet(asList.size());
                    for (String str2 : asList) {
                        String[] split = str2.split(":", 2);
                        int length = split.length;
                        if (length == 0) {
                            bsVar = null;
                        } else {
                            String str3 = split[0];
                            if (length > 1) {
                                try {
                                    i4 = Integer.decode(split[1]).intValue();
                                } catch (NumberFormatException unused) {
                                }
                                bsVar = new C143285bs(str3, i4);
                            }
                            i4 = 0;
                            bsVar = new C143285bs(str3, i4);
                        }
                        if (bsVar != null) {
                            hashSet.add(bsVar);
                        } else {
                            throw new IllegalArgumentException("Invalid package spec: ".concat(String.valueOf(str2)));
                        }
                    }
                    set = Collections.unmodifiableSet(new HashSet(hashSet));
                } else {
                    set = Collections.emptySet();
                }
                Set set2 = set;
                Service service = this.f388458g;
                if (!set2.isEmpty()) {
                    String packageName = service.getPackageName();
                    try {
                        i3 = service.getPackageManager().getPackageInfo(service.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        C143316a.m232514d(5, "PackageCapabilities", e, "Unable to resolve package versionCode", new Object[0]);
                        i3 = 0;
                    }
                    Iterator it = set2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        C143285bs bsVar2 = (C143285bs) it.next();
                        if (packageName.equals(bsVar2.f388496a) && i3 >= bsVar2.f388497b) {
                            break;
                        }
                    }
                }
                z2 = true;
                boolean z3 = !z2;
                boolean q = this.f388477z.mo117935q(33);
                if (this.f388477z.mo117935q(38)) {
                    i2 = m232423x("projected_presentation_config_max_checks", 10);
                    i = m232423x("projected_presentation_config_check_delay", 20);
                } else {
                    i2 = 10;
                    i = 20;
                }
                Service service2 = this.f388458g;
                Display display = this.f388463l.f388308a.getDisplay();
                String str4 = this.f388473v;
                C143143c cVar = new C143143c();
                cVar.mo118080d(false);
                cVar.mo118081e(false);
                cVar.mo118077a(false);
                cVar.mo118079c(10);
                cVar.mo118078b(20);
                cVar.mo118080d(q);
                cVar.mo118081e(this.f388477z.mo117935q(38));
                cVar.mo118077a(this.f388477z.mo117935q(39));
                cVar.mo118079c(i2);
                cVar.mo118078b(i);
                if (cVar.f388199f != 31) {
                    StringBuilder sb = new StringBuilder();
                    if ((cVar.f388199f & 1) == 0) {
                        sb.append(" useConfigurationContext");
                    }
                    if ((cVar.f388199f & 2) == 0) {
                        sb.append(" waitUntilPresentationConfigured");
                    }
                    if ((cVar.f388199f & 4) == 0) {
                        sb.append(" crashIfUnableToConfigure");
                    }
                    if ((cVar.f388199f & 8) == 0) {
                        sb.append(" delayBetweenConfigChecks");
                    }
                    if ((cVar.f388199f & 16) == 0) {
                        sb.append(" maxConfigChecks");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                C143171d dVar = new C143171d(cVar.f388194a, cVar.f388195b, cVar.f388196c, cVar.f388197d, cVar.f388198e);
                String str5 = str4;
                C143179df dfVar2 = r4;
                C143179df dfVar3 = new C143179df(service2, display, str5, p, z3, dVar);
                if (Build.VERSION.SDK_INT == 31 && dVar.f388219b) {
                    if (C143316a.m232515e("CAR.PROJECTION.PRES", 4)) {
                        C143316a.m232513c("CAR.PROJECTION.PRES", (Throwable) null, "Waiting for correct configuration");
                    }
                    dfVar2.f388238M = new HandlerThread("ProjectedPresentation");
                    dfVar2.f388238M.start();
                    dfVar2.f388239N = new C144861c(dfVar2.f388238M.getLooper());
                    Handler handler = dfVar2.f388239N;
                    C58838bb.m90866a(handler, "presentationConfigurationCheckingHandler can't be null if we're waiting for correct configuration");
                    handler.post(new C143163cs(dfVar2));
                    try {
                        dfVar2.f388241P.acquire();
                    } catch (InterruptedException e2) {
                        if (C143316a.m232515e("CAR.PROJECTION.PRES", 6)) {
                            C143316a.m232512b("CAR.PROJECTION.PRES", e2, "Unable to acquire presentationConfiguredSemaphore");
                        }
                    }
                } else if (C143316a.m232515e("CAR.PROJECTION.PRES", 4)) {
                    C143316a.m232513c("CAR.PROJECTION.PRES", (Throwable) null, "Not waiting for correct configuration");
                }
                this.f388464m = dfVar2;
                if (!z || Build.VERSION.SDK_INT != 31) {
                    m232425z();
                    return;
                }
                this.f388439G = true;
                this.f388451S = new C143305t(this, runnable2);
                ((ContextWrapper) this.f388464m.mo118141a()).getBaseContext().registerComponentCallbacks(this.f388451S);
                if (this.f388437E.mo117900a(this.f388464m.mo118141a().getResources().getConfiguration())) {
                    if (C143316a.m232515e("CAR.PROJECTION.CAHI", 4)) {
                        C143316a.m232513c("CAR.PROJECTION.CAHI", (Throwable) null, "Presentation was ready immediately");
                    }
                    this.f388439G = false;
                    mo118313m(runnable2);
                    return;
                }
                return;
            }
            this.f388464m.mo118158o(this.f388476y);
            if (runnable2 != null) {
                ((C143303r) runnable2).f388530a.mo118307g();
                return;
            }
            return;
        }
        throw new RuntimeException("attachPresentation virtual display is null");
    }

    /* renamed from: z */
    private final void m232425z() {
        this.f388464m.f388254b = this.f388477z.mo117934p(C143264a.PRESENTATION_CLEAR_PARENT_PADDING);
        C143179df dfVar = this.f388464m;
        dfVar.f388228C = true;
        dfVar.mo118158o(this.f388476y);
        if (this.f388477z.mo117935q(33)) {
            mo118323s(this.f388464m.f388237L);
        } else {
            mo118325u(this.f388464m.mo118141a().getResources());
        }
        mo118324t();
        try {
            C143059db dbVar = this.f388477z;
            dbVar.mo117926h(CarDisplayId.f388291a).mo117971b(this.f388452T);
        } catch (C143111aw unused) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s attachPresentation while not connected to car", this.f388473v);
            }
        }
        this.f388464m.getWindow().setCallback(new C143182di(this));
        if (this.f388464m.getWindow().getAttributes() != null) {
            this.f388464m.getWindow().getAttributes().setTitle(this.f388473v);
        }
        if (this.f388477z.mo117935q(33)) {
            this.f388461j.mo118015E(this.f388464m.f388237L);
        } else {
            this.f388461j.mo118015E(this.f388464m.mo118141a());
        }
        this.f388461j.mo118028y(this);
    }

    /* renamed from: a */
    public final void mo118030a() {
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.finish()", this.f388473v);
        }
        if (!this.f388471t) {
            this.f388471t = true;
            new C144861c(Looper.getMainLooper()).postAtFrontOfQueue(new C143237aa(this));
        } else if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Already finishing %s, ignoring duplicate finish", this.f388473v);
        }
    }

    /* renamed from: b */
    public final void mo118031b(View view) {
        this.f388472u = view;
        this.f388464m.setContentView(view);
    }

    /* renamed from: c */
    public final void mo118217c(boolean z, boolean z2) {
        synchronized (this.f388441I) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s performWindowFocusChange(hasFocus:%b, inTouchMode%b) [activityHasWindowFocus:%b]", this.f388473v, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f388442J));
            }
            this.f388442J = z;
            this.f388441I.notifyAll();
        }
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s %s.onWindowFocusChanged, focus=%b, touch mode=%b", this.f388450R.toShortString(), this.f388473v, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        this.f388461j.mo17289k(z);
    }

    /* renamed from: d */
    public final boolean mo118218d() {
        boolean z;
        synchronized (this.f388441I) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s hasWindowFocus() [activityHasWindowFocus:%b]", this.f388473v, Boolean.valueOf(this.f388442J));
            }
            z = this.f388442J;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo118306f() {
        C143181dh dhVar = this.f388445M;
        Context context = this.f388459h;
        int callingUid = Binder.getCallingUid();
        boolean z = dhVar.f388281a;
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        int length = packagesForUid.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C143701ac.m233450a(context).mo119084c(packagesForUid[i])) {
                z2 = true;
                break;
            }
            i++;
        }
        boolean z3 = dhVar.f388281a;
        if (!z2 && this.f388459h.checkCallingPermission("android.permission.CAPTURE_VIDEO_OUTPUT") != 0) {
            int callingPid = Binder.getCallingPid();
            int callingUid2 = Binder.getCallingUid();
            throw new SecurityException("projection client manager does not have permission:android.permission.CAPTURE_VIDEO_OUTPUT pid:" + callingPid + " uid:" + callingUid2);
        }
    }

    /* renamed from: g */
    public final void mo118307g() {
        C143179df dfVar;
        mo118311k(3, false);
        this.f388438F = true;
        if (this.f388477z.mo117935q(32) && (dfVar = this.f388464m) != null) {
            dfVar.mo118163s(this.f388476y);
        }
        try {
            C143150cf cfVar = this.f388447O;
            if (cfVar != null) {
                cfVar.mo17262he(1, cfVar.mo17260gA());
            }
        } catch (RemoteException unused) {
            mo118322r();
        }
    }

    /* renamed from: h */
    public final void mo118308h(int i, int i2, int i3, Surface surface) {
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.createVirtualDisplay(width:%d, height:%d, dpi:%d)", this.f388473v, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        String packageName = this.f388458g.getPackageName();
        String name = this.f388460i.getName();
        this.f388463l = new C143207dx((DisplayManager) this.f388459h.getSystemService("display"), packageName + "/" + name, i, i2, i3, surface, new C143239ac(this));
    }

    /* renamed from: i */
    public final void mo118309i(WindowManager.LayoutParams layoutParams) {
        try {
            C143091ac acVar = this.f388461j;
            if (acVar != null) {
                acVar.mo17287i(layoutParams);
            }
        } catch (NoSuchMethodError unused) {
            C143316a.m232511a("CAR.PROJECTION.CAHI", (Throwable) null, "Unable to deliver onWindowAttributesChanged callback");
        }
    }

    /* renamed from: j */
    public final void mo118310j() {
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s.destroyPresentationAndVirtualDisplay()", this.f388473v);
        }
        m232419A();
        C143207dx dxVar = this.f388463l;
        if (dxVar != null) {
            dxVar.mo118228b();
            this.f388463l = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r0 != 2) goto L_0x007b;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118311k(int r10, boolean r11) {
        /*
            r9 = this;
            com.google.android.gms.car.ac r0 = r9.f388461j
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r9.f388444L
            java.lang.String r1 = "CAR.PROJECTION.CAHI"
            r2 = 3
            boolean r3 = com.google.android.gms.car.C143109au.m232164a(r1, r2)
            r4 = 0
            r5 = 1
            r6 = 2
            r7 = 0
            if (r3 == 0) goto L_0x002b
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r8 = r9.f388473v
            r3[r7] = r8
            java.lang.String r8 = m232421e(r0)
            r3[r5] = r8
            java.lang.String r8 = m232421e(r10)
            r3[r6] = r8
            java.lang.String r8 = "%s.moveActivityToState() from: %s to: %s"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r2, r1, r4, r8, r3)
        L_0x002b:
            r3 = 4
            if (r0 >= r10) goto L_0x0090
            if (r0 == 0) goto L_0x0035
            if (r0 == r5) goto L_0x005b
            if (r0 == r6) goto L_0x005b
            goto L_0x007b
        L_0x0035:
            r9.m232424y(r7, r4)
            com.google.android.gms.car.a.a.db r11 = r9.f388477z
            r0 = 35
            boolean r11 = r11.mo117935q(r0)
            if (r11 == 0) goto L_0x0045
            r9.mo118324t()
        L_0x0045:
            com.google.android.gms.car.ac r11 = r9.f388461j
            android.os.Bundle r0 = r9.f388467p
            r11.mo17282c(r0)
            r9.f388444L = r5
            com.google.android.gms.car.df r11 = r9.f388464m
            android.view.Window r11 = r11.getWindow()
            android.view.WindowManager$LayoutParams r11 = r11.getAttributes()
            r9.mo118309i(r11)
        L_0x005b:
            if (r10 <= r6) goto L_0x007b
            r9.m232424y(r7, r4)
            android.view.View r11 = r9.f388472u
            r9.mo118031b(r11)
            com.google.android.gms.car.ac r11 = r9.f388461j
            r11.mo17285g()
            r9.f388444L = r2
            android.os.Bundle r11 = r9.f388467p
            if (r11 == 0) goto L_0x007b
            boolean r0 = r9.f388448P
            if (r0 == 0) goto L_0x007b
            com.google.android.gms.car.ac r0 = r9.f388461j
            r0.mo17283e(r11)
            r9.f388448P = r7
        L_0x007b:
            if (r10 <= r3) goto L_0x0137
            com.google.android.gms.car.ac r10 = r9.f388461j
            r10.mo19993p()
            r10 = 5
            r9.f388444L = r10
            com.google.android.gms.car.ac r10 = r9.f388461j
            r10.mo118014D()
            com.google.android.gms.car.df r10 = r9.f388464m
            r10.show()
            return
        L_0x0090:
            if (r0 <= r10) goto L_0x0137
            if (r0 == r5) goto L_0x011d
            if (r0 == r6) goto L_0x011d
            if (r0 == r2) goto L_0x00e8
            if (r0 == r3) goto L_0x00e8
            com.google.android.gms.car.ac r8 = r9.f388461j
            r8.mo19992o()
            r9.f388444L = r3
            boolean r3 = r9.f388471t
            if (r3 == 0) goto L_0x00e8
            com.google.android.gms.car.df r3 = r9.f388464m
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x00e8
            com.google.android.gms.car.df r3 = r9.f388464m
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L_0x00e8
            boolean r3 = com.google.android.gms.car.p10764h.C143316a.m232515e(r1, r6)
            if (r3 == 0) goto L_0x00d6
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r8 = r9.f388473v
            r3[r7] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r3[r5] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = "%s moveActivityToState(newState:%d) [currentState:%d]"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r1, r4, r0, r3)
        L_0x00d6:
            boolean r0 = r9.f388433A
            r9.mo118217c(r7, r0)
            com.google.android.gms.car.df r0 = r9.f388464m
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.dispatchWindowFocusChanged(r7)
        L_0x00e8:
            if (r10 >= r2) goto L_0x011d
            boolean r0 = r9.f388471t
            if (r0 != 0) goto L_0x0116
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.car.ac r1 = r9.f388461j
            r1.mo17284f(r0)
            r9.f388467p = r0
            r9.f388448P = r5
            com.google.android.gms.car.cf r1 = r9.f388447O     // Catch:{ RemoteException -> 0x010d }
            if (r1 == 0) goto L_0x0116
            android.os.Parcel r2 = r1.mo17260gA()     // Catch:{ RemoteException -> 0x010d }
            com.google.android.p445a.C8850c.m23497f(r2, r0)     // Catch:{ RemoteException -> 0x010d }
            r0 = 12
            r1.mo17262he(r0, r2)     // Catch:{ RemoteException -> 0x010d }
            goto L_0x0116
        L_0x010d:
            java.lang.Runnable r0 = r9.f388456e
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.gms.car.C143181dh.m232308a(r1, r0)
        L_0x0116:
            com.google.android.gms.car.ac r0 = r9.f388461j
            r0.mo17286h()
            r9.f388444L = r6
        L_0x011d:
            if (r10 >= r6) goto L_0x0137
            if (r11 == 0) goto L_0x0129
            com.google.android.gms.car.ac r10 = r9.f388461j
            java.lang.Object r10 = r10.mo117889x()
            r9.f388436D = r10
        L_0x0129:
            com.google.android.gms.car.ac r10 = r9.f388461j
            r10.mo19990m()
            r9.f388444L = r7
            r9.f388461j = r4
            r9.f388438F = r7
            r9.m232419A()
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143268bb.mo118311k(int, boolean):void");
    }

    /* renamed from: l */
    public final void mo118312l(InputFocusChangedEvent inputFocusChangedEvent, boolean z) {
        C143150cf cfVar;
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange(event:%s, callback:%b)", this.f388473v, inputFocusChangedEvent, Boolean.valueOf(z));
        }
        if (!mo118326v()) {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange() No-Op as CAR_API not connected", this.f388473v);
            return;
        }
        this.f388433A = inputFocusChangedEvent.f387994b;
        C143179df dfVar = this.f388464m;
        if (dfVar != null) {
            dfVar.mo118151h(inputFocusChangedEvent.f387993a, inputFocusChangedEvent.f387994b, inputFocusChangedEvent.f387995c, inputFocusChangedEvent.f387996d);
        } else {
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange() presentation is null", this.f388473v);
        }
        if (z && (cfVar = this.f388447O) != null) {
            try {
                cfVar.mo17262he(15, cfVar.mo17260gA());
            } catch (RemoteException e) {
                C143316a.m232514d(6, "CAR.PROJECTION.CAHI", (Throwable) null, "%s onInputFocusChange() [RemoteException:%s]", this.f388473v, e);
                C143181dh.m232308a(Looper.getMainLooper(), this.f388456e);
            }
        }
    }

    /* renamed from: m */
    public final void mo118313m(Runnable runnable) {
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 4)) {
            C143316a.m232513c("CAR.PROJECTION.CAHI", (Throwable) null, "Presentation correctly configured");
        }
        m232425z();
        if (runnable != null) {
            ((C143303r) runnable).f388530a.mo118307g();
        }
        if (this.f388451S != null) {
            ((ContextWrapper) this.f388464m.mo118141a()).getBaseContext().unregisterComponentCallbacks(this.f388451S);
            this.f388451S = null;
        }
        m232420B();
    }

    /* renamed from: n */
    public final void mo118314n(CarRegionId carRegionId, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        if (mo118326v()) {
            this.f388437E = drawingSpec;
            this.f388462k = carRegionId;
            this.f388468q = configuration;
            mo118325u(this.f388458g.getBaseContext().getResources());
            C143207dx dxVar = this.f388463l;
            if (dxVar == null) {
                mo118308h(drawingSpec.f387987a, drawingSpec.f387988b, drawingSpec.f387989c, drawingSpec.f387990d);
            } else {
                dxVar.mo118229c(drawingSpec.f387990d);
            }
            mo118321q(drawingSpec);
            this.f388467p = bundle;
            if (this.f388450R == null) {
                this.f388450R = intent.getComponent();
            }
            Bundle bundle2 = this.f388467p;
            if (bundle2 != null) {
                bundle2.setClassLoader(this.f388458g.getClassLoader());
            }
            if (this.f388461j == null) {
                this.f388461j = m232422w(this.f388458g.getClassLoader(), this.f388460i.getName());
            }
            if ((intent == null && this.f388466o != null) || (intent != null && !intent.filterEquals(this.f388466o))) {
                this.f388466o = intent;
            }
            if (!this.f388477z.mo117935q(37) || Build.VERSION.SDK_INT != 31) {
                mo118307g();
            } else {
                m232424y(true, new C143303r(this));
            }
        }
    }

    /* renamed from: o */
    public final void mo118315o() {
        this.f388469r = false;
        try {
            C143150cf cfVar = this.f388447O;
            if (cfVar != null) {
                cfVar.mo17262he(6, cfVar.mo17260gA());
            }
        } catch (RemoteException unused) {
            mo118322r();
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f388461j.mo118019I();
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f388461j.mo118020J();
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f388461j.mo118021K(i);
    }

    /* renamed from: p */
    public final void mo118320p(Runnable runnable) {
        C143181dh.m232308a(Looper.getMainLooper(), new C143302q(this, runnable));
    }

    /* renamed from: q */
    public final void mo118321q(DrawingSpec drawingSpec) {
        Rect rect = drawingSpec.f387991e;
        if (rect == null) {
            C143316a.m232516f("CAR.PROJECTION.CAHI", "spec has no insets. Will not update presentation.");
            return;
        }
        this.f388476y.set(rect);
        C143179df dfVar = this.f388464m;
        if (dfVar != null) {
            dfVar.mo118158o(this.f388476y);
        } else {
            C143316a.m232516f("CAR.PROJECTION.CAHI", "System window insets set before presentation attached. Will apply to presentation when attaching.");
        }
    }

    /* renamed from: r */
    public final void mo118322r() {
        if (!this.f388449Q) {
            this.f388449Q = true;
            mo118311k(0, false);
            mo118310j();
            this.f388477z.mo118008u((C143134br) null);
        }
    }

    /* renamed from: s */
    public final void mo118323s(C143180dg dgVar) {
        C58838bb.m90884s(this.f388477z.mo117935q(33), "Configuration context must be enabled to call updateContextConfigurationForNightMode");
        if (this.f388468q != null) {
            Resources resources = dgVar.getResources();
            resources.getConfiguration().uiMode = (resources.getConfiguration().uiMode & -49) | (this.f388468q.uiMode & 48);
            dgVar.mo118170a(resources.getConfiguration(), resources.getDisplayMetrics());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118324t() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "%s Configuration change while not connected to car"
            java.lang.String r3 = "%s Unable to get configuration from CarService!"
            java.lang.String r4 = "CAR.PROJECTION.CAHI"
            com.google.android.gms.car.a.a.db r0 = r1.f388477z
            boolean r0 = r0.mo117940t()
            if (r0 == 0) goto L_0x0187
            boolean r0 = r1.f388471t
            if (r0 == 0) goto L_0x0016
            goto L_0x0187
        L_0x0016:
            r5 = 6
            r6 = 3
            r7 = 0
            r8 = 1
            r9 = 0
            com.google.android.gms.car.a.a.db r0 = r1.f388477z     // Catch:{ RemoteException -> 0x0047, IllegalStateException -> 0x0026 }
            com.google.android.gms.car.br r0 = r0.mo117937s()     // Catch:{ RemoteException -> 0x0047, IllegalStateException -> 0x0026 }
            com.google.android.gms.car.CarUiInfo r0 = r0.mo118064g()     // Catch:{ RemoteException -> 0x0047, IllegalStateException -> 0x0026 }
            goto L_0x0052
        L_0x0026:
            r0 = move-exception
            com.google.android.gms.car.p10760f.p10761a.C143236b.m232383a(r0)     // Catch:{ aw -> 0x0037, IllegalStateException -> 0x002b }
            goto L_0x0051
        L_0x002b:
            r0 = move-exception
            r10 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r11 = r1.f388473v
            r0[r9] = r11
            com.google.android.gms.car.p10764h.C143316a.m232514d(r5, r4, r10, r3, r0)
            goto L_0x0051
        L_0x0037:
            boolean r0 = com.google.android.gms.car.p10764h.C143316a.m232515e(r4, r6)
            if (r0 == 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f388473v
            r0[r9] = r3
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r4, r7, r2, r0)
            goto L_0x0051
        L_0x0047:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = r1.f388473v
            r10[r9] = r11
            com.google.android.gms.car.p10764h.C143316a.m232514d(r5, r4, r0, r3, r10)
        L_0x0051:
            r0 = r7
        L_0x0052:
            com.google.android.gms.car.df r3 = r1.f388464m
            if (r3 != 0) goto L_0x0065
            r0 = 5
            boolean r2 = com.google.android.gms.car.C143109au.m232164a(r4, r0)
            if (r2 == 0) goto L_0x0187
            java.lang.String r2 = "updatePresentationForInputMethods invoked when presentation not set"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            com.google.android.gms.car.p10764h.C143316a.m232514d(r0, r4, r7, r2, r3)
            return
        L_0x0065:
            r10 = 2
            java.lang.String r11 = "CAR.PROJECTION.PRES"
            if (r0 == 0) goto L_0x0127
            boolean r13 = r0.f387977b
            boolean r14 = r0.f387976a
            boolean r15 = r0.f387979d
            int r12 = r0.f387984i
            int r5 = r0.f387985j
            com.google.android.gms.car.cy r7 = new com.google.android.gms.car.cy
            r16 = r12
            r12 = r7
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            boolean r5 = com.google.android.gms.car.C143109au.m232164a(r11, r6)
            if (r5 == 0) goto L_0x0092
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r12 = r3.f388260h
            r5[r9] = r12
            r5[r8] = r7
            java.lang.String r12 = "%s updateConfiguration(%s)"
            r13 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r11, r13, r12, r5)
        L_0x0092:
            android.content.res.Resources r5 = r3.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            boolean r12 = r7.f388211a
            if (r8 == r12) goto L_0x00a0
            r12 = 1
            goto L_0x00a1
        L_0x00a0:
            r12 = 3
        L_0x00a1:
            r5.touchscreen = r12
            android.content.res.Resources r5 = r3.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            boolean r12 = r7.f388213c
            if (r12 == 0) goto L_0x00b1
            r12 = 2
            goto L_0x00b8
        L_0x00b1:
            boolean r12 = r7.f388212b
            if (r12 == 0) goto L_0x00b7
            r12 = 4
            goto L_0x00b8
        L_0x00b7:
            r12 = 1
        L_0x00b8:
            r5.navigation = r12
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            android.view.Display r12 = r3.getDisplay()
            r12.getMetrics(r5)
            com.google.android.gms.car.dd r12 = r3.f388236K
            com.google.android.gms.car.d r12 = (com.google.android.gms.car.C143171d) r12
            boolean r12 = r12.f388218a
            if (r12 == 0) goto L_0x00dc
            com.google.android.gms.car.dg r12 = r3.f388237L
            android.content.res.Resources r13 = r3.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            r12.mo118170a(r13, r5)
            goto L_0x00eb
        L_0x00dc:
            android.content.res.Resources r12 = r3.getResources()
            android.content.res.Resources r13 = r3.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            r12.updateConfiguration(r13, r5)
        L_0x00eb:
            int r5 = r7.f388214d
            r3.f388274v = r5
            int r5 = r7.f388215e
            r3.f388275w = r5
            boolean r5 = r3.f388265m
            if (r5 != 0) goto L_0x0116
            boolean r5 = r7.f388213c
            r3.f388273u = r5
            r3.f388265m = r8
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.car.f.bt r5 = r3.f388259g
            r5.mo118337b()
            android.view.View r5 = r3.f388230E
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.car.f.bt r5 = r3.f388259g
            android.view.Window r3 = r3.mo118143c()
            android.view.View r3 = r3.getDecorView()
            r5.mo118336a(r3)
            goto L_0x011c
        L_0x0116:
            boolean r3 = r3.f388273u
            boolean r5 = r7.f388213c
            if (r3 != r5) goto L_0x011f
        L_0x011c:
            boolean r0 = r0.f387979d
            goto L_0x0128
        L_0x011f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Changing the value of touchpadForUiNavigation configuration not supported"
            r0.<init>(r2)
            throw r0
        L_0x0127:
            r0 = 0
        L_0x0128:
            com.google.android.gms.car.a.a.db r3 = r1.f388477z     // Catch:{ aw -> 0x0176 }
            java.lang.String r5 = "rotary_use_focus_finder"
            boolean r3 = r3.mo117936r(r5)     // Catch:{ aw -> 0x0176 }
            if (r0 == 0) goto L_0x0143
            com.google.android.gms.car.a.a.db r0 = r1.f388477z     // Catch:{ aw -> 0x0176 }
            java.lang.String r5 = "touchpad_focus_navigation_history_max_size"
            int r0 = r0.mo117925g(r5, r9)     // Catch:{ aw -> 0x0176 }
            com.google.android.gms.car.a.a.db r5 = r1.f388477z     // Catch:{ aw -> 0x0176 }
            java.lang.String r7 = "touchpad_focus_navigation_history_max_age_ms"
            int r5 = r5.mo117925g(r7, r9)     // Catch:{ aw -> 0x0176 }
            goto L_0x0145
        L_0x0143:
            r0 = 0
            r5 = 0
        L_0x0145:
            com.google.android.gms.car.df r7 = r1.f388464m     // Catch:{ aw -> 0x0176 }
            boolean r12 = com.google.android.gms.car.C143109au.m232164a(r11, r6)     // Catch:{ aw -> 0x0176 }
            if (r12 == 0) goto L_0x016c
            java.lang.String r12 = "%s updateSettings(isFocusFinderEnabledInRotary=%s, touchpadFocusNavigationHistoryMaxSize=%s, touchpadFocusNavigationHistoryMaxAgeMs=%s)"
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ aw -> 0x0176 }
            java.lang.String r14 = r7.f388260h     // Catch:{ aw -> 0x0176 }
            r13[r9] = r14     // Catch:{ aw -> 0x0176 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)     // Catch:{ aw -> 0x0176 }
            r13[r8] = r14     // Catch:{ aw -> 0x0176 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ aw -> 0x0176 }
            r13[r10] = r14     // Catch:{ aw -> 0x0176 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ aw -> 0x0176 }
            r13[r6] = r10     // Catch:{ aw -> 0x0176 }
            r10 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r11, r10, r12, r13)     // Catch:{ aw -> 0x0176 }
        L_0x016c:
            r7.f388229D = r3     // Catch:{ aw -> 0x0176 }
            com.google.android.gms.car.bp r3 = new com.google.android.gms.car.bp     // Catch:{ aw -> 0x0176 }
            r3.<init>(r0, r5)     // Catch:{ aw -> 0x0176 }
            r7.f388243R = r3     // Catch:{ aw -> 0x0176 }
            return
        L_0x0176:
            boolean r0 = com.google.android.gms.car.p10764h.C143316a.m232515e(r4, r6)
            if (r0 == 0) goto L_0x0187
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f388473v
            r0[r9] = r3
            r3 = 0
            com.google.android.gms.car.p10764h.C143316a.m232514d(r6, r4, r3, r2, r0)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143268bb.mo118324t():void");
    }

    /* renamed from: u */
    public final void mo118325u(Resources resources) {
        if (this.f388468q != null) {
            resources.getConfiguration().uiMode = (resources.getConfiguration().uiMode & -49) | (this.f388468q.uiMode & 48);
            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }
    }

    /* renamed from: v */
    public final boolean mo118326v() {
        if (this.f388477z.mo117940t()) {
            return true;
        }
        C143316a.m232514d(5, "CAR.PROJECTION.CAHI", (Throwable) null, "%s ICar not available", this.f388473v);
        return false;
    }

    public C143268bb(byte[] bArr) {
        this.f388455d = new Semaphore(0);
        this.f388456e = new C143306u(this);
        this.f388457f = new C143307v(this);
        this.f388471t = false;
        this.f388476y = new Rect();
        this.f388433A = true;
        this.f388440H = new ArrayDeque();
        this.f388452T = new C143308w(this);
        this.f388441I = new Object();
        this.f388443K = new KeyEvent.DispatcherState();
        this.f388444L = 0;
        this.f388445M = new C143181dh((byte[]) null);
        this.f388435C = true;
        this.f388453b = Pair.create(-1, (Object) null);
        C143059db dbVar = new C143059db(Looper.getMainLooper(), new C143309x(this));
        this.f388477z = dbVar;
        this.f388434B = new C143310y(this, dbVar);
    }
}
