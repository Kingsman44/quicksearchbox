package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79892n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79893o;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80051ae;
import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.assistant.p3817aj.p3818a.p3819a.C49196h;
import com.google.assistant.p3817aj.p3818a.p3819a.C49197i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.p014d.p015a.p016a.C0043af;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ge */
/* compiled from: PG */
public final class C123459ge implements C123402eb {

    /* renamed from: a */
    public final C123501ht f341247a;

    /* renamed from: b */
    public final C123331bl f341248b;

    /* renamed from: c */
    public final C123391dr f341249c;

    /* renamed from: d */
    public final C123392ds f341250d;

    /* renamed from: e */
    public final C123510p f341251e;

    /* renamed from: f */
    public final Executor f341252f;

    /* renamed from: g */
    private final C123401ea f341253g;

    /* renamed from: h */
    private final C123325bf f341254h;

    public C123459ge(C123501ht htVar, C123401ea eaVar, C123331bl blVar, C123392ds dsVar, C123391dr drVar, C123510p pVar, C123325bf bfVar, Executor executor) {
        this.f341247a = htVar;
        this.f341253g = eaVar;
        this.f341248b = blVar;
        this.f341250d = dsVar;
        this.f341249c = drVar;
        this.f341251e = pVar;
        this.f341254h = bfVar;
        this.f341252f = executor;
    }

    /* renamed from: c */
    public static C123427f m202806c(C123381dh dhVar) {
        if (dhVar.mo105993a() == 0) {
            return dhVar.mo105995c(0);
        }
        IntStream range = IntStream.CC.range(1, dhVar.mo105993a() + 1);
        Objects.requireNonNull(dhVar);
        return ((C123427f) range.mapToObj(new C123430fc(dhVar)).map(C123431fd.f341206a).reduce(new C123304al(BuildConfig.FLAVOR, C58485gu.m89845m()), C123432fe.f341207a)).mo106006e();
    }

