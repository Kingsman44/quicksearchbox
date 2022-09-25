package com.google.android.apps.gsa.staticplugins.bisto.notifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89622at;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.bisto.C89684w;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.C95577u;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a.C95507c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95532g;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95589aj;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95605az;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95606b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95607c;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95615k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95616l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95618n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95626v;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95627w;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e.C95635d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95638b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7505g.C95640a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7505g.C95643d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7506h.C95644a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95646a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95651ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95655d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95662k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95666o;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95667p;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.f */
/* compiled from: PG */
public final class C95636f implements AutoCloseable, C89495cg, C95639g, C89683v {

    /* renamed from: a */
    public static final C59071e f267647a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.f");

    /* renamed from: A */
    private final C95616l f267648A;

    /* renamed from: B */
    private final Context f267649B;

    /* renamed from: C */
    private final C22871g f267650C;

    /* renamed from: D */
    private C60870cx f267651D;

    /* renamed from: E */
    private boolean f267652E = false;

    /* renamed from: b */
    public final C89622at f267653b;

    /* renamed from: c */
    public final C95589aj f267654c;

    /* renamed from: d */
    public final C95598as f267655d;

    /* renamed from: e */
    public final C95626v f267656e;

    /* renamed from: f */
    public C95615k f267657f;

    /* renamed from: g */
    public C95605az f267658g;

    /* renamed from: h */
    public final C95706l f267659h;

    /* renamed from: i */
    public final C68214a f267660i;

    /* renamed from: j */
    public final C95643d f267661j;

    /* renamed from: k */
    public final C95607c f267662k;

    /* renamed from: l */
    public final C69464a f267663l;

    /* renamed from: m */
    C95666o f267664m;

    /* renamed from: n */
    public C95606b f267665n;

    /* renamed from: o */
    C95577u f267666o;

    /* renamed from: p */
    public C95655d f267667p;

    /* renamed from: q */
    public C95293ae f267668q;

    /* renamed from: r */
    public C95640a f267669r;

    /* renamed from: s */
    public C95355bf f267670s;

    /* renamed from: t */
    public final C95667p f267671t;

    /* renamed from: u */
    public final C22871g f267672u;

    /* renamed from: v */
    public final C95504a f267673v;

    /* renamed from: w */
    public C60870cx f267674w;

    /* renamed from: x */
    public final C95507c f267675x;

    /* renamed from: y */
    private final C69464a f267676y;

    /* renamed from: z */
    private final C95635d f267677z;

    public C95636f(Context context, C89684w wVar, C68214a aVar, C21370a aVar2, C22871g gVar, C22871g gVar2, C95635d dVar, C68214a aVar3, C89622at atVar, C69464a aVar4, C95504a aVar5, C95643d dVar2, C95850a aVar6, C95667p pVar, C95507c cVar, C95706l lVar, C95616l lVar2, C95598as asVar, C95626v vVar, C95589aj ajVar, C95607c cVar2, C69464a aVar7) {
        C89684w wVar2 = wVar;
        C95635d dVar3 = dVar;
        C95706l lVar3 = lVar;
        C95598as asVar2 = asVar;
        C95626v vVar2 = vVar;
        C95589aj ajVar2 = ajVar;
        C22872h.m42742b(C0826b.class);
        this.f267649B = context;
        this.f267672u = gVar;
        this.f267650C = gVar2;
        this.f267671t = pVar;
        this.f267673v = aVar5;
        this.f267677z = dVar3;
        this.f267653b = atVar;
        this.f267676y = aVar4;
        this.f267660i = aVar;
        this.f267661j = dVar2;
        this.f267675x = cVar;
        this.f267659h = lVar3;
        this.f267648A = lVar2;
        this.f267662k = cVar2;
        this.f267663l = aVar7;
        wVar.mo83587a("NotificationAnnouncementSystem", this);
        wVar.mo83587a("EngagementTracker", lVar3);
        this.f267655d = asVar2;
        C21370a aVar8 = aVar2;
        asVar2.f267538i = new C95618n(lVar3, dVar3, (C95638b) aVar3.mo27525b(), aVar2);
        wVar.mo83587a("NotificationStorage", asVar2);
        this.f267656e = vVar2;
        wVar.mo83587a("NotificationGroupStorage", vVar2);
        this.f267654c = ajVar2;
        wVar.mo83587a("NotificationStaging", ajVar2);
        mo89599e();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(m158349b());
        ihVar.mo55373c(15);
        ihVar.mo55373c(33);
        ihVar.mo55373c(35);
        ((C89492cd) aVar.mo27525b()).mo83360B(ihVar.mo55486f(), this);
        C58976aa aaVar = C58975e.f156826a;
        aVar6.f268408a.add(this);
    }

