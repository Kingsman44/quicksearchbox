package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138128j;
import com.google.android.apps.search.googleapp.search.suggest.C138129k;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.android.apps.search.googleapp.search.suggest.p10452d.C138076c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58851bo;
import com.google.common.base.C58869cf;
import com.google.common.base.C58880cq;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.ana;
import com.google.common.p4552o.anb;
import com.google.common.p4552o.anf;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.aol;
import com.google.common.p4552o.aos;
import com.google.common.p4552o.aou;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.apd;
import com.google.p395al.p417d.p418a.C8592s;
import com.google.p4017at.p4060h.p4073d.p4074a.C54213ab;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54230as;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.p4017at.p4060h.p4073d.p4074a.C54248l;
import com.google.p4184bj.C56032h;
import com.google.p4184bj.C56033i;
import com.google.p4184bj.C56034j;
import com.google.p4184bj.C56036l;
import com.google.p4440ca.p4441a.C57922b;
import com.google.p4440ca.p4441a.C57924d;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import com.google.protos.p4932ax.p4933a.C64269i;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.y */
/* compiled from: PG */
public final class C138068y {

    /* renamed from: l */
    private static final C58974d f375644l = C58974d.m91136j();

    /* renamed from: a */
    public final C21370a f375645a;

    /* renamed from: b */
    public final C138055l f375646b;

    /* renamed from: c */
    public final amt f375647c = ((amt) apd.f159555aA.createBuilder());

    /* renamed from: d */
    public final List f375648d = new ArrayList();

    /* renamed from: e */
    public final boolean f375649e;

    /* renamed from: f */
    public final boolean f375650f;

    /* renamed from: g */
    public final Optional f375651g;

    /* renamed from: h */
    public int f375652h = -1;

    /* renamed from: i */
    public Duration f375653i = Duration.ZERO;

    /* renamed from: j */
    public Duration f375654j = Duration.ZERO;

    /* renamed from: k */
    public Duration f375655k = Duration.ZERO;

    /* renamed from: m */
    private final C138076c f375656m;

    /* renamed from: n */
    private final Set f375657n;

    /* renamed from: o */
    private final String f375658o;

    /* renamed from: p */
    private final Set f375659p = new HashSet();

    /* renamed from: q */
    private final C58425eo f375660q;

    /* renamed from: r */
    private int f375661r;

    /* renamed from: s */
    private boolean f375662s;

    /* renamed from: t */
    private int f375663t;

    /* renamed from: u */
    private long f375664u;

    /* renamed from: v */
    private C54230as f375665v = ((C54230as) C54231at.f142359r.createBuilder());

    /* renamed from: w */
    private int f375666w;

    public C138068y(C21370a aVar, C138076c cVar, C138055l lVar, Set set, String str, long j, boolean z, boolean z2, Optional optional) {
        this.f375645a = aVar;
        this.f375656m = cVar;
        this.f375646b = lVar;
        this.f375657n = set;
        this.f375658o = str;
        this.f375660q = new C58425eo((int) j);
        this.f375649e = z;
        this.f375650f = z2;
        this.f375651g = optional;
    }

