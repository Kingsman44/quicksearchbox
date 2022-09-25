package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113185cp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113260am;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113278bc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48576aj;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.C48752j;
import com.google.assistant.p3781ad.p3789d.C48763u;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.ar */
/* compiled from: PG */
public final class C111663ar implements C111674k {

    /* renamed from: a */
    private final C86124t f310434a;

    /* renamed from: b */
    private final C113206m f310435b;

    /* renamed from: c */
    private final C68214a f310436c;

    /* renamed from: d */
    private final C68214a f310437d;

    /* renamed from: e */
    private final C68214a f310438e;

    public C111663ar(C86124t tVar, C113206m mVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f310434a = tVar;
        this.f310435b = mVar;
        this.f310436c = aVar;
        this.f310437d = aVar2;
        this.f310438e = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo99200b(C48578al alVar, String str) {
        if (!this.f310434a.mo79746e(C90063do.f249378cR)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (alVar.f125508b.isEmpty() || alVar.f125509c.size() == 0) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        Optional e = C113148bf.m187158e((C48576aj) alVar.f125509c.get(0));
        if (e.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C48752j jVar = ((C48763u) e.get()).f126180g;
        if (jVar == null) {
            jVar = C48752j.f126144f;
        }
        ((C111248k) this.f310436c.mo27525b()).mo99076a(C111255r.SEARCH_X_ON_Y, String.format("AndroidIntentSuggestion for '%s':\n%s", new Object[]{alVar.f125508b, jVar}));
        String str2 = jVar.f126147b;
        if (TextUtils.isEmpty(str2)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String str3 = jVar.f126146a;
        if (TextUtils.isEmpty(str3) || !this.f310435b.mo99854m(str3)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String str4 = jVar.f126148c;
        if (TextUtils.isEmpty(str4)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C48752j jVar2 = ((C48763u) e.get()).f126180g;
        if (jVar2 == null) {
            jVar2 = C48752j.f126144f;
        }
        String str5 = jVar2.f126150e;
        if (TextUtils.isEmpty(str5)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String replace = (jVar.f126149d.isEmpty() ? alVar.f125508b : jVar.f126149d).replace("search for ", BuildConfig.FLAVOR).replace(" on ".concat(String.valueOf(C58890d.m90988c(str4.replace("search on ", BuildConfig.FLAVOR)))), BuildConfig.FLAVOR);
        C58976aa aaVar = C58975e.f156826a;
        String str6 = alVar.f125508b;
        C113414ey R = C113415ez.m187750R();
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        R.mo100175t(C48672ag.TAPAS_SERVER);
        R.mo100167l(10001);
        R.mo100180y(20040);
        C113386e eVar = (C113386e) R;
        eVar.f313956d = Optional.m71637of(alVar);
        C113260am amVar = new C113260am();
        amVar.f313623a = Optional.m71637of(str2);
        amVar.f313624b = Optional.m71637of(str3);
        eVar.f313961i = Optional.m71637of(amVar.mo99950a());
        C113278bc bcVar = new C113278bc();
        bcVar.f313715a = Optional.m71637of(str3);
        bcVar.f313716b = Optional.m71637of(str5);
        bcVar.f313717c = Optional.m71637of(replace);
        bcVar.f313718d = Optional.m71637of(str4);
        eVar.f313958f = Optional.m71637of(bcVar.mo100062a());
        R.mo100177v(C48580an.SEARCH_X_ON_Y);
        eVar.f313953a = replace + " - " + str4;
        C58490gz gzVar = new C58490gz(4);
        String c = C58890d.m90988c(replace);
        C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
        hVar.mo99420b(c + " - " + C58890d.m90988c(str4), 1.0f);
        hVar.mo99420b(c + " - " + str3, 1.0f);
        if (this.f310434a.mo79746e(C90063do.f249443dd)) {
            String c2 = ((C113185cp) this.f310437d.mo27525b()).mo99900c(c, C113185cp.m187204b(((bm) this.f310438e.mo27525b()).b()), C48580an.SEARCH_X_ON_Y);
            hVar.mo99420b(c2 + " - " + str3, 1.0f);
            hVar.mo99420b(c2 + " - " + str4, 1.0f);
        }
        gzVar.mo55429h(C112142i.DISPLAY_TEXT, (C112144k) hVar.build());
        if (this.f310434a.mo79746e(C90063do.f249337bd) && !jVar.f126147b.isEmpty()) {
            C112142i iVar = C112142i.URI;
            C112141h hVar2 = (C112141h) C112144k.f311414b.createBuilder();
            hVar2.mo99420b(jVar.f126147b, 1.0f);
            gzVar.mo55429h(iVar, (C112144k) hVar2.build());
        }
        eVar.f313963k = gzVar.mo55427f(false);
        return C60856cj.m92900i(C58485gu.m89846n(R.mo100156a()));
    }
}
