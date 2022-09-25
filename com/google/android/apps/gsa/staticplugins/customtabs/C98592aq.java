package com.google.android.apps.gsa.staticplugins.customtabs;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86134c;
import com.google.android.apps.gsa.search.core.p6807j.C86135d;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.search.core.state.p6872d.C86926at;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98667a;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98671b;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98672c;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98673d;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98675f;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98676g;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98677h;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98678i;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98681l;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98682m;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98684o;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.C98686q;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.p7713a.C98669b;
import com.google.android.apps.gsa.staticplugins.customtabs.intent.p7713a.C98670c;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98634q;
import com.google.android.apps.gsa.staticplugins.customtabs.p7711d.C98649a;
import com.google.android.apps.gsa.staticplugins.customtabs.p7711d.C98650b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60490rv;
import com.google.common.p4552o.C60492rx;
import com.google.common.p4552o.C60496sa;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.aq */
/* compiled from: PG */
public final class C98592aq implements C86134c {

    /* renamed from: a */
    private final C98650b f275360a;

    /* renamed from: b */
    private final C68214a f275361b;

    /* renamed from: c */
    private final C98667a f275362c;

    /* renamed from: d */
    private final C98686q f275363d;

    /* renamed from: e */
    private final C69464a f275364e;

    /* renamed from: f */
    private final C83559c f275365f;

    /* renamed from: g */
    private final C89336a f275366g;

    /* renamed from: h */
    private final C98670c f275367h;

    public C98592aq(C98650b bVar, C68214a aVar, C98667a aVar2, C98670c cVar, C98686q qVar, C69464a aVar3, C83559c cVar2, C89336a aVar4) {
        this.f275360a = bVar;
        this.f275361b = aVar;
        this.f275362c = aVar2;
        this.f275367h = cVar;
        this.f275363d = qVar;
        this.f275364e = aVar3;
        this.f275365f = cVar2;
        this.f275366g = aVar4;
    }

