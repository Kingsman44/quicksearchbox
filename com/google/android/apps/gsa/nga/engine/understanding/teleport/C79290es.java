package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.au.ak;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.au.at;
import com.google.android.apps.gsa.nga.engine.au.au;
import com.google.android.apps.gsa.nga.engine.au.av;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a.C78918ad;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a.C78930l;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80051ae;
import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p001a.p014d.p015a.p016a.C0043af;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.es */
/* compiled from: PG */
public final class C79290es {

    /* renamed from: a */
    public static final C58974d f217762a = C58974d.m91136j();

    /* renamed from: b */
    public final C79164aa f217763b;

    /* renamed from: c */
    public final Set f217764c;

    /* renamed from: d */
    public final C79219cb f217765d;

    /* renamed from: e */
    public final C91142g f217766e;

    /* renamed from: f */
    public final C79308fj f217767f;

    /* renamed from: g */
    public final TeleportQueryCleaner f217768g;

    /* renamed from: h */
    public final C78930l f217769h;

    /* renamed from: i */
    public final C76455a f217770i;

    /* renamed from: j */
    public final bz f217771j;

    /* renamed from: k */
    public final al f217772k;

    /* renamed from: l */
    public final e f217773l;

    /* renamed from: m */
    public final Executor f217774m;

    /* renamed from: n */
    public ak f217775n;

    /* renamed from: o */
    public av f217776o;

    /* renamed from: p */
    public d f217777p;

    /* renamed from: q */
    public C79326x f217778q = new C79326x(Optional.m71637of(f217762a));

    /* renamed from: r */
    private final C78918ad f217779r;

    public C79290es(C79164aa aaVar, C79219cb cbVar, al alVar, bz bzVar, e eVar, C79308fj fjVar, TeleportQueryCleaner teleportQueryCleaner, C78930l lVar, C78918ad adVar, C91142g gVar, Set set, C76455a aVar, C22871g gVar2) {
        this.f217763b = aaVar;
        this.f217767f = fjVar;
        this.f217768g = teleportQueryCleaner;
        this.f217764c = set;
        this.f217765d = cbVar;
        this.f217770i = aVar;
        this.f217771j = bzVar;
        this.f217776o = bzVar.a();
        this.f217772k = alVar;
        this.f217775n = alVar.a();
        this.f217773l = eVar;
        this.f217777p = eVar.a();
        this.f217769h = lVar;
        this.f217779r = adVar;
        this.f217766e = gVar;
        this.f217774m = new C79282ek(gVar2);
    }

    /* renamed from: b */
    public static C79298f m127206b(C79207bq bqVar) {
        if (bqVar.mo73827a() == 0) {
            return bqVar.mo73829c(0);
        }
        IntStream range = IntStream.CC.range(1, bqVar.mo73827a() + 1);
        Objects.requireNonNull(bqVar);
        return ((C79298f) range.mapToObj(new C79259do(bqVar)).map(C79260dp.f217724a).reduce(new C79316n(BuildConfig.FLAVOR, C58485gu.m89845m()), C79261dq.f217725a)).mo73858d();
    }

    /* renamed from: f */
    public static Optional m127207f(C80047aa aaVar) {
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
            return Optional.m71637of(C79315m.m127254a(bVar.f219688a));
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
        return Optional.m71637of(C79315m.m127255b(aeVar.f219674a));
    }

    /* renamed from: m */
    private final C58485gu m127208m(C79311i iVar) {
        C58485gu guVar = (C58485gu) m127210o(mo73854i(iVar)).flatMap(C79239cv.f217706a).collect(C58370cn.f155946a);
        return (!guVar.isEmpty() || !iVar.mo73870a().equals(C79310h.URL)) ? guVar : C58485gu.m89846n(iVar.mo73873d());
    }

    /* renamed from: n */
    private final Optional m127209n(C79311i iVar) {
        if (iVar.mo73870a().equals(C79310h.URL)) {
            return this.f217775n.b(iVar.mo73873d(), Optional.m71637of(this.f217777p));
        }
        return this.f217775n.b(iVar.mo73873d(), Optional.empty());
    }

    /* renamed from: o */
    private static Stream m127210o(Optional optional) {
        return (Stream) optional.map(C79272ea.f217740a).orElseGet(C79273eb.f217741a);
    }

    /* renamed from: a */
    public final C0043af mo73848a(C79311i iVar) {
        if (iVar.mo73870a().equals(C79310h.URL)) {
            return this.f217776o.d(iVar.mo73873d(), this.f217777p);
        }
        return this.f217776o.c(iVar.mo73873d());
    }