    /* renamed from: a */
    public static aov m224388a(C138030av avVar, int i, int i2) {
        aos aos = (aos) aov.f159510u.createBuilder();
        HashSet hashSet = new HashSet(new C62963cj(avVar.f375542e, C138030av.f375535f));
        if ((avVar.f375538a & 8) != 0) {
            C54228aq aqVar = avVar.f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            if ((aqVar.f142330a & 8) != 0) {
                C54213ab abVar = aqVar.f142335g;
                if (abVar == null) {
                    abVar = C54213ab.f142280c;
                }
                if ((abVar.f142282a & 32) != 0) {
                    int i3 = abVar.f142283b;
                    aos.copyOnWrite();
                    aov aov = (aov) aos.instance;
                    aov.f159512a |= 8192;
                    aov.f159526o = i3;
                }
            }
            if ((aqVar.f142330a & 4) != 0) {
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                if ((aeVar.f142290a & C89885b.S3REQUEST_VALUE) != 0) {
                    int i4 = aeVar.f142305p;
                    aos.copyOnWrite();
                    aov aov2 = (aov) aos.instance;
                    aov2.f159512a |= 512;
                    aov2.f159523l = i4;
                }
                if ((aeVar.f142290a & C89885b.HTTP_VALUE) != 0) {
                    int i5 = aeVar.f142306q;
                    aos.copyOnWrite();
                    aov aov3 = (aov) aos.instance;
                    aov3.f159512a |= 1024;
                    aov3.f159524m = i5;
                }
                if (i2 != -2) {
                    for (int i6 = 0; i6 < aeVar.f142288B.size(); i6++) {
                        if (i2 == -1 || i6 == i2) {
                            hashSet.addAll(new C62963cj(((C64269i) aeVar.f142288B.get(i6)).f173769e, C64269i.f173762f));
                        }
                    }
                }
            }
            C54248l lVar = aqVar.f142338j;
            if (lVar == null) {
                lVar = C54248l.f142431m;
            }
            if ((lVar.f142433a & 1) != 0) {
                C54228aq aqVar2 = avVar.f375543g;
                if (aqVar2 == null) {
                    aqVar2 = C54228aq.f142328w;
                }
                C54248l lVar2 = aqVar2.f142338j;
                if (lVar2 == null) {
                    lVar2 = C54248l.f142431m;
                }
                String str = lVar2.f142434b;
                aos.copyOnWrite();
                aov aov4 = (aov) aos.instance;
                str.getClass();
                aov4.f159512a |= 2048;
                aov4.f159525n = str;
            }
        }
        aos.copyOnWrite();
        aov aov5 = (aov) aos.instance;
        aov5.f159512a |= 1;
        aov5.f159513b = i;
        C138034az a = C138034az.m224336a(avVar.f375545i);
        if (a == null) {
            a = C138034az.NONE;
        }
        int a2 = aou.m92448a(a.f375590i);
        aos.copyOnWrite();
        aov aov6 = (aov) aos.instance;
        int i7 = a2 - 1;
        if (a2 != 0) {
            aov6.f159517f = i7;
            aov6.f159512a |= 8;
            C138029au a3 = C138029au.m224331a(avVar.f375541d);
            if (a3 == null) {
                a3 = C138029au.QUERY;
            }
            int i8 = a3.f375534n;
            aos.copyOnWrite();
            aov aov7 = (aov) aos.instance;
            aov7.f159512a |= 2;
            aov7.f159514c = i8;
            aos.mo57029a((Iterable) Collection.EL.stream(hashSet).map(C138067x.f375643a).sorted().collect(Collectors.toCollection(C138063t.f375639a)));
            return (aov) aos.build();
        }
        throw null;
    }

    /* renamed from: e */
    public static String m224389e(apd apd) {
        return Base64.encodeToString(apd.toByteArray(), 11);
    }

    /* renamed from: k */
    public static boolean m224390k(List list, long j) {
        return list.isEmpty() || Collection.EL.stream(list).anyMatch(new C138064u(j));
    }

    /* renamed from: m */
    private static int m224391m(long j, long j2) {
        return (int) Math.max(j - j2, 0);
    }

    /* renamed from: n */
    private static Set m224392n(List list) {
        return (Set) Collection.EL.stream(list).map(C138065v.f375641a).collect(Collectors.toCollection(C138066w.f375642a));
    }

    /* renamed from: b */
    public final apd mo114113b(String str, aod aod) {
        return mo114114c(str, aod, Duration.ofMillis(this.f375645a.mo26871c()));
    }

