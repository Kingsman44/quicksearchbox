package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.aqw;
import com.google.android.libraries.assistant.soda.C19240ac;
import com.google.android.libraries.assistant.soda.C19244ag;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.C19258c;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.p1611f.p1612a.C19321a;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39361bj;
import com.google.android.libraries.search.p3055n.C39365bn;
import com.google.android.libraries.search.p3055n.C39374bw;
import com.google.android.libraries.search.p3055n.C39375bx;
import com.google.android.libraries.search.p3055n.C39647ca;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.p3075e.p3077b.C39689e;
import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import com.google.android.libraries.search.p3055n.p3087j.p3089b.C39801a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62950b;
import com.google.speech.p5218j.C66763ad;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66845bw;
import com.google.speech.p5218j.C66846bx;
import com.google.speech.p5218j.C66867cm;
import com.google.speech.p5218j.C66909dz;
import com.google.speech.p5218j.C66911ea;
import com.google.speech.p5218j.C66913ec;
import com.google.speech.p5218j.C66914ed;
import com.google.speech.p5218j.C66915ee;
import com.google.speech.p5218j.C66963fz;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66965ga;
import com.google.speech.p5218j.C66978gn;
import com.google.speech.p5218j.C66979go;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66722az;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.aa */
/* compiled from: PG */
public final class C39280aa {

    /* renamed from: a */
    public static final C59071e f103467a = C59071e.m91332i("com.google.android.libraries.search.n.b.b.aa");

    /* renamed from: x */
    private static final ByteBuffer f103468x = ByteBuffer.allocateDirect(0);

    /* renamed from: A */
    private final C19244ag f103469A = new C19244ag();

    /* renamed from: B */
    private final C19244ag f103470B = new C19244ag();

    /* renamed from: b */
    public final C47632e f103471b = new C47632e();

    /* renamed from: c */
    public final Optional f103472c;

    /* renamed from: d */
    public final Executor f103473d;

    /* renamed from: e */
    public final boolean f103474e;

    /* renamed from: f */
    public C60870cx f103475f;

    /* renamed from: g */
    public Soda f103476g = null;

    /* renamed from: h */
    Optional f103477h = Optional.empty();

    /* renamed from: i */
    public Optional f103478i = Optional.empty();

    /* renamed from: j */
    public final boolean f103479j;

    /* renamed from: k */
    public final C39326bt f103480k;

    /* renamed from: l */
    public final boolean f103481l;

    /* renamed from: m */
    public final Optional f103482m;

    /* renamed from: n */
    public final boolean f103483n;

    /* renamed from: o */
    public final Duration f103484o;

    /* renamed from: p */
    public final C19321a f103485p;

    /* renamed from: q */
    public C60870cx f103486q = C60866ct.f164955a;

    /* renamed from: r */
    public final AtomicReference f103487r = new AtomicReference(Optional.empty());

    /* renamed from: s */
    public Optional f103488s = Optional.empty();

    /* renamed from: t */
    public final AtomicLong f103489t = new AtomicLong(0);

    /* renamed from: u */
    public final AtomicInteger f103490u = new AtomicInteger(0);

    /* renamed from: v */
    public int f103491v = 1;

    /* renamed from: w */
    public final aqw f103492w;

    /* renamed from: y */
    private final boolean f103493y;

    /* renamed from: z */
    private final Optional f103494z;

    public C39280aa(C60887da daVar, aqw aqw, boolean z, C60887da daVar2, Optional optional, boolean z2, boolean z3, boolean z4, boolean z5, C62910ar arVar, C60870cx cxVar, Optional optional2, Optional optional3, boolean z6) {
        this.f103473d = daVar;
        this.f103492w = aqw;
        this.f103474e = z;
        this.f103475f = cxVar;
        this.f103494z = optional;
        this.f103472c = optional2;
        this.f103485p = new C19321a();
        C60887da daVar3 = daVar2;
        boolean z7 = z2;
        this.f103480k = new C39326bt(z2, new C60904dr(daVar2));
        this.f103493y = z3;
        this.f103479j = z6;
        this.f103481l = z4;
        this.f103482m = optional3;
        this.f103483n = z5;
        this.f103484o = C62950b.m95473d(arVar);
    }

