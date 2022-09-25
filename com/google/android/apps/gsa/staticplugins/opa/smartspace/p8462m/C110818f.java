package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107974aa;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107990aq;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107991ar;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107995av;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108005be;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108007bg;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108014bn;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108022d;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108035q;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118328s;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.f */
/* compiled from: PG */
public final class C110818f implements C83783a {

    /* renamed from: a */
    public static final long f308756a = TimeUnit.DAYS.toMinutes(1);

    /* renamed from: b */
    public static final long f308757b = TimeUnit.DAYS.toMinutes(7);

    /* renamed from: f */
    private static final long f308758f = TimeUnit.DAYS.toMinutes(1);

    /* renamed from: g */
    private static final long f308759g = TimeUnit.DAYS.toMinutes(7);

    /* renamed from: c */
    public final C108013bm f308760c;

    /* renamed from: d */
    public final C83794j f308761d;

    /* renamed from: e */
    public final C58974d f308762e;

    /* renamed from: h */
    private final C86124t f308763h;

    public C110818f(C108013bm bmVar, C83794j jVar, C83564a aVar, C86124t tVar) {
        this.f308760c = bmVar;
        this.f308761d = jVar;
        this.f308762e = aVar.mo76900a("AA.ContentStoreImpl");
        this.f308763h = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo77102a() {
        return this.f308760c.mo96363t();
    }

    /* renamed from: b */
    public final C60870cx mo77103b() {
        return this.f308760c.f300493i.mo96375d(18, C107995av.f300464a, C108022d.f300521a);
    }

    /* renamed from: c */
    public final C60870cx mo77104c() {
        return this.f308760c.f300493i.mo96375d(27, C107974aa.f300442a, C108022d.f300521a);
    }

    /* renamed from: d */
    public final C60870cx mo77105d() {
        C108013bm bmVar = this.f308760c;
        return bmVar.f300493i.mo96375d(27, C107990aq.f300459a, new C107991ar(bmVar));
    }

    /* renamed from: e */
    public final C60870cx mo77106e() {
        return this.f308760c.f300493i.mo96376e(12, 19, C58836b.f156633a, C108007bg.f300479a);
    }

    /* renamed from: f */
    public final C60870cx mo77107f() {
        return this.f308760c.f300493i.mo96377f(12, 27, Collections.emptySet());
    }

    /* renamed from: g */
    public final C60870cx mo77108g(String str) {
        return this.f308760c.f300493i.mo96374c(12, 18, C58833ax.m90834k(str.getBytes()));
    }

    /* renamed from: h */
    public final C60870cx mo77109h(C50794cr crVar) {
        if (crVar == C50794cr.WEATHER) {
            ((C58970a) ((C58970a) this.f308762e.mo56226d()).mo56372aa(26786)).mo56386p("clear weather card");
            return this.f308760c.mo96363t();
        }
        C108035q qVar = this.f308760c.f300493i;
        C118302a aVar = C108014bn.f300501b;
        int i = crVar.f132222T;
        C118316g c = qVar.f300540b.mo91759c();
        c.f328433a.mo55395g(C118328s.m196511c(C108014bn.f300500a, 17));
        c.f328433a.mo55395g(C118328s.m196511c(aVar, (long) i));
        return C118826c.m197213c(qVar.f300540b.mo91762h(c.mo103660a()));
    }

    /* renamed from: i */
    public final C60870cx mo77110i(String str) {
        return this.f308760c.f300493i.mo96374c(12, 27, C58833ax.m90834k(str.getBytes()));
    }

    /* renamed from: j */
    public final C60870cx mo77111j(String str, C83741am amVar, C50794cr crVar) {
        C60870cx cxVar;
        ((C58970a) ((C58970a) this.f308762e.mo56224b()).mo56372aa(26787)).mo56386p("check if should dismiss card");
        C50794cr crVar2 = C50794cr.UNDEFINED;
        int ordinal = crVar.ordinal();
        if (ordinal == 1) {
            cxVar = C60856cj.m92900i(false);
        } else if (ordinal == 14) {
            cxVar = C60922j.m93045h(mo98892n(str), new C110814b(this, str), C60826bg.f164896a);
        } else if (ordinal == 16) {
            long a = this.f308763h.mo79743a(C89985ax.f246714av);
            if (a == -1) {
                cxVar = C60856cj.m92900i(false);
            } else {
                cxVar = C60922j.m93045h(mo98892n(str), new C110815c(this, amVar, a, str), C60826bg.f164896a);
            }
        } else if (!this.f308761d.f228394e.mo79746e(C90017bw.f247870L)) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = C60922j.m93045h(mo98892n(str), new C110816d(this, crVar, str), C60826bg.f164896a);
        }
        return C60922j.m93045h(cxVar, new C110817e(this, crVar, amVar, str), C60826bg.f164896a);
    }

    /* renamed from: k */
    public final C60870cx mo77112k(String str, C83809y yVar, long j) {
        if (j == 0) {
            j = f308757b;
        }
        return this.f308760c.mo96357H(str.getBytes(), yVar.toByteArray(), j);
    }

    /* renamed from: l */
    public final C60870cx mo77113l(String str, C50738bc bcVar) {
        C108013bm bmVar = this.f308760c;
        long j = f308759g;
        byte[] bytes = str.getBytes();
        C108035q qVar = bmVar.f300493i;
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        return qVar.mo96379i(27, a.f131953N, C108014bn.f300502c, C58833ax.m90834k(bytes), bcVar.toByteArray(), j);
    }

    /* renamed from: m */
    public final C60870cx mo77114m(C83741am amVar) {
        C108013bm bmVar = this.f308760c;
        return bmVar.f300493i.mo96378g(12, 19, C58836b.f156633a, amVar.toByteArray(), f308758f);
    }

    /* renamed from: n */
    public final C60870cx mo98892n(String str) {
        return this.f308760c.f300493i.mo96376e(12, 37, C58833ax.m90834k(str.getBytes()), C108005be.f300477a);
    }
}
