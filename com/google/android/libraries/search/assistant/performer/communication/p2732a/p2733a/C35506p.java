package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.performer.communication.p2732a.C35490a;
import com.google.android.libraries.search.assistant.performer.communication.p2735c.C35569a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.C48269bz;
import com.google.assistant.p3745ab.C48273ca;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68754r;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.p */
/* compiled from: PG */
public final class C35506p implements C35490a {

    /* renamed from: a */
    public static final C59071e f93237a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.a.a.p");

    /* renamed from: b */
    public final Context f93238b;

    /* renamed from: c */
    public final C60888db f93239c;

    /* renamed from: d */
    public final C21370a f93240d;

    /* renamed from: e */
    public final C46877q f93241e;

    /* renamed from: f */
    public final TelephonyManager f93242f;

    /* renamed from: g */
    public final C35569a f93243g;

    /* renamed from: h */
    public final C68754r f93244h;

    /* renamed from: i */
    private final Object f93245i;

    /* renamed from: j */
    private final C35505o f93246j;

    public C35506p(Context context, C60888db dbVar, C68754r rVar, C46877q qVar, C21370a aVar, TelephonyManager telephonyManager, C35569a aVar2) {
        Object obj = new Object();
        this.f93245i = obj;
        this.f93238b = context;
        this.f93239c = dbVar;
        this.f93244h = rVar;
        this.f93241e = qVar;
        this.f93240d = aVar;
        this.f93242f = telephonyManager;
        this.f93243g = aVar2;
        synchronized (obj) {
            this.f93246j = new C35505o(this);
        }
    }

    /* renamed from: a */
    public final void mo39666a() {
        synchronized (this.f93245i) {
            this.f93243g.mo39710d(C62722b.INTERNAL);
            C35505o oVar = this.f93246j;
            if (oVar != null) {
                oVar.mo39679b();
            }
        }
    }

    /* renamed from: b */
    public final void mo39667b(String str) {
        C35504n nVar;
        synchronized (this.f93245i) {
            this.f93243g.mo39719m();
            if (this.f93238b.checkSelfPermission("android.permission.CALL_PHONE") == -1) {
                this.f93243g.mo39720n(C62722b.PERMISSION_DENIED);
                return;
            }
            C35505o oVar = this.f93246j;
            if (oVar == null) {
                ((C59052c) ((C59052c) f93237a.mo56225c()).mo56372aa(51738)).mo56386p("callStateHandler was not successfully initiated, do not activate tracking.");
                return;
            }
            synchronized (oVar.f93231d) {
                oVar.f93233f = -1;
                oVar.f93230c = str;
                if (Build.VERSION.SDK_INT < 31 || (nVar = oVar.f93229b) == null) {
                    oVar.f93235h.f93242f.listen(oVar.f93228a, 32);
                } else {
                    C35506p pVar = oVar.f93235h;
                    pVar.f93242f.registerTelephonyCallback(pVar.f93239c, nVar);
                }
                C35506p pVar2 = oVar.f93235h;
                oVar.f93232e = pVar2.f93239c.mo29164d(new C35498h(oVar), ((C46897i) pVar2.f93244h.f184849a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45370890").mo50903b(), TimeUnit.MILLISECONDS);
                C60872cz czVar = oVar.f93232e;
                C35500j jVar = new C35500j();
                C60856cj.m92911t(czVar, C47810es.m84974n(jVar), oVar.f93235h.f93239c);
            }
        }
    }

    /* renamed from: c */
    public final C35493c mo39681c(C48273ca caVar) {
        C48273ca caVar2;
        C58485gu j = C58485gu.m89842j(((C65599b) ((C46897i) this.f93244h.f184849a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45370889").mo50905d()).f178301a);
        if (j.isEmpty()) {
            caVar2 = caVar;
        } else {
            C48269bz bzVar = (C48269bz) caVar.toBuilder();
            float a = C35492b.m63848a(caVar.f124854b, j);
            bzVar.copyOnWrite();
            C48273ca caVar3 = (C48273ca) bzVar.instance;
            caVar3.f124853a |= 1;
            caVar3.f124854b = a;
            float a2 = C35492b.m63848a(caVar.f124855c, j);
            bzVar.copyOnWrite();
            C48273ca caVar4 = (C48273ca) bzVar.instance;
            caVar4.f124853a |= 2;
            caVar4.f124855c = a2;
            caVar2 = (C48273ca) bzVar.build();
        }
        float f = caVar.f124855c;
        float f2 = caVar2.f124855c;
        float f3 = caVar.f124854b;
        float f4 = caVar2.f124854b;
        if (caVar == null || caVar2 == null) {
            return new C35491a(caVar, Duration.ZERO);
        }
        return new C35491a(caVar2, Duration.ofMillis((long) Math.max(0, (int) (f2 - f))));
    }
}