    /* renamed from: b */
    public static C39647ca m68696b(C39374bw bwVar, Optional optional) {
        C66964g a = C66964g.m97396a(bwVar.f103691c);
        if (a == null) {
            a = C66964g.UNKNOWN;
        }
        if (!a.equals(C66964g.UNKNOWN)) {
            C39276az azVar = bwVar.f103690b;
            if (azVar == null) {
                azVar = C39276az.f103456b;
            }
            int size = azVar.f103458a.size();
            if (size == 0) {
                ((C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53403)).mo56386p("#checkAsrCompatibility missing locale.");
                C39375bx bxVar = (C39375bx) C39647ca.f104365d.createBuilder();
                bxVar.copyOnWrite();
                C39647ca caVar = (C39647ca) bxVar.instance;
                caVar.f104368a |= 1;
                caVar.f104369b = false;
                bxVar.copyOnWrite();
                C39647ca caVar2 = (C39647ca) bxVar.instance;
                caVar2.f104370c = 4;
                caVar2.f104368a |= 2;
                return (C39647ca) bxVar.build();
            } else if (size > 1) {
                ((C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53402)).mo56387q("#checkAsrCompatibility %d locales provided, one locale expected.", size);
                C39375bx bxVar2 = (C39375bx) C39647ca.f104365d.createBuilder();
                bxVar2.copyOnWrite();
                C39647ca caVar3 = (C39647ca) bxVar2.instance;
                caVar3.f104368a |= 1;
                caVar3.f104369b = false;
                bxVar2.copyOnWrite();
                C39647ca caVar4 = (C39647ca) bxVar2.instance;
                caVar4.f104370c = 5;
                caVar4.f104368a |= 2;
                return (C39647ca) bxVar2.build();
            } else {
                if (!optional.isEmpty()) {
                    C39276az azVar2 = bwVar.f103690b;
                    if (azVar2 == null) {
                        azVar2 = C39276az.f103456b;
                    }
                    if (!m68698h(optional, azVar2).isEmpty()) {
                        C39375bx bxVar3 = (C39375bx) C39647ca.f104365d.createBuilder();
                        bxVar3.copyOnWrite();
                        C39647ca caVar5 = (C39647ca) bxVar3.instance;
                        caVar5.f104368a |= 1;
                        caVar5.f104369b = true;
                        return (C39647ca) bxVar3.build();
                    }
                }
                C59052c cVar = (C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53401);
                C39276az azVar3 = bwVar.f103690b;
                if (azVar3 == null) {
                    azVar3 = C39276az.f103456b;
                }
                cVar.mo56389s("#checkAsrCompatibility no available lp for %s", (String) azVar3.f103458a.get(0));
                C39375bx bxVar4 = (C39375bx) C39647ca.f104365d.createBuilder();
                bxVar4.copyOnWrite();
                C39647ca caVar6 = (C39647ca) bxVar4.instance;
                caVar6.f104368a |= 1;
                caVar6.f104369b = false;
                bxVar4.copyOnWrite();
                C39647ca caVar7 = (C39647ca) bxVar4.instance;
                caVar7.f104370c = 2;
                caVar7.f104368a |= 2;
                return (C39647ca) bxVar4.build();
            }
        } else {
            ((C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53404)).mo56386p("#checkAsrCompatibility missing application domain.");
            C39375bx bxVar5 = (C39375bx) C39647ca.f104365d.createBuilder();
            bxVar5.copyOnWrite();
            C39647ca caVar8 = (C39647ca) bxVar5.instance;
            caVar8.f104368a |= 1;
            caVar8.f104369b = false;
            bxVar5.copyOnWrite();
            C39647ca caVar9 = (C39647ca) bxVar5.instance;
            caVar9.f104370c = 3;
            caVar9.f104368a |= 2;
            return (C39647ca) bxVar5.build();
        }
    }

