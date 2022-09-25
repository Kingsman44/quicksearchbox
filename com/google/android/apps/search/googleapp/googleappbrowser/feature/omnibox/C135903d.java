package com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox;

import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.C137399c;
import com.google.android.apps.search.googleapp.search.C137404d;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46491l;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.contrib.p3629c.C46503x;
import com.google.apps.tiktok.contrib.p3629c.C46504y;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox.d */
/* compiled from: PG */
public final class C135903d {

    /* renamed from: a */
    public final AccountId f370135a;

    /* renamed from: b */
    public final C135901b f370136b;

    /* renamed from: c */
    public final C136012b f370137c;

    /* renamed from: d */
    public final C136012b f370138d;

    /* renamed from: e */
    public final C136012b f370139e;

    /* renamed from: f */
    public final C28306ab f370140f;

    /* renamed from: g */
    public final C28443m f370141g;

    /* renamed from: h */
    public final C47770dh f370142h;

    /* renamed from: i */
    private final C46485f f370143i;

    /* renamed from: j */
    private final C43377v f370144j;

    public C135903d(AccountId accountId, C46485f fVar, C135901b bVar, C136012b bVar2, C136012b bVar3, C136012b bVar4, C43377v vVar, C28306ab abVar, C28443m mVar, C47770dh dhVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f370135a = accountId;
        this.f370143i = fVar;
        this.f370136b = bVar;
        this.f370137c = bVar2;
        this.f370138d = bVar3;
        this.f370139e = bVar4;
        this.f370144j = vVar;
        this.f370140f = abVar;
        this.f370141g = mVar;
        this.f370142h = dhVar;
    }

    /* renamed from: a */
    public final void mo112618a() {
        C46496q c = this.f370143i.mo50482c(this.f370136b);
        C46503x f = C46504y.m82902f(R.id.googleapp_search_fragment_destination);
        C137404d dVar = (C137404d) C137411e.f373755g.createBuilder();
        C69664n.m101060f(dVar, "newBuilder()");
        C137399c a = C69664n.m101061g(dVar, "builder");
        a.mo113704b(C139704d.GOOGLE_APP_BROWSER);
        C43376u a2 = this.f370144j.mo46468a();
        String str = a2.f113329b;
        if (str.length() == 0) {
            C43367l lVar = a2.f113335h;
            if (lVar == null) {
                lVar = C43367l.f113293h;
            }
            str = lVar.f113296b;
        }
        C69664n.m101060f(str, "webStateDataService.webS…ntUrl }\n                }");
        C69664n.m101061g(str, "value");
        C137404d dVar2 = a.f373724a;
        dVar2.copyOnWrite();
        C137411e eVar = (C137411e) dVar2.instance;
        str.getClass();
        eVar.f373757a |= 16;
        eVar.f373762f = str;
        ((C46491l) f).f121639c = C46490k.m82868a(a.mo113703a());
        c.mo50507c(f.mo50495a());
    }
}
