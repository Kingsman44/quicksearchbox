package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ab */
/* compiled from: PG */
public final class C111890ab {

    /* renamed from: a */
    public static final C59071e f310908a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ab");

    /* renamed from: b */
    public static final C121537f f310909b = C121537f.m200840b("Tapas/PrefixPredictor", C121511c.f337208a);

    /* renamed from: c */
    public static final Duration f310910c = Duration.ofSeconds(60);

    /* renamed from: d */
    public final C22871g f310911d;

    /* renamed from: e */
    public final C111915i f310912e = new C111915i();

    /* renamed from: f */
    public final C58495hd f310913f;

    /* renamed from: g */
    private final C86124t f310914g;

    /* renamed from: h */
    private final C21370a f310915h;

    public C111890ab(C86124t tVar, C21370a aVar, C22871g gVar, Map map) {
        this.f310914g = tVar;
        this.f310915h = aVar;
        this.f310911d = gVar;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h((String) entry.getKey(), new C111929w(this, (String) entry.getKey(), (C69464a) entry.getValue()));
        }
        this.f310913f = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C58485gu mo99290a() {
        return this.f310914g.mo79745c(C90063do.f249438dY);
    }

    /* renamed from: b */
    public final C60870cx mo99291b(C111932z zVar) {
        C58485gu a = mo99290a();
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) a.get(i);
            C111929w wVar = (C111929w) this.f310913f.get(str);
            if (wVar == null) {
                C59052c cVar = (C59052c) f310908a.mo56226d();
                cVar.mo56374ac(10, TimeUnit.SECONDS);
                ((C59052c) cVar.mo56372aa(27471)).mo56389s("Unknown model enabled: %s", str);
            } else {
                arrayList.add(this.f310911d.mo28209i(wVar.f310962c.f310911d.mo28209i(wVar.mo99299a(), "[Tapas] predict follow-ups", new C111927u(wVar, zVar)), "recording predictions", new C111918l(this, str)));
            }
        }
        this.f310911d.mo28212l("prefetch history cleanup", new C111919m(this));
        return this.f310911d.mo28209i(C60856cj.m92896e(arrayList), "[Tapas] merge predicted followup prefixes", C111920n.f310947a);
    }

    /* renamed from: c */
    public final Duration mo99292c() {
        return Duration.ofNanos(this.f310915h.mo26872d());
    }
}
