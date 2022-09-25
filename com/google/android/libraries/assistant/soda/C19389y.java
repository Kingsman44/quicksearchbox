package com.google.android.libraries.assistant.soda;

import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.soda.data.C19283a;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.android.libraries.p1963i.C23849ax;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.speech.p5208h.C66668eh;
import com.google.speech.p5208h.C66669ei;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66963fz;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66965ga;
import com.google.speech.p5218j.C66971gg;
import com.google.speech.p5218j.C66984gt;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66986gv;
import com.google.speech.p5218j.C66987gw;
import com.google.speech.p5218j.C66994hc;
import com.google.speech.p5218j.C66996he;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66998hg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67114lo;
import com.google.speech.p5218j.C67115lp;
import com.google.speech.p5218j.C67125lz;
import com.google.speech.p5218j.C67134mh;
import com.google.speech.p5218j.C67135mi;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.C67153n;
import com.google.speech.p5218j.C67168no;
import com.google.speech.p5218j.C67169np;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66742i;
import com.google.speech.p5218j.p5219a.C66743j;
import com.google.speech.p5218j.p5219a.C66744k;
import com.google.speech.p5218j.p5219a.C66745l;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.io.File;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.soda.y */
/* compiled from: PG */
public final class C19389y {

    /* renamed from: a */
    public static final C59071e f54228a = C59071e.m91332i("com.google.android.libraries.assistant.soda.y");

    /* renamed from: A */
    private final C66764ae f54229A;

    /* renamed from: B */
    private final C66971gg f54230B;

    /* renamed from: C */
    private final C58833ax f54231C;

    /* renamed from: D */
    private final int f54232D;

    /* renamed from: E */
    private final C58833ax f54233E;

    /* renamed from: F */
    private final String f54234F;

    /* renamed from: G */
    private final String f54235G;

    /* renamed from: b */
    public final String f54236b;

    /* renamed from: c */
    public final boolean f54237c;

    /* renamed from: d */
    public final boolean f54238d;

    /* renamed from: e */
    public final C67153n f54239e;

    /* renamed from: f */
    public final C58833ax f54240f;

    /* renamed from: g */
    public final boolean f54241g;

    /* renamed from: h */
    public final C60888db f54242h;

    /* renamed from: i */
    final C60887da f54243i;

    /* renamed from: j */
    public String f54244j;

    /* renamed from: k */
    private final String f54245k;

    /* renamed from: l */
    private final String f54246l;

    /* renamed from: m */
    private final String f54247m;

    /* renamed from: n */
    private final boolean f54248n;

    /* renamed from: o */
    private final boolean f54249o;

    /* renamed from: p */
    private final boolean f54250p;

    /* renamed from: q */
    private final boolean f54251q;

    /* renamed from: r */
    private final boolean f54252r;

    /* renamed from: s */
    private final boolean f54253s;

    /* renamed from: t */
    private final C66996he f54254t;

    /* renamed from: u */
    private final boolean f54255u;

    /* renamed from: v */
    private final boolean f54256v;

    /* renamed from: w */
    private final boolean f54257w;

    /* renamed from: x */
    private final C66964g f54258x;

    /* renamed from: y */
    private final C19347o f54259y;

    /* renamed from: z */
    private final C19283a f54260z;

    public C19389y(C19388x xVar, C60888db dbVar, C58833ax axVar, C58833ax axVar2, C60887da daVar, Map map) {
        this.f54245k = xVar.mo24412n();
        this.f54246l = xVar.mo24411m();
        this.f54247m = xVar.mo24407i();
        this.f54236b = xVar.mo24409k();
        this.f54248n = xVar.mo24418t();
        this.f54237c = xVar.mo24424y();
        this.f54238d = xVar.mo24414p();
        this.f54249o = xVar.mo24425z();
        this.f54250p = xVar.mo24415q();
        this.f54251q = xVar.mo24396A();
        this.f54252r = xVar.mo24423x();
        this.f54253s = xVar.mo24417s();
        this.f54254t = xVar.mo24405h();
        this.f54255u = xVar.mo24422w();
        this.f54256v = xVar.mo24420u();
        this.f54257w = xVar.mo24421v();
        this.f54258x = xVar.mo24400d();
        this.f54259y = xVar.mo24398b();
        this.f54260z = xVar.mo24399c();
        this.f54229A = xVar.mo24403f();
        this.f54230B = xVar.mo24404g();
        this.f54239e = xVar.mo24401e();
        this.f54232D = xVar.mo24397a();
        this.f54242h = C23849ax.m44396a(dbVar);
        this.f54231C = axVar;
        this.f54240f = axVar2;
        this.f54243i = daVar;
        this.f54241g = xVar.mo24416r();
        this.f54233E = C58833ax.m90833j((C19348p) map.get(xVar.mo24408j()));
        this.f54234F = xVar.mo24413o();
        this.f54235G = xVar.mo24410l();
    }

