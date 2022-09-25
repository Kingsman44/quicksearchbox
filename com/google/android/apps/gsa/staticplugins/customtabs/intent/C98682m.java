package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98634q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20638ab;
import com.google.android.libraries.p1703d.C20639ac;
import com.google.android.libraries.p1703d.C20652h;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60492rx;
import dagger.C68214a;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.m */
/* compiled from: PG */
public final class C98682m {

    /* renamed from: a */
    public static final C59071e f275646a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.intent.m");

    /* renamed from: b */
    public final C98634q f275647b;

    /* renamed from: c */
    public final Context f275648c;

    /* renamed from: d */
    public final SharedPreferences f275649d;

    /* renamed from: e */
    public final C68214a f275650e;

    /* renamed from: f */
    public final C98685p f275651f;

    /* renamed from: g */
    public final C98684o f275652g;

    /* renamed from: h */
    public final C22871g f275653h;

    /* renamed from: i */
    public final C22871g f275654i;

    /* renamed from: j */
    public final C22871g f275655j;

    /* renamed from: k */
    public final C68214a f275656k;

    /* renamed from: l */
    public final C58881cr f275657l;

    /* renamed from: m */
    public final C89917a f275658m;

    /* renamed from: n */
    private final C69464a f275659n;

    /* renamed from: o */
    private final C98573i f275660o;

    /* renamed from: p */
    private final C98686q f275661p;

    public C98682m(C98634q qVar, Context context, SharedPreferences sharedPreferences, C68214a aVar, C98573i iVar, C69464a aVar2, C98685p pVar, C98684o oVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar3, C68214a aVar4, C98686q qVar2, C89917a aVar5) {
        this.f275647b = qVar;
        this.f275648c = context;
        this.f275649d = sharedPreferences;
        this.f275650e = aVar;
        this.f275660o = iVar;
        this.f275659n = aVar2;
        this.f275651f = pVar;
        this.f275652g = oVar;
        this.f275653h = gVar;
        this.f275654i = gVar2;
        this.f275655j = gVar3;
        this.f275656k = aVar3;
        this.f275657l = C58886cw.m90973a(new C98679j(aVar4));
        this.f275661p = qVar2;
        this.f275658m = aVar5;
    }

    /* renamed from: b */
    public static boolean m163467b(C60492rx rxVar) {
        return rxVar == C60492rx.YES_IMPLICIT || rxVar == C60492rx.YES_USER_DEFAULT || rxVar == C60492rx.YES_OVERRIDE || rxVar == C60492rx.YES_FORCED;
    }

    /* renamed from: a */
    public final C98681l mo91257a(Intent intent) {
        C60492rx rxVar;
        C60492rx rxVar2;
        C60492rx rxVar3;
        if (!intent.hasCategory("android.intent.category.BROWSABLE") || intent.getSelector() != null || intent.getData() == null) {
            return C98681l.m163462d();
        }
        C68214a aVar = (C68214a) this.f275659n.mo17428b();
        if (intent.getPackage() == null || C90721ae.f253800i.contains(intent.getPackage()) || TextUtils.equals(intent.getPackage(), ((C98574j) aVar.mo27525b()).mo91180b())) {
            C98680k kVar = new C98680k(intent);
            if (!this.f275660o.mo91196f() || kVar.mo91255a()) {
                C98574j jVar = (C98574j) aVar.mo27525b();
                String b = jVar.mo91180b();
                if (b == null) {
                    C59104x b2 = f275646a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "CustomTabsInterceptor");
                    ((C59052c) ((C59052c) b2).mo56372aa(19198)).mo56386p("Using default browser since there are no Custom Tabs browsers");
                    this.f275660o.mo91193c();
                    return C98681l.m163461c(C60492rx.NO_NO_CUSTOM_TABS_BROWSERS);
                }
                C98572h a = this.f275660o.mo91191a();
                if (a == null || !TextUtils.equals(a.f57882c.mo25582b(), b)) {
                    C59104x b3 = f275646a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "CustomTabsInterceptor");
                    ((C59052c) ((C59052c) b3).mo56372aa(19187)).mo56386p("Stale browser information. Not using Custom Tabs.");
                    C98573i iVar = this.f275660o;
                    C20638ab d = C20639ac.m38733d();
                    ((C20652h) d).f57903a = b;
                    C98572h hVar = new C98572h(iVar, d.mo25585a(), false);
                    iVar.mo91194d(hVar);
                    a = hVar;
                }
                if (!a.f57882c.mo25583f() && !kVar.mo91255a()) {
                    C58976aa aaVar = C58975e.f156826a;
                    C59104x b4 = f275646a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "CustomTabsInterceptor");
                    ((C59052c) ((C59052c) b4).mo56372aa(19197)).mo56386p("Using the default browser because CCT browser has not been used.");
                    return C98681l.m163461c(C60492rx.NO_BROWSER_FIRST_RUN_NOT_DONE);
                } else if (a.mo91188i()) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C59104x b5 = f275646a.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "CustomTabsInterceptor");
                    ((C59052c) ((C59052c) b5).mo56372aa(19195)).mo56386p("Using the default browser because CCT browser is not compatible.");
                    return C98681l.m163461c(C60492rx.NO_ACCOUNT_MISMATCH_TOAST_NOT_SUPPORTED);
                } else {
                    List a2 = this.f275661p.mo91262a(intent);
                    if (a2.isEmpty()) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        return C98681l.m163461c(C60492rx.NO_UNRESOLVED_INTENT);
                    }
                    PackageManager packageManager = this.f275648c.getPackageManager();
                    C90476a aVar2 = C91018d.f254254a;
                    ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
                    resolveActivity.getClass();
                    C58976aa aaVar4 = C58975e.f156826a;
                    if (resolveActivity.match <= 0 || !C98686q.m163479b(resolveActivity, jVar)) {
                        if (resolveActivity.match > 0 && !kVar.mo91255a()) {
                            return C98681l.m163461c(C60492rx.NO_NON_BROWSER_APP_DEFAULT);
                        }
                        if (C98686q.m163480c(a2, jVar) && !kVar.mo91255a()) {
                            return C98681l.m163461c(C60492rx.NO_MULTIPLE_APPS_NO_DEFAULT);
                        }
                        if (kVar.f275644a) {
                            rxVar = C60492rx.YES_FORCED;
                        } else {
                            rxVar = C60492rx.YES_IMPLICIT;
                        }
                        return C98681l.m163463e(rxVar, a);
                    } else if (resolveActivity.activityInfo.packageName.equals(b)) {
                        if (kVar.f275644a) {
                            rxVar3 = C60492rx.YES_FORCED;
                        } else {
                            rxVar3 = C60492rx.YES_USER_DEFAULT;
                        }
                        return C98681l.m163463e(rxVar3, a);
                    } else {
                        if (kVar.f275644a) {
                            rxVar2 = C60492rx.YES_FORCED;
                        } else {
                            rxVar2 = C60492rx.YES_OVERRIDE;
                        }
                        return C98681l.m163463e(rxVar2, a);
                    }
                }
            } else {
                C58976aa aaVar5 = C58975e.f156826a;
                return C98681l.m163461c(C60492rx.NO_USER_OPTED_OUT);
            }
        } else {
            C58976aa aaVar6 = C58975e.f156826a;
            return C98681l.m163462d();
        }
    }
}
