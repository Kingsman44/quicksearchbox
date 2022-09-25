package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100934q;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5228m.C67251a;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67271ab;
import com.google.speech.p5228m.C67272ac;
import com.google.speech.p5228m.C67273ad;
import com.google.speech.p5228m.C67274ae;
import com.google.speech.p5228m.C67318bv;
import com.google.speech.p5228m.C67319bw;
import com.google.speech.p5228m.C67320bx;
import com.google.speech.p5228m.C67327cd;
import com.google.speech.p5228m.C67337cn;
import com.google.speech.p5228m.C67340d;
import com.google.speech.p5228m.C67341e;
import com.google.speech.p5228m.C67342f;
import com.google.speech.p5228m.C67343g;
import com.google.speech.p5228m.C67345i;
import com.google.speech.p5228m.C67354r;
import com.google.speech.p5228m.C67355s;
import com.google.speech.p5228m.C67356t;
import com.google.speech.p5228m.C67357u;
import com.google.speech.p5228m.C67362z;
import dagger.C68214a;
import java.util.Collections;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.o */
/* compiled from: PG */
public final class C100784o {

    /* renamed from: a */
    public static final C59071e f281692a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.o");

    /* renamed from: b */
    public final C68214a f281693b;

    /* renamed from: c */
    private final Context f281694c;

    /* renamed from: d */
    private final String f281695d;

    /* renamed from: e */
    private final C100721ad f281696e;

    /* renamed from: f */
    private final C100770ai f281697f;

    /* renamed from: g */
    private final C69464a f281698g;