    /* renamed from: k */
    private final C66999hh m36969k() {
        C67125lz lzVar;
        C66998hg g = C19245ah.m36699g(this.f54245k, this.f54246l, this.f54247m);
        C66985gu guVar = ((C66999hh) g.instance).f182131c;
        if (guVar == null) {
            guVar = C66985gu.f182075h;
        }
        C66984gt gtVar = (C66984gt) guVar.toBuilder();
        boolean z = this.f54248n;
        gtVar.copyOnWrite();
        C66985gu guVar2 = (C66985gu) gtVar.instance;
        guVar2.f182077a |= 4096;
        guVar2.f182083g = z;
        g.copyOnWrite();
        C66999hh hhVar = (C66999hh) g.instance;
        C66985gu guVar3 = (C66985gu) gtVar.build();
        guVar3.getClass();
        hhVar.f182131c = guVar3;
        hhVar.f182129a |= 2;
        C66997hf hfVar = ((C66999hh) g.instance).f182132d;
        if (hfVar == null) {
            hfVar = C66997hf.f182099z;
        }
        C66994hc hcVar = (C66994hc) hfVar.toBuilder();
        boolean z2 = this.f54249o;
        hcVar.copyOnWrite();
        C66997hf hfVar2 = (C66997hf) hcVar.instance;
        hfVar2.f182102a |= 65536;
        hfVar2.f182116o = z2;
        boolean z3 = this.f54250p;
        hcVar.copyOnWrite();
        C66997hf hfVar3 = (C66997hf) hcVar.instance;
        hfVar3.f182102a |= C89885b.HTTP_VALUE;
        hfVar3.f182118q = z3;
        boolean z4 = this.f54252r;
        hcVar.copyOnWrite();
        C66997hf hfVar4 = (C66997hf) hcVar.instance;
        hfVar4.f182102a |= 1024;
        hfVar4.f182110i = z4;
        boolean z5 = this.f54253s;
        hcVar.copyOnWrite();
        C66997hf hfVar5 = (C66997hf) hcVar.instance;
        hfVar5.f182103b |= 32;
        hfVar5.f182126y = z5;
        boolean z6 = this.f54256v;
        hcVar.copyOnWrite();
        C66997hf hfVar6 = (C66997hf) hcVar.instance;
        hfVar6.f182103b |= 1;
        hfVar6.f182125x = z6;
        boolean z7 = this.f54257w;
        hcVar.copyOnWrite();
        C66997hf hfVar7 = (C66997hf) hcVar.instance;
        hfVar7.f182102a |= C89885b.S3REQUEST_VALUE;
        hfVar7.f182117p = z7;
        C66964g gVar = this.f54258x;
        hcVar.copyOnWrite();
        C66997hf hfVar8 = (C66997hf) hcVar.instance;
        hfVar8.f182119r = gVar.f182026k;
        hfVar8.f182102a |= 1048576;
        if (this.f54254t != null) {
            hcVar.copyOnWrite();
            C66997hf hfVar9 = (C66997hf) hcVar.instance;
            hfVar9.f182102a |= 16777216;
            hfVar9.f182120s = true;
            C66996he heVar = this.f54254t;
            hcVar.copyOnWrite();
            C66997hf hfVar10 = (C66997hf) hcVar.instance;
            hfVar10.f182121t = heVar.f182097c;
            hfVar10.f182102a |= 33554432;
            boolean z8 = this.f54255u;
            hcVar.copyOnWrite();
            C66997hf hfVar11 = (C66997hf) hcVar.instance;
            hfVar11.f182102a |= 67108864;
            hfVar11.f182122u = z8;
        }
        C66971gg ggVar = this.f54230B;
        if (ggVar != null) {
            hcVar.copyOnWrite();
            C66997hf hfVar12 = (C66997hf) hcVar.instance;
            hfVar12.f182123v = ggVar;
            hfVar12.f182102a |= 1073741824;
        }
        if (!this.f54234F.isEmpty()) {
            C67134mh mhVar = (C67134mh) C67135mi.f182484c.createBuilder();
            String str = this.f54234F;
            mhVar.copyOnWrite();
            C67135mi miVar = (C67135mi) mhVar.instance;
            str.getClass();
            miVar.f182486a |= 2;
            miVar.f182487b = str;
            hcVar.copyOnWrite();
            C66997hf hfVar13 = (C66997hf) hcVar.instance;
            C67135mi miVar2 = (C67135mi) mhVar.build();
            miVar2.getClass();
            hfVar13.f182108g = miVar2;
            hfVar13.f182102a |= 256;
        }
        if (!this.f54235G.isEmpty()) {
            String str2 = this.f54235G;
            hcVar.copyOnWrite();
            C66997hf hfVar14 = (C66997hf) hcVar.instance;
            str2.getClass();
            hfVar14.f182102a |= LinearLayoutManager.INVALID_OFFSET;
            hfVar14.f182124w = str2;
        }
        g.copyOnWrite();
        C66999hh hhVar2 = (C66999hh) g.instance;
        C66997hf hfVar15 = (C66997hf) hcVar.build();
        hfVar15.getClass();
        hhVar2.f182132d = hfVar15;
        hhVar2.f182129a |= 4;
        C67115lp lpVar = ((C66999hh) g.instance).f182139k;
        if (lpVar == null) {
            lpVar = C67115lp.f182448d;
        }
        C67114lo loVar = (C67114lo) lpVar.toBuilder();
        boolean z9 = this.f54251q;
        loVar.copyOnWrite();
        C67115lp lpVar2 = (C67115lp) loVar.instance;
        lpVar2.f182450a |= 1;
        lpVar2.f182451b = z9;
        if (this.f54248n) {
            lzVar = C67125lz.TEXT_INDEPENDENT;
        } else {
            lzVar = C67125lz.DEFAULT_TEXT_DEPENDENT;
        }
        loVar.copyOnWrite();
        C67115lp lpVar3 = (C67115lp) loVar.instance;
        lpVar3.f182452c = lzVar.f182473c;
        lpVar3.f182450a |= 2;
        g.copyOnWrite();
        C66999hh hhVar3 = (C66999hh) g.instance;
        C67115lp lpVar4 = (C67115lp) loVar.build();
        lpVar4.getClass();
        hhVar3.f182139k = lpVar4;
        hhVar3.f182129a |= 1024;
        C66764ae aeVar = this.f54229A;
        if (aeVar != null) {
            g.copyOnWrite();
            C66999hh hhVar4 = (C66999hh) g.instance;
            hhVar4.f182138j = aeVar;
            hhVar4.f182129a |= 512;
        }
        if (this.f54245k.isEmpty()) {
            g.copyOnWrite();
            C66999hh hhVar5 = (C66999hh) g.instance;
            hhVar5.f182132d = null;
            hhVar5.f182129a &= -5;
        }
        if (this.f54236b != null) {
            C66987gw gwVar = ((C66999hh) g.instance).f182134f;
            if (gwVar == null) {
                gwVar = C66987gw.f182085b;
            }
            C66986gv gvVar = (C66986gv) gwVar.toBuilder();
            gvVar.mo59760a(this.f54236b);
            g.copyOnWrite();
            C66999hh hhVar6 = (C66999hh) g.instance;
            C66987gw gwVar2 = (C66987gw) gvVar.build();
            gwVar2.getClass();
            hhVar6.f182134f = gwVar2;
            hhVar6.f182129a |= 32;
        }
        C66965ga gaVar = ((C66999hh) g.instance).f182130b;
        if (gaVar == null) {
            gaVar = C66965ga.f182027c;
        }
        C66963fz fzVar = (C66963fz) gaVar.toBuilder();
        C66965ga gaVar2 = ((C66999hh) g.instance).f182130b;
        if (gaVar2 == null) {
            gaVar2 = C66965ga.f182027c;
        }
        C67175t tVar = gaVar2.f182030b;
        if (tVar == null) {
            tVar = C67175t.f182588e;
        }
        C67172q qVar = (C67172q) tVar.toBuilder();
        int i = this.f54232D;
        qVar.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = i;
        fzVar.copyOnWrite();
        C66965ga gaVar3 = (C66965ga) fzVar.instance;
        C67175t tVar3 = (C67175t) qVar.build();
        tVar3.getClass();
        gaVar3.f182030b = tVar3;
        gaVar3.f182029a |= 1;
        g.copyOnWrite();
        C66999hh hhVar7 = (C66999hh) g.instance;
        C66965ga gaVar4 = (C66965ga) fzVar.build();
        gaVar4.getClass();
        hhVar7.f182130b = gaVar4;
        hhVar7.f182129a |= 1;
        C67153n nVar = this.f54239e;
        if (nVar != null) {
            g.copyOnWrite();
            C66999hh hhVar8 = (C66999hh) g.instance;
            hhVar8.f182137i = nVar;
            hhVar8.f182129a |= 256;
        }
        return (C66999hh) this.f54233E.mo56106b(new C19349q()).mo56109e((C66999hh) g.build());
    }

