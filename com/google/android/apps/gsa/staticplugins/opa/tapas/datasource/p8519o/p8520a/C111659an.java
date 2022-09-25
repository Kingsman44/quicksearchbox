package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113115a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113263ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.an */
/* compiled from: PG */
public final class C111659an implements C111674k {

    /* renamed from: a */
    private static final C59071e f310427a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.an");

    /* renamed from: b */
    private final C113206m f310428b;

    /* renamed from: c */
    private final PackageManager f310429c;

    /* renamed from: d */
    private final C22871g f310430d;

    /* renamed from: e */
    private final C86124t f310431e;

    /* renamed from: f */
    private final C112037ao f310432f;

    /* renamed from: g */
    private final C113115a f310433g;

    public C111659an(C113206m mVar, Context context, C22871g gVar, C86124t tVar, C112037ao aoVar, C113115a aVar) {
        this.f310428b = mVar;
        this.f310429c = context.getPackageManager();
        this.f310430d = gVar;
        this.f310431e = tVar;
        this.f310432f = aoVar;
        this.f310433g = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo99200b(C48578al alVar, String str) {
        if (str.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        String str2 = alVar.f125508b;
        Optional c = C113148bf.m187156c(alVar);
        if (c.isEmpty()) {
            C59104x c2 = f310427a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OpenAppIntProc");
            ((C59052c) ((C59052c) c2).mo56372aa(27350)).mo56389s("Suggestion %s: Interpretation not found!", str2);
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C112036an a = this.f310432f.mo99348a((C48570ad) c.get());
        if (!a.mo99346j()) {
            C59104x c3 = f310427a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "OpenAppIntProc");
            ((C59052c) ((C59052c) c3).mo56372aa(27349)).mo56389s("Suggestion %s: Intent not found!", str2);
            return C60856cj.m92900i(C58485gu.m89845m());
        } else if (this.f310431e.mo79746e(C90063do.f249548fc)) {
            return this.f310430d.mo28201a("Create open app suggestion with slow disk fetch", new C111658am(this, alVar, a));
        } else {
            return C60856cj.m92900i(mo99202c(alVar, a));
        }
    }

    /* renamed from: c */
    public final C58485gu mo99202c(C48578al alVar, C112036an anVar) {
        String str;
        String str2 = alVar.f125508b;
        Optional g = this.f310428b.mo99848g(anVar.mo99339a("appAnnotation", "app"));
        if (g.isEmpty()) {
            C59104x c = f310427a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpenAppIntProc");
            ((C59052c) ((C59052c) c).mo56372aa(27348)).mo56389s("Suggestion %s: No installed and enabled package found in intent!", str2);
            return C58485gu.m89845m();
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) g.get();
        String str3 = applicationInfo.packageName;
        Intent launchIntentForPackage = this.f310429c.getLaunchIntentForPackage(str3);
        if (launchIntentForPackage == null) {
            C59104x c2 = f310427a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OpenAppIntProc");
            ((C59052c) ((C59052c) c2).mo56372aa(27347)).mo56354G("Suggestion %s: Launch intent not found for package name %s", str2, str3);
            return C58485gu.m89845m();
        }
        C113263ap apVar = new C113263ap();
        apVar.f313629a = Optional.m71637of(C113259al.m187317b(this.f310429c.getApplicationIcon(applicationInfo)));
        apVar.f313630b = Optional.m71637of(launchIntentForPackage);
        C113284bi a = apVar.mo99958a();
        if (this.f310431e.mo79746e(C90063do.f249497ee)) {
            str = ((CharSequence) this.f310428b.mo99847f(str3).orElse(this.f310429c.getApplicationLabel(applicationInfo).toString())).toString();
        } else {
            str = this.f310429c.getApplicationLabel(applicationInfo).toString();
        }
        C113414ey R = C113415ez.m187750R();
        R.mo100180y(20010);
        R.mo100177v(C48580an.ICON_SHORTCUT);
        R.mo100167l(20010);
        R.mo100164i(str);
        C113386e eVar = (C113386e) R;
        eVar.f313957e = Optional.m71637of(a);
        R.mo100175t(C48672ag.TAPAS_SERVER);
        R.mo100174s((double) ((Float) C113148bf.m187159f(alVar).orElse(Float.valueOf(0.0f))).floatValue());
        R.mo100173r(this.f310433g.mo99841a(str, str3));
        eVar.f313956d = Optional.m71637of(alVar);
        return C58485gu.m89846n(R.mo100156a());
    }
}