    /* renamed from: c */
    public final apd mo114114c(String str, aod aod, Duration duration) {
        C138129k kVar;
        int i;
        String b = C58880cq.m90966b("#", str.length());
        amt amt = this.f375647c;
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd apd2 = apd.f159555aA;
        apd.f159583a |= 256;
        apd.f159617i = b;
        Duration duration2 = this.f375656m.f375675e;
        C138055l lVar = this.f375646b;
        synchronized (lVar.f375626a) {
            kVar = (C138129k) lVar.f375627b.build();
        }
        amt amt2 = this.f375647c;
        int i2 = kVar.f375811b;
        amt2.copyOnWrite();
        apd apd3 = (apd) amt2.instance;
        apd3.f159583a |= 268435456;
        apd3.f159557A = i2;
        int i3 = kVar.f375813d;
        amt2.copyOnWrite();
        apd apd4 = (apd) amt2.instance;
        apd4.f159610b |= 16;
        apd4.f159563G = i3;
        int i4 = kVar.f375812c;
        amt2.copyOnWrite();
        apd apd5 = (apd) amt2.instance;
        apd5.f159610b |= 256;
        apd5.f159567K = i4;
        if (!this.f375659p.isEmpty()) {
            if (!this.f375648d.isEmpty()) {
                this.f375659p.removeAll(m224392n(this.f375648d));
            }
            amt amt3 = this.f375647c;
            Set set = this.f375659p;
            amt3.copyOnWrite();
            apd apd6 = (apd) amt3.instance;
            apd6.mo57032b();
            C62947c.addAll((Iterable) set, (List) apd6.f159622n);
        }
        ana ana = (ana) anb.f159266c.createBuilder();
        if (this.f375662s) {
            i = this.f375663t > 1 ? 3 : 1;
        } else {
            i = this.f375663t > 0 ? 2 : 0;
        }
        amt amt4 = this.f375647c;
        ana.copyOnWrite();
        anb anb = (anb) ana.instance;
        anb.f159268a |= 4;
        anb.f159269b = i;
        amt4.copyOnWrite();
        apd apd7 = (apd) amt4.instance;
        anb anb2 = (anb) ana.build();
        anb2.getClass();
        apd7.f159616h = anb2;
        apd7.f159583a |= 128;
        C138047d dVar = new C138047d();
        for (C138048e b2 : this.f375657n) {
            b2.mo114094b(dVar);
        }
        amt amt5 = this.f375647c;
        amt5.copyOnWrite();
        ((apd) amt5.instance).f159587ad = apd.emptyProtobufList();
        amt amt6 = this.f375647c;
        ArrayList arrayList = new ArrayList();
        Map.EL.forEach(dVar.f375615a, new C138045b(arrayList));
        Map.EL.forEach(dVar.f375616b, new C138046c(arrayList));
        amt6.mo57025a(arrayList);
        this.f375647c.mo57025a(Collections.unmodifiableList(((C54231at) this.f375665v.instance).f142375o));
        C54231at atVar = (C54231at) this.f375665v.instance;
        if ((atVar.f142361a & 33554432) != 0) {
            amt amt7 = this.f375647c;
            long j = atVar.f142373m;
            amt7.copyOnWrite();
            apd apd8 = (apd) amt7.instance;
            apd8.f159611c |= 2048;
            apd8.f159596am = j;
        }
        amt amt8 = this.f375647c;
        long j2 = this.f375664u;
        amt8.copyOnWrite();
        apd apd9 = (apd) amt8.instance;
        apd9.f159610b |= LinearLayoutManager.INVALID_OFFSET;
        apd9.f159588ae = j2;
        for (C138048e c : this.f375657n) {
            c.mo114095c(this.f375647c);
        }
        int i5 = this.f375666w;
        if (i5 != 0) {
            amt amt9 = this.f375647c;
            amt9.copyOnWrite();
            apd apd10 = (apd) amt9.instance;
            apd10.f159606aw = i5 - 1;
            apd10.f159611c |= 524288;
            if (this.f375666w == 5) {
                amt amt10 = this.f375647c;
                amt10.copyOnWrite();
                apd apd11 = (apd) amt10.instance;
                apd11.f159607ax = 1;
                apd11.f159611c |= 1048576;
            }
        }
        amt amt11 = this.f375647c;
        String str2 = this.f375658o;
        amt11.copyOnWrite();
        apd apd12 = (apd) amt11.instance;
        apd12.f159583a |= 16;
        apd12.f159613e = str2;
        int m = m224391m(this.f375654j.toMillis(), duration2.toMillis());
        amt11.copyOnWrite();
        apd apd13 = (apd) amt11.instance;
        apd13.f159583a = 33554432 | apd13.f159583a;
        apd13.f159632x = m;
        int m2 = m224391m(this.f375653i.toMillis(), duration2.toMillis());
        amt11.copyOnWrite();
        apd apd14 = (apd) amt11.instance;
        apd14.f159583a |= 67108864;
        apd14.f159633y = m2;
        int m3 = m224391m(this.f375655k.toMillis(), duration2.toMillis());
        amt11.copyOnWrite();
        apd apd15 = (apd) amt11.instance;
        apd15.f159583a |= 134217728;
        apd15.f159634z = m3;
        int m4 = m224391m(duration.toMillis(), duration2.toMillis());
        amt11.copyOnWrite();
        apd apd16 = (apd) amt11.instance;
        apd16.f159583a |= 16777216;
        apd16.f159631w = m4;
        int i6 = this.f375652h;
        amt11.copyOnWrite();
        apd apd17 = (apd) amt11.instance;
        apd17.f159583a |= 8388608;
        apd17.f159630v = i6;
        amt11.copyOnWrite();
        apd apd18 = (apd) amt11.instance;
        apd18.f159614f = aod.f159471J;
        apd18.f159583a |= 64;
        return (apd) amt11.build();
    }