    /* renamed from: i */
    public static Optional m202807i(C80047aa aaVar) {
        C80051ae aeVar;
        C80056b bVar;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a.equals(C80080z.APP)) {
            if (aaVar.f219657a == 12) {
                bVar = (C80056b) aaVar.f219658b;
            } else {
                bVar = C80056b.f219686c;
            }
            return Optional.m71637of(C123303ak.m202660a(bVar.f219688a));
        }
        C80080z a2 = C80080z.m128077a(aaVar.f219659c);
        if (a2 == null) {
            a2 = C80080z.UNRECOGNIZED;
        }
        if (!a2.equals(C80080z.URL)) {
            return Optional.empty();
        }
        if (aaVar.f219657a == 13) {
            aeVar = (C80051ae) aaVar.f219658b;
        } else {
            aeVar = C80051ae.f219672b;
        }
        String str = aeVar.f219674a;
        str.getClass();
        return Optional.m71637of(new C123301ai(str));
    }

    /* renamed from: n */
    private final C58485gu m202808n(C123503i iVar) {
        C58485gu guVar = (C58485gu) ((Stream) mo106019l(iVar).map(C123426ez.f341198a).orElseGet(C123428fa.f341199a)).flatMap(C123439fl.f341219a).collect(C58370cn.f155946a);
        return (!guVar.isEmpty() || !iVar.mo105917a().equals(C123481h.URL)) ? guVar : C58485gu.m89846n(iVar.mo106026d());
    }

    /* renamed from: a */
    public final C60870cx mo106002a(String str, List list, Optional optional, C64979f fVar) {
        C60870cx cxVar;
        C123427f e = C123427f.m202785d(str, list).mo106006e();
        C60870cx i = C60856cj.m92900i(optional.map(C123420et.f341192a));
        if (!Collection.EL.stream(this.f341247a.mo106025e("com.android.vending")).map(new C123446fs(e)).anyMatch(C123453fz.f341237a)) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C60870cx a = this.f341249c.mo105997a(e, "com.android.vending", fVar);
            C123447ft ftVar = new C123447ft(this, e);
            cxVar = C60922j.m93044g(a, C47810es.m84963c(ftVar), C60826bg.f164896a);
        }
        C123436fi fiVar = new C123436fi(this, i, e, fVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(fiVar), C60826bg.f164896a);
        C123424ex exVar = C123424ex.f341196a;
        return C60922j.m93045h(h, C47810es.m84966f(exVar), this.f341252f);
    }

    /* renamed from: b */
    public final C0043af mo106011b(C123503i iVar) {
        if (iVar.mo105917a().equals(C123481h.URL)) {
            return this.f341247a.mo106024d(iVar.mo106026d(), this.f341248b);
        }
        return this.f341247a.mo106023c(iVar.mo106026d());
    }

    /* renamed from: d */
    public final C58485gu mo106012d(C123503i iVar, String str, boolean z, C123458gd gdVar, C123458gd gdVar2) {
        Optional optional;
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        if (iVar.mo105917a().equals(C123481h.URL)) {
            optional = this.f341253g.mo106000b(iVar.mo106026d(), Optional.m71637of(this.f341248b));
        } else {
            optional = this.f341253g.mo106000b(iVar.mo106026d(), Optional.empty());
        }
        Optional map = optional.map(C123451fx.f341235a);
        if (!map.isPresent() && iVar.mo105917a().equals(C123481h.APP)) {
            map = Optional.m71637of(iVar.mo106026d());
        }
        Optional map2 = map.map(new C123414en(gdVar, str));
        Objects.requireNonNull(e);
        map2.ifPresent(new C123425ey(e));
        if (((Boolean) mo106019l(iVar).map(new C123404ed(z)).orElse(true)).booleanValue()) {
            Stream map3 = Collection.EL.stream(m202808n(iVar)).peek(C123437fj.f341215a).map(new C123448fu(gdVar2, str));
            Objects.requireNonNull(e);
            map3.forEach(new C123425ey(e));
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public final C58485gu mo106013e(C123503i iVar) {
        if (iVar.mo105917a().equals(C123481h.URL)) {
            C123501ht htVar = this.f341247a;
            return (C58485gu) Collection.EL.stream(htVar.mo106022b(iVar.mo106026d(), this.f341248b).f112a).flatMap(new C123498hq(htVar)).collect(C58370cn.f155946a);
        }
        C123501ht htVar2 = this.f341247a;
        return (C58485gu) Collection.EL.stream(htVar2.mo106021a(iVar.mo106026d()).f112a).flatMap(new C123500hs(htVar2)).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    public final C60870cx mo106014f(C123503i iVar, String str, C60870cx cxVar) {
        C123438fk fkVar = new C123438fk(this, iVar, str);
        return C60922j.m93044g(cxVar, C47810es.m84963c(fkVar), this.f341252f);
    }

    /* renamed from: g */
    public final C60870cx mo106015g(C123503i iVar, C123427f fVar, C64979f fVar2) {
        C123325bf bfVar = this.f341254h;
        C49192d dVar = mo106011b(iVar).f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49190b a = C49190b.m85387a(dVar.f127202b);
        if (a == null) {
            a = C49190b.OTHER;
        }
        String i = fVar.mo105929i();
        C58485gu h = fVar.mo105927h();
        C79882d dVar2 = (C79882d) C79885g.f218957h.createBuilder();
        C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
        aVar.copyOnWrite();
        C79881c cVar = (C79881c) aVar.instance;
        cVar.f218950b = 3;
        cVar.f218949a |= 1;
        dVar2.copyOnWrite();
        C79885g gVar = (C79885g) dVar2.instance;
        C79881c cVar2 = (C79881c) aVar.build();
        cVar2.getClass();
        gVar.f218963e = cVar2;
        gVar.f218959a |= 8;
        C79892n nVar = (C79892n) C79893o.f218982d.createBuilder();
        nVar.copyOnWrite();
        C79893o oVar = (C79893o) nVar.instance;
        i.getClass();
        oVar.f218984a |= 1;
        oVar.f218985b = i;
        nVar.mo74272a(h);
        C79893o oVar2 = (C79893o) nVar.build();
        dVar2.copyOnWrite();
        C79885g gVar2 = (C79885g) dVar2.instance;
        oVar2.getClass();
        gVar2.f218960b = oVar2;
        gVar2.f218959a |= 1;
        C62940bt btVar = C49197i.f127209e;
        C49196h hVar = (C49196h) C49197i.f127208d.createBuilder();
        C49191c cVar3 = (C49191c) C49192d.f127199e.createBuilder();
        cVar3.copyOnWrite();
        C49192d dVar3 = (C49192d) cVar3.instance;
        dVar3.f127202b = a.f127198r;
        dVar3.f127201a |= 1;
        C49192d dVar4 = (C49192d) cVar3.build();
        hVar.copyOnWrite();
        C49197i iVar2 = (C49197i) hVar.instance;
        dVar4.getClass();
        iVar2.f127212b = dVar4;
        iVar2.f127211a |= 1;
        hVar.copyOnWrite();
        C49197i iVar3 = (C49197i) hVar.instance;
        iVar3.f127213c = 27;
        iVar3.f127211a |= 2;
        dVar2.mo58885m(btVar, (C49197i) hVar.build());
        return C47633f.m84733g(fVar2.mo59322a(new C18238f(), (C79885g) dVar2.build())).mo51515h(C123324be.f341074a, bfVar.f341075a);
    }

    /* renamed from: h */
    public final C60870cx mo106016h(C123427f fVar, C60870cx cxVar, C64979f fVar2) {
        C123457gc gcVar = new C123457gc(this, fVar, fVar2);
        return C60922j.m93045h(cxVar, C47810es.m84966f(gcVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final Optional mo106017j(C123427f fVar, List list) {
        return Collection.EL.stream(list).map(new C123406ef(this)).map(new C123449fv(fVar)).filter(C123453fz.f341237a).map(C123408eh.f341171a).findFirst();
    }

    /* renamed from: k */
    public final Optional mo106018k(C80047aa aaVar) {
        C0043af afVar;
        C80051ae aeVar;
        C80056b bVar;
        C0043af afVar2 = C0043af.f114m;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a.equals(C80080z.APP)) {
            C123501ht htVar = this.f341247a;
            if (aaVar.f219657a == 12) {
                bVar = (C80056b) aaVar.f219658b;
            } else {
                bVar = C80056b.f219686c;
            }
            afVar = htVar.mo106023c(bVar.f219688a);
        } else {
            C123501ht htVar2 = this.f341247a;
            if (aaVar.f219657a == 13) {
                aeVar = (C80051ae) aaVar.f219658b;
            } else {
                aeVar = C80051ae.f219672b;
            }
            afVar = htVar2.mo106024d(aeVar.f219674a, this.f341248b);
        }
        C49192d dVar = afVar.f117b;
        if (dVar != null) {
            return Optional.m71637of(dVar);
        }
        return Optional.empty();
    }

    /* renamed from: l */
    public final Optional mo106019l(C123503i iVar) {
        if (iVar.mo105917a().equals(C123481h.URL)) {
            return this.f341253g.mo106001c(iVar.mo106026d(), Optional.m71637of(this.f341248b));
        }
        return this.f341253g.mo106001c(iVar.mo106026d(), Optional.empty());
    }

    /* renamed from: m */
    public final boolean mo106020m(Optional optional, C123503i iVar) {
        if (!optional.isPresent() || !((C123326bg) optional.get()).mo105959b()) {
            return false;
        }
        C58528ij F = C58528ij.m90006F(m202808n(((C123326bg) optional.get()).mo105958a()));
        Stream stream = Collection.EL.stream(m202808n(iVar));
        Objects.requireNonNull(F);
        return stream.anyMatch(new C123403ec(F));
    }
}
