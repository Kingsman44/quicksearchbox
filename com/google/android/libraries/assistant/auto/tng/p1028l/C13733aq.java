package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13848b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.aq */
/* compiled from: PG */
public final class C13733aq implements C13734ar {

    /* renamed from: a */
    public static final C59071e f41869a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.aq");

    /* renamed from: b */
    public final C13816co f41870b;

    /* renamed from: c */
    public final C13848b f41871c;

    /* renamed from: d */
    public final C37215b f41872d;

    /* renamed from: e */
    public final C13755bh f41873e;

    /* renamed from: f */
    public C2164c f41874f;

    /* renamed from: g */
    public C60870cx f41875g;

    /* renamed from: h */
    private final C13742az f41876h;

    /* renamed from: i */
    private final C60870cx f41877i = C2169h.m6027a(new C13727ak(this));

    public C13733aq(C13848b bVar, C13741ay ayVar, C37215b bVar2, C13755bh bhVar) {
        C13848b bVar3 = bVar;
        C13741ay ayVar2 = ayVar;
        this.f41871c = bVar3;
        bVar.getClass();
        C13816co coVar = new C13816co(bVar);
        this.f41870b = coVar;
        this.f41876h = new C13742az(bVar3, coVar, ayVar2.f41886a, ayVar2.f41887b, ayVar2.f41894i, ayVar2.f41888c, ayVar2.f41889d, ayVar2.f41893h, ayVar2.f41890e, ayVar2.f41891f, ayVar2.f41892g);
        this.f41872d = bVar2;
        this.f41873e = bhVar;
        this.f41874f.getClass();
    }

    /* renamed from: a */
    public final C60870cx mo21233a() {
        C59071e eVar = f41869a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(44994)).mo56386p("#cancel");
        this.f41873e.mo21253d();
        C60870cx cxVar = this.f41875g;
        if (cxVar == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(44995)).mo56386p("cancel called before fetch");
            return C60866ct.f164955a;
        }
        return C60856cj.m92901j(C47638k.m84751b(this.f41877i, cxVar).mo51521b(new C13729am(this), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo21234b(C13829a aVar) {
        ((C59052c) ((C59052c) f41869a.mo56224b()).mo56372aa(44996)).mo56386p("#fetch");
        this.f41873e.mo21254e(aVar);
        C37215b bVar = this.f41872d;
        C37252a c = C37179a.f97704y.mo40779c();
        C15480f.m32212a(c, aVar.mo21273d());
        bVar.mo19974a(c);
        if (aVar.mo21274e()) {
            this.f41872d.mo19974a(C37179a.f97445aQ);
        } else {
            this.f41872d.mo19974a(C37179a.f97444aP);
        }
        this.f41871c.mo21301l(aVar);
        C13742az azVar = this.f41876h;
        C13883n nVar = azVar.f41906l;
        C13880k kVar = new C13880k(nVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(kVar), nVar.f42296b);
        C13738av avVar = new C13738av(azVar);
        C47633f h = C47633f.m84733g(C60922j.m93045h(m, C47810es.m84966f(avVar), C60826bg.f164896a)).mo51515h(new C13740ax(azVar), C60826bg.f164896a);
        this.f41875g = h;
        C13728al alVar = new C13728al(this, aVar);
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(alVar), C60826bg.f164896a);
        C13732ap apVar = new C13732ap(this, aVar);
        C60856cj.m92911t(h2, C47810es.m84974n(apVar), C60826bg.f164896a);
        return h2;
    }
}
