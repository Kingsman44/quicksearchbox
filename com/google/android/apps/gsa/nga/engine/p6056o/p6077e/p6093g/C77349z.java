package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.au.g;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6040k.p6041a.C76225m;
import com.google.android.apps.gsa.nga.engine.p6040k.p6041a.C76231s;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.z */
/* compiled from: PG */
public final class C77349z implements C76591c {

    /* renamed from: e */
    public static final /* synthetic */ int f213309e = 0;

    /* renamed from: f */
    private static final C58974d f213310f = C58974d.m91136j();

    /* renamed from: g */
    private static final C82831ca f213311g = C82831ca.ON_DEVICE_DEEPLINK;

    /* renamed from: a */
    public final C76225m f213312a;

    /* renamed from: b */
    public final C76231s f213313b;

    /* renamed from: c */
    public final C91142g f213314c;

    /* renamed from: d */
    public final Set f213315d;

    /* renamed from: h */
    private final C22871g f213316h;

    public C77349z(C76225m mVar, C76231s sVar, C91142g gVar, C22871g gVar2, Set set) {
        this.f213312a = mVar;
        this.f213313b = sVar;
        this.f213314c = gVar;
        this.f213315d = set;
        this.f213316h = gVar2;
    }

    /* renamed from: c */
    public static C58485gu m124119c(C76590bg bgVar) {
        return bgVar.mo72261c("entity", g.c);
    }

    /* renamed from: d */
    public static C58485gu m124120d(C76590bg bgVar) {
        return bgVar.mo72262d("entity");
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        C77346w wVar = new C77346w(this);
        Optional of = Optional.m71637of(f213311g);
        C76541a aVar = (C76541a) h;
        aVar.f211764a = wVar;
        h.mo72246e(of);
        h.mo72244c(C58485gu.m89846n("OnDeviceDeeplink"));
        aVar.f211766c = 10807;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C60870cx cxVar;
        C79326x a = new C79326x(Optional.m71637of(f213310f)).mo73900a("\nOnDeviceDeeplinkFulfiller");
        a.mo73900a("Input FunctionCall").mo73900a(bgVar.f211837a.toString());
        boolean booleanValue = ((Boolean) bgVar.mo72265g(C76575as.f211814a, "assisted_browse").orElse(false)).booleanValue();
        C22871g gVar = this.f213316h;
        Locale q = nVar.mo71342q();
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "query");
        if (g.isEmpty()) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else if (!this.f213314c.mo85405j(C90126fx.f251485jh)) {
            String str = (String) g.get();
            a.mo73900a(String.format("Matching exact query [%s] from database.", new Object[]{str}));
            cxVar = this.f213312a.mo72143l(str);
        } else {
            C58485gu n = C58485gu.m89846n((String) g.get());
            a.mo73900a(String.format("Matching exact query [%s] from database.", new Object[]{n}));
            cxVar = this.f213312a.mo72132a(n, q);
        }
        return gVar.mo28209i(this.f213316h.mo28210j(this.f213316h.mo28209i(cxVar, "[NGA] OnDeviceDeeplinkFulfiller.generateAndroidIntentExactQuery", new C77340q(this, bgVar, a)), "[NGA] OnDeviceDeeplinkFulfiller.generateAndroidIntentWebref", new C77341r(this, bgVar, q, a)), "[NGA] OnDeviceDeeplinkFulfiller.fulfillInternal", new C77342s(this, nVar, booleanValue));
    }
}