    /* renamed from: a */
    public final C60870cx mo24528a(int i, int i2, InputStream inputStream, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        C19351s sVar = new C19351s(this, i, i2, inputStream, axVar, axVar2, axVar3);
        return C60856cj.m92905n(C47810es.m84965e(sVar), this.f54242h);
    }

    /* renamed from: b */
    public final C67152mz mo24529b() {
        if (mo24536i()) {
            try {
                ((C19241ad) this.f54240f.mo56107c()).mo24349p();
            } catch (IllegalStateException e) {
                ((C59052c) ((C59052c) ((C59052c) f54228a.mo56225c()).mo56382g(e)).mo56372aa(47648)).mo56386p("SODA failed to stop capturing; simply deleting SODA");
                ((C19241ad) this.f54240f.mo56107c()).mo24340l();
            }
        }
        if (!mo24536i() || ((C19241ad) this.f54240f.mo56107c()).mo24354u(m36969k())) {
            mo24532e();
            return mo24530c();
        }
        if (this.f54259y != null) {
            ((C19241ad) this.f54240f.mo56107c()).mo24348o(this.f54259y);
        } else {
            ((C59052c) ((C59052c) f54228a.mo56226d()).mo56372aa(47646)).mo56386p("No soda callback provided. Events will not be reported back");
        }
        return C67152mz.NO_ERROR;
    }

