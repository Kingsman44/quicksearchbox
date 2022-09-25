package com.google.android.apps.gsa.staticplugins.recently;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6786e.C85765a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86790e;
import com.google.android.apps.gsa.search.core.state.p6864a.C86801p;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88338xz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88340ya;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88341yb;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98635r;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97278ah;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97280c;
import com.google.android.apps.gsa.staticplugins.recently.p8680c.C116040g;
import com.google.android.apps.gsa.staticplugins.recently.p8680c.C116041h;
import com.google.android.apps.gsa.staticplugins.recently.p8681d.C116048d;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22837h;
import com.google.android.libraries.gsa.p1875j.C22838i;
import com.google.android.libraries.gsa.p1875j.C22841l;
import com.google.android.libraries.gsa.p1875j.C22842m;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.h */
/* compiled from: PG */
public final class C116093h extends C86734a implements C85089a {

    /* renamed from: a */
    public static final C59071e f321893a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.h");

    /* renamed from: b */
    public final Context f321894b;

    /* renamed from: c */
    public final C21370a f321895c;

    /* renamed from: f */
    public final C116048d f321896f;

    /* renamed from: g */
    public final C86054o f321897g;

    /* renamed from: h */
    public final C86124t f321898h;

    /* renamed from: i */
    public final SharedPreferences f321899i;

    /* renamed from: j */
    public final ContentResolver f321900j;

    /* renamed from: k */
    public final C85765a f321901k;

    /* renamed from: l */
    public final C68214a f321902l;

    /* renamed from: m */
    public final C86790e f321903m;

    /* renamed from: n */
    private final C86610af f321904n;

    /* renamed from: o */
    private final C85923cq f321905o;

    /* renamed from: p */
    private final C22871g f321906p;

    /* renamed from: q */
    private final C116041h f321907q;

    /* renamed from: r */
    private final C86801p f321908r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116093h(Context context, C21370a aVar, C116048d dVar, C86054o oVar, C86610af afVar, C85923cq cqVar, C86124t tVar, SharedPreferences sharedPreferences, C22871g gVar, ContentResolver contentResolver, C85765a aVar2, C68214a aVar3, C86790e eVar, C116041h hVar, C86801p pVar) {
        super(C118575h.WORKER_RECENTLY, "recently");
        this.f321894b = context;
        this.f321895c = aVar;
        this.f321896f = dVar;
        this.f321897g = oVar;
        this.f321904n = afVar;
        this.f321905o = cqVar;
        this.f321898h = tVar;
        this.f321899i = sharedPreferences;
        this.f321906p = gVar;
        this.f321900j = contentResolver;
        this.f321901k = aVar2;
        this.f321902l = aVar3;
        this.f321903m = eVar;
        this.f321907q = hVar;
        this.f321908r = pVar;
        dVar.mo102435e();
    }

    /* renamed from: u */
    public static C22832c m192483u(long j, String str) {
        C22832c cVar = (C22832c) C22845p.f62890o.createBuilder();
        long nextLong = C90719ac.f253778a.f253779b.nextLong();
        cVar.copyOnWrite();
        C22845p pVar = (C22845p) cVar.instance;
        pVar.f62892a |= 1;
        pVar.f62893b = nextLong;
        cVar.copyOnWrite();
        C22845p pVar2 = (C22845p) cVar.instance;
        pVar2.f62892a |= 2048;
        pVar2.f62903l = j;
        cVar.copyOnWrite();
        C22845p pVar3 = (C22845p) cVar.instance;
        pVar3.f62892a |= 4;
        pVar3.f62895d = j;
        cVar.copyOnWrite();
        C22845p pVar4 = (C22845p) cVar.instance;
        str.getClass();
        pVar4.f62892a |= 8;
        pVar4.f62896e = str;
        return cVar;
    }

    /* renamed from: a */
    public final C60870cx mo78697a(C86387ai aiVar, C89356b bVar) {
        C86124t tVar = (C86124t) this.f321907q.f321782a.mo17428b();
        tVar.getClass();
        aiVar.getClass();
        return C60856cj.m92900i(new C116040g(tVar, aiVar, bVar, this));
    }