    /* renamed from: a */
    public final C86135d mo79784a(Intent intent) {
        C60870cx cxVar;
        Uri data;
        C98667a aVar = this.f275362c;
        if (aVar.f275623b.mo78108av() && (data = intent.getData()) != null) {
            intent.setData(aVar.mo91249a(data, aVar.f275622a.mo57444a()));
        }
        if (this.f275365f.mo76893d(this.f275366g.mo79659F()) && this.f275365f.f227865c.mo76896a() && intent.hasCategory("android.intent.category.BROWSABLE") && intent.getSelector() == null && intent.getData() != null && !intent.hasExtra("com.google.android.apps.gsa.customtabs.WITHOUT_CUSTOM_TABS")) {
            C98686q qVar = this.f275363d;
            C98574j jVar = (C98574j) this.f275364e.mo17428b();
            PackageManager packageManager = qVar.f275672a.getPackageManager();
            C90476a aVar2 = C91018d.f254254a;
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.match <= 0 ? !C98686q.m163480c(qVar.mo91262a(intent), jVar) : C98686q.m163479b(resolveActivity, jVar)) {
                C60492rx rxVar = (C60492rx) ((C98671b) ((C98682m) this.f275361b.mo27525b()).mo91257a(intent)).f275633a.mo56111f();
                if (rxVar == null || rxVar == C60492rx.NO_NO_CUSTOM_TABS_BROWSERS || rxVar == C60492rx.NO_BROWSER_FIRST_RUN_NOT_DONE || rxVar == C60492rx.NO_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED || !intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.FORCE_CCT", false)) {
                    intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED", false);
                    C98670c cVar = this.f275367h;
                    return C86135d.m138540c(cVar.f275628b.mo28209i(cVar.f275627a.mo79697b(), "Create Google App Browser Intent", new C98669b(cVar, intent)));
                }
            }
        }
        if (intent.hasExtra("google.app.browser.params.key")) {
            intent.removeExtra("google.app.browser.params.key");
        }
        C98682m mVar = (C98682m) this.f275361b.mo27525b();
        if (intent.hasExtra("com.google.android.apps.gsa.customtabs.WITHOUT_CUSTOM_TABS") || intent.hasExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED")) {
            return C86135d.m138541d(intent);
        }
        Intent intent2 = new Intent(intent);
        Uri data2 = intent2.getData();
        if (data2 != null && !C89917a.m146440a(intent2).mo56113h()) {
            C58833ax b = C89917a.m146441b(data2);
            Objects.requireNonNull(mVar.f275658m);
            intent2.putExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", ((Long) b.mo56108d(new C98672c())).longValue());
        }
        C98681l a = mVar.mo91257a(intent2);
        C58976aa aaVar = C58975e.f156826a;
        intent2.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_CUSTOMTABS_RESOLVED", a.mo91256f());
        if (a.mo91256f()) {
            int a2 = (int) ((C86124t) mVar.f275650e.mo27525b()).mo79743a(C90110fh.f250629aa);
            if (a2 == 0) {
                cxVar = C118826c.f331423b;
            } else {
                C22871g gVar = mVar.f275654i;
                C98634q qVar2 = mVar.f275647b;
                Objects.requireNonNull(qVar2);
                Class<CancellationException> cls = CancellationException.class;
                cxVar = C118826c.m197213c(C60922j.m93044g(C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(C90877ak.m148471e(gVar.mo28202b("ensurePreparedForSession", new C98675f(qVar2)), (long) a2, TimeUnit.MILLISECONDS, mVar.f275655j)), TimeoutException.class, new C98676g(a2), C60826bg.f164896a), cls, C98677h.f275641a, C60826bg.f164896a), new C98678i(mVar), C60826bg.f164896a));
            }
            return C86135d.m138540c(C60922j.m93044g(cxVar, new C98673d(mVar, intent2, a), C60826bg.f164896a));
        }
        intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        C58833ax axVar = ((C98671b) a).f275633a;
        if (axVar.mo56113h()) {
            C60555uf a3 = C98684o.m163471a(intent2, (C60492rx) axVar.mo56107c());
            C60548tz tzVar = (C60548tz) a3.toBuilder();
            C60496sa saVar = a3.f164103aJ;
            if (saVar == null) {
                saVar = C60496sa.f163764k;
            }
            C60490rv rvVar = (C60490rv) saVar.toBuilder();
            rvVar.copyOnWrite();
            C60496sa saVar2 = (C60496sa) rvVar.instance;
            saVar2.f163766a = 1 | saVar2.f163766a;
            saVar2.f163767b = false;
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            C60496sa saVar3 = (C60496sa) rvVar.build();
            saVar3.getClass();
            ufVar.f164103aJ = saVar3;
            ufVar.f164250e |= 33554432;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.CCT_NOT_LAUNCHED;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C58833ax a4 = C89917a.m146440a(intent2);
            if (a4.mo56113h()) {
                long longValue = ((Long) a4.mo56107c()).longValue();
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                cbVar.f160123d = 65536 | cbVar.f160123d;
                cbVar.f160085aW = longValue;
            }
            fVar.f246203c = (C59687cb) ajVar.build();
            ((C89859i) mVar.f275656k.mo27525b()).mo74236a(fVar.mo83699a());
        }
        return C86135d.m138541d(intent2);
    }

    /* renamed from: b */
    public final C86387ai mo79785b(C86387ai aiVar, C89356b bVar) {
        C98650b bVar2 = this.f275360a;
        C86124t tVar = (C86124t) bVar2.f275542a.mo17428b();
        tVar.getClass();
        C84624a aVar = (C84624a) bVar2.f275543b.mo17428b();
        aVar.getClass();
        C86926at atVar = (C86926at) bVar2.f275544c.mo17428b();
        atVar.getClass();
        return new C98649a(tVar, aVar, atVar, bVar, aiVar);
    }
}
