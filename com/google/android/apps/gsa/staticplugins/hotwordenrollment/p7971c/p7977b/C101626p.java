package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102169bm;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102170bn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p */
/* compiled from: PG */
public final class C101626p implements C101771k {

    /* renamed from: a */
    public static final C59071e f283578a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.p");

    /* renamed from: b */
    public final C101628r f283579b;

    /* renamed from: c */
    public final C86124t f283580c;

    /* renamed from: d */
    public final C101860a f283581d;

    /* renamed from: e */
    public final C101497ae f283582e;

    /* renamed from: f */
    private final C89994f f283583f;

    /* renamed from: g */
    private final C102170bn f283584g;

    /* renamed from: h */
    private final C101610b f283585h;

    /* renamed from: i */
    private final C90584f f283586i;

    public C101626p(C101628r rVar, C86124t tVar, C89994f fVar, C101860a aVar, C102170bn bnVar, C101497ae aeVar, C101610b bVar, C90584f fVar2) {
        this.f283579b = rVar;
        this.f283580c = tVar;
        this.f283583f = fVar;
        this.f283581d = aVar;
        this.f283584g = bnVar;
        this.f283582e = aeVar;
        this.f283585h = bVar;
        this.f283586i = fVar2;
    }

    /* renamed from: a */
    public final C101775o mo92446a() {
        if (this.f283586i == C90584f.OK_HEY_GOOGLE) {
            this.f283583f.mo83832u(C90584f.OK_HEY_GOOGLE, this.f283581d.mo92638c());
        }
        C101773m mVar = C101773m.DEVICE_SCAN;
        int e = this.f283579b.mo92434e();
        int i = e - 1;
        if (e != 0) {
            if (i == 0) {
                boolean d = mo92449d();
                ((C59052c) ((C59052c) f283578a.mo56224b()).mo56372aa(20366)).mo56389s("showEnroll: isEligibleForCloudEnrollment = %b", Boolean.valueOf(d));
                if (d) {
                    return C101775o.m168407i(C101773m.CLOUD_ENROLL_SCREEN);
                }
            } else if (i != 1) {
                if (i == 2) {
                    return C101775o.m168405g();
                }
                throw new AssertionError();
            }
            return C101775o.m168407i(C101773m.FRESH_ENROLL_SCREEN);
        }
        throw null;
    }

    /* renamed from: b */
    public final C101775o mo92447b() {
        if (this.f283581d.f284140g.get() || !this.f283585h.mo92421b()) {
            return mo92448c();
        }
        return C101775o.m168404f(C101773m.HOTWORD_SCREEN);
    }

    /* renamed from: c */
    public final C101775o mo92448c() {
        if (!this.f283581d.f284140g.get()) {
            return C101775o.m168404f(C101773m.VOICE_MATCH_CONSENT_SCREEN);
        }
        return mo92446a();
    }

    /* renamed from: d */
    public final boolean mo92449d() {
        List list = this.f283581d.f284135b;
        ((C59052c) ((C59052c) f283578a.mo56224b()).mo56372aa(20367)).mo56354G("config = %s, utteranceList = %s", this.f283579b, list);
        return this.f283586i == C90584f.OK_HEY_GOOGLE && list != null && !list.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo92450e() {
        return this.f283579b.mo92433d() && this.f283584g.mo92922a() != C102169bm.NONE;
    }
}
