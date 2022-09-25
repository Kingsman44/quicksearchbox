package com.google.android.apps.gsa.notificationlistener;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class GsaNotificationListenerService extends C83397m implements C47231d {

    /* renamed from: a */
    private C83391h f227247a;

    /* renamed from: b */
    private boolean f227248b;

    /* renamed from: c */
    private final C47550bb f227249c = new C47550bb(this);

    @Deprecated
    public GsaNotificationListenerService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C83391h mo17754z() {
        C83391h hVar = this.f227247a;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C47573bx c = this.f227249c.mo51411c("dump");
        try {
            C83391h a = mo17754z();
            printWriter.println(String.format(Locale.getDefault(), "State: %s", new Object[]{C83391h.m132724c(a.f227279g)}));
            c.close();
            return;
        } catch (Throwable th) {
            C83386c.m132711a(th, th);
        }
        throw th;
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f227249c.mo51409a(intent);
        try {
            C83391h a2 = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            String action = intent.getAction();
            if ("android.service.notification.NotificationListenerService".equals(action)) {
                C83391h.f227274b.set(a2);
                IBinder onBind = super.onBind(intent);
                a.close();
                return onBind;
            }
            throw new IllegalArgumentException("Illegal action: ".concat(String.valueOf(action)));
        } catch (Throwable th) {
            C83386c.m132711a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f227249c.mo51410b();
        try {
            this.f227248b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f227247a == null) {
                if (this.f227248b) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo76696b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo76696b().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof GsaNotificationListenerService) {
                        GsaNotificationListenerService gsaNotificationListenerService = (GsaNotificationListenerService) service;
                        C68225k.m98532d(gsaNotificationListenerService);
                        aso aso = ((amb) jN).f197807b.d;
                        this.f227247a = new C83391h(gsaNotificationListenerService, Optional.m71637of(new C83399o((Context) aso.f201488a.g.mo17428b(), (C91022f) aso.f201488a.a.f202649b.mo17428b(), aso.f201488a.b.mo67228S())));
                        a2.close();
                        this.f227247a.f227281i = this;
                    } else {
                        String obj = C83391h.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            super.onCreate();
            C83391h a3 = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (a3.f227280h.isPresent()) {
                C83399o oVar = (C83399o) a3.f227280h.get();
                C83387d.m132714d(oVar);
                oVar.f227294a.mo85301a(oVar);
            }
            this.f227248b = false;
            b.close();
            return;
            throw th;
            throw th;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f227249c.mo51412d();
        try {
            C83391h a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C83391h.m132725d();
            a.mo76692e();
            super.onDestroy();
            if (a.f227280h.isPresent()) {
                C83399o oVar = (C83399o) a.f227280h.get();
                C83387d.m132717g(oVar);
                oVar.f227294a.mo85302b(oVar);
            }
            d.close();
            return;
        } catch (Throwable th) {
            C83386c.m132711a(th, th);
        }
        throw th;
    }

    public final void onInterruptionFilterChanged(int i) {
        C47573bx c = this.f227249c.mo51411c("onInterruptionFilterChanged");
        try {
            super.onInterruptionFilterChanged(i);
            C83391h a = mo17754z();
            if (!a.f227278f.get()) {
                C59104x d = C83391h.f227273a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
                ((C59052c) ((C59052c) d).mo56372aa(6586)).mo56386p("onInterruptionFilterChanged() called while disconnected");
            } else {
                C58976aa aaVar = C58975e.f156826a;
                synchronized (a.f227277e) {
                    for (C36599b c2 : a.f227277e) {
                        c2.mo21531c(i);
                    }
                }
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final void onListenerConnected() {
        C58528ij F;
        C47573bx c = this.f227249c.mo51411c("onListenerConnected");
        try {
            super.onListenerConnected();
            C83391h a = mo17754z();
            if (C83391h.f227274b.get() == null) {
                C59104x d = C83391h.f227273a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
                ((C59052c) ((C59052c) d).mo56372aa(6589)).mo56386p("onListenerConnected() called while not bound");
            } else {
                C58976aa aaVar = C58975e.f156826a;
                a.f227278f.getAndSet(true);
                C83391h.m132725d();
                synchronized (C83391h.f227275c) {
                    F = C58528ij.m90006F(C83391h.f227275c);
                }
                Collection.EL.stream(F).forEach(C83388e.f227269a);
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final void onListenerDisconnected() {
        C47573bx c = this.f227249c.mo51411c("onListenerDisconnected");
        try {
            super.onListenerDisconnected();
            mo17754z().mo76692e();
            c.close();
            return;
        } catch (Throwable th) {
            C83386c.m132711a(th, th);
        }
        throw th;
    }

    public final void onListenerHintsChanged(int i) {
        C47573bx c = this.f227249c.mo51411c("onListenerHintsChanged");
        try {
            super.onListenerHintsChanged(i);
            C83391h a = mo17754z();
            if (!a.f227278f.get()) {
                C59104x d = C83391h.f227273a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
                ((C59052c) ((C59052c) d).mo56372aa(6593)).mo56386p("onListenerHintsChanged() called while disconnected");
            } else {
                C58976aa aaVar = C58975e.f156826a;
                synchronized (a.f227277e) {
                    for (C36599b d2 : a.f227277e) {
                        d2.mo21532d(i);
                    }
                }
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C47573bx c = this.f227249c.mo51411c("onNotificationPosted");
        try {
            super.onNotificationPosted(statusBarNotification, rankingMap);
            C83391h a = mo17754z();
            if (!a.f227278f.get()) {
                C59104x d = C83391h.f227273a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
                ((C59052c) ((C59052c) d).mo56372aa(6595)).mo56386p("onNotificationPosted() called while disconnected");
            } else {
                C58976aa aaVar = C58975e.f156826a;
                synchronized (a.f227277e) {
                    for (C36599b e : a.f227277e) {
                        e.mo21533e(statusBarNotification, rankingMap);
                    }
                }
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        C47573bx c = this.f227249c.mo51411c("onNotificationRemoved");
        try {
            super.onNotificationRemoved(statusBarNotification, rankingMap);
            C83391h a = mo17754z();
            if (!a.f227278f.get()) {
                C59104x d = C83391h.f227273a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
                ((C59052c) ((C59052c) d).mo56372aa(6597)).mo56386p("onNotificationRemoved() called while disconnected");
            } else {
                C58976aa aaVar = C58975e.f156826a;
                if (!(statusBarNotification == null || rankingMap == null)) {
                    synchronized (a.f227277e) {
                        for (C36599b f : a.f227277e) {
                            f.mo21534f(statusBarNotification, rankingMap);
                        }
                    }
                }
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                C83386c.m132711a(th, th2);
            }
            throw th;
        }
    }

    public final boolean onUnbind(Intent intent) {
        C47573bx f = this.f227249c.mo51414f();
        try {
            C83391h a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if ("android.service.notification.NotificationListenerService".equals(intent.getAction())) {
                C83391h.f227274b.set((Object) null);
            }
            boolean onUnbind = super.onUnbind(intent);
            f.close();
            return onUnbind;
        } catch (Throwable th) {
            C83386c.m132711a(th, th);
        }
        throw th;
    }
}
