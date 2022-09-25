package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90091ep;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.C121059e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.ac */
/* compiled from: PG */
public final class C9796ac implements C9799ae, C9805ak {

    /* renamed from: a */
    public final C46723bg f33779a;

    /* renamed from: b */
    public final Context f33780b;

    /* renamed from: c */
    public final C46776ct f33781c;

    /* renamed from: d */
    public final C68214a f33782d;

    /* renamed from: e */
    private final C86034c f33783e;

    /* renamed from: f */
    private final C86124t f33784f;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.ac$a */
    /* compiled from: PG */
    public interface C9797a {
        /* renamed from: b */
        C121059e mo18050b();

        /* renamed from: c */
        C42876ab mo18051c();
    }

    public C9796ac(C46723bg bgVar, C86034c cVar, Context context, C46776ct ctVar, C86124t tVar, C68214a aVar) {
        this.f33779a = bgVar;
        this.f33783e = cVar;
        this.f33780b = context;
        this.f33781c = ctVar;
        this.f33784f = tVar;
        this.f33782d = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18041a() {
        return C60922j.m93044g(mo18043c(), C47810es.m84963c(C9823s.f33809a), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo18042b() {
        return C60922j.m93044g(mo18043c(), C47810es.m84963c(C9818n.f33804a), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo18043c() {
        if (!this.f33784f.mo79746e(C90091ep.f250543f)) {
            return C60922j.m93045h(mo18044d(), C47810es.m84966f(C9826v.f33812a), C60826bg.f164896a);
        }
        C60870cx h = C60922j.m93045h(mo18046f(), C47810es.m84966f(C9817m.f33803a), C60826bg.f164896a);
        return C47638k.m84751b(h).mo51521b(new C9825u(h), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo18044d() {
        return C60922j.m93044g(this.f33783e.mo79697b(), C47810es.m84963c(new C9824t(this)), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo18045e() {
        return C60922j.m93044g(mo18043c(), C47810es.m84963c(C9807c.f33793a), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo18046f() {
        return C60922j.m93044g(this.f33783e.mo79697b(), C47810es.m84963c(new C9795ab(this)), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo18047g(C9855w wVar) {
        C60922j.m93045h(mo18046f(), C47810es.m84966f(new C9827w(wVar)), C60826bg.f164896a);
        C60870cx h = C60922j.m93045h(mo18044d(), C47810es.m84966f(new C9828x(wVar)), C60826bg.f164896a);
        C46882v vVar = new C46882v();
        vVar.f122320a = h;
        vVar.f122321b = "lockscreensettingsdata";
        vVar.f122322c = new C9829y(wVar);
        C60870cx a = this.f33781c.mo50786a(vVar.mo50884a());
        a.mo4106b(new C9830z(this), C60826bg.f164896a);
        return a;
    }

    /* renamed from: h */
    public final C60870cx mo18048h(boolean z) {
        C60922j.m93045h(mo18046f(), C47810es.m84966f(new C9811g(z)), C60826bg.f164896a);
        C60870cx h = C60922j.m93045h(mo18044d(), C47810es.m84966f(new C9812h(z)), C60826bg.f164896a);
        C46882v vVar = new C46882v();
        vVar.f122320a = h;
        vVar.f122321b = "lockscreensettingsdata";
        vVar.f122322c = new C9813i(z);
        C60870cx a = this.f33781c.mo50786a(vVar.mo50884a());
        a.mo4106b(new C9830z(this), C60826bg.f164896a);
        return a;
    }

    /* renamed from: i */
    public final void mo18049i(int i) {
        C60922j.m93045h(mo18046f(), C47810es.m84966f(new C9819o(i)), C60826bg.f164896a);
        C60870cx h = C60922j.m93045h(mo18044d(), C47810es.m84966f(new C9820p(i)), C60826bg.f164896a);
        C46882v vVar = new C46882v();
        vVar.f122320a = h;
        vVar.f122321b = "lockscreensettingsdata";
        vVar.f122322c = new C9821q(i);
        this.f33781c.mo50786a(vVar.mo50884a()).mo4106b(new C9830z(this), C60826bg.f164896a);
    }
}
