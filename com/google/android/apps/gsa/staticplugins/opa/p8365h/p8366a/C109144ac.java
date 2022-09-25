package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.shared.p6976ag.p6977a.C89105a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106597i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106600l;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107061a;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.C109191s;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.C109192t;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.C131702a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1963i.C23849ax;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.ac */
/* compiled from: PG */
public final class C109144ac extends C89105a implements C90991b {

    /* renamed from: a */
    public final C58974d f303932a;

    /* renamed from: b */
    public final Context f303933b;

    /* renamed from: c */
    public final ActivityManager f303934c;

    /* renamed from: d */
    public final C109191s f303935d;

    /* renamed from: e */
    public final C58881cr f303936e;

    /* renamed from: f */
    public final Optional f303937f;

    /* renamed from: g */
    public final C91142g f303938g;

    /* renamed from: h */
    public final C60888db f303939h;

    /* renamed from: i */
    public final C21370a f303940i;

    /* renamed from: j */
    public final C106597i f303941j = ((C106597i) C106600l.f297227d.createBuilder());

    /* renamed from: k */
    public final C91123v f303942k;

    /* renamed from: l */
    private final C68214a f303943l;

    /* renamed from: m */
    private final Optional f303944m;

    /* renamed from: n */
    private final C90479a f303945n;

    /* renamed from: o */
    private final C60836bq f303946o = new C60836bq();

    /* renamed from: p */
    private final C47770dh f303947p;

