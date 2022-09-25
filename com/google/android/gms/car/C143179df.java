package com.google.android.gms.car;

import android.app.Presentation;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.car.p10760f.C143283bq;
import com.google.android.gms.car.p10760f.C143286bt;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.car.df */
/* compiled from: PG */
public final class C143179df extends Presentation {

    /* renamed from: A */
    public float f388226A;

    /* renamed from: B */
    public final Rect f388227B;

    /* renamed from: C */
    public boolean f388228C;

    /* renamed from: D */
    public boolean f388229D;

    /* renamed from: E */
    public View f388230E;

    /* renamed from: F */
    public final Rect f388231F;

    /* renamed from: G */
    public WeakReference f388232G;

    /* renamed from: H */
    public final C143174da f388233H;

    /* renamed from: I */
    public final C143175db f388234I;

    /* renamed from: J */
    public final Display f388235J;

    /* renamed from: K */
    public final C143177dd f388236K;

    /* renamed from: L */
    public C143180dg f388237L;

    /* renamed from: M */
    public HandlerThread f388238M;

    /* renamed from: N */
    public Handler f388239N;

    /* renamed from: O */
    public int f388240O;

    /* renamed from: P */
    public final Semaphore f388241P;

    /* renamed from: Q */
    final boolean f388242Q;

    /* renamed from: R */
    public C143132bp f388243R;

    /* renamed from: S */
    private final boolean f388244S;

    /* renamed from: T */
    private boolean f388245T;

    /* renamed from: U */
    private C143178de f388246U;

    /* renamed from: V */
    private final Queue f388247V;

    /* renamed from: W */
    private final ViewTreeObserver.OnGlobalLayoutListener f388248W;

    /* renamed from: X */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f388249X;

    /* renamed from: Y */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f388250Y;

    /* renamed from: Z */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f388251Z;

    /* renamed from: a */
    View f388252a;

    /* renamed from: aa */
    private final ViewTreeObserver.OnTouchModeChangeListener f388253aa;

    /* renamed from: b */
    public boolean f388254b;

    /* renamed from: c */
    public final Pair f388255c;

    /* renamed from: d */
    public final Pair f388256d;

    /* renamed from: e */
    public final Pair f388257e;

    /* renamed from: f */
    public boolean f388258f;

    /* renamed from: g */
    public final C143286bt f388259g;

    /* renamed from: h */
    public final String f388260h;

    /* renamed from: i */
    public final boolean f388261i;

    /* renamed from: j */
    public boolean f388262j;

    /* renamed from: k */
    public boolean f388263k;

    /* renamed from: l */
    public boolean f388264l;

    /* renamed from: m */
    public boolean f388265m;

    /* renamed from: n */
    public boolean f388266n;

    /* renamed from: o */
    public boolean f388267o;

    /* renamed from: p */
    public boolean f388268p;

    /* renamed from: q */
    public boolean f388269q;

    /* renamed from: r */
    public float f388270r;

    /* renamed from: s */
    public float f388271s;

    /* renamed from: t */
    public boolean f388272t;

    /* renamed from: u */
    public boolean f388273u;

    /* renamed from: v */
    public int f388274v;

    /* renamed from: w */
    public int f388275w;

    /* renamed from: x */
    public float f388276x;

    /* renamed from: y */
    public float f388277y;

