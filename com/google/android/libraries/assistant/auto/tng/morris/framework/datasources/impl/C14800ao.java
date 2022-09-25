package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14225bi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14226bj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ao */
/* compiled from: PG */
public final class C14800ao implements C14781a {

    /* renamed from: i */
    private static final C59071e f44586i = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ao");

    /* renamed from: a */
    public final Context f44587a;

    /* renamed from: b */
    public final C86124t f44588b;

    /* renamed from: c */
    public final C14096x f44589c;

    /* renamed from: d */
    final BroadcastReceiver f44590d = new C14799an(this);

    /* renamed from: e */
    public Optional f44591e = Optional.empty();

    /* renamed from: f */
    public int f44592f;

    /* renamed from: g */
    public Optional f44593g = Optional.empty();

    /* renamed from: h */
    public boolean f44594h = false;

    /* renamed from: j */
    private final C60887da f44595j;

    /* renamed from: k */
    private final C60888db f44596k;

    /* renamed from: l */
    private final NotificationManager f44597l;

    /* renamed from: m */
    private C60870cx f44598m = null;

    /* renamed from: n */
    private int f44599n = -1;

    public C14800ao(Context context, C86124t tVar, C60887da daVar, C60888db dbVar, C14096x xVar) {
        this.f44587a = context;
        this.f44588b = tVar;
        this.f44595j = daVar;
        this.f44596k = dbVar;
        this.f44589c = xVar;
        this.f44597l = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: m */
    public static boolean m31136m(Optional optional, Optional optional2) {
        if (optional.isEmpty() && optional2.isEmpty()) {
            return false;
        }
        if (!optional.isEmpty() && !optional2.isEmpty() && ((NotificationManager.Policy) optional.get()).priorityCategories == ((NotificationManager.Policy) optional2.get()).priorityCategories && ((NotificationManager.Policy) optional.get()).priorityCallSenders == ((NotificationManager.Policy) optional2.get()).priorityCallSenders && ((NotificationManager.Policy) optional.get()).priorityMessageSenders == ((NotificationManager.Policy) optional2.get()).priorityMessageSenders && ((NotificationManager.Policy) optional.get()).suppressedVisualEffects == ((NotificationManager.Policy) optional2.get()).suppressedVisualEffects) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final void m31137n() {
        int i;
        m31138o();
        if (this.f44591e.isPresent() && m31136m(mo21745j(), this.f44591e) && !this.f44594h) {
            if (C14160ab.m30484e(this.f44587a, (NotificationManager.Policy) this.f44591e.get())) {
                this.f44593g = this.f44591e;
            }
            mo21747l(Optional.empty());
        }
        if (C14160ab.m30486g(this.f44599n) && (i = this.f44599n) != -1 && !this.f44594h) {
            if (C14160ab.m30483d(this.f44587a, i)) {
                this.f44592f = this.f44599n;
            }
            mo21746k(-1);
        }
    }

    /* renamed from: o */
    private final void m31138o() {
        synchronized (this) {
            C60870cx cxVar = this.f44598m;
            if (cxVar != null && !cxVar.isDone()) {
                this.f44598m.cancel(true);
            }
            this.f44598m = null;
        }
        try {
            this.f44587a.unregisterReceiver(this.f44590d);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final void mo21501a() {
        C58976aa aaVar = C58975e.f156826a;
        m31137n();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        m31137n();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final int mo21744f() {
        NotificationManager notificationManager = this.f44597l;
        if (notificationManager == null) {
            return -1;
        }
        return notificationManager.getCurrentInterruptionFilter();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14226bj bjVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.DND_REQUEST) {
            C59104x d = f44586i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
            ((C59052c) ((C59052c) d).mo56372aa(45534)).mo56389s("getDataForRequest(), request.getRequestCase() should be DND_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
            return C14221be.f43041c;
        }
        C59104x d2 = f44586i.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
        C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(45533);
        if (bcVar.f43038a == 26) {
            bjVar = (C14226bj) bcVar.f43039b;
        } else {
            bjVar = C14226bj.f43052c;
        }
        int b = C14225bi.m30581b(bjVar.f43054a);
        if (b == 0) {
            b = 1;
        }
        cVar.mo56389s("Unsupported Op: Cannot getDataForRequest(%s)", C14225bi.m30580a(b));
        return C14221be.f43041c;
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14226bj bjVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.DND_REQUEST) {
            C59104x d = f44586i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
            ((C59052c) ((C59052c) d).mo56372aa(45536)).mo56389s("fetchAndStoreData(), request.getRequestCase() should be DND_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
            return C60856cj.m92900i(C14782b.FAILED);
        }
        C59104x d2 = f44586i.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
        C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(45535);
        if (bcVar.f43038a == 26) {
            bjVar = (C14226bj) bcVar.f43039b;
        } else {
            bjVar = C14226bj.f43052c;
        }
        int b = C14225bi.m30581b(bjVar.f43054a);
        if (b == 0) {
            b = 1;
        }
        cVar.mo56389s("Unsupported Op: fetchAndStoreData(%s)", C14225bi.m30580a(b));
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* renamed from: k */
    public final void mo21746k(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f44599n = i;
        C46459k.m82829b(this.f44595j.mo19398a(C47810es.m84977q(new C14797al(this, i))), "Failed to set prior DND filter in data store.", new Object[0]);
    }

    /* renamed from: l */
    public final void mo21747l(Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        this.f44591e = optional;
        C46459k.m82829b(this.f44595j.mo19398a(C47810es.m84977q(new C14798am(this, optional))), "Failed to set prior notification policy in data store.", new Object[0]);
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C14226bj bjVar;
        C14226bj bjVar2;
        C14226bj bjVar3;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.DND_REQUEST) {
            C59104x d = f44586i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
            ((C59052c) ((C59052c) d).mo56372aa(45542)).mo56389s("sendFireAndForgetRequest(), request.getRequestCase() should be DND_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
            return;
        }
        if (bcVar.f43038a == 26) {
            bjVar = (C14226bj) bcVar.f43039b;
        } else {
            bjVar = C14226bj.f43052c;
        }
        int b = C14225bi.m30581b(bjVar.f43054a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (i2 == -1 || i2 == 0) {
            C59104x d2 = f44586i.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
            C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(45541);
            if (bcVar.f43038a == 26) {
                bjVar2 = (C14226bj) bcVar.f43039b;
            } else {
                bjVar2 = C14226bj.f43052c;
            }
            int b2 = C14225bi.m30581b(bjVar2.f43054a);
            if (b2 != 0) {
                i = b2;
            }
            cVar.mo56389s("Unsupported Op: Cannot sendFireAndForget(%s)", C14225bi.m30580a(i));
        } else if (i2 == 1) {
            if (bcVar.f43038a == 26) {
                bjVar3 = (C14226bj) bcVar.f43039b;
            } else {
                bjVar3 = C14226bj.f43052c;
            }
            boolean z = bjVar3.f43055b;
            if (!C14160ab.m30481b(this.f44587a)) {
                C59104x b3 = f44586i.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
                ((C59052c) ((C59052c) b3).mo56372aa(45548)).mo56386p("Forcing allow calls to true because DND permission is not granted.");
                z = true;
            } else if (C14160ab.m30485f(this.f44587a)) {
                C59104x b4 = f44586i.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
                ((C59052c) ((C59052c) b4).mo56372aa(45547)).mo56386p("Forcing allow calls to false because incoming calls should be disabled per policy.");
                z = false;
            }
            NotificationManager.Policy policy = new NotificationManager.Policy((true != z ? 0 : 8) | 224, 0, 0, true != this.f44588b.mo79746e(C90051dc.f248902cd) ? 159 : 415);
            m31138o();
            int f = mo21744f();
            this.f44592f = f;
            if (C14160ab.m30486g(f) && !this.f44594h && f != 2) {
                if (C14160ab.m30483d(this.f44587a, 2)) {
                    this.f44592f = 2;
                    if (this.f44599n == -1) {
                        mo21746k(f);
                    }
                } else {
                    C59104x c = f44586i.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
                    ((C59052c) ((C59052c) c).mo56372aa(45546)).mo56386p("Did not store prior notification filter: error setting new state.");
                }
            }
            Optional j = mo21745j();
            this.f44593g = j;
            if (m31136m(j, Optional.m71637of(policy)) && !this.f44594h) {
                if (C14160ab.m30484e(this.f44587a, policy)) {
                    this.f44593g = Optional.m71637of(policy);
                    if (this.f44591e.isEmpty()) {
                        mo21747l(j);
                    }
                } else {
                    C59104x c2 = f44586i.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
                    ((C59052c) ((C59052c) c2).mo56372aa(45545)).mo56386p("Did not store prior notification policy: error setting new state.");
                }
            }
            if (!C14160ab.m30482c(this.f44587a)) {
                C59104x b5 = f44586i.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "Morris.DndDataSource");
                ((C59052c) ((C59052c) b5).mo56372aa(45540)).mo56386p("Not registering broadcast receiver, no notification policy access.");
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
            intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
            long a = this.f44588b.mo79743a(C90051dc.f248895bx);
            if (a <= 0) {
                this.f44587a.registerReceiver(this.f44590d, intentFilter);
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            synchronized (this) {
                this.f44598m = this.f44596k.mo29164d(new C14796ak(this, intentFilter), a, TimeUnit.MILLISECONDS);
            }
        } else if (i2 == 3) {
            m31137n();
        }
    }

    /* renamed from: j */
    public final Optional mo21745j() {
        NotificationManager notificationManager = this.f44597l;
        notificationManager.getClass();
        return Optional.ofNullable(notificationManager.getNotificationPolicy());
    }
}
