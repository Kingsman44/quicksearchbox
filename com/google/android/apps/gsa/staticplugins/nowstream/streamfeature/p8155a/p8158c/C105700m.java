package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91657f;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105772j;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105752e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.m */
/* compiled from: PG */
public final class C105700m extends C23056g implements C105752e {

    /* renamed from: a */
    public final C105772j f294955a;

    /* renamed from: b */
    public final C91656e f294956b;

    /* renamed from: c */
    public final C91657f f294957c;

    /* renamed from: d */
    public final boolean f294958d;

    /* renamed from: e */
    public final C118827a f294959e;

    /* renamed from: f */
    public final C58881cr f294960f = C58886cw.m90973a(new C105698k(this));

    /* renamed from: g */
    private final C58881cr f294961g = C58886cw.m90973a(new C105699l(this));

    public C105700m(C23052c cVar, C105772j jVar, boolean z, C91656e eVar, C91657f fVar, C118827a aVar) {
        super(cVar);
        this.f294955a = jVar;
        this.f294956b = eVar;
        this.f294957c = fVar;
        this.f294958d = z;
        this.f294959e = aVar;
    }

    /* renamed from: e */
    public final void mo95014e() {
        mo95016h(false);
        ((C118831d) this.f294961g.mo6453a()).mo104025g(1);
        this.f294957c.mo86059b(C37182a.f98245o.mo40779c(), this.f294958d);
    }

    /* renamed from: f */
    public final void mo95015f() {
        if (((Boolean) ((C105691d) this.f294955a).f294920b.f63720e).booleanValue()) {
            C91656e eVar = this.f294956b;
            String c = C91656e.m149939c(this.f294958d);
            if (!eVar.mo86055t(c)) {
                eVar.mo86039d(c);
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.FEED_NEXT_PAGE_CANCELLED_VIA_NAVIGATION;
                fVar.mo83701c("SessionLoggerId", c);
                eVar.f255616c.mo74236a(fVar.mo83699a());
            }
            this.f294957c.mo86061d(this.f294958d);
            return;
        }
        this.f294956b.mo86048m(this.f294958d);
    }

    /* renamed from: h */
    public final void mo95016h(boolean z) {
        if (!this.f63405W.mo28420E()) {
            ((C105691d) this.f294955a).f294920b.mo28730f(Boolean.valueOf(z), false);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        ((C105691d) this.f294955a).f294919a.mo28730f(false, false);
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        mo95015f();
    }
}
