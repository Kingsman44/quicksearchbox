package com.google.android.libraries.search.logging.p3034a;

import android.content.Context;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.p3034a.p3035a.C38729a;
import com.google.android.libraries.search.logging.p3034a.p3036b.C38753b;
import com.google.android.libraries.search.logging.p3039b.C38830b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3915h.p3916a.C51227b;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.all;
import com.google.common.p4552o.apq;
import com.google.common.p4552o.apr;
import com.google.common.p4552o.aps;
import com.google.common.p4552o.apt;
import com.google.common.p4552o.apu;
import com.google.common.p4552o.apv;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62917ay;
import com.google.protos.p4816ai.p4817a.C63193g;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5682q.p5688b.p5689a.C72766a;

/* renamed from: com.google.android.libraries.search.logging.a.ah */
/* compiled from: PG */
public final class C38745ah implements C38768q, C38750am {

    /* renamed from: c */
    public static final /* synthetic */ int f102286c = 0;

    /* renamed from: g */
    private static final C38753b f102287g = C38775x.f102352a;

    /* renamed from: a */
    public final C38828b f102288a;

    /* renamed from: b */
    public final C143623ad f102289b;

    /* renamed from: h */
    private final Executor f102290h;

    /* renamed from: i */
    private final C38830b f102291i;

    /* renamed from: j */
    private final Optional f102292j;

    /* renamed from: k */
    private final C38766o f102293k;

    /* renamed from: l */
    private final C38728a f102294l;

    public C38745ah(Context context, Executor executor, C38830b bVar, Optional optional, C38766o oVar, C38728a aVar, C38828b bVar2) {
        this.f102290h = executor;
        this.f102291i = bVar;
        this.f102292j = optional;
        this.f102293k = oVar;
        this.f102294l = aVar;
        this.f102288a = bVar2;
        this.f102289b = C24006d.m44596b(context, new C72766a());
    }