    /* renamed from: b */
    public static C58528ij m158349b() {
        return C58528ij.m90011K(29, 36);
    }

    /* renamed from: g */
    private final void m158350g() {
        C95615k kVar = this.f267657f;
        if (kVar != null) {
            kVar.mo21529a();
            this.f267657f = null;
            C59104x b = f267647a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifAnncSystem");
            ((C59052c) ((C59052c) b).mo56372aa(16020)).mo56386p("bistoListener stopped");
        }
    }

    /* renamed from: h */
    private final void m158351h() {
        C95605az azVar = this.f267658g;
        if (azVar != null) {
            azVar.f267554b.mo83488c();
            this.f267658g = null;
            C59104x b = f267647a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifAnncSystem");
            ((C59052c) ((C59052c) b).mo56372aa(16022)).mo56386p("sharedListener stopped");
        }
    }

    /* renamed from: c */
    public final void mo89596c() {
        C58976aa aaVar = C58975e.f156826a;
        C95615k kVar = this.f267657f;
        if (kVar != null) {
            synchronized (kVar.f267588a) {
                kVar.f267590c = false;
                kVar.f267591d = null;
            }
            kVar.mo89569i();
        }
        this.f267659h.f267949g = false;
        C95577u uVar = this.f267666o;
        if (uVar != null) {
            AlarmManager alarmManager = (AlarmManager) uVar.f267467d.getSystemService("alarm");
            for (PendingIntent cancel : uVar.f267472i.values()) {
                alarmManager.cancel(cancel);
            }
            uVar.f267472i.clear();
            uVar.f267473j.clear();
            try {
                uVar.f267467d.unregisterReceiver(uVar.f267470g);
                uVar.f267467d.unregisterReceiver(uVar.f267469f);
            } catch (IllegalArgumentException e) {
                C59104x d = C95577u.f267461a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CalendarManager");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(16147)).mo56386p("CalendarManager receiver not registered.");
            }
            this.f267666o = null;
        }
        C95606b bVar = this.f267665n;
        if (bVar != null) {
            bVar.f267565c.mo89553c();
            bVar.mo89559a();
            this.f267665n = null;
        }
        this.f267655d.mo89546j((C95627w) null);
        C95655d dVar = this.f267667p;
        if (dVar != null) {
            dVar.mo89627g((C95662k) null);
            this.f267667p.mo89628h((C95688l) null);
            this.f267667p = null;
        }
        this.f267668q = null;
        C95666o oVar = this.f267664m;
        if (oVar != null) {
            C95532g gVar = oVar.f267797e.f267733g;
            ((C89492cd) gVar.f267340c.mo27525b()).mo83379U(gVar);
            oVar.f267793a.f267695c.set((Object) null);
            C95651ae aeVar = oVar.f267796d;
            aeVar.f267720k.set(true);
            aeVar.f267715f.f267695c.set((Object) null);
            aeVar.f267713d.mo89546j((C95627w) null);
            C60870cx cxVar = aeVar.f267723n;
            if (cxVar != null) {
                cxVar.cancel(false);
                aeVar.f267723n = null;
            }
            oVar.f267794b.f267769e = null;
            oVar.f267795c.f267786d.f267769e = null;
            C95646a aVar = oVar.f267793a;
            aVar.f267695c.set((Object) null);
            aVar.f267694b.f266456j = null;
            if (aVar.f267696d.get() != null) {
                aVar.f267694b.mo89162j(3);
            }
            this.f267664m = null;
        }
        C95640a aVar2 = this.f267669r;
        if (aVar2 != null) {
            try {
                aVar2.close();
            } catch (Exception e2) {
                C59104x c = f267647a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NotifAnncSystem");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(16021)).mo56386p("Exception when closing deviceStatusHandler");
            }
            this.f267669r = null;
        }
        this.f267670s = null;
    }

