package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import android.content.Context;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17048ao;
import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.C17120b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29668l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.am */
/* compiled from: PG */
public final class C122165am implements C122179b {

    /* renamed from: a */
    public static final C58974d f338836a = C58974d.m91136j();

    /* renamed from: b */
    public final C122174av f338837b;

    /* renamed from: c */
    public final C68214a f338838c;

    /* renamed from: d */
    public final C60887da f338839d;

    /* renamed from: e */
    public final Context f338840e;

    /* renamed from: f */
    public final C122150a f338841f;

    /* renamed from: g */
    public final C17048ao f338842g;

    /* renamed from: h */
    public final boolean f338843h;

    /* renamed from: i */
    private final C122210bb f338844i;

    /* renamed from: j */
    private final boolean f338845j;

    /* renamed from: k */
    private final Set f338846k;

    public C122165am(Context context, C68214a aVar, C60887da daVar, C122210bb bbVar, C122174av avVar, C122150a aVar2, C17048ao aoVar, boolean z, boolean z2, Set set) {
        this.f338840e = context;
        this.f338838c = aVar;
        this.f338839d = daVar;
        this.f338844i = bbVar;
        this.f338837b = avVar;
        this.f338841f = aVar2;
        this.f338842g = aoVar;
        this.f338843h = z;
        this.f338845j = z2;
        this.f338846k = set;
    }

    /* renamed from: a */
    public final C60870cx mo105548a(C28740br brVar, Locale locale) {
        if (this.f338845j) {
            for (C17120b a : this.f338846k) {
                Optional a2 = a.mo23190a(brVar);
                if (a2.isPresent()) {
                    return (C60870cx) a2.get();
                }
            }
        }
        return C47633f.m84733g(((C29409fd) this.f338838c.mo27525b()).mo34714c(brVar)).mo51516i(new C122378x(this, locale), this.f338839d).mo51515h(C122380z.f339292a, this.f338839d);
    }

    /* renamed from: b */
    public final C60870cx mo105549b(C28740br brVar, Locale locale) {
        C60870cx cxVar;
        C122174av avVar = this.f338837b;
        if (!avVar.f338855b) {
            cxVar = C60856cj.m92899h(new C122172at());
        } else if (avVar.f338856c.contains(brVar.mo34350i())) {
            cxVar = C60856cj.m92899h(new C122173au(brVar.mo34350i()));
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C47633f.m84733g(cxVar).mo51516i(new C122164al(this), this.f338839d).mo51516i(new C122213d(this, brVar), this.f338839d).mo51516i(new C122300e(this, brVar, locale), this.f338839d).mo51516i(new C122319f(this, brVar), this.f338839d).mo51516i(new C122320g(this, locale), this.f338839d).mo51513e(Exception.class, new C122321h(this, locale, brVar), this.f338839d);
    }

    /* renamed from: c */
    public final C60870cx mo105550c(C28805ct ctVar, Locale locale) {
        if (!this.f338843h) {
            return C47633f.m84733g(((C29409fd) this.f338838c.mo27525b()).mo34717f(ctVar)).mo51516i(new C122333t(this, locale), this.f338839d).mo51515h(new C122375u(this, locale, ctVar), this.f338839d);
        }
        C28806cu h = C28807cv.m53759h();
        ((C29668l) h).f80325a = C58833ax.m90834k(ctVar.mo34454c());
        h.mo34458b(ctVar.mo34452a());
        h.mo34459c(!ctVar.mo34452a().mo56113h());
        return C47633f.m84733g(((C29409fd) this.f338838c.mo27525b()).mo34718g(h.mo34462f())).mo51516i(new C122331r(this, locale), this.f338839d).mo51515h(new C122332s(this, locale, ctVar), this.f338839d);
    }

    /* renamed from: d */
    public final C60870cx mo105551d(C28807cv cvVar, Locale locale) {
        C60870cx e = mo105552e(cvVar, locale);
        C122377w wVar = C122377w.f339288a;
        return C60922j.m93044g(e, C47810es.m84963c(wVar), this.f338839d);
    }

    /* renamed from: e */
    public final C60870cx mo105552e(C28807cv cvVar, Locale locale) {
        C60870cx g = ((C29409fd) this.f338838c.mo27525b()).mo34718g(cvVar);
        C122322i iVar = new C122322i(this, locale, cvVar);
        return C60922j.m93045h(g, C47810es.m84966f(iVar), this.f338839d);
    }

    /* renamed from: f */
    public final C60870cx mo105553f(C28807cv cvVar, Locale locale) {
        if (this.f338845j) {
            for (C17120b b : this.f338846k) {
                Optional b2 = b.mo23191b(cvVar);
                if (b2.isPresent()) {
                    return (C60870cx) b2.get();
                }
            }
        }
        return C47633f.m84733g(((C29409fd) this.f338838c.mo27525b()).mo34718g(cvVar)).mo51516i(new C122211c(this, locale), this.f338839d).mo51515h(C122327n.f339196a, this.f338839d);
    }

    /* renamed from: g */
    public final C60870cx mo105554g() {
        return mo105555h();
    }

    /* renamed from: h */
    public final C60870cx mo105555h() {
        return C47633f.m84733g(((C29409fd) this.f338838c.mo27525b()).mo34719h("MDD.CELLULAR.CHARGING.PERIODIC.TASK")).mo51513e(Exception.class, C122156ad.f338823a, this.f338839d);
    }

    /* renamed from: i */
    public final C60870cx mo105556i(C29690f fVar, Locale locale) {
        C60870cx j = mo105557j(fVar, locale);
        C122159ag agVar = C122159ag.f338828a;
        return C60922j.m93044g(j, C47810es.m84963c(agVar), this.f338839d);
    }

    /* renamed from: j */
    public final C60870cx mo105557j(C29690f fVar, Locale locale) {
        if (fVar == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx a = this.f338844i.mo105569a(fVar);
        C122157ae aeVar = new C122157ae(this, locale, fVar);
        return C60922j.m93044g(a, C47810es.m84963c(aeVar), this.f338839d);
    }
}