    /* renamed from: c */
    public final C67152mz mo24530c() {
        if (!this.f54240f.mo56113h()) {
            ((C59052c) ((C59052c) f54228a.mo56226d()).mo56372aa(47656)).mo56386p("Not connecting: SODA not present");
            return C67152mz.UNDEFINED_BEHAVIOR;
        }
        if (this.f54245k.isEmpty()) {
            ((C59052c) ((C59052c) f54228a.mo56226d()).mo56372aa(47655)).mo56386p("SODA resources directory string is empty; skipping the check for the existence of LP");
        } else {
            String[] list = new File(this.f54245k).list();
            if (list == null || list.length == 0) {
                ((C59052c) ((C59052c) f54228a.mo56225c()).mo56372aa(47654)).mo56386p("Invalid config: empty SODA resources directory");
                return C67152mz.INVALID_CONFIG;
            }
        }
        C66999hh k = m36969k();
        C19258c cVar = new C19258c();
        cVar.mo24390b(k);
        if (this.f54251q) {
            if (this.f54231C.mo56113h()) {
                cVar.f53966a = C58833ax.m90834k((SodaTransportFactory) this.f54231C.mo56107c());
            } else {
                ((C59052c) ((C59052c) f54228a.mo56225c()).mo56372aa(47653)).mo56386p("No SodaTransportFactory provided but attempting to upload audios.");
                return C67152mz.INVALID_CONFIG;
            }
        }
        C19283a aVar = this.f54260z;
        if (aVar != null) {
            cVar.f53967b = C58833ax.m90834k(aVar);
        }
        C67152mz a = C67152mz.m97427a(((C19241ad) this.f54240f.mo56107c()).mo24331g(cVar.mo24391c()).f182527b);
        if (a == null) {
            a = C67152mz.NO_ERROR;
        }
        C59071e eVar = f54228a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(47651)).mo56389s("Initialized SODA with status: %s", a);
        if (a != C67152mz.NO_ERROR) {
            return a;
        }
        if (this.f54259y != null) {
            ((C19241ad) this.f54240f.mo56107c()).mo24348o(this.f54259y);
        } else {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(47652)).mo56386p("No soda callback provided. Events will not be reported back");
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C66752s mo24531d() {
        C66744k kVar = (C66744k) C66745l.f181530c.createBuilder();
        C66742i iVar = (C66742i) C66743j.f181525d.createBuilder();
        C67175t tVar = (C67175t) C19245ah.m36697e().build();
        iVar.copyOnWrite();
        C66743j jVar = (C66743j) iVar.instance;
        tVar.getClass();
        jVar.f181528b = tVar;
        jVar.f181527a |= 2;
        C66743j jVar2 = (C66743j) iVar.build();
        kVar.copyOnWrite();
        C66745l lVar = (C66745l) kVar.instance;
        jVar2.getClass();
        lVar.f181533b = jVar2;
        lVar.f181532a = 2;
        C66745l lVar2 = (C66745l) kVar.build();
        C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
        rVar.copyOnWrite();
        C66752s sVar = (C66752s) rVar.instance;
        lVar2.getClass();
        sVar.f181550e = lVar2;
        sVar.f181546a |= 8;
        rVar.copyOnWrite();
        C66752s sVar2 = (C66752s) rVar.instance;
        sVar2.f181546a |= 1;
        int i = 0;
        sVar2.f181547b = false;
        boolean z = this.f54237c;
        rVar.copyOnWrite();
        C66752s sVar3 = (C66752s) rVar.instance;
        sVar3.f181546a = 2 | sVar3.f181546a;
        sVar3.f181548c = z;
        if (true == this.f54238d) {
            i = 500;
        }
        rVar.copyOnWrite();
        C66752s sVar4 = (C66752s) rVar.instance;
        sVar4.f181546a |= 128;
        sVar4.f181554i = i;
        rVar.copyOnWrite();
        C66752s sVar5 = (C66752s) rVar.instance;
        sVar5.f181546a |= 1;
        sVar5.f181547b = true;
        if (this.f54251q && !TextUtils.isEmpty(this.f54244j)) {
            C66668eh ehVar = (C66668eh) C66669ei.f181356c.createBuilder();
            String str = this.f54244j;
            ehVar.copyOnWrite();
            C66669ei eiVar = (C66669ei) ehVar.instance;
            str.getClass();
            eiVar.f181359a |= 1;
            eiVar.f181360b = str;
            C66669ei eiVar2 = (C66669ei) ehVar.build();
            C67168no noVar = (C67168no) C67169np.f182570c.createBuilder();
            noVar.copyOnWrite();
            C67169np npVar = (C67169np) noVar.instance;
            eiVar2.getClass();
            npVar.f182574b = eiVar2;
            npVar.f182573a |= 1;
            rVar.mo58885m(C67169np.f182571d, (C67169np) noVar.build());
        }
        return (C66752s) rVar.build();
    }

    /* renamed from: e */
    public final void mo24532e() {
        if (mo24536i()) {
            ((C19241ad) this.f54240f.mo56107c()).mo24340l();
        }
    }

    /* renamed from: f */
    public final void mo24533f() {
        C60870cx a = this.f54242h.mo19398a(C47810es.m84977q(new C19384t(this)));
        C19386v vVar = new C19386v();
        C60856cj.m92911t(a, C47810es.m84974n(vVar), this.f54243i);
    }

    /* renamed from: g */
    public final void mo24534g(C62910ar arVar) {
        if (mo24536i()) {
            ((C19241ad) this.f54240f.mo56107c()).mo24350q(arVar);
        }
    }

    /* renamed from: h */
    public final void mo24535h() {
        this.f54242h.mo19398a(C47810es.m84977q(new C19350r(this)));
    }

    /* renamed from: i */
    public final boolean mo24536i() {
        return this.f54240f.mo56113h() && ((C19241ad) this.f54240f.mo56107c()).mo24355v();
    }

    /* renamed from: j */
    public final boolean mo24537j() {
        return mo24536i() && ((C19241ad) this.f54240f.mo56107c()).mo24356w();
    }
}
