package com.google.android.apps.gsa.staticplugins.p7385ak;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6532af.C84671a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C89971aj;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93890c;
import com.google.android.apps.gsa.staticplugins.p7385ak.p7386a.C93894g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.s */
/* compiled from: PG */
public final class C93914s extends C86734a implements C84671a {

    /* renamed from: a */
    public static final C59071e f262266a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ak.s");

    /* renamed from: b */
    public final C86054o f262267b;

    /* renamed from: c */
    public final Context f262268c;

    /* renamed from: f */
    public final b f262269f;

    /* renamed from: g */
    public final C22871g f262270g;

    /* renamed from: h */
    public final C22871g f262271h;

    /* renamed from: i */
    public final C93916u f262272i;

    /* renamed from: j */
    public final C21370a f262273j;

    /* renamed from: k */
    public final AtomicBoolean f262274k = new AtomicBoolean(false);

    /* renamed from: l */
    public final C86124t f262275l;

    /* renamed from: m */
    public final C93894g f262276m;

    /* renamed from: n */
    public final i f262277n;

    /* renamed from: o */
    public final u f262278o;

    /* renamed from: p */
    public long f262279p = 0;

    /* renamed from: q */
    private final C22871g f262280q;

    public C93914s(C86054o oVar, Context context, C22871g gVar, C22871g gVar2, C22871g gVar3, C93916u uVar, b bVar, C86124t tVar, C21370a aVar, C93894g gVar4, i iVar, u uVar2) {
        super(C118575h.WORKER_DEVICE_APP_INFO, "device_app_info");
        this.f262267b = oVar;
        this.f262268c = context;
        this.f262270g = gVar;
        this.f262271h = gVar2;
        this.f262280q = gVar3;
        this.f262272i = uVar;
        this.f262269f = bVar;
        this.f262275l = tVar;
        this.f262273j = aVar;
        this.f262276m = gVar4;
        this.f262277n = iVar;
        this.f262278o = uVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78409a() {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        for (String c : this.f262267b.mo79685s()) {
            arrayList.add(this.f262278o.c(c, C65753ak.DEVICE_INSTALLED_APPS, false));
        }
        return this.f262270g.mo28209i(C60856cj.m92896e(arrayList), "Clear local cache", new C93901f(this));
    }

    /* renamed from: b */
    public final C60870cx mo78410b() {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        if (TextUtils.isEmpty(this.f262267b.mo79659F())) {
            return C118826c.f331423b;
        }
        if (!this.f262274k.compareAndSet(false, true)) {
            return C118826c.f331423b;
        }
        C22871g gVar = this.f262271h;
        long a = this.f262275l.mo79743a(C89971aj.f246524a);
        if (a <= 0) {
            cxVar = C118826c.f331423b;
        } else {
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f262273j.mo26870b());
            C93894g gVar2 = this.f262276m;
            cxVar = this.f262280q.mo28210j(gVar2.f262241c.mo28209i(gVar2.f262240b.mo46042d(), "read last full sync time", C93890c.f262235a), "[DeviceAppInfo] full sync", new C93900e(this, a, ofEpochMilli));
        }
        return gVar.mo28210j(cxVar, "maybe perform full sync", new C93913r(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