    /* renamed from: z */
    public float f388278z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143179df(android.content.Context r9, android.view.Display r10, java.lang.String r11, boolean r12, boolean r13, com.google.android.gms.car.C143177dd r14) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.app.Service
            r1 = 1
            java.lang.String r2 = "CAR.PROJECTION.PRES"
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L_0x0017
            r0 = 3
            boolean r0 = com.google.android.gms.car.C143109au.m232164a(r2, r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "getTheme: context not an instance of service"
            com.google.android.gms.car.p10764h.C143316a.m232511a(r2, r3, r0)
        L_0x0015:
            r6 = 0
            goto L_0x0046
        L_0x0017:
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class r5 = r9.getClass()
            r0.<init>(r9, r5)
            android.content.pm.PackageManager r5 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x003b }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x003b }
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x003b }
            android.content.pm.ApplicationInfo r6 = r9.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x003b }
            int r6 = r6.theme     // Catch:{ NameNotFoundException -> 0x003b }
            if (r5 == 0) goto L_0x0046
            java.lang.String r7 = "android.app.theme"
            int r6 = r5.getInt(r7, r6)     // Catch:{ NameNotFoundException -> 0x003b }
            goto L_0x0046
        L_0x003b:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r4] = r0
            r0 = 6
            java.lang.String r6 = "Could not get theme for component %s; use the default theme"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r0, r2, r3, r6, r5)
            goto L_0x0015
        L_0x0046:
            r8.<init>(r9, r10, r6)
            r8.f388258f = r4
            com.google.android.gms.car.f.bt r9 = new com.google.android.gms.car.f.bt
            r9.<init>()
            r8.f388259g = r9
            r8.f388263k = r4
            r8.f388264l = r1
            com.google.android.gms.car.de r9 = new com.google.android.gms.car.de
            r9.<init>(r4, r4)
            r8.f388246U = r9
            r8.f388266n = r4
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.f388227B = r9
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.f388231F = r9
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>()
            r8.f388247V = r9
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r3)
            r8.f388232G = r9
            com.google.android.gms.car.bl r9 = new com.google.android.gms.car.bl
            r9.<init>()
            r8.f388233H = r9
            com.google.android.gms.car.db r9 = new com.google.android.gms.car.db
            r9.<init>()
            r8.f388234I = r9
            java.util.concurrent.Semaphore r9 = new java.util.concurrent.Semaphore
            r9.<init>(r4)
            r8.f388241P = r9
            r8.f388242Q = r1
            com.google.android.gms.car.ct r9 = new com.google.android.gms.car.ct
            r9.<init>(r8)
            r8.f388248W = r9
            com.google.android.gms.car.cu r9 = new com.google.android.gms.car.cu
            r9.<init>(r8)
            r8.f388249X = r9
            com.google.android.gms.car.cv r9 = new com.google.android.gms.car.cv
            r9.<init>(r8)
            r8.f388250Y = r9
            com.google.android.gms.car.cw r9 = new com.google.android.gms.car.cw
            r9.<init>(r8)
            r8.f388251Z = r9
            com.google.android.gms.car.cx r9 = new com.google.android.gms.car.cx
            r9.<init>(r8)
            r8.f388253aa = r9
            com.google.android.gms.car.bp r9 = new com.google.android.gms.car.bp
            r9.<init>(r4, r4)
            r8.f388243R = r9
            r8.f388260h = r11
            r8.f388235J = r10
            r8.f388236K = r14
            r8.f388261i = r13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            android.util.Pair r9 = android.util.Pair.create(r9, r3)
            r8.f388255c = r9
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r9, r3)
            r8.f388256d = r9
            r9 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r9, r3)
            r8.f388257e = r9
            android.view.Window r9 = r8.mo118143c()
            r10 = 2030(0x7ee, float:2.845E-42)
            r9.setType(r10)
            r10 = 16777216(0x1000000, float:2.3509887E-38)
            r9.addFlags(r10)
            r10 = 8
            r9.addFlags(r10)
            r8.f388244S = r12
            if (r12 == 0) goto L_0x0100
            r10 = 1024(0x400, float:1.435E-42)
            r9.addFlags(r10)
        L_0x0100:
            r10 = 48
            r9.setSoftInputMode(r10)
            if (r13 == 0) goto L_0x010a
            r8.mo118160p(r4)
        L_0x010a:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 != r10) goto L_0x0118
            com.google.android.gms.car.d r14 = (com.google.android.gms.car.C143171d) r14
            boolean r9 = r14.f388219b
            if (r9 != 0) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            return
        L_0x0118:
            com.google.android.gms.car.dg r9 = new com.google.android.gms.car.dg
            android.content.Context r10 = r8.getContext()
            r9.<init>(r10)
            r8.f388237L = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.C143179df.<init>(android.content.Context, android.view.Display, java.lang.String, boolean, boolean, com.google.android.gms.car.dd):void");
    }

    /* renamed from: u */
    public static boolean m232281u(View view, ViewGroup viewGroup) {
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private final void m232282y() {
        View view = this.f388252a;
        if (view != null) {
            view.setSystemUiVisibility(true != this.f388245T ? 0 : 4);
        }
    }

    /* renamed from: z */
    private final boolean m232283z(View view) {
        if (!(view == null || view == mo118143c().getDecorView())) {
            View decorView = mo118143c().getDecorView();
            if (decorView instanceof ViewGroup) {
                ArrayList arrayList = new ArrayList();
                ((ViewGroup) decorView).addFocusables(arrayList, 0);
                if (arrayList.contains(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Context mo118141a() {
        return ((C143171d) this.f388236K).f388218a ? this.f388237L : getContext();
    }

    /* renamed from: b */
    public final Pair mo118142b(int i) {
        C143132bp bpVar = this.f388243R;
        View currentFocus = getCurrentFocus();
        C143130bn bnVar = (C143130bn) bpVar.f388190b.get(i);
        if (bnVar != null) {
            if (i == bnVar.f388184a && bnVar.f388186c.get() == currentFocus && C143132bp.m232182b(bnVar.f388185b, bpVar.f388192d) && bpVar.f388189a.isEmpty()) {
                return Pair.create(-1, (Object) null);
            }
            bpVar.f388190b.clear();
        }
        mo118161q();
        return Pair.create(-1, new C143283bq(i, this.f388231F));
    }

    /* renamed from: c */
    public final Window mo118143c() {
        return (Window) Objects.requireNonNull(getWindow(), String.valueOf(this.f388260h).concat(" getWindow() returned null"));
    }

    public final void cancel() {
        if (!this.f388258f) {
            super.cancel();
        }
    }

    /* renamed from: d */
    public final void mo118145d(boolean z, boolean z2) {
        if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s callSetLocalFocus(hasFocus:%b, inTouchMode:%b)", this.f388260h, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        this.f388264l = z2;
        try {
            mo118143c().setLocalFocus(z, z2);
            this.f388246U = new C143178de(z, z2);
        } catch (IllegalStateException unused) {
            C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "%s Trying to set input focus on window that's been removed.", this.f388260h);
        }
    }

    public final void dismiss() {
        if (!this.f388258f) {
            super.dismiss();
        }
    }

    /* renamed from: e */
    public final void mo118147e() {
        if (this.f388242Q) {
            C58838bb.m90884s(Looper.myLooper() != Looper.getMainLooper(), "completePresentationConfiguration must happen on worker thread");
        }
        this.f388237L = new C143180dg(getContext());
        this.f388241P.release();
        HandlerThread handlerThread = this.f388238M;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f388238M = null;
        }
        this.f388239N = null;
    }

    /* renamed from: f */
    public final void mo118148f(View view) {
        if (!this.f388264l) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                while (i < viewGroup.getChildCount()) {
                    if (!viewGroup.getChildAt(i).hasFocusable()) {
                        i++;
                    } else if (view.isFocusable()) {
                        view.setFocusable(false);
                        if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                            C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s ensureFocusable set view to non-focusable because it has focusable children: %s", this.f388260h, view);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
            view.setFocusable(true);
            mo118168w(view);
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s ensureFocusable set view to focusable because it has no focusable children: %s", this.f388260h, view);
            }
        }
    }

    /* renamed from: g */
    public final void mo118149g() {
        int i;
        int size;
        View decorView = mo118143c().getDecorView();
        if (Build.VERSION.SDK_INT < 33 || (this.f388246U.f388224a == decorView.hasWindowFocus() && this.f388246U.f388225b == decorView.isInTouchMode())) {
            while (true) {
                Runnable runnable = (Runnable) this.f388247V.poll();
                if (runnable != null) {
                    if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
                        i = this.f388247V.size();
                        C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s onWindowFocusChangeReached() [pendingOnWindowFocusReachedTasks.size():%d]", this.f388260h, Integer.valueOf(i));
                    } else {
                        i = 0;
                    }
                    runnable.run();
                    if (C143316a.m232515e("CAR.PROJECTION.PRES", 2) && i != (size = this.f388247V.size())) {
                        C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s onWindowFocusChangeReached() pendingOnWindowFocusReachedTasks queue size altered while tasks were running. [before:%d, after:%d]", this.f388260h, Integer.valueOf(i), Integer.valueOf(size));
                    }
                } else {
                    return;
                }
            }
        } else if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
            C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "executePendingWindowFocusReachedTasks aborting state not synced focus(expected=%b, actual=%b) touchMode(expected=%b actual=%b)", Boolean.valueOf(this.f388246U.f388224a), Boolean.valueOf(decorView.hasWindowFocus()), Boolean.valueOf(this.f388246U.f388225b), Boolean.valueOf(decorView.isInTouchMode()));
        }
    }

    public final Resources getResources() {
        if (((C143171d) this.f388236K).f388218a) {
            return this.f388237L.getResources();
        }
        return super.getResources();
    }

    /* renamed from: h */
    public final void mo118151h(boolean z, boolean z2, int i, Rect rect) {
        if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s onInputFocusChange(hasFocus:%b, inTouchMode:%b) [hasInputFocus:%b, attachedToWindow:%b]", this.f388260h, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(this.f388263k), Boolean.valueOf(this.f388262j));
        }
        if (this.f388263k != z) {
            this.f388263k = z;
            if (this.f388261i) {
                this.f388264l = !z || z2;
            } else {
                this.f388264l = z2;
            }
            if (this.f388262j) {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s Deferring onInputFocusChange(hasFocus:%s, direction:%s, focusedRect:%s)", this.f388260h, Boolean.valueOf(z), C143200dq.m232322a(i), rect);
                }
                this.f388247V.offer(new C143161cq(this, z, i, rect));
                mo118145d(z, this.f388264l);
            }
            if (this.f388273u) {
                this.f388268p = false;
                mo118162r(getCurrentFocus());
            }
        }
    }

    /* renamed from: i */
    public final void mo118152i(float f, float f2) {
        this.f388270r = f;
        this.f388271s = f2;
        this.f388276x = 0.0f;
        this.f388277y = 0.0f;
        this.f388278z = 0.0f;
        this.f388226A = 0.0f;
    }

    /* renamed from: j */
    public final void mo118153j() {
        View decorView = mo118143c().getDecorView();
        View findFocus = decorView.findFocus();
        if (findFocus == decorView) {
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s safeRequestFocus(dv:%s", this.f388260h, decorView);
            }
            mo118154k(decorView, -1, (Rect) null);
        } else if (!m232283z(findFocus)) {
            if (!C2043bi.m5536aC(decorView)) {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s safeRequestFocus(dv:%s)", this.f388260h, decorView);
                }
                mo118154k(decorView, -1, (Rect) null);
            } else if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s restoreDefaultFocus(dv:%s) succeeded", this.f388260h, decorView);
            }
        } else if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s focus:%s already has focus", this.f388260h, findFocus);
        }
    }

    /* renamed from: k */
    public final void mo118154k(View view, int i, Rect rect) {
        if (!m232283z(view)) {
            view = mo118143c().getDecorView();
        }
        if (view != null) {
            if (this.f388273u && view == mo118143c().getDecorView()) {
                mo118148f(view);
            }
            if (this.f388264l && !view.isInTouchMode()) {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s handleGainFocus requestFocusFromTouch() on %s", this.f388260h, view);
                }
                mo118167v(view);
            } else if (i == -1 || rect == null) {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s handleGainFocus requestFocus() on %s", this.f388260h, view);
                }
                mo118168w(view);
            } else {
                if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                    C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s handleGainFocus requestFocus(%s, %s) on %s", this.f388260h, C143200dq.m232322a(i), rect, view);
                }
                mo118169x(view, i, rect);
            }
        } else if (C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
            C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "%s safeRequestFocus Unable to find view to request focus on.", this.f388260h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo118155l(boolean z) {
        if (C143316a.m232515e("CAR.PROJECTION.PRES", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.PRES", (Throwable) null, "%s setAttachedWindow(attached: %b) [attachedToWindow: %b, hasInputFocus: %b, inTouchMode: %b]", this.f388260h, Boolean.valueOf(z), Boolean.valueOf(this.f388262j), Boolean.valueOf(this.f388263k), Boolean.valueOf(this.f388264l));
        }
        this.f388262j = z;
        ViewTreeObserver viewTreeObserver = mo118143c().getDecorView().getViewTreeObserver();
        if (viewTreeObserver != null) {
            if (z) {
                viewTreeObserver.addOnTouchModeChangeListener(this.f388253aa);
                if (this.f388273u) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f388248W);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.f388249X);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.f388250Y);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.f388251Z);
                }
            } else {
                viewTreeObserver.removeOnTouchModeChangeListener(this.f388253aa);
                if (this.f388273u) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.f388248W);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.f388249X);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.f388250Y);
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.f388251Z);
                    return;
                }
                return;
            }
        } else if (!z) {
            return;
        }
        if (!this.f388263k) {
            if (this.f388264l) {
                return;
            }
        } else if (this.f388261i) {
            mo118160p(true);
        } else {
            mo118153j();
        }
        mo118145d(this.f388263k, this.f388264l);
    }

    /* renamed from: m */
    public final void mo118156m(boolean z) {
        View decorView = mo118143c().getDecorView();
        if (decorView instanceof ViewGroup) {
            ((ViewGroup) decorView).setDescendantFocusability(true != z ? 393216 : C89885b.HTTP_VALUE);
        }
    }

    /* renamed from: n */
    public final void mo118157n(boolean z) {
        if (!this.f388244S) {
            this.f388245T = z;
            m232282y();
        }
    }

    /* renamed from: o */
    public final void mo118158o(Rect rect) {
        if (!this.f388227B.equals(rect)) {
            this.f388227B.set(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f388247V.clear();
        super.onStop();
    }

    /* renamed from: p */
    public final void mo118160p(boolean z) {
        mo118156m(z);
        if (z) {
            mo118154k((View) null, -1, (Rect) null);
            return;
        }
        View currentFocus = mo118143c().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
    }

    /* renamed from: q */
    public final void mo118161q() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            Rect rect = new Rect();
            currentFocus.getFocusedRect(rect);
            this.f388231F.left = iArr[0] + rect.left;
            this.f388231F.right = iArr[0] + rect.right;
            this.f388231F.top = iArr[1] + rect.top;
            this.f388231F.bottom = iArr[1] + rect.bottom;
        }
    }

    /* renamed from: r */
    public final void mo118162r(View view) {
        if (view != null) {
            boolean z = view.isFocused() && this.f388263k && this.f388268p;
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
                C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s updateHoveredState(%s) for %s", this.f388260h, Boolean.valueOf(z), view);
            }
            view.setHovered(z);
        }
    }

    /* renamed from: s */
    public final void mo118163s(Rect rect) {
        if (C143109au.m232164a("CAR.PROJECTION.PRES", 3)) {
            C143316a.m232514d(3, "CAR.PROJECTION.PRES", (Throwable) null, "%s updateSystemWindowInsets: %s", this.f388260h, rect);
        }
        mo118158o(rect);
        View view = this.f388252a;
        if (view != null) {
            view.requestApplyInsets();
        }
    }

    public final void setContentView(View view) {
        if (this.f388230E != view) {
            if (this.f388273u) {
                this.f388259g.mo118337b();
                this.f388243R.f388189a.clear();
            }
            this.f388230E = view;
            if (((C143171d) this.f388236K).f388218a) {
                this.f388252a = new C143170cz(this, this.f388237L, view);
            } else {
                this.f388252a = new C143170cz(this, getContext(), view);
            }
            mo118157n((mo118143c().getAttributes().flags & 1024) != 0);
            m232282y();
            super.setContentView(this.f388252a);
            if (this.f388273u) {
                this.f388259g.mo118336a(mo118143c().getDecorView());
            }
        }
    }

    public final void show() {
        super.show();
        new C144861c().post(new C143162cr(this));
    }

    /* renamed from: t */
    public final void mo118166t(MotionEvent motionEvent, int i, double d, double d2) {
        if (d != C59203do.f157270a) {
            double d3 = (double) this.f388270r;
            double d4 = (double) i;
            Double.isNaN(d4);
            Double.isNaN(d3);
            mo118152i((float) (d3 + (d4 * d)), motionEvent.getY());
        } else if (d2 != C59203do.f157270a) {
            float x = motionEvent.getX();
            double d5 = (double) this.f388271s;
            double d6 = (double) i;
            Double.isNaN(d6);
            Double.isNaN(d5);
            mo118152i(x, (float) (d5 + (d6 * d2)));
        }
    }

    /* renamed from: v */
    public final boolean mo118167v(View view) {
        boolean requestFocusFromTouch = view.requestFocusFromTouch();
        if (requestFocusFromTouch || !C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
            return requestFocusFromTouch;
        }
        C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "%s requestFocusFromTouch() on %s returned false", this.f388260h, view);
        return false;
    }

    /* renamed from: w */
    public final void mo118168w(View view) {
        if (!view.requestFocus() && C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
            C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "%s requestFocus() on %s returned false", this.f388260h, view);
        }
    }

    /* renamed from: x */
    public final void mo118169x(View view, int i, Rect rect) {
        if (!view.requestFocus(i, rect) && C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
            C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "%s requestFocus(%s, %s) on %s returned false", this.f388260h, C143200dq.m232322a(i), rect, view);
        }
    }
}