    /* renamed from: d */
    public final C56036l mo114115d(Optional optional) {
        C56032h hVar = (C56032h) C56036l.f149228f.createBuilder();
        if (optional.isPresent()) {
            C138030av avVar = (C138030av) optional.get();
            if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PROACTIVE_ZPS) || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PIPS)) {
                C138030av avVar2 = (C138030av) optional.get();
                C56033i iVar = (C56033i) C56034j.f149219g.createBuilder();
                C138029au a = C138029au.m224331a(avVar2.f375541d);
                if (a == null) {
                    a = C138029au.QUERY;
                }
                int i = a.f375534n;
                iVar.copyOnWrite();
                C56034j jVar = (C56034j) iVar.instance;
                jVar.f149221a |= 4;
                jVar.f149224d = i;
                iVar.mo54316a((Iterable) Collection.EL.stream(new C62963cj(avVar2.f375542e, C138030av.f375535f)).map(C138067x.f375643a).collect(Collectors.toCollection(C138063t.f375639a)));
                if ((avVar2.f375538a & 8) != 0) {
                    C54228aq aqVar = avVar2.f375543g;
                    if (aqVar == null) {
                        aqVar = C54228aq.f142328w;
                    }
                    if ((aqVar.f142330a & 4) != 0) {
                        C54216ae aeVar = aqVar.f142334f;
                        if (aeVar == null) {
                            aeVar = C54216ae.f142285C;
                        }
                        if ((aeVar.f142290a & 16777216) != 0) {
                            C8592s sVar = aeVar.f142309t;
                            if (sVar == null) {
                                sVar = C8592s.f29730d;
                            }
                            if ((sVar.f29732a & 1) != 0) {
                                long j = sVar.f29733b;
                                iVar.copyOnWrite();
                                C56034j jVar2 = (C56034j) iVar.instance;
                                jVar2.f149221a |= 1;
                                jVar2.f149222b = j;
                            }
                            if ((sVar.f29732a & 2) != 0) {
                                long j2 = sVar.f29734c;
                                iVar.copyOnWrite();
                                C56034j jVar3 = (C56034j) iVar.instance;
                                jVar3.f149221a |= 2;
                                jVar3.f149223c = j2;
                            }
                        }
                        if ((aeVar.f142290a & C89885b.HTTP_VALUE) != 0) {
                            int i2 = aeVar.f142306q;
                            iVar.copyOnWrite();
                            C56034j jVar4 = (C56034j) iVar.instance;
                            jVar4.f149221a |= 16;
                            jVar4.f149226f = i2;
                        }
                    }
                }
                C56034j jVar5 = (C56034j) iVar.build();
                hVar.copyOnWrite();
                C56036l lVar = (C56036l) hVar.instance;
                jVar5.getClass();
                lVar.f149232c = jVar5;
                lVar.f149230a |= 1;
            }
        }
        hVar.mo54315a(this.f375660q);
        hVar.copyOnWrite();
        C56036l lVar2 = (C56036l) hVar.instance;
        lVar2.f149234e = 1;
        lVar2.f149230a |= 8;
        return (C56036l) hVar.build();
    }

    /* renamed from: f */
    public final void mo114116f(List list, long j, long j2, C138542t tVar, boolean z) {
        this.f375648d.clear();
        this.f375648d.addAll(list);
        if (z) {
            C58425eo eoVar = this.f375660q;
            C54231at atVar = tVar.f376814b;
            if (atVar == null) {
                atVar = C54231at.f142359r;
            }
            C57924d dVar = atVar.f142377q;
            if (dVar == null) {
                dVar = C57924d.f154931b;
            }
            eoVar.addAll((List) Collection.EL.stream(dVar.f154933a).filter(new C138061r(this)).map(C138062s.f375638a).collect(Collectors.toCollection(C138063t.f375639a)));
        }
        if (z) {
            amt amt = this.f375647c;
            if ((((apd) amt.instance).f159610b & 8192) == 0) {
                int m = m224391m(j, j2);
                amt.copyOnWrite();
                apd apd = (apd) amt.instance;
                apd.f159610b |= 8192;
                apd.f159572P = m;
            }
        }
        if (!this.f375648d.isEmpty()) {
            this.f375659p.addAll(m224392n(this.f375648d));
            int m2 = m224391m(j, j2);
            amt amt2 = this.f375647c;
            int i = ((apd) amt2.instance).f159573Q;
            amt2.copyOnWrite();
            apd apd2 = (apd) amt2.instance;
            apd2.f159610b |= 16384;
            apd2.f159573Q = i + ((int) ((long) m2));
            amt amt3 = this.f375647c;
            int i2 = ((apd) amt3.instance).f159570N;
            amt3.copyOnWrite();
            apd apd3 = (apd) amt3.instance;
            apd3.f159610b |= 2048;
            apd3.f159570N = i2 + 1;
        }
        amt amt4 = this.f375647c;
        amt4.copyOnWrite();
        apd apd4 = apd.f159555aA;
        ((apd) amt4.instance).f159620l = apd.emptyProtobufList();
        for (int i3 = 0; i3 < this.f375648d.size(); i3++) {
            this.f375647c.mo57026b(m224388a((C138030av) this.f375648d.get(i3), i3, -1));
        }
        if (!this.f375648d.isEmpty()) {
            C138030av avVar = (C138030av) this.f375648d.get(0);
            if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_SRP_ON_FOCUS) || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_REFINEMENTS)) {
                amt amt5 = this.f375647c;
                int size = this.f375648d.size();
                amt5.copyOnWrite();
                apd apd5 = (apd) amt5.instance;
                apd5.f159583a |= 65536;
                apd5.f159626r = size;
            }
        }
        if (z) {
            amt amt6 = this.f375647c;
            int size2 = this.f375648d.size();
            amt6.copyOnWrite();
            apd apd6 = (apd) amt6.instance;
            apd6.f159583a |= 32768;
            apd6.f159625q = size2;
        }
        C54231at atVar2 = tVar.f376814b;
        if (atVar2 == null) {
            atVar2 = C54231at.f142359r;
        }
        boolean z2 = atVar2.f142363c;
        this.f375662s = z2;
        if (z2) {
            this.f375663t++;
        }
        C54231at atVar3 = tVar.f376814b;
        if (atVar3 == null) {
            atVar3 = C54231at.f142359r;
        }
        if ((atVar3.f142361a & 268435456) != 0) {
            amt amt7 = this.f375647c;
            long j3 = atVar3.f142376p;
            amt7.copyOnWrite();
            apd apd7 = (apd) amt7.instance;
            apd7.mo57033c();
            apd7.f159597an.mo58929f(j3);
        }
        if (!atVar3.f142375o.isEmpty() || !(((atVar3.f142361a & 33554432) == 0 && (((C54231at) this.f375665v.instance).f142361a & 33554432) == 0) || atVar3.f142373m == ((C54231at) this.f375665v.instance).f142373m)) {
            if (!atVar3.f142375o.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (anf hashCode : Collections.unmodifiableList(((C54231at) this.f375665v.instance).f142375o)) {
                    hashSet.add(Integer.valueOf(hashCode.hashCode()));
                }
                for (anf anf : atVar3.f142375o) {
                    if (!hashSet.contains(Integer.valueOf(anf.hashCode()))) {
                        if (anf.f159359c == 10001) {
                            C57924d dVar2 = atVar3.f142377q;
                            if (dVar2 == null) {
                                dVar2 = C57924d.f154931b;
                            }
                            long b = this.f375645a.mo26870b();
                            if (anf.f159359c == 10001) {
                                ArrayList arrayList = new ArrayList();
                                int i4 = -1;
                                for (String str : C58869cf.m90936b(new C58903m(':')).mo56153g(anf.f159360d)) {
                                    if (i4 < 0) {
                                        try {
                                            i4 = Integer.parseInt(str);
                                        } catch (NumberFormatException unused) {
                                        }
                                    } else {
                                        arrayList.add(Integer.valueOf(str));
                                    }
                                }
                                Iterator it = dVar2.f154933a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C57922b bVar = (C57922b) it.next();
                                    HashSet hashSet2 = new HashSet(bVar.f154928d);
                                    if (i4 == bVar.f154927c && hashSet2.containsAll(arrayList) && m224390k(bVar.f154929e, b)) {
                                        break;
                                    }
                                }
                            }
                        }
                        this.f375665v.mo54077a(anf);
                        hashSet.add(Integer.valueOf(anf.hashCode()));
                    }
                }
            }
            if ((atVar3.f142361a & 33554432) != 0) {
                C54230as asVar = this.f375665v;
                long j4 = atVar3.f142373m;
                asVar.copyOnWrite();
                C54231at atVar4 = (C54231at) asVar.instance;
                atVar4.f142361a |= 33554432;
                atVar4.f142373m = j4;
            } else {
                C54230as asVar2 = this.f375665v;
                asVar2.copyOnWrite();
                C54231at atVar5 = (C54231at) asVar2.instance;
                atVar5.f142361a &= -33554433;
                atVar5.f142373m = 0;
            }
        }
        long j5 = tVar.f376817e;
        long j6 = this.f375664u;
        this.f375664u = j5 | ((j6 | (j6 << 32)) & -4294967296L);
    }

    /* renamed from: g */
    public final void mo114117g() {
        mo114118h(Duration.ofMillis(this.f375645a.mo26871c()));
    }

    /* renamed from: h */
    public final void mo114118h(Duration duration) {
        duration.toMillis();
        this.f375647c.clear();
        this.f375652h++;
        amt amt = this.f375647c;
        String b = C39191a.m68623b(C58851bo.f156649a.nextLong());
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd apd2 = apd.f159555aA;
        b.getClass();
        apd.f159611c |= 4;
        apd.f159589af = b;
        C138076c cVar = this.f375656m;
        C19559g.m37304c();
        cVar.f375675e = duration;
        cVar.f375676f++;
        synchronized (cVar.f375671a) {
            cVar.f375677g = null;
        }
        this.f375648d.clear();
        this.f375659p.clear();
        this.f375653i = Duration.ZERO;
        this.f375654j = Duration.ZERO;
        this.f375655k = Duration.ZERO;
        this.f375662s = false;
        this.f375663t = 0;
        this.f375664u = 0;
        for (C138048e a : this.f375657n) {
            a.mo114093a();
        }
        C138055l lVar = this.f375646b;
        synchronized (lVar.f375626a) {
            lVar.f375627b = (C138128j) C138129k.f375808e.createBuilder();
        }
        this.f375661r = 0;
        this.f375660q.clear();
        this.f375665v = (C54230as) C54231at.f142359r.createBuilder();
    }

    /* renamed from: i */
    public final void mo114119i(C138030av avVar) {
        for (int i = 0; i < this.f375648d.size(); i++) {
            if (((C138030av) this.f375648d.get(i)).equals(avVar)) {
                amt amt = this.f375647c;
                aov a = m224388a(avVar, i, -2);
                amt.copyOnWrite();
                apd apd = (apd) amt.instance;
                apd apd2 = apd.f159555aA;
                a.getClass();
                apd.f159619k = a;
                apd.f159583a |= 4096;
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo114120j(C139704d dVar) {
        int a = aol.m92445a(dVar.f379715p);
        if (a != 0) {
            this.f375666w = a;
            return;
        }
        C58970a aVar = (C58970a) f375644l.mo56225c();
        aVar.mo56378ag(C38505d.f101864b, 158665695);
        ((C58970a) aVar.mo56372aa(41117)).mo56387q("Unsupported Suggest entry point (%d)", dVar.f379715p);
    }

    /* renamed from: l */
    public final boolean mo114121l() {
        if (this.f375656m.mo114123a(this.f375645a.mo26871c())) {
            amt amt = this.f375647c;
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            apd apd2 = apd.f159555aA;
            apd.f159583a |= 8192;
            apd.f159623o = true;
            int i = this.f375661r;
            this.f375661r = i + 1;
            if (i == 0) {
                return true;
            }
        }
        return false;
    }
}