    /* renamed from: g */
    public static C66915ee m68697g(C39365bn bnVar) {
        C66911ea eaVar = (C66911ea) C66913ec.f181884n.createBuilder();
        eaVar.copyOnWrite();
        C66913ec ecVar = (C66913ec) eaVar.instance;
        int i = 1;
        ecVar.f181889d = 1;
        ecVar.f181886a |= 1;
        String str = bnVar.f103666d;
        eaVar.copyOnWrite();
        C66913ec ecVar2 = (C66913ec) eaVar.instance;
        str.getClass();
        ecVar2.f181886a |= 2;
        ecVar2.f181890e = str;
        boolean z = bnVar.f103671i;
        eaVar.copyOnWrite();
        C66913ec ecVar3 = (C66913ec) eaVar.instance;
        ecVar3.f181886a |= 8;
        ecVar3.f181892g = z;
        boolean z2 = bnVar.f103672j;
        eaVar.copyOnWrite();
        C66913ec ecVar4 = (C66913ec) eaVar.instance;
        ecVar4.f181886a |= 16;
        ecVar4.f181893h = z2;
        String str2 = bnVar.f103667e;
        eaVar.copyOnWrite();
        C66913ec ecVar5 = (C66913ec) eaVar.instance;
        str2.getClass();
        ecVar5.f181886a |= 4;
        ecVar5.f181891f = str2;
        C63088z zVar = bnVar.f103668f;
        eaVar.copyOnWrite();
        C66913ec ecVar6 = (C66913ec) eaVar.instance;
        zVar.getClass();
        ecVar6.f181886a |= 64;
        ecVar6.f181895j = zVar;
        long j = bnVar.f103669g;
        eaVar.copyOnWrite();
        C66913ec ecVar7 = (C66913ec) eaVar.instance;
        ecVar7.f181886a |= 128;
        ecVar7.f181896k = j;
        int a = C66909dz.m97374a(bnVar.f103673k);
        if (a != 0) {
            i = a;
        }
        eaVar.copyOnWrite();
        C66913ec ecVar8 = (C66913ec) eaVar.instance;
        ecVar8.f181894i = i - 1;
        ecVar8.f181886a |= 32;
        C51544lq lqVar = bnVar.f103674l;
        if (lqVar == null) {
            lqVar = C51544lq.f134342j;
        }
        eaVar.copyOnWrite();
        C66913ec ecVar9 = (C66913ec) eaVar.instance;
        lqVar.getClass();
        ecVar9.f181898m = lqVar;
        ecVar9.f181886a |= 4096;
        String str3 = bnVar.f103670h;
        eaVar.copyOnWrite();
        C66913ec ecVar10 = (C66913ec) eaVar.instance;
        str3.getClass();
        ecVar10.f181886a |= 2048;
        ecVar10.f181897l = str3;
        int i2 = bnVar.f103664b;
        if (i2 == 5) {
            String str4 = (String) bnVar.f103665c;
            eaVar.copyOnWrite();
            C66913ec ecVar11 = (C66913ec) eaVar.instance;
            str4.getClass();
            ecVar11.f181887b = 8;
            ecVar11.f181888c = str4;
        } else if (i2 == 6) {
            C60218r rVar = (C60218r) bnVar.f103665c;
            eaVar.copyOnWrite();
            C66913ec ecVar12 = (C66913ec) eaVar.instance;
            rVar.getClass();
            ecVar12.f181888c = rVar;
            ecVar12.f181887b = 9;
        }
        C66914ed edVar = (C66914ed) C66915ee.f181900b.createBuilder();
        edVar.mo59747a(eaVar);
        return (C66915ee) edVar.build();
    }

