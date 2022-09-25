package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.platform.p9060d.p9062b.C120151a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.p9936a.C130887a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131178c;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9960c.C131216b;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.settings.C131567i;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28465i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50761bz;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.C50847s;
import com.google.assistant.p3886c.C50849u;
import com.google.assistant.p3886c.C50850v;
import com.google.assistant.p3886c.C50851w;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.ajb;
import com.google.common.p4552o.ajg;
import com.google.common.p4552o.akh;
import com.google.common.p4552o.akn;
import com.google.common.p4552o.all;
import com.google.common.p4580v.C60950i;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.t */
/* compiled from: PG */
public final class C130964t implements C130886a {

    /* renamed from: a */
    public static final C59071e f358314a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.m.t");

    /* renamed from: b */
    static final C58495hd f358315b;

    /* renamed from: c */
    static final C58495hd f358316c;

    /* renamed from: d */
    public static final Duration f358317d = Duration.ofSeconds(1);

    /* renamed from: e */
    public final C60950i f358318e;

    /* renamed from: f */
    public final C131216b f358319f;

    /* renamed from: g */
    public final Executor f358320g;

    /* renamed from: h */
    public final boolean f358321h;

    /* renamed from: i */
    public final C131251t f358322i;

    /* renamed from: j */
    public Instant f358323j = Instant.EPOCH;

    /* renamed from: k */
    private final C38750am f358324k;

    /* renamed from: l */
    private final C28463g f358325l;

    /* renamed from: m */
    private final C28443m f358326m;

    /* renamed from: n */
    private final AccountId f358327n;

    /* renamed from: o */
    private final C28310af f358328o;

    /* renamed from: p */
    private final C47632e f358329p = new C47632e();

    /* renamed from: q */
    private C28439i f358330q = null;

    /* renamed from: r */
    private final boolean f358331r;