    public C109144ac(Context context, ActivityManager activityManager, C68214a aVar, Optional optional, C109192t tVar, C90479a aVar2, Set set, Optional optional2, C91142g gVar, C91022f fVar, C60888db dbVar, C91123v vVar, C47770dh dhVar, C21370a aVar3, C83564a aVar4) {
        C109192t tVar2 = tVar;
        this.f303933b = context;
        this.f303934c = activityManager;
        this.f303943l = aVar;
        this.f303944m = optional;
        Context context2 = (Context) tVar2.f304032a.mo17428b();
        context2.getClass();
        C90851k kVar = (C90851k) tVar2.f304033b.mo17428b();
        kVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) tVar2.f304034c).f184585a);
        a.getClass();
        C47770dh dhVar2 = (C47770dh) tVar2.f304035d.mo17428b();
        dhVar2.getClass();
        Looper looper = (Looper) tVar2.f304036e.mo17428b();
        looper.getClass();
        C83564a aVar5 = (C83564a) tVar2.f304037f.mo17428b();
        aVar5.getClass();
        this.f303935d = new C109191s(context2, kVar, a, dhVar2, looper, aVar5);
        this.f303945n = aVar2;
        this.f303937f = optional2;
        this.f303938g = gVar;
        this.f303939h = C23849ax.m44396a(dbVar);
        this.f303942k = vVar;
        this.f303947p = dhVar;
        this.f303940i = aVar3;
        C58974d a2 = aVar4.mo76900a("AmbBrdcstRcvrServClient");
        this.f303932a = a2;
        this.f303936e = C58886cw.m90973a(new C109154j(this, set));
        fVar.mo85301a(this);
        ((C58970a) ((C58970a) a2.mo56224b()).mo56372aa(23904)).mo56386p("constructed!");
    }

    /* renamed from: a */
    public final void mo83077a(Context context) {
        C46459k.m82829b(this.f303946o.mo57305b(new C109161q(this, context), this.f303939h), "connect(): failed", new Object[0]);
    }

    /* renamed from: b */
    public final void mo83078b() {
        C46459k.m82829b(this.f303946o.mo57305b(new C109158n(this), this.f303939h), "disconnect(): failed", new Object[0]);
    }

    /* renamed from: c */
    public final boolean mo83079c() {
        return true;
    }

    /* renamed from: e */
    public final C60870cx mo97637e(Context context) {
        C60870cx cxVar;
        C109164t tVar = new C109164t(this, context);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(tVar), this.f303939h);
        C60870cx[] cxVarArr = new C60870cx[2];
        if (!this.f303945n.mo84234i() || !this.f303944m.isPresent() || !C107061a.m177778c(this.f303938g)) {
            ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23900)).mo56386p("Not starting TngAmbientAssistant.");
            cxVar = C60866ct.f164955a;
        } else {
            ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23901)).mo56386p("Starting TngAmbientAssistant.");
            cxVar = ((C131702a) this.f303944m.get()).mo110277a();
        }
        cxVarArr[0] = cxVar;
        cxVarArr[1] = n;
        return C47638k.m84753d(cxVarArr).mo51520a(C109165u.f303977a, this.f303939h);
    }

    /* renamed from: f */
    public final C60870cx mo97638f() {
        C60870cx cxVar;
        C109168x xVar = new C109168x(this);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(xVar), this.f303939h);
        C60870cx[] cxVarArr = new C60870cx[2];
        if (!this.f303945n.mo84234i() || !this.f303944m.isPresent()) {
            ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23902)).mo56386p("TngAmbientAssistant is not present.");
            cxVar = C60866ct.f164955a;
        } else {
            ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23903)).mo56386p("Stopping TngAmbientAssistant.");
            cxVar = ((C131702a) this.f303944m.get()).mo110278b();
        }
        cxVarArr[0] = cxVar;
        cxVarArr[1] = n;
        C60870cx a = C47638k.m84753d(cxVarArr).mo51520a(C109169y.f303981a, this.f303939h);
        C109150f fVar = new C109150f(this);
        return C60846c.m92878g(a, RuntimeException.class, C47810es.m84963c(fVar), this.f303939h);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AmbientBroadcastReceiverServiceClientImpl");
        C47633f g = C47633f.m84733g(((C42876ab) this.f303943l.mo27525b()).mo46042d());
        C109170z zVar = new C109170z(fVar);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(zVar), this.f303939h);
        boolean j = this.f303938g.mo85405j(C90017bw.f247861C);
        fVar.mo85292s(C90752i.m148229c("AA flag enabled? " + j));
        boolean b = C107061a.m177777b(this.f303938g);
        fVar.mo85292s(C90752i.m148229c("AA unlocked enabled? " + b));
        boolean j2 = this.f303938g.mo85405j(C90017bw.f247976bl);
        fVar.mo85292s(C90752i.m148229c("AA TNG flag enabled? " + j2));
        boolean c = C107061a.m177778c(this.f303938g);
        fVar.mo85292s(C90752i.m148229c("AA TNG unlocked enabled? " + c));
        boolean j3 = this.f303938g.mo85405j(C90017bw.f247872N);
        fVar.mo85292s(C90752i.m148229c("Context aggregator enabled? " + j3));
        boolean j4 = this.f303938g.mo85405j(C90017bw.f247897aL);
        fVar.mo85292s(C90752i.m148229c("Enable dynamic mendel flag updates enabled? " + j4));
        boolean j5 = this.f303938g.mo85405j(C90017bw.f247868J);
        fVar.mo85292s(C90752i.m148229c("Enable headphone trigger enabled? " + j5));
        boolean j6 = this.f303938g.mo85405j(C90017bw.f247969be);
        fVar.mo85292s(C90752i.m148229c("Is Blue Chip Smartspace Enabled? " + j6));
        boolean J = C83794j.m133429J(this.f303933b, this.f303942k);
        fVar.mo85292s(C90752i.m148229c("Is widget installed? " + J));
        C58800sl lA = ((C58528ij) this.f303936e.mo6453a()).iterator();
        while (lA.hasNext()) {
            ((C109143ab) lA.next()).mo17602gS(fVar);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        C47538ax c = this.f303947p.mo51613c("AmbientBroadcastReceiverServiceClientImpl#onReceive");
        try {
            C60870cx a = this.f303935d.mo97656a(intent);
            if (!"com.google.android.googlequicksearchbox.AA_ACTION_REFRESH".equals(intent.getAction())) {
                ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23909)).mo56389s("handleRefreshAction(): not handling %s", intent.getAction());
            } else {
                ((C58970a) ((C58970a) this.f303932a.mo56224b()).mo56372aa(23908)).mo56389s("handleRefreshAction(): handling %s", intent.getAction());
                C46459k.m82829b(this.f303946o.mo57305b(new C109157m(this, a, context), this.f303939h), "maybeRefreshAction(): failed", new Object[0]);
            }
            String action = intent.getAction();
            Object[] objArr = new Object[1];
            if (action == null) {
                action = "null";
            }
            objArr[0] = action;
            C46459k.m82829b(a, "onReceive(): failed action %s", objArr);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