    /* renamed from: b */
    public final C60870cx mo78698b() {
        if (!mo102479v()) {
            return C60856cj.m92900i(BuildConfig.FLAVOR);
        }
        return this.f321906p.mo28201a("getRecentlyDir", new C116033c(this));
    }

    /* renamed from: c */
    public final C60870cx mo78699c(String str) {
        C60870cx a = this.f321896f.mo102431a(str);
        return C60922j.m93044g(C60856cj.m92893b(a).mo57334a(new C116043d(this, a), C60826bg.f164896a), C116017a.f321698a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo78700d(C58833ax axVar) {
        this.f321908r.mo80497e(axVar);
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78701e(String str, LongSparseArray longSparseArray, long j) {
        return this.f321896f.mo102432b(str, longSparseArray, j);
    }

    /* renamed from: f */
    public final C60870cx mo78702f(String str, LongSparseArray longSparseArray, long j) {
        return this.f321896f.mo102433c(str, longSparseArray, j);
    }

    /* renamed from: g */
    public final void mo78703g() {
        String F = this.f321897g.mo79659F();
        if (F != null) {
            this.f321896f.mo102437g(F);
        }
    }

    /* renamed from: h */
    public final void mo78704h(long[] jArr, String str) {
        if (mo102479v()) {
            this.f321896f.mo102438h(jArr, str);
        }
    }

    /* renamed from: i */
    public final void mo78705i(String str) {
        if (mo102479v()) {
            this.f321896f.mo102439i(str);
        }
    }

    /* renamed from: j */
    public final void mo78706j(DoodleData doodleData) {
        String F;
        if (mo102479v() && (F = this.f321897g.mo79659F()) != null) {
            String queryParameter = Uri.parse(doodleData.f252941g).getQueryParameter("q");
            if (queryParameter == null) {
                queryParameter = doodleData.f252939e;
            }
            C22832c u = m192483u(this.f321895c.mo26870b(), queryParameter);
            u.copyOnWrite();
            C22845p pVar = (C22845p) u.instance;
            C22845p pVar2 = C22845p.f62890o;
            pVar.f62894c = 10;
            pVar.f62892a |= 2;
            C22837h hVar = (C22837h) C22838i.f62869h.createBuilder();
            String str = doodleData.f252942h;
            hVar.copyOnWrite();
            C22838i iVar = (C22838i) hVar.instance;
            str.getClass();
            iVar.f62871a |= 1;
            iVar.f62872b = str;
            int i = doodleData.f252945k;
            hVar.copyOnWrite();
            C22838i iVar2 = (C22838i) hVar.instance;
            iVar2.f62871a |= 2;
            iVar2.f62873c = i;
            String str2 = doodleData.f252939e;
            hVar.copyOnWrite();
            C22838i iVar3 = (C22838i) hVar.instance;
            str2.getClass();
            iVar3.f62871a |= 4;
            iVar3.f62874d = str2;
            int i2 = doodleData.f252938d;
            hVar.copyOnWrite();
            C22838i iVar4 = (C22838i) hVar.instance;
            iVar4.f62871a |= 32;
            iVar4.f62877g = i2;
            Uri uri = doodleData.f252950p;
            if (uri != null) {
                String uri2 = uri.toString();
                hVar.copyOnWrite();
                C22838i iVar5 = (C22838i) hVar.instance;
                uri2.getClass();
                iVar5.f62871a |= 8;
                iVar5.f62875e = uri2;
                int i3 = doodleData.f252952r;
                hVar.copyOnWrite();
                C22838i iVar6 = (C22838i) hVar.instance;
                iVar6.f62871a |= 16;
                iVar6.f62876f = i3;
            }
            byte[] bArr = doodleData.f252957w;
            if (bArr != null && bArr.length > 0) {
                this.f321896f.mo102440j(bArr, ((C22845p) u.instance).f62893b);
                long j = ((C22845p) u.instance).f62893b;
                u.copyOnWrite();
                C22845p pVar3 = (C22845p) u.instance;
                pVar3.f62892a |= 128;
                pVar3.f62899h = j;
            }
            C116048d dVar = this.f321896f;
            u.copyOnWrite();
            C22845p pVar4 = (C22845p) u.instance;
            C22838i iVar7 = (C22838i) hVar.build();
            iVar7.getClass();
            pVar4.f62901j = iVar7;
            pVar4.f62892a |= 512;
            dVar.mo102436f((C22845p) u.build(), F);
        }
    }

    /* renamed from: k */
    public final void mo78707k(String str, String str2, Bitmap bitmap) {
        if (mo102479v()) {
            long b = this.f321895c.mo26870b();
            String F = this.f321897g.mo79659F();
            if (F != null) {
                C22832c u = m192483u(b, str);
                u.copyOnWrite();
                C22845p pVar = (C22845p) u.instance;
                C22845p pVar2 = C22845p.f62890o;
                pVar.f62894c = 0;
                pVar.f62892a |= 2;
                C22841l lVar = (C22841l) C22842m.f62879d.createBuilder();
                lVar.copyOnWrite();
                C22842m mVar = (C22842m) lVar.instance;
                str2.getClass();
                mVar.f62881a |= 1;
                mVar.f62882b = str2;
                String replaceFirst = this.f321905o.mo83211i().replaceFirst("^www\\.", BuildConfig.FLAVOR);
                lVar.copyOnWrite();
                C22842m mVar2 = (C22842m) lVar.instance;
                replaceFirst.getClass();
                mVar2.f62881a |= 2;
                mVar2.f62883c = replaceFirst;
                u.copyOnWrite();
                C22845p pVar3 = (C22845p) u.instance;
                C22842m mVar3 = (C22842m) lVar.build();
                mVar3.getClass();
                pVar3.f62898g = mVar3;
                pVar3.f62892a |= 64;
                mo102480w(u, bitmap, 2, F);
            }
        }
    }

    /* renamed from: l */
    public final void mo78708l() {
        this.f321899i.edit().putLong("cct_account_mismatch_timestamp", 0).putBoolean("cct_account_mismatch_removed", true).apply();
    }

    /* renamed from: m */
    public final void mo78709m(String str, String str2) {
        if (mo102479v()) {
            C88340ya yaVar = (C88340ya) C88341yb.f238907d.createBuilder();
            yaVar.copyOnWrite();
            C88341yb ybVar = (C88341yb) yaVar.instance;
            str.getClass();
            ybVar.f238909a |= 1;
            ybVar.f238910b = str;
            yaVar.copyOnWrite();
            C88341yb ybVar2 = (C88341yb) yaVar.instance;
            str2.getClass();
            ybVar2.f238909a |= 2;
            ybVar2.f238911c = str2;
            C87684al alVar = new C87684al(C88244um.TAKE_RECENTLY_SCREENSHOT);
            alVar.mo81965b(C88338xz.f238906a, (C88341yb) yaVar.build());
            this.f321904n.mo80228i(alVar.mo81964a());
        }
    }

    /* renamed from: n */
    public final C60870cx mo78710n(String str, C97278ah ahVar) {
        return this.f321896f.mo102441k(str, ahVar);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: p */
    public final C60870cx mo78711p(String str, C97280c cVar) {
        return this.f321896f.mo102442l(str, cVar);
    }

    /* renamed from: q */
    public final void mo78712q(String str, C98635r rVar, int i) {
        String F;
        String c = rVar.mo91238c();
        if (!TextUtils.isEmpty(c) && (F = this.f321897g.mo79659F()) != null) {
            this.f321906p.mo28212l("Get screenshot", new C116024b(this, rVar, str, c, F, i));
        }
    }

    /* renamed from: v */
    public final boolean mo102479v() {
        return this.f321899i.getBoolean("use_recently", true);
    }

    /* renamed from: w */
    public final void mo102480w(C22832c cVar, Bitmap bitmap, int i, String str) {
        if (bitmap == null) {
            this.f321896f.mo102436f((C22845p) cVar.build(), str);
        } else {
            new C90873ag(this.f321896f.mo102443m(bitmap, ((C22845p) cVar.instance).f62893b, i), this.f321906p, "Save screenshot", new C116079f(this, cVar, str)).mo85223a(new C116089g(this, cVar, str));
        }
    }
}