    /* renamed from: c */
    public final C58485gu mo73849c(C79311i iVar, String str, boolean z, C79289er erVar, C79289er erVar2, Optional optional) {
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        Optional map = m127209n(iVar).map(C79262dr.f217726a);
        if (!map.isPresent() && iVar.mo73870a().equals(C79310h.APP)) {
            map = Optional.m71637of(iVar.mo73873d());
        }
        Optional map2 = map.map(new C79276ee(erVar, str));
        Objects.requireNonNull(e);
        map2.ifPresent(new C79277ef(e));
        if (((Boolean) mo73854i(iVar).map(new C79284em(z)).orElse(true)).booleanValue()) {
            this.f217778q.mo73900a("Create FindOnSiteIntent.");
            Stream map3 = Collection.EL.stream(m127208m(iVar)).peek(new C79278eg(this)).map(new C79279eh(erVar2, str));
            Objects.requireNonNull(e);
            map3.forEach(new C79277ef(e));
        } else {
            this.f217778q.mo73900a("FindOnSiteIntent is disabled.");
        }
        if (optional.isPresent()) {
            Stream map4 = Collection.EL.stream((C58485gu) m127210o(m127209n(iVar)).flatMap(C79287ep.f217760a).collect(C58370cn.f155946a)).map(new C79280ei(optional, str));
            Objects.requireNonNull(e);
            map4.forEach(new C79277ef(e));
        }
        return e.mo55394f();
    }

    /* renamed from: d */
    public final C58485gu mo73850d(C79311i iVar) {
        if (iVar.mo73870a().equals(C79310h.URL)) {
            av avVar = this.f217776o;
            return (C58485gu) Collection.EL.stream(avVar.b(iVar.mo73873d(), this.f217777p).f112a).flatMap(new at(avVar)).collect(C58370cn.f155946a);
        }
        av avVar2 = this.f217776o;
        return (C58485gu) Collection.EL.stream(avVar2.a(iVar.mo73873d()).f112a).flatMap(new au(avVar2)).collect(C58370cn.f155946a);
    }

    /* renamed from: e */
    public final C60870cx mo73851e(C79311i iVar, String str, C60870cx cxVar) {
        return C60922j.m93044g(cxVar, new C79285en(this, iVar, str), this.f217774m);
    }

    /* renamed from: g */
    public final Optional mo73852g(C79298f fVar, List list) {
        return Collection.EL.stream(list).map(new C79288eq(this)).map(new C79265du(fVar)).filter(C79240cw.f217707a).map(C79231cn.f217701a).findFirst();
    }

    /* renamed from: h */
    public final Optional mo73853h(C80047aa aaVar) {
        C0043af afVar;
        C80051ae aeVar;
        C80056b bVar;
        C0043af afVar2 = C0043af.f114m;
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a.equals(C80080z.APP)) {
            av avVar = this.f217776o;
            if (aaVar.f219657a == 12) {
                bVar = (C80056b) aaVar.f219658b;
            } else {
                bVar = C80056b.f219686c;
            }
            afVar = avVar.c(bVar.f219688a);
        } else {
            av avVar2 = this.f217776o;
            if (aaVar.f219657a == 13) {
                aeVar = (C80051ae) aaVar.f219658b;
            } else {
                aeVar = C80051ae.f219672b;
            }
            afVar = avVar2.d(aeVar.f219674a, this.f217777p);
        }
        C49192d dVar = afVar.f117b;
        if (dVar != null) {
            return Optional.m71637of(dVar);
        }
        return Optional.empty();
    }

    /* renamed from: i */
    public final Optional mo73854i(C79311i iVar) {
        if (iVar.mo73870a().equals(C79310h.URL)) {
            return this.f217775n.c(iVar.mo73873d(), Optional.m71637of(this.f217777p));
        }
        return this.f217775n.c(iVar.mo73873d(), Optional.empty());
    }

    /* renamed from: j */
    public final boolean mo73855j(C79311i iVar, C79298f fVar) {
        C78918ad adVar = this.f217779r;
        C49192d dVar = mo73848a(iVar).f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49190b a = C49190b.m85387a(dVar.f127202b);
        if (a == null) {
            a = C49190b.OTHER;
        }
        return adVar.mo73694a(a, fVar.mo73864j(), fVar.mo73862h());
    }

    /* renamed from: k */
    public final boolean mo73856k(Optional optional, C79311i iVar) {
        if (!optional.isPresent() || !((C79325w) optional.get()).mo73887b()) {
            return false;
        }
        C58528ij F = C58528ij.m90006F(m127208m(((C79325w) optional.get()).mo73886a()));
        Stream stream = Collection.EL.stream(m127208m(iVar));
        Objects.requireNonNull(F);
        return stream.anyMatch(new C79264dt(F));
    }

    /* renamed from: l */
    public final void mo73857l() {
        Collection.EL.stream(this.f217764c).forEach(new C79283el());
    }
}