    /* renamed from: s */
    private final C131567i f358332s;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C50794cr.BIRTHDAY, 104352);
        gzVar.mo55429h(C50794cr.CALENDAR, 79169);
        gzVar.mo55429h(C50794cr.COMMUTE_TIME, 79170);
        gzVar.mo55429h(C50794cr.FLIGHT, 79171);
        gzVar.mo55429h(C50794cr.LOCATION_OOBE, 109674);
        gzVar.mo55429h(C50794cr.OOBE, 105420);
        gzVar.mo55429h(C50794cr.REMINDER, 96816);
        gzVar.mo55429h(C50794cr.SPORTS, 94613);
        gzVar.mo55429h(C50794cr.STOCK_PRICE_CHANGE, 114513);
        gzVar.mo55429h(C50794cr.TIPS, 79172);
        gzVar.mo55429h(C50794cr.WEATHER, 79173);
        gzVar.mo55429h(C50794cr.WEATHER_ALERT, 104353);
        gzVar.mo55429h(C50794cr.MEDIA, 104336);
        f358315b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C9027a.CALENDAR, 108883);
        gzVar2.mo55429h(C9027a.COMMUTE_TIME, 108875);
        gzVar2.mo55429h(C9027a.FLIGHT, 108884);
        gzVar2.mo55429h(C9027a.LOYALTY_CARD, 108887);
        gzVar2.mo55429h(C9027a.MEDIA_RECOMMENDATION, 153125);
        gzVar2.mo55429h(C9027a.REMINDER, 108885);
        gzVar2.mo55429h(C9027a.SHOPPING_LIST, 108886);
        gzVar2.mo55429h(C9027a.TIME_TO_LEAVE, 108876);
        gzVar2.mo55429h(C9027a.WEATHER, 108877);
        gzVar2.mo55429h(C9027a.WEATHER_ALERT, 139156);
        gzVar2.mo55429h(C9027a.GROCERY_DELIVERY, 150461);
        gzVar2.mo55429h(C9027a.GROCERY_PICKUP, 150462);
        f358316c = gzVar2.mo55427f(false);
    }

    public C130964t(C131216b bVar, C60950i iVar, C28465i iVar2, C28310af afVar, C28443m mVar, AccountId accountId, Executor executor, C38750am amVar, boolean z, boolean z2, C131567i iVar3, C131251t tVar) {
        this.f358319f = bVar;
        this.f358318e = iVar;
        this.f358325l = iVar2.mo33923a(C58733pz.f156496a);
        this.f358328o = afVar;
        this.f358326m = mVar;
        this.f358327n = accountId;
        this.f358320g = executor;
        this.f358324k = amVar;
        this.f358331r = z;
        this.f358321h = z2;
        this.f358332s = iVar3;
        this.f358322i = tVar;
    }

    /* renamed from: h */
    private static all m213517h(C50794cr crVar, C130918bc bcVar) {
        akh akh = (akh) all.f159065n.createBuilder();
        boolean c = bcVar.mo109961c();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        all.f159068a |= 8;
        all.f159071d = c;
        boolean e = bcVar.mo109963e();
        akh.copyOnWrite();
        all all2 = (all) akh.instance;
        all2.f159068a |= 16;
        all2.f159072e = e;
        boolean d = bcVar.mo109962d();
        akh.copyOnWrite();
        all all3 = (all) akh.instance;
        all3.f159068a |= 32;
        all3.f159073f = d;
        akh.mo57014a(bcVar.mo109959a());
        if (bcVar.mo109960b().isPresent()) {
            akn a = C130916ba.m213451a((C50813dj) bcVar.mo109960b().get(), crVar);
            akh.copyOnWrite();
            all all4 = (all) akh.instance;
            a.getClass();
            all4.f159080m = a;
            all4.f159068a |= 2048;
        }
        return (all) akh.build();
    }

    /* renamed from: a */
    public final C60870cx mo109859a() {
        if (this.f358323j.isAfter(this.f358318e.mo57444a().minus(Duration.ofDays(1)))) {
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(this.f358332s.mo110190b()).mo51515h(new C130955k(this), this.f358320g);
    }

    /* renamed from: b */
    public final void mo109860b(C50819dp dpVar) {
        OptionalInt optionalInt;
        Object obj;
        if (this.f358331r) {
            for (C50818do doVar : dpVar.f132332a) {
                C58480gp e = C58485gu.m89837e();
                C50794cr a = C50794cr.m85938a(doVar.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                if (a.equals(C50794cr.MEDIA)) {
                    C50813dj djVar = doVar.f132329z;
                    if (djVar == null) {
                        djVar = C50813dj.f132278a;
                    }
                    C62940bt r3 = C62942bv.checkIsLite(C50761bz.f132094e);
                    djVar.mo58887l(r3);
                    Object l = djVar.f169962ag.mo58854l(r3.f169971d);
                    if (l == null) {
                        obj = r3.f169969b;
                    } else {
                        obj = r3.mo58889c(l);
                    }
                    if ((((C50761bz) obj).f132096a & 2) != 0) {
                        e.mo55395g(153124);
                    }
                }
                C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
                if (a2 == null) {
                    a2 = C50794cr.UNDEFINED;
                }
                if (!C131178c.f358764a.containsKey(a2)) {
                    ((C59052c) ((C59052c) f358314a.mo56226d()).mo56372aa(38993)).mo56387q("No feature type for card type %d - not getting ve", a2.f132222T);
                    optionalInt = OptionalInt.empty();
                } else {
                    C9027a aVar = (C9027a) C131178c.f358764a.get(a2);
                    C58495hd hdVar = f358316c;
                    if (!hdVar.containsKey(aVar)) {
                        ((C59052c) ((C59052c) f358314a.mo56226d()).mo56372aa(38992)).mo56387q("No ve found for feature type %d", aVar.f31227ag);
                        optionalInt = OptionalInt.empty();
                    } else {
                        optionalInt = OptionalInt.m71640of(((Integer) Objects.requireNonNull((Integer) hdVar.get(aVar))).intValue());
                    }
                }
                Objects.requireNonNull(e);
                optionalInt.ifPresent(new C130949e(e));
                C58485gu f = e.mo55394f();
                akh akh = (akh) all.f159065n.createBuilder();
                boolean z = doVar.f132322s;
                akh.copyOnWrite();
                all all = (all) akh.instance;
                all.f159068a |= 16;
                all.f159072e = z;
                boolean z2 = doVar.f132323t;
                akh.copyOnWrite();
                all all2 = (all) akh.instance;
                all2.f159068a |= 32;
                all2.f159073f = z2;
                akh.copyOnWrite();
                all all3 = (all) akh.instance;
                all3.f159068a |= 64;
                all3.f159074g = true;
                akn akn = akn.f158974a;
                if ((doVar.f132304a & 33554432) != 0) {
                    C50813dj djVar2 = doVar.f132329z;
                    if (djVar2 == null) {
                        djVar2 = C50813dj.f132278a;
                    }
                    C50794cr a3 = C50794cr.m85938a(doVar.f132315l);
                    if (a3 == null) {
                        a3 = C50794cr.UNDEFINED;
                    }
                    akn = C130916ba.m213451a(djVar2, a3);
                }
                if (!akn.equals(akn.f158974a)) {
                    akh.copyOnWrite();
                    all all4 = (all) akh.instance;
                    akn.getClass();
                    all4.f159080m = akn;
                    all4.f159068a |= 2048;
                }
                all all5 = (all) akh.build();
                if (!f.isEmpty()) {
                    C60856cj.m92911t(this.f358329p.mo51512b(new C130942c(this, f, all5), this.f358320g), C47810es.m84974n(new C130960p()), this.f358320g);
                }
                C50794cr a4 = C50794cr.m85938a(doVar.f132315l);
                if (a4 == null) {
                    a4 = C50794cr.UNDEFINED;
                }
                if (!C131178c.f358764a.containsKey(a4)) {
                    ((C59052c) ((C59052c) f358314a.mo56226d()).mo56372aa(38995)).mo56387q("No feature type for card type %d - not extracting sub cards", a4.f132222T);
                } else {
                    C9027a aVar2 = (C9027a) Objects.requireNonNull((C9027a) C131178c.f358764a.get(a4));
                    C50770h hVar = doVar.f132298D;
                    if (hVar == null) {
                        hVar = C50770h.f132124g;
                    }
                    C50770h hVar2 = doVar.f132300F;
                    if (hVar2 == null) {
                        hVar2 = C50770h.f132124g;
                    }
                    C50770h hVar3 = doVar.f132299E;
                    if (hVar3 == null) {
                        hVar3 = C50770h.f132124g;
                    }
                    C50770h hVar4 = doVar.f132301G;
                    if (hVar4 == null) {
                        hVar4 = C50770h.f132124g;
                    }
                    C58800sl lA = ((C58528ij) Collection.EL.stream(C58485gu.m89849q(hVar, hVar2, hVar3, hVar4)).flatMap(C130957m.f358311a).flatMap(C130958n.f358312a).collect(C58370cn.f155947b)).iterator();
                    while (lA.hasNext()) {
                        C9027a aVar3 = (C9027a) lA.next();
                        C58495hd hdVar2 = f358316c;
                        if (!hdVar2.containsKey(aVar3)) {
                            ((C59052c) ((C59052c) f358314a.mo56226d()).mo56372aa(38996)).mo56387q("No ve found for feature type %d", aVar3.f31227ag);
                        } else {
                            akh akh2 = (akh) all.f159065n.createBuilder();
                            akh2.copyOnWrite();
                            all all6 = (all) akh2.instance;
                            all6.f159068a |= 64;
                            all6.f159074g = true;
                            int i = aVar2.f31227ag;
                            akh2.copyOnWrite();
                            all all7 = (all) akh2.instance;
                            all7.f159068a |= 128;
                            all7.f159075h = i;
                            C60856cj.m92911t(this.f358329p.mo51512b(new C130915b(this, (Integer) hdVar2.get(aVar3), (all) akh2.build()), this.f358320g), C47810es.m84974n(new C130961q()), this.f358320g);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo109861c(C50794cr crVar, C130918bc bcVar) {
        C58495hd hdVar = f358315b;
        if (!hdVar.containsKey(crVar)) {
            ((C59052c) ((C59052c) f358314a.mo56225c()).mo56372aa(38997)).mo56386p("CardType not found at impression");
            return;
        }
        C60870cx b = this.f358329p.mo51512b(new C130952h(this, ((Integer) hdVar.get(crVar)).intValue(), m213517h(crVar, bcVar)), this.f358320g);
        C130959o oVar = new C130959o(this);
        C60856cj.m92911t(b, C47810es.m84974n(oVar), this.f358320g);
    }

    /* renamed from: d */
    public final void mo109862d(C50794cr crVar, C130918bc bcVar) {
        C58495hd hdVar = f358315b;
        if (!hdVar.containsKey(crVar)) {
            ((C59052c) ((C59052c) f358314a.mo56225c()).mo56372aa(38998)).mo56386p("CardType not found at interaction");
            return;
        }
        C60870cx b = this.f358329p.mo51512b(new C130950f(this, ((Integer) hdVar.get(crVar)).intValue(), m213517h(crVar, bcVar)), this.f358320g);
        C130963s sVar = new C130963s();
        C60856cj.m92911t(b, C47810es.m84974n(sVar), this.f358320g);
    }

    /* renamed from: e */
    public final void mo109863e(List list, boolean z) {
        akh akh = (akh) all.f159065n.createBuilder();
        akh.copyOnWrite();
        all all = (all) akh.instance;
        C62971cq cqVar = all.f159076i;
        if (!cqVar.mo58948c()) {
            all.f159076i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) all.f159076i);
        akh.copyOnWrite();
        all all2 = (all) akh.instance;
        all2.f159068a |= 512;
        all2.f159078k = z;
        this.f358324k.mo41604p((all) akh.build());
    }

    /* renamed from: f */
    public final C60870cx mo110012f(List list, all all, C50851w wVar, boolean z) {
        C63042fg fgVar = wVar.f132419c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Instant e = C62950b.m95474e(fgVar);
        ZoneId zoneId = C60951j.f165070a;
        if (e.isBefore(this.f358318e.mo57445b(zoneId).atStartOfDay(zoneId).toInstant())) {
            C50847s sVar = (C50847s) wVar.toBuilder();
            sVar.copyOnWrite();
            ((C50851w) sVar.instance).f132418b = C50851w.emptyProtobufList();
            wVar = (C50851w) sVar.build();
        }
        C58485gu guVar = (C58485gu) list;
        C58801sm G = guVar.listIterator(0);
        while (G.hasNext()) {
            Integer num = (Integer) G.next();
            Iterator it = wVar.f132418b.iterator();
            while (true) {
                int i = 1;
                if (it.hasNext()) {
                    C50850v vVar = (C50850v) it.next();
                    int intValue = num.intValue();
                    if (true == z) {
                        i = 5;
                    }
                    if (vVar.f132410b != intValue || vVar.f132414f < i) {
                    }
                } else {
                    mo110013g(list, all, false, z);
                    C50847s sVar2 = (C50847s) wVar.toBuilder();
                    sVar2.copyOnWrite();
                    ((C50851w) sVar2.instance).f132418b = C50851w.emptyProtobufList();
                    HashSet hashSet = new HashSet();
                    for (C50850v vVar2 : wVar.f132418b) {
                        if (!list.contains(Integer.valueOf(vVar2.f132410b))) {
                            sVar2.mo53485a(vVar2);
                        } else {
                            C50849u uVar = (C50849u) vVar2.toBuilder();
                            int i2 = vVar2.f132414f;
                            uVar.copyOnWrite();
                            C50850v vVar3 = (C50850v) uVar.instance;
                            vVar3.f132409a |= 16;
                            vVar3.f132414f = i2 + 1;
                            sVar2.mo53485a((C50850v) uVar.build());
                            hashSet.add(Integer.valueOf(vVar2.f132410b));
                        }
                    }
                    C58801sm G2 = guVar.listIterator(0);
                    while (G2.hasNext()) {
                        Integer num2 = (Integer) G2.next();
                        if (!hashSet.contains(num2)) {
                            C50849u uVar2 = (C50849u) C50850v.f132407g.createBuilder();
                            int intValue2 = num2.intValue();
                            uVar2.copyOnWrite();
                            C50850v vVar4 = (C50850v) uVar2.instance;
                            vVar4.f132409a |= 1;
                            vVar4.f132410b = intValue2;
                            uVar2.copyOnWrite();
                            C50850v vVar5 = (C50850v) uVar2.instance;
                            vVar5.f132409a |= 16;
                            vVar5.f132414f = 1;
                            sVar2.mo53485a((C50850v) uVar2.build());
                        }
                    }
                    C63042fg b = C62950b.m95471b(this.f358318e);
                    sVar2.copyOnWrite();
                    C50851w wVar2 = (C50851w) sVar2.instance;
                    b.getClass();
                    wVar2.f132419c = b;
                    wVar2.f132417a |= 1;
                    return this.f358319f.mo110118a(new C130953i((C50851w) sVar2.build()));
                }
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: g */
    public final void mo110013g(List list, all all, boolean z, boolean z2) {
        C28439i iVar = this.f358330q;
        if (iVar != null) {
            this.f358325l.mo33921e(iVar);
        }
        int i = true != z2 ? 79168 : 108888;
        C28463g gVar = this.f358325l;
        C28313c a = this.f358328o.mo33805a(C28427h.m53115a(i));
        a.mo33859g(C45954d.m82060a(this.f358327n));
        a.mo33859g(C28375ak.m53061c(79409));
        a.mo33858f(new C28353e(C130887a.f358179a, all));
        C62940bt btVar = C120151a.f334404a;
        ajb ajb = (ajb) ajg.f158865g.createBuilder();
        ajb.copyOnWrite();
        ajg ajg = (ajg) ajb.instance;
        ajg.f158872e = 4;
        ajg.f158868a |= 512;
        a.mo33858f(new C28353e(btVar, (ajg) ajb.build()));
        C28439i b = gVar.mo33918b(a);
        this.f358325l.mo33920d(b);
        this.f358330q = b;
        HashSet<C28439i> hashSet = new HashSet<>();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            int intValue = ((Integer) G.next()).intValue();
            C28463g gVar2 = this.f358325l;
            C28439i iVar2 = this.f358330q;
            C28313c a2 = this.f358328o.mo33805a(C28427h.m53115a(intValue));
            gVar2.mo33919c(iVar2);
            C28439i a3 = C28470n.m53226a(iVar2, a2);
            if (z) {
                hashSet.add(a3);
            }
        }
        this.f358325l.mo33922f();
        if (z) {
            for (C28439i c : hashSet) {
                this.f358326m.mo33853c(C28442l.m53142h().mo33894a(), c);
            }
            this.f358325l.mo33922f();
        }
    }
}
