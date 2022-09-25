package com.google.android.apps.gsa.search.core.carassistant.p6782e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.e.c */
/* compiled from: PG */
public final class C85710c {

    /* renamed from: a */
    public static final C59071e f231767a = C59071e.m91332i("com.google.android.apps.gsa.search.core.carassistant.e.c");

    /* renamed from: b */
    public final C86124t f231768b;

    /* renamed from: c */
    public final C68214a f231769c;

    /* renamed from: d */
    public final C68214a f231770d;

    /* renamed from: e */
    private final C68214a f231771e;

    /* renamed from: f */
    private final C68214a f231772f;

    public C85710c(C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f231768b = tVar;
        this.f231769c = aVar;
        this.f231771e = aVar2;
        this.f231772f = aVar3;
        this.f231770d = aVar4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e3, code lost:
        if (com.google.common.base.C58890d.m90990e(r1, java.util.Locale.getDefault().toLanguageTag()) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0126  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo79343a() {
        /*
            r7 = this;
            dagger.a r0 = r7.f231772f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.v r0 = (com.google.android.apps.gsa.shared.util.C91123v) r0
            boolean r0 = r0.mo85390b()
            r1 = 0
            java.lang.String r2 = "AssistantLocaleSettings"
            if (r0 == 0) goto L_0x004f
            boolean r0 = r7.mo79347e()
            if (r0 == 0) goto L_0x0040
            dagger.a r0 = r7.f231770d     // Catch:{ RuntimeException -> 0x002c }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ RuntimeException -> 0x002c }
            com.google.android.libraries.storage.protostore.ab r0 = (com.google.android.libraries.storage.protostore.C42876ab) r0     // Catch:{ RuntimeException -> 0x002c }
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()     // Catch:{ RuntimeException -> 0x002c }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ RuntimeException -> 0x002c }
            com.google.android.apps.gsa.search.core.carassistant.e.a.d r0 = (com.google.android.apps.gsa.search.core.carassistant.p6782e.p6783a.C85708d) r0     // Catch:{ RuntimeException -> 0x002c }
            java.lang.String r1 = r0.f231762b     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x0071
        L_0x002c:
            r0 = move-exception
            com.google.common.f.e r3 = f231767a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            java.lang.String r4 = "Error fetching profile user primary locale string."
            r5 = 7572(0x1d94, float:1.061E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0071
        L_0x0040:
            dagger.a r0 = r7.f231769c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0
            java.lang.String r3 = "aae_settings_primary_language"
            java.lang.String r1 = r0.getString(r3, r1)
            goto L_0x0071
        L_0x004f:
            dagger.a r0 = r7.f231771e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r0
            java.lang.String r0 = r0.mo79659F()
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)
            dagger.a r3 = r7.f231769c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r3 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r3
            java.lang.String r4 = "language_settings_primary_assistant_language:"
            java.lang.String r0 = r4.concat(r0)
            java.lang.String r1 = r3.getString(r0, r1)
        L_0x0071:
            if (r1 == 0) goto L_0x00e5
            dagger.a r0 = r7.f231772f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.v r0 = (com.google.android.apps.gsa.shared.util.C91123v) r0
            boolean r0 = r0.mo85390b()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r7.mo79347e()
            r3 = 0
            if (r0 == 0) goto L_0x00b1
            dagger.a r0 = r7.f231770d     // Catch:{ RuntimeException -> 0x009d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ RuntimeException -> 0x009d }
            com.google.android.libraries.storage.protostore.ab r0 = (com.google.android.libraries.storage.protostore.C42876ab) r0     // Catch:{ RuntimeException -> 0x009d }
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()     // Catch:{ RuntimeException -> 0x009d }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ RuntimeException -> 0x009d }
            com.google.android.apps.gsa.search.core.carassistant.e.a.d r0 = (com.google.android.apps.gsa.search.core.carassistant.p6782e.p6783a.C85708d) r0     // Catch:{ RuntimeException -> 0x009d }
            boolean r3 = r0.f231761a     // Catch:{ RuntimeException -> 0x009d }
            goto L_0x00bf
        L_0x009d:
            r0 = move-exception
            com.google.common.f.e r4 = f231767a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            java.lang.String r5 = "Error fetching profile user secondary locale string."
            r6 = 7577(0x1d99, float:1.0618E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            goto L_0x00bf
        L_0x00b1:
            dagger.a r0 = r7.f231769c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r0 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r0
            java.lang.String r4 = "aae_settings_user_picked_assistant_LOCALE"
            boolean r3 = r0.getBoolean(r4, r3)
        L_0x00bf:
            com.google.common.f.e r0 = f231767a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5 = 7576(0x1d98, float:1.0616E-41)
            java.lang.String r6 = "User pick assistant locale: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r6, r4)
            if (r3 != 0) goto L_0x00ff
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLanguageTag()
            boolean r0 = com.google.common.base.C58890d.m90990e(r1, r0)
            if (r0 != 0) goto L_0x00ff
        L_0x00e5:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.toLanguageTag()
            com.google.common.f.e r0 = f231767a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r2)
            java.lang.String r3 = "Detected discrepancy between System Language and Assistant Language"
            r4 = 7567(0x1d8f, float:1.0604E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x00ff:
            boolean r0 = r7.mo79345c(r1)
            if (r0 != 0) goto L_0x0159
            dagger.a r0 = r7.f231772f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.util.v r0 = (com.google.android.apps.gsa.shared.util.C91123v) r0
            boolean r0 = r0.mo85390b()
            if (r0 == 0) goto L_0x0159
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f231768b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250519q
            boolean r0 = r0.mo79746e(r3)
            if (r0 != 0) goto L_0x0126
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r0.toLanguageTag()
            goto L_0x0159
        L_0x0126:
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f231768b
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250309ah
            com.google.common.b.hd r0 = r0.mo79752r(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0157
            java.lang.Object r3 = r0.mo56107c()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r7.mo79345c(r3)
            if (r3 == 0) goto L_0x0157
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56107c()
            java.lang.Object r0 = r0.mo56107c()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0159
        L_0x0157:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0159:
            com.google.common.f.e r0 = f231767a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r2)
            java.lang.String r2 = "Retrieved the primary assistant language: %s"
            r3 = 7568(0x1d90, float:1.0605E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c.mo79343a():java.lang.String");
    }

    /* renamed from: b */
    public final Locale mo79344b() {
        List i = C58869cf.m90936b(new C58903m('-')).mo56155i(mo79343a().replace('_', '-'));
        if (i.size() == 2) {
            return new Locale((String) i.get(0), (String) i.get(1));
        }
        C58976aa aaVar = C58975e.f156826a;
        mo79343a();
        return Locale.US;
    }

    /* renamed from: c */
    public final boolean mo79345c(String str) {
        C58485gu guVar;
        if (((C91123v) this.f231772f.mo27525b()).mo85390b()) {
            guVar = this.f231768b.mo79745c(C90086ek.f250381c);
        } else {
            guVar = this.f231768b.mo79745c(C90086ek.f250407cZ);
        }
        return guVar.contains(str);
    }

    /* renamed from: d */
    public final boolean mo79346d() {
        return this.f231768b.mo79746e(C90086ek.f250519q) && !mo79345c(mo79343a());
    }

    /* renamed from: e */
    public final boolean mo79347e() {
        return this.f231768b.mo79746e(C90086ek.f250272X);
    }
}