    public final void close() {
        if (mo89600f()) {
            mo89596c();
        }
        this.f267654c.mo89528b();
        this.f267653b.mo83488c();
        m158350g();
        C60870cx cxVar = this.f267651D;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f267651D = null;
        }
        C60870cx cxVar2 = this.f267674w;
        if (cxVar2 != null) {
            cxVar2.cancel(false);
            this.f267674w = null;
        }
        m158351h();
        ((C89492cd) this.f267660i.mo27525b()).mo83379U(this);
        this.f267677z.close();
    }

    /* renamed from: d */
    public final void mo89598d(C124548d dVar) {
        if (dVar == null || (!dVar.mo106514l().equals(C124721s.APOLLO) ? !C124526g.m203994b(dVar) : dVar.mo106509h().equals(C124711i.BUTTON_ACTION_NEXT_TRACK))) {
            if (this.f267658g != null) {
                m158351h();
            }
            if (this.f267657f != null) {
                m158350g();
                return;
            }
            return;
        }
        if (!this.f267652E) {
            C95504a aVar = this.f267673v;
            C83395k.m132734e(aVar.f267242a, aVar.f267243b);
            this.f267652E = true;
        }
        C95605az azVar = this.f267658g;
        if (azVar != null) {
            azVar.mo89558h();
        } else if (C36619a.m65148d(this.f267673v.f267242a)) {
            C59104x b = f267647a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotifAnncSystem");
            ((C59052c) ((C59052c) b).mo56372aa(16018)).mo56386p("start sharedListener");
            C95605az azVar2 = (C95605az) this.f267676y.mo17428b();
            this.f267658g = azVar2;
            C83387d.m132712b(this.f267673v.f267242a.getApplicationContext(), azVar2);
        }
        if (this.f267657f == null) {
            C59104x b2 = f267647a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NotifAnncSystem");
            ((C59052c) ((C59052c) b2).mo56372aa(16016)).mo56386p("start bistoListener");
            C95616l lVar = this.f267648A;
            C89622at atVar = this.f267653b;
            Context context = (Context) lVar.f267600a.mo17428b();
            context.getClass();
            atVar.getClass();
            C21370a aVar2 = (C21370a) lVar.f267601b.mo17428b();
            aVar2.getClass();
            Executor executor = (Executor) lVar.f267602c.mo17428b();
            executor.getClass();
            ((C95644a) lVar.f267603d.mo17428b()).getClass();
            this.f267657f = new C95615k(context, atVar, aVar2, executor);
            if (mo89600f()) {
                C95615k kVar = this.f267657f;
                kVar.getClass();
                kVar.mo89570j(this.f267665n);
            }
            if (C36619a.m65148d(this.f267673v.f267242a)) {
                C95504a aVar3 = this.f267673v;
                C95615k kVar2 = this.f267657f;
                kVar2.getClass();
                C83387d.m132712b(aVar3.f267242a.getApplicationContext(), kVar2);
            }
        }
    }

    /* renamed from: e */
    public final void mo89599e() {
        C60870cx cxVar = this.f267651D;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        C95355bf bfVar = this.f267670s;
        if (bfVar == null) {
            mo89598d((C124548d) null);
            return;
        }
        this.f267651D = this.f267672u.mo28209i(this.f267650C.mo28201a("bisto-get-devinfo", new C95509b(this, bfVar.mo89270k())), "bisto-create-noti-listen", new C95552c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo89600f() {
        return this.f267670s != null;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        C95666o oVar;
        C95355bf bfVar = this.f267670s;
        if (bfVar != null && bfVar.mo89270k().equals(str)) {
            mo89598d(dVar);
        }
        Stream stream = Collection.EL.stream(m158349b());
        Objects.requireNonNull(set);
        if (stream.anyMatch(new C95578d(set)) && (oVar = this.f267664m) != null) {
            oVar.f267794b.f267770f = !C124526g.m203994b(dVar);
        }
        this.f267659h.f267951i = dVar;
    }

    /* renamed from: iq */
    public final void mo83403iq(C89619aq aqVar, boolean z) {
        boolean z2;
        boolean d = C36619a.m65148d(this.f267649B);
        aqVar.println("Has perms: " + d);
        C89622at atVar = this.f267653b;
        synchronized (atVar.f242701b) {
            z2 = atVar.f242702c != null;
        }
        aqVar.println("NLS Connected: " + z2);
    }
}
