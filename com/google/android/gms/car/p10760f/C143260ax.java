package com.google.android.gms.car.p10760f;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.C143148cd;
import com.google.android.gms.car.C143150cf;
import com.google.android.gms.car.C143207dx;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.KillOptions;
import com.google.android.gms.car.p10764h.C143316a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executors;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.car.f.ax */
/* compiled from: PG */
public final class C143260ax extends C143148cd {

    /* renamed from: a */
    private final WeakReference f388411a;

    public C143260ax(C143268bb bbVar) {
        this.f388411a = new WeakReference(bbVar);
    }

    /* renamed from: B */
    private static String m232387B() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StringBuilder sb = new StringBuilder("***ANR Stack Traces***");
        for (Map.Entry next : allStackTraces.entrySet()) {
            sb.append(((Thread) next.getKey()).toString());
            sb.append(":");
            if (((StackTraceElement[]) next.getValue()).length == 0) {
                sb.append(" No non-native stack");
            } else {
                for (StackTraceElement stackTraceElement : (StackTraceElement[]) next.getValue()) {
                    sb.append("\n\t");
                    sb.append(stackTraceElement.toString());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: C */
    private final void m232388C(InputFocusChangedEvent inputFocusChangedEvent) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        C143249am amVar = new C143249am(bbVar, inputFocusChangedEvent);
        SparseArray sparseArray = C143268bb.f388432a;
        bbVar.mo118320p(amVar);
    }

    /* renamed from: D */
    private static boolean m232389D(C143268bb bbVar) {
        return bbVar == null || bbVar.f388458g == null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.f388447O = null;
        com.google.android.gms.car.C143181dh.m232308a(android.os.Looper.getMainLooper(), r0.f388456e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0057 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118082A(com.google.android.gms.car.C143150cf r8, com.google.android.gms.car.C143134br r9) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.f388411a
            java.lang.Object r0 = r0.get()
            com.google.android.gms.car.f.bb r0 = (com.google.android.gms.car.p10760f.C143268bb) r0
            boolean r1 = m232389D(r0)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r1 = "CAR.PROJECTION.CAHI"
            r2 = 3
            boolean r1 = com.google.android.gms.car.C143109au.m232164a(r1, r2)
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x002a
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            android.util.SparseArray r5 = com.google.android.gms.car.p10760f.C143268bb.f388432a
            java.lang.String r5 = r0.f388473v
            r1[r4] = r5
            java.lang.String r5 = "CAR.PROJECTION.CAHI"
            java.lang.String r6 = "Binder:%s.onSetup()"
            com.google.android.gms.car.p10764h.C143316a.m232514d(r2, r5, r3, r6, r1)
        L_0x002a:
            android.util.SparseArray r1 = com.google.android.gms.car.p10760f.C143268bb.f388432a
            com.google.android.gms.car.a.a.db r1 = r0.f388477z
            r1.mo118008u(r9)
            android.os.IBinder$DeathRecipient r9 = r0.f388457f
            monitor-enter(r9)
            r0.f388447O = r8     // Catch:{ all -> 0x0064 }
            android.os.IBinder r1 = r8.f30761a     // Catch:{ RemoteException -> 0x0057 }
            android.os.IBinder$DeathRecipient r2 = r0.f388457f     // Catch:{ RemoteException -> 0x0057 }
            r1.linkToDeath(r2, r4)     // Catch:{ RemoteException -> 0x0057 }
            monitor-exit(r9)     // Catch:{ all -> 0x0064 }
            android.os.Parcel r9 = r8.mo17260gA()     // Catch:{ RemoteException -> 0x004d }
            r1 = 10
            r9.writeInt(r1)     // Catch:{ RemoteException -> 0x004d }
            r1 = 23
            r8.mo17262he(r1, r9)     // Catch:{ RemoteException -> 0x004d }
            return
        L_0x004d:
            java.lang.Runnable r8 = r0.f388456e
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            com.google.android.gms.car.C143181dh.m232308a(r9, r8)
            return
        L_0x0057:
            r0.f388447O = r3     // Catch:{ all -> 0x0064 }
            java.lang.Runnable r8 = r0.f388456e     // Catch:{ all -> 0x0064 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0064 }
            com.google.android.gms.car.C143181dh.m232308a(r0, r8)     // Catch:{ all -> 0x0064 }
            monitor-exit(r9)     // Catch:{ all -> 0x0064 }
            return
        L_0x0064:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0064 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10760f.C143260ax.mo118082A(com.google.android.gms.car.cf, com.google.android.gms.car.br):void");
    }

    /* renamed from: a */
    public final void mo118083a() {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            bbVar.mo118030a();
        }
    }

    /* renamed from: b */
    public final void mo118084b() {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            Objects.requireNonNull(bbVar);
            C143256at atVar = new C143256at(bbVar);
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(atVar);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo118085c() {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.killDeprecated()", bbVar.f388473v);
            }
            C143316a.m232514d(6, "CAR.PROJECTION.CAHI", (Throwable) null, "%s", m232387B());
            SparseArray sparseArray2 = C143268bb.f388432a;
            if (bbVar.f388435C) {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        }
    }

    /* renamed from: d */
    public final void mo118086d(IBinder iBinder) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onAccessibilityEvent", bbVar.f388473v);
            }
            C143251ao aoVar = new C143251ao(bbVar, iBinder);
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118320p(aoVar);
        }
    }

    /* renamed from: e */
    public final void mo118087e(int i) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            C143258av avVar = new C143258av();
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(avVar);
        }
    }

    /* renamed from: f */
    public final void mo118088f(InputFocusChangedEvent inputFocusChangedEvent) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onInputFocusChange(event: %s)", bbVar.f388473v, inputFocusChangedEvent);
            }
            m232388C(inputFocusChangedEvent);
        } else if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder: onInputFocusChange(event: %s) service is null", inputFocusChangedEvent);
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo118089g(boolean z) {
        if (!m232389D((C143268bb) this.f388411a.get())) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s onInputFocusChangeDeprecated(hasFocus:%b)", ((C143268bb) this.f388411a.get()).f388473v, Boolean.valueOf(z));
            }
            m232388C(new InputFocusChangedEvent(z, true, -1, (Rect) null));
        } else if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder: onInputFocusChangeDeprecated(hasFocus:%b) service is null", Boolean.valueOf(z));
        }
    }

    @Deprecated
    /* renamed from: h */
    public final void mo118090h(boolean z, boolean z2) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b)", bbVar.f388473v, Boolean.valueOf(z), Boolean.valueOf(z2));
            }
            m232388C(new InputFocusChangedEvent(z, !z2, -1, (Rect) null));
        } else if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder: onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b) service is null", Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: i */
    public final void mo118091i(Intent intent) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onNewIntent(%s)", bbVar.f388473v, intent);
            }
            C143248al alVar = new C143248al(bbVar, intent);
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118320p(alVar);
        }
    }

    /* renamed from: j */
    public final void mo118092j(int i) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            C143244ah ahVar = new C143244ah();
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(ahVar);
        }
    }

    /* renamed from: k */
    public final void mo118093k(int i) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionPause(displayId:%s)", bbVar.f388473v, Integer.valueOf(i));
            }
            Objects.requireNonNull(bbVar);
            C143254ar arVar = new C143254ar(bbVar);
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118320p(arVar);
        }
    }

    /* renamed from: l */
    public final void mo118094l(int i) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionResume(displayId:%s)", bbVar.f388473v, Integer.valueOf(i));
            }
            Objects.requireNonNull(bbVar);
            C143252ap apVar = new C143252ap(bbVar);
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118320p(apVar);
        }
    }

    /* renamed from: m */
    public final void mo118095m(int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionStart(displayId:%d, regionId:%d, spec:%s, currentIntent:%s, config:%s)", bbVar.f388473v, Integer.valueOf(i), Integer.valueOf(i2), drawingSpec, intent, configuration);
            }
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118306f();
            bbVar.mo118320p(new C143250an(bbVar, i2, i, drawingSpec, intent, configuration, bundle));
        }
    }

    @Deprecated
    /* renamed from: n */
    public final void mo118096n(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionStartDeprecated(displayId:%d, spec:%s, currentIntent:%s)", bbVar.f388473v, Integer.valueOf(i), drawingSpec, intent);
            }
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118306f();
            bbVar.mo118320p(new C143253aq(bbVar, i, drawingSpec, intent, bundle));
        }
    }

    /* renamed from: o */
    public final void mo118097o(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionStartWithDisplayIdDeprecated(displayId:%d, spec:%s, currentIntent:%s, config:%s)", bbVar.f388473v, Integer.valueOf(i), drawingSpec, intent, configuration);
            }
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118306f();
            bbVar.mo118320p(new C143240ad(bbVar, i, drawingSpec, intent, configuration, bundle));
        }
    }

    /* renamed from: p */
    public final void mo118098p(int i) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onProjectionStop(displayId:%s)", bbVar.f388473v, Integer.valueOf(i));
            }
            Objects.requireNonNull(bbVar);
            C143242af afVar = new C143242af(bbVar);
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118320p(afVar);
        }
    }

    /* renamed from: q */
    public final void mo118099q() {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            SparseArray sparseArray = C143268bb.f388432a;
            C143284br brVar = bbVar.f388474w;
            if (brVar != null) {
                if (C143109au.m232164a("CAR.INPUT", 3)) {
                    C143316a.m232511a("CAR.INPUT", (Throwable) null, "onStopInput");
                }
                synchronized (brVar.f388494b) {
                    if (!brVar.f388494b.isEmpty()) {
                        brVar.f388494b.poll();
                    } else {
                        C143316a.m232514d(5, "CAR.INPUT", (Throwable) null, "onStopInput recieved with no active editable", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo118100r(Rect rect) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (m232389D(bbVar)) {
            C143316a.m232511a("CAR.PROJECTION.CAHI", (Throwable) null, "No CarActivityHost connected, not delivering onSystemWindowInsetsChanged.");
            return;
        }
        if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = C143268bb.f388432a;
            C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onSystemWindowInsetsChanged()", bbVar.f388473v);
        }
        SparseArray sparseArray2 = C143268bb.f388432a;
        bbVar.mo118306f();
        bbVar.mo118320p(new C143243ag(bbVar, rect));
    }

    /* renamed from: s */
    public final void mo118101s(int i, MotionEvent motionEvent) {
        long j;
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onTouchEvent(displayId:%s, event:%s)", bbVar.f388473v, Integer.valueOf(i), motionEvent);
            }
            if (motionEvent.isFromSource(4098)) {
                C143246aj ajVar = new C143246aj(bbVar, i, motionEvent);
                SparseArray sparseArray2 = C143268bb.f388432a;
                bbVar.mo118320p(ajVar);
                try {
                    synchronized (bbVar.f388441I) {
                        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                            j = SystemClock.elapsedRealtime();
                            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s onTouchEvent() [activityHasWindowFocus(beforeWait):%b]", bbVar.f388473v, Boolean.valueOf(bbVar.f388442J));
                        } else {
                            j = 0;
                        }
                        while (!bbVar.f388442J) {
                            bbVar.f388441I.wait(500);
                        }
                        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 2)) {
                            C143316a.m232514d(2, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s onTouchEvent() [activityHasWindowFocus(afterWait):%b, waitTimeInMs:%d]", bbVar.f388473v, Boolean.valueOf(bbVar.f388442J), Long.valueOf(SystemClock.elapsedRealtime() - j));
                        }
                    }
                } catch (InterruptedException e) {
                    C143316a.m232512b("CAR.PROJECTION.CAHI", e, "Error waiting for car activity to receive focus on touch.");
                }
            }
            C143247ak akVar = new C143247ak(bbVar, motionEvent);
            SparseArray sparseArray3 = C143268bb.f388432a;
            bbVar.mo118320p(akVar);
        }
    }

    /* renamed from: t */
    public final void mo118102t(CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            C143255as asVar = new C143255as(bbVar, carWindowManagerLayoutParams);
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(asVar);
        }
    }

    /* renamed from: u */
    public final void mo118103u(DrawingSpec drawingSpec) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            C143245ai aiVar = new C143245ai(bbVar, drawingSpec);
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(aiVar);
        }
    }

    /* renamed from: v */
    public final void mo118104v() {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            SparseArray sparseArray = C143268bb.f388432a;
            C143207dx dxVar = bbVar.f388463l;
            if (dxVar != null) {
                dxVar.mo118229c((Surface) null);
            }
        }
    }

    /* renamed from: w */
    public final void mo118105w(KeyEvent keyEvent) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            C143259aw awVar = new C143259aw(bbVar, keyEvent);
            SparseArray sparseArray = C143268bb.f388432a;
            bbVar.mo118320p(awVar);
        }
    }

    /* renamed from: x */
    public final void mo118106x(int i, DrawingSpec drawingSpec, Configuration configuration) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.onVideoConfigurationChanged()", bbVar.f388473v);
            }
            SparseArray sparseArray2 = C143268bb.f388432a;
            bbVar.mo118306f();
            bbVar.mo118320p(new C143241ae(bbVar, i, drawingSpec, configuration));
        }
    }

    @Deprecated
    /* renamed from: y */
    public final void mo118107y(C143150cf cfVar) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar)) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.kill()", bbVar.f388473v);
            }
            String B = m232387B();
            C143316a.m232514d(6, "CAR.PROJECTION.CAHI", (Throwable) null, "%s", B);
            Bundle bundle = new Bundle();
            bundle.putString("anr_logs", B);
            try {
                cfVar.mo118109e(bundle);
            } catch (RemoteException e) {
                C143316a.m232512b("CAR.PROJECTION.CAHI", e, "Failed to log ANR data!");
            }
            SparseArray sparseArray2 = C143268bb.f388432a;
            if (bbVar.f388435C) {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        }
    }

    /* renamed from: z */
    public final void mo118108z(C143150cf cfVar, KillOptions killOptions) {
        C143268bb bbVar = (C143268bb) this.f388411a.get();
        if (!m232389D(bbVar) && cfVar != null && killOptions != null) {
            if (C143109au.m232164a("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = C143268bb.f388432a;
                C143316a.m232514d(3, "CAR.PROJECTION.CAHI", (Throwable) null, "Binder:%s.kill()", bbVar.f388473v);
            }
            String B = m232387B();
            C143316a.m232514d(6, "CAR.PROJECTION.CAHI", (Throwable) null, "%s", B);
            Bundle bundle = new Bundle();
            if (killOptions.f387998b) {
                bundle.putString("anr_logs", B);
            }
            try {
                cfVar.mo118109e(bundle);
            } catch (RemoteException e) {
                C143316a.m232512b("CAR.PROJECTION.CAHI", e, "Failed to log ANR data!");
            }
            if (killOptions.f387999c) {
                SparseArray sparseArray2 = C143268bb.f388432a;
                Executors.newSingleThreadExecutor().execute(new C143257au(killOptions));
                return;
            }
            SparseArray sparseArray3 = C143268bb.f388432a;
            if (bbVar.f388435C) {
                Process.killProcess(Process.myPid());
                System.exit(10);
            }
        }
    }
}