    /* renamed from: h */
    public static String m68698h(Optional optional, C39276az azVar) {
        if (!optional.isPresent() || azVar.f103458a.size() == 0) {
            return BuildConfig.FLAVOR;
        }
        return (String) Collection.EL.stream(((C39775h) optional.get()).f104627e).filter(new C39339n(azVar)).findFirst().map(C39340o.f103611a).orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final C19240ac mo41756a(Context context, C39276az azVar, Optional optional, boolean z, boolean z2, Duration duration, C66964g gVar, boolean z3) {
        Optional optional2;
        String h = m68698h(optional, azVar);
        Optional map = optional.map(C39279a.f103466a);
        C19258c cVar = new C19258c();
        boolean z4 = this.f103493y;
        C66994hc hcVar = (C66994hc) C66997hf.f182099z.createBuilder();
        hcVar.copyOnWrite();
        C66997hf hfVar = (C66997hf) hcVar.instance;
        hfVar.f182119r = gVar.f182026k;
        hfVar.f182102a |= 1048576;
        hcVar.copyOnWrite();
        C66997hf hfVar2 = (C66997hf) hcVar.instance;
        h.getClass();
        hfVar2.f182102a |= 32768;
        hfVar2.f182115n = h;
        if (z4) {
            ((C59052c) ((C59052c) f103467a.mo56224b()).mo56372aa(53431)).mo56386p("Enabling Greco debug logging");
            C62940bt btVar = C66846bx.f181765e;
            C66845bw bwVar = (C66845bw) C66846bx.f181764d.createBuilder();
            bwVar.copyOnWrite();
            C66846bx bxVar = (C66846bx) bwVar.instance;
            bxVar.f181767a |= 1;
            bxVar.f181768b = true;
            bwVar.copyOnWrite();
            C66846bx bxVar2 = (C66846bx) bwVar.instance;
            bxVar2.f181767a |= 2;
            bxVar2.f181769c = true;
            hcVar.mo58885m(btVar, (C66846bx) bwVar.build());
        }
        if (z3) {
            ((C59052c) ((C59052c) f103467a.mo56224b()).mo56372aa(53430)).mo56386p("Using infinite context deadline");
            hcVar.copyOnWrite();
            C66997hf hfVar3 = (C66997hf) hcVar.instance;
            hfVar3.f182102a |= 32;
            hfVar3.f182105d = -1;
        }
        C66998hg hgVar = (C66998hg) C66999hh.f182127p.createBuilder();
        String str = context.getFilesDir().getAbsolutePath() + File.separator + "soda" + File.separator;
        hgVar.copyOnWrite();
        C66999hh hhVar = (C66999hh) hgVar.instance;
        hhVar.f182129a |= 64;
        hhVar.f182135g = str;
        hgVar.copyOnWrite();
        C66999hh hhVar2 = (C66999hh) hgVar.instance;
        C66997hf hfVar4 = (C66997hf) hcVar.build();
        hfVar4.getClass();
        hhVar2.f182132d = hfVar4;
        hhVar2.f182129a |= 4;
        C66763ad adVar = (C66763ad) C66764ae.f181577i.createBuilder();
        adVar.copyOnWrite();
        C66764ae aeVar = (C66764ae) adVar.instance;
        aeVar.f181582d = 1;
        aeVar.f181579a |= 4;
        C66764ae aeVar2 = (C66764ae) adVar.build();
        hgVar.copyOnWrite();
        C66999hh hhVar3 = (C66999hh) hgVar.instance;
        aeVar2.getClass();
        hhVar3.f182138j = aeVar2;
        hhVar3.f182129a |= 512;
        C66963fz fzVar = (C66963fz) C66965ga.f182027c.createBuilder();
        C67172q e = C19245ah.m36697e();
        fzVar.copyOnWrite();
        C66965ga gaVar = (C66965ga) fzVar.instance;
        C67175t tVar = (C67175t) e.build();
        tVar.getClass();
        gaVar.f182030b = tVar;
        gaVar.f182029a |= 1;
        hgVar.copyOnWrite();
        C66999hh hhVar4 = (C66999hh) hgVar.instance;
        C66965ga gaVar2 = (C66965ga) fzVar.build();
        gaVar2.getClass();
        hhVar4.f182130b = gaVar2;
        hhVar4.f182129a |= 1;
        if (!z2) {
            ((C59052c) ((C59052c) f103467a.mo56224b()).mo56372aa(53434)).mo56386p("Hotmatch disabled: flag not enabled");
            optional2 = Optional.empty();
        } else if (map.isEmpty() || ((String) map.get()).isEmpty()) {
            ((C59052c) ((C59052c) f103467a.mo56224b()).mo56372aa(53432)).mo56386p("Hotmatch disabled: fingerprints file path empty, maybe not synced yet by MDD or download flag disabled?");
            optional2 = Optional.empty();
        } else {
            ((C59052c) ((C59052c) f103467a.mo56224b()).mo56372aa(53433)).mo56389s("Hotmatch enabled: with fingerprints file path %s", map.get());
            C66978gn gnVar = (C66978gn) C66979go.f182056g.createBuilder();
            gnVar.copyOnWrite();
            C66979go goVar = (C66979go) gnVar.instance;
            goVar.f182058a |= 1;
            goVar.f182061d = true;
            String str2 = (String) map.get();
            gnVar.copyOnWrite();
            C66979go goVar2 = (C66979go) gnVar.instance;
            str2.getClass();
            goVar2.f182059b = 5;
            goVar2.f182060c = str2;
            gnVar.copyOnWrite();
            C66979go goVar3 = (C66979go) gnVar.instance;
            goVar3.f182058a |= 32;
            goVar3.f182062e = true;
            long millis = duration.toMillis();
            int i = (int) millis;
            if (millis == ((long) i)) {
                gnVar.copyOnWrite();
                C66979go goVar4 = (C66979go) gnVar.instance;
                goVar4.f182058a |= 64;
                goVar4.f182063f = i;
                optional2 = Optional.m71637of((C66979go) gnVar.build());
            } else {
                throw new ArithmeticException();
            }
        }
        optional2.ifPresent(new C39328c(hgVar));
        if (z) {
            C66867cm cmVar = C66867cm.f181796g;
            hgVar.copyOnWrite();
            C66999hh hhVar5 = (C66999hh) hgVar.instance;
            cmVar.getClass();
            hhVar5.f182141m = cmVar;
            hhVar5.f182129a |= 8192;
        }
        cVar.mo24390b((C66999hh) hgVar.build());
        cVar.f53967b = C58833ax.m90834k(this.f103485p);
        if (this.f103494z.isPresent()) {
            cVar.f53966a = C58833ax.m90834k((SodaTransportFactory) this.f103494z.get());
        } else {
            ((C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53399)).mo56386p("Soda was built without a transport factory.");
        }
        return cVar.mo24391c();
    }

    /* renamed from: c */
    public final C60870cx mo41757c() {
        return this.f103471b.mo51512b(new C39334i(this), this.f103473d);
    }

    /* renamed from: d */
    public final C60870cx mo41758d(C39361bj bjVar) {
        return this.f103471b.mo51512b(new C39306b(this, bjVar), this.f103473d);
    }

    /* renamed from: e */
    public final C60870cx mo41759e(C39655ci ciVar, C19347o oVar, Context context, boolean z, boolean z2) {
        return this.f103471b.mo51512b(new C39342q(this, ciVar, context, z, z2, oVar), this.f103473d);
    }

    /* renamed from: f */
    public final C60870cx mo41760f(C39666ct ctVar) {
        return this.f103471b.mo51512b(new C39341p(this, ctVar), this.f103473d);
    }

    /* renamed from: i */
    public final void mo41761i(Context context, C19240ac acVar, C19347o oVar) {
        if (this.f103472c.isPresent()) {
            this.f103476g = ((C39689e) this.f103472c.get()).mo41993a(context, acVar, oVar);
        } else {
            Soda soda = this.f103476g;
            if (soda != null) {
                soda.mo24340l();
            }
            Soda soda2 = new Soda(context, oVar);
            this.f103476g = soda2;
            C67150mx g = soda2.mo24331g(acVar);
            C67152mz a = C67152mz.m97427a(g.f182527b);
            if (a == null) {
                a = C67152mz.NO_ERROR;
            }
            if (a != C67152mz.NO_ERROR) {
                C59052c cVar = (C59052c) ((C59052c) f103467a.mo56225c()).mo56372aa(53438);
                C67152mz a2 = C67152mz.m97427a(g.f182527b);
                if (a2 == null) {
                    a2 = C67152mz.NO_ERROR;
                }
                cVar.mo56354G("Failed to initialize soda: %s: %s", a2.name(), g.f182528c);
            }
        }
        this.f103482m.ifPresent(new C39331f(acVar));
    }

    /* renamed from: j */
    public final void mo41762j(C63088z zVar, long j, long j2) {
        int d = zVar.mo59031d();
        ByteBuffer a = this.f103469A.mo24395a(d);
        a.put(zVar.mo59174N(), 0, d);
        ByteBuffer a2 = this.f103470B.mo24395a(16);
        a2.putLong(Long.reverseBytes(j));
        a2.putLong(Long.reverseBytes(j2));
        Soda soda = this.f103476g;
        if (soda != null) {
            soda.mo24337i(a, d, a2, a2.capacity());
        }
    }

    /* renamed from: k */
    public final void mo41763k() {
        if (this.f103488s.isPresent()) {
            ((C39801a) this.f103488s.get()).mo42018b();
        } else {
            mo41764l();
        }
    }

    /* renamed from: l */
    public final void mo41764l() {
        Soda soda = this.f103476g;
        if (soda != null) {
            ByteBuffer byteBuffer = f103468x;
            soda.mo24337i(byteBuffer, 0, byteBuffer, 0);
        }
    }

    /* renamed from: m */
    public final void mo41765m(C39666ct ctVar) {
        Soda soda = this.f103476g;
        soda.getClass();
        int i = ctVar.f104419b;
        if (i == 1) {
            soda.mo24351r((C66722az) ctVar.f104420c);
        } else if (i == 2) {
            soda.mo24353t();
            soda.nativeUpdateContext(soda.f53871d, ((C66709am) ctVar.f104420c).toByteArray());
        } else {
            ((C59052c) ((C59052c) f103467a.mo56226d()).mo56372aa(53441)).mo56386p("The update type is not supported.");
        }
    }

    /* renamed from: n */
    public final void mo41766n(int i) {
        int i2 = this.f103491v;
        if (i2 == 1) {
            if (i != 1) {
                this.f103486q = C2169h.m6027a(new C39345t(this));
            }
        } else if (i2 != 1 && i == 1) {
            Optional optional = (Optional) this.f103487r.getAndSet(Optional.empty());
            C58838bb.m90884s(optional.isPresent(), "non-IDLE completer was missing!");
            ((C2164c) optional.get()).mo5437b((Object) null);
            this.f103486q = C60866ct.f164955a;
        }
        this.f103491v = i;
        this.f103482m.ifPresent(new C39346u(i));
    }
}