    public C100784o(Context context, String str, C100721ad adVar, C100770ai aiVar, C68214a aVar, C69464a aVar2) {
        this.f281694c = context;
        this.f281695d = str;
        this.f281696e = adVar;
        this.f281697f = aiVar;
        this.f281693b = aVar;
        this.f281698g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo92047a(String str) {
        return ((C100719ab) this.f281693b.mo27525b()).mo92021e(str);
    }

    /* renamed from: b */
    public final C60870cx mo92048b() {
        ((C59052c) ((C59052c) f281692a.mo56224b()).mo56372aa(19533)).mo56386p("getEkhoParamsAsync()");
        return C47633f.m84733g(((C100719ab) this.f281693b.mo27525b()).mo92020d()).mo51515h(new C100781l(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo92049c() {
        C100742h c = C100742h.m166944c(((C100719ab) this.f281693b.mo27525b()).mo92020d());
        C100770ai aiVar = this.f281697f;
        Objects.requireNonNull(aiVar);
        C100742h d = c.mo92034d(new C100779j(aiVar));
        d.mo92038i(C100780k.f281688a);
        return d.f281631a;
    }

    /* renamed from: d */
    public final C67270aa mo92050d(C132800h hVar, boolean z) {
        if (!hVar.f362334b.isEmpty()) {
            C67362z zVar = (C67362z) C67270aa.f182856g.createBuilder();
            String g = mo92053g(hVar.f362334b);
            zVar.copyOnWrite();
            C67270aa aaVar = (C67270aa) zVar.instance;
            aaVar.f182858a |= 1;
            aaVar.f182859b = g;
            zVar.copyOnWrite();
            C67270aa aaVar2 = (C67270aa) zVar.instance;
            aaVar2.f182858a |= 2;
            aaVar2.f182860c = z;
            C67272ac e = mo92051e(hVar);
            zVar.copyOnWrite();
            C67270aa aaVar3 = (C67270aa) zVar.instance;
            e.getClass();
            aaVar3.f182862e = e;
            aaVar3.f182858a |= 32;
            C67337cn a = this.f281697f.mo92043a(hVar);
            zVar.copyOnWrite();
            C67270aa aaVar4 = (C67270aa) zVar.instance;
            a.getClass();
            aaVar4.f182861d = a;
            aaVar4.f182858a |= 8;
            zVar.copyOnWrite();
            C67270aa aaVar5 = (C67270aa) zVar.instance;
            aaVar5.f182858a |= 64;
            aaVar5.f182863f = true;
            return (C67270aa) zVar.build();
        }
        throw new IllegalStateException("account cannot be empty for ekho params.");
    }

    /* renamed from: e */
    public final C67272ac mo92051e(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        int i = 1;
        boolean z = false;
        boolean z2 = wVar.f362366b && this.f281696e.mo92028c(hVar);
        boolean a = ((C100934q) this.f281698g.mo17428b()).mo92101b(hVar).mo24611a();
        ((C59052c) ((C59052c) f281692a.mo56224b()).mo56372aa(19534)).mo56389s("If ASR p13n cache is allowed: %b", Boolean.valueOf(a));
        C67251a aVar = (C67251a) C67341e.f183034i.createBuilder();
        boolean z3 = z2 && wVar.f362367c;
        aVar.copyOnWrite();
        C67341e eVar = (C67341e) aVar.instance;
        eVar.f183037a |= 1;
        eVar.f183038b = z3;
        if (z2 && wVar.f362368d) {
            z = true;
        }
        aVar.copyOnWrite();
        C67341e eVar2 = (C67341e) aVar.instance;
        eVar2.f183037a |= 2;
        eVar2.f183039c = z;
        aVar.mo59781a(Collections.unmodifiableMap(wVar.f362369e));
        long j = wVar.f362371g;
        aVar.copyOnWrite();
        C67341e eVar3 = (C67341e) aVar.instance;
        eVar3.f183037a |= 8;
        eVar3.f183042f = j;
        aVar.copyOnWrite();
        C67341e eVar4 = (C67341e) aVar.instance;
        eVar4.f183037a |= 4;
        eVar4.f183040d = a;
        C132818z zVar2 = hVar.f362336d;
        if (zVar2 == null) {
            zVar2 = C132818z.f362393h;
        }
        boolean z4 = zVar2.f362401g;
        aVar.copyOnWrite();
        C67341e eVar5 = (C67341e) aVar.instance;
        eVar5.f183037a |= 32;
        eVar5.f183043g = z4;
        C132818z zVar3 = hVar.f362336d;
        if (zVar3 == null) {
            zVar3 = C132818z.f362393h;
        }
        C132815w wVar2 = zVar3.f362397c;
        if (wVar2 == null) {
            wVar2 = C132815w.f362363x;
        }
        int a2 = C67340d.m97452a(wVar2.f362386v);
        if (a2 != 0) {
            i = a2;
        }
        aVar.copyOnWrite();
        C67341e eVar6 = (C67341e) aVar.instance;
        eVar6.f183044h = i - 1;
        eVar6.f183037a |= 64;
        C67354r rVar = (C67354r) C67355s.f183081a.createBuilder();
        rVar.mo58885m(C67341e.f183035j, (C67341e) aVar.build());
        C67355s sVar = (C67355s) rVar.build();
        C67271ab abVar = (C67271ab) C67272ac.f182865c.createBuilder();
        abVar.copyOnWrite();
        C67272ac acVar = (C67272ac) abVar.instance;
        sVar.getClass();
        acVar.f182868b = sVar;
        acVar.f182867a |= 2;
        return (C67272ac) abVar.build();
    }

    /* renamed from: f */
    public final C67274ae mo92052f(C132800h hVar) {
        C67342f fVar = (C67342f) C67343g.f183045g.createBuilder();
        String str = Build.MODEL;
        fVar.copyOnWrite();
        C67343g gVar = (C67343g) fVar.instance;
        str.getClass();
        gVar.f183048a |= 1;
        gVar.f183049b = str;
        int i = Build.VERSION.SDK_INT;
        fVar.copyOnWrite();
        C67343g gVar2 = (C67343g) fVar.instance;
        gVar2.f183048a |= 2;
        gVar2.f183050c = i;
        String str2 = this.f281695d;
        fVar.copyOnWrite();
        C67343g gVar3 = (C67343g) fVar.instance;
        str2.getClass();
        gVar3.f183048a |= 4;
        gVar3.f183051d = str2;
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        int a = C67345i.m97453a(wVar.f362372h);
        if (a == 0) {
            a = 1;
        }
        fVar.copyOnWrite();
        C67343g gVar4 = (C67343g) fVar.instance;
        gVar4.f183052e = a - 1;
        gVar4.f183048a |= 8;
        C132818z zVar2 = hVar.f362336d;
        if (zVar2 == null) {
            zVar2 = C132818z.f362393h;
        }
        C132815w wVar2 = zVar2.f362397c;
        if (wVar2 == null) {
            wVar2 = C132815w.f362363x;
        }
        boolean z = wVar2.f362379o;
        fVar.copyOnWrite();
        C67343g gVar5 = (C67343g) fVar.instance;
        gVar5.f183048a |= 16;
        gVar5.f183053f = z;
        C67343g gVar6 = (C67343g) fVar.build();
        C132818z zVar3 = hVar.f362336d;
        if (zVar3 == null) {
            zVar3 = C132818z.f362393h;
        }
        C132815w wVar3 = zVar3.f362397c;
        if (wVar3 == null) {
            wVar3 = C132815w.f362363x;
        }
        C67319bw bwVar = (C67319bw) C67320bx.f182979e.createBuilder();
        C67327cd cdVar = wVar3.f362380p;
        if (cdVar == null) {
            cdVar = C67327cd.f182998h;
        }
        bwVar.copyOnWrite();
        C67320bx bxVar = (C67320bx) bwVar.instance;
        cdVar.getClass();
        bxVar.f182983b = cdVar;
        bxVar.f182982a |= 1;
        C67318bv bvVar = wVar3.f362381q;
        if (bvVar == null) {
            bvVar = C67318bv.f182974d;
        }
        bwVar.copyOnWrite();
        C67320bx bxVar2 = (C67320bx) bwVar.instance;
        bvVar.getClass();
        bxVar2.f182984c = bvVar;
        bxVar2.f182982a |= 2;
        C67356t tVar = (C67356t) C67357u.f183084a.createBuilder();
        tVar.mo58885m(C67343g.f183046h, gVar6);
        tVar.mo58885m(C67320bx.f182980f, (C67320bx) bwVar.build());
        C67357u uVar = (C67357u) tVar.build();
        C67273ad adVar = (C67273ad) C67274ae.f182870c.createBuilder();
        adVar.copyOnWrite();
        C67274ae aeVar = (C67274ae) adVar.instance;
        uVar.getClass();
        aeVar.f182873b = uVar;
        aeVar.f182872a |= 1;
        return (C67274ae) adVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo92053g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C60790c.m92793a(this.f281694c.getNoBackupFilesDir().getAbsolutePath(), "fedass", String.format("training_cache_%s", new Object[]{str}));
        }
        throw new IllegalArgumentException("accountName cannot be empty for ekho dir path.");
    }
}