    /* renamed from: t */
    private final void m68023t(C59743a aVar, C62917ay ayVar, Object obj, boolean z, C38753b bVar) {
        apq apq = (apq) apr.f159695c.createBuilder();
        aps aps = (aps) apt.f159700c.createBuilder();
        C38828b bVar2 = this.f102288a;
        aps.copyOnWrite();
        apt apt = (apt) aps.instance;
        apt.f159703b = bVar2.getNumber();
        apt.f159702a |= 1;
        apq.copyOnWrite();
        apr apr = (apr) apq.instance;
        apt apt2 = (apt) aps.build();
        apt2.getClass();
        apr.f159698b = apt2;
        apr.f159697a |= 1;
        apq.mo58885m(ayVar, obj);
        apr apr2 = (apr) apq.build();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        apr2.getClass();
        ufVar.f164245cw = apr2;
        ufVar.f164255j |= 32768;
        C46459k.m82829b(mo41595g(aVar, tzVar, z, bVar, Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: u */
    private final void m68024u(C60548tz tzVar) {
        aps aps = (aps) apt.f159700c.createBuilder();
        C38828b bVar = this.f102288a;
        aps.copyOnWrite();
        apt apt = (apt) aps.instance;
        apt.f159703b = bVar.getNumber();
        apt.f159702a |= 1;
        apt apt2 = (apt) aps.build();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        if ((ufVar.f164255j & 32768) != 0) {
            apr apr = ufVar.f164245cw;
            if (apr == null) {
                apr = apr.f159695c;
            }
            apq apq = (apq) apr.toBuilder();
            apq.copyOnWrite();
            apr apr2 = (apr) apq.instance;
            apt2.getClass();
            apr2.f159698b = apt2;
            apr2.f159697a |= 1;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            apr apr3 = (apr) apq.build();
            apr3.getClass();
            ufVar2.f164245cw = apr3;
            ufVar2.f164255j |= 32768;
            return;
        }
        apq apq2 = (apq) apr.f159695c.createBuilder();
        apq2.copyOnWrite();
        apr apr4 = (apr) apq2.instance;
        apt2.getClass();
        apr4.f159698b = apt2;
        apr4.f159697a |= 1;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        apr apr5 = (apr) apq2.build();
        apr5.getClass();
        ufVar3.f164245cw = apr5;
        ufVar3.f164255j |= 32768;
    }

    /* renamed from: a */
    public final void mo41589a(C62917ay ayVar, Object obj) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        apu apu = (apu) apv.f159704a.createBuilder();
        apu.mo58885m(ayVar, obj);
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        apv apv = (apv) apu.build();
        apv.getClass();
        ufVar.f164246cx = apv;
        ufVar.f164255j |= 65536;
        m68024u(tzVar);
        C46459k.m82829b(mo41595g(C59743a.DAILY_DATA, tzVar, false, f102287g, Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: b */
    public final void mo41590b(C59743a aVar, C62917ay ayVar, Object obj) {
        m68023t(aVar, ayVar, obj, false, f102287g);
    }

    /* renamed from: c */
    public final void mo41591c(C59743a aVar, C62917ay ayVar, Object obj) {
        m68023t(aVar, ayVar, obj, true, f102287g);
    }

    /* renamed from: d */
    public final void mo41592d(Set set) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        m68024u(tzVar);
        C46459k.m82829b(mo41595g(C59743a.TESTCODE_EVENT, tzVar, false, new C38743af(set), Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C60870cx mo41593e(C143658k kVar, C59743a aVar, C60555uf ufVar, Optional optional) {
        C60870cx a = this.f102291i.mo41663a(ufVar, this.f102293k);
        C38771t tVar = new C38771t(this, optional, kVar, aVar);
        return C60922j.m93044g(a, C47810es.m84963c(tVar), this.f102290h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo41594f(C143658k kVar, C59743a aVar, C60555uf ufVar, Optional optional) {
        C60870cx a = this.f102291i.mo41663a(ufVar, this.f102293k);
        C38738aa aaVar = new C38738aa(this, optional, kVar, aVar);
        return C60922j.m93044g(a, C47810es.m84963c(aaVar), this.f102290h);
    }

    /* renamed from: g */
    public final C60870cx mo41595g(C59743a aVar, C60548tz tzVar, boolean z, C38753b bVar, Optional optional) {
        this.f102291i.mo41665c(tzVar);
        C60555uf ufVar = (C60555uf) tzVar.build();
        if (this.f102292j.isPresent()) {
            return ((C38729a) this.f102292j.get()).mo41586a(aVar, tzVar, bVar, new C38740ac(this, optional), this.f102294l.mo41585a(z));
        }
        C60870cx a = this.f102294l.mo41585a(z);
        C38741ad adVar = new C38741ad(this, aVar, ufVar, optional);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(adVar), this.f102290h);
        C38742ae aeVar = new C38742ae(bVar);
        return C60922j.m93044g(h, C47810es.m84963c(aeVar), this.f102290h);
    }

    /* renamed from: h */
    public final C60870cx mo41596h(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        m68024u(tzVar);
        return mo41595g(C59743a.TESTCODE_EVENT, tzVar, false, new C38774w(i), Optional.empty());
    }

    /* renamed from: i */
    public final void mo41597i(C51227b bVar, String str) {
        C60870cx cxVar;
        C59743a aVar = C59743a.APA_ON_DEVICE_QUERY;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = C59743a.APA_ON_DEVICE_QUERY.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        str.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = str;
        m68024u(tzVar);
        C38753b bVar2 = f102287g;
        Optional of = Optional.m71637of(bVar);
        this.f102291i.mo41665c(tzVar);
        C60555uf ufVar3 = (C60555uf) tzVar.build();
        if (this.f102292j.isPresent()) {
            cxVar = ((C38729a) this.f102292j.get()).mo41586a(aVar, tzVar, bVar2, new C38770s(this, of), this.f102294l.mo41585a(true));
        } else {
            cxVar = C60922j.m93044g(C60922j.m93045h(this.f102294l.mo41585a(true), C47810es.m84966f(new C38776y(this, aVar, ufVar3, of)), this.f102290h), C47810es.m84963c(new C38777z()), this.f102290h);
        }
        C46459k.m82829b(cxVar, "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: j */
    public final void mo41598j(C59743a aVar, C60548tz tzVar, C60321oe oeVar, boolean z) {
        m68024u(tzVar);
        C46459k.m82829b(mo41595g(aVar, tzVar, z, new C38739ab(oeVar), Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: k */
    public final void mo41599k(C59743a aVar, C60548tz tzVar) {
        C58838bb.m90871f(f102302d.contains(aVar), "Unsupported eventName: %s", aVar.f161421ts);
        mo41602n(aVar, tzVar);
    }

    /* renamed from: l */
    public final void mo41600l(C59743a aVar) {
        C58838bb.m90871f(f102304f.contains(aVar), "Unsupported eventName: %s", aVar.f161421ts);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        int i = aVar.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        mo41602n(aVar, tzVar);
    }

    /* renamed from: m */
    public final void mo41601m(C60548tz tzVar) {
        mo41602n(C59743a.OPA_AUTO_ON_GEARHEAD_ASSISTANT_SESSION_INFO_RECEIVED, tzVar);
    }

    /* renamed from: n */
    public final void mo41602n(C59743a aVar, C60548tz tzVar) {
        m68024u(tzVar);
        C46459k.m82829b(mo41595g(aVar, tzVar, false, f102287g, Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: o */
    public final void mo41603o(C59743a aVar, C60548tz tzVar, C19088t tVar) {
        m68024u(tzVar);
        C46459k.m82829b(mo41595g(aVar, tzVar, false, f102287g, Optional.m71637of(tVar)), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: p */
    public final void mo41604p(all all) {
        C59743a aVar = C59743a.SMARTSPACE_LOGGING;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        all.getClass();
        ufVar.f164157bK = all;
        ufVar.f164253h |= 8388608;
        mo41602n(aVar, tzVar);
    }

    /* renamed from: q */
    public final void mo41605q(C59743a aVar, C60548tz tzVar) {
        C58838bb.m90871f(f102303e.contains(aVar), "Unsupported eventName: %s", aVar.f161421ts);
        mo41602n(aVar, tzVar);
    }

    /* renamed from: r */
    public final void mo41606r(C60548tz tzVar) {
        int i = C59743a.VBUS_TEXT_SEARCH_COMMIT.f161421ts;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        C46459k.m82829b(mo41595g(C59743a.VBUS_TEXT_SEARCH_COMMIT, tzVar, false, f102287g, Optional.empty()), "Clearcut logging failed", new Object[0]);
    }

    /* renamed from: s */
    public final void mo41607s(C59743a aVar, C60548tz tzVar, C63193g gVar) {
        m68024u(tzVar);
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        gVar.getClass();
        ufVar.f164110aQ = gVar;
        ufVar.f164251f |= 64;
        C46459k.m82829b(mo41595g(aVar, tzVar, true, f102287g, Optional.empty()), "Clearcut logging failed", new Object[0]);
    }
}
