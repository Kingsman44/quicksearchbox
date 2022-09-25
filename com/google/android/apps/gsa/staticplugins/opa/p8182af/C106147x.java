package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.accounts.Account;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.C108782dp;
import com.google.android.apps.gsa.staticplugins.opa.C108783dq;
import com.google.android.apps.gsa.staticplugins.opa.util.C113764ag;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.x */
/* compiled from: PG */
public final class C106147x {

    /* renamed from: a */
    public final C106146w f296233a;

    /* renamed from: b */
    public final C106127d f296234b;

    /* renamed from: c */
    public final C68214a f296235c;

    /* renamed from: d */
    public C106118a f296236d = null;

    /* renamed from: e */
    public boolean f296237e;

    /* renamed from: f */
    public final C108783dq f296238f;

    /* renamed from: g */
    public final C108782dp f296239g;

    /* renamed from: h */
    private final C68214a f296240h;

    /* renamed from: i */
    private final C68214a f296241i;

    /* renamed from: j */
    private final C68214a f296242j;

    /* renamed from: k */
    private final C86124t f296243k;

    /* renamed from: l */
    private final Activity f296244l;

    /* renamed from: m */
    private final C68214a f296245m;

    public C106147x(C108782dp dpVar, C108783dq dqVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C106146w wVar, C106127d dVar, C86124t tVar, Activity activity, C68214a aVar5) {
        this.f296239g = dpVar;
        this.f296238f = dqVar;
        this.f296240h = aVar;
        this.f296241i = aVar2;
        this.f296235c = aVar3;
        this.f296242j = aVar4;
        this.f296233a = wVar;
        this.f296234b = dVar;
        this.f296243k = tVar;
        this.f296244l = activity;
        this.f296245m = aVar5;
        this.f296237e = false;
    }

    /* renamed from: a */
    public final void mo95320a() {
        C106118a aVar = this.f296236d;
        if (aVar != null) {
            aVar.mo95290b();
        }
    }

    /* renamed from: b */
    public final boolean mo95321b() {
        C106118a aVar = this.f296236d;
        return aVar != null && aVar.mo95291c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r0 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r5.f296244l.getIntent().getExtras());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95322c() {
        /*
            r5 = this;
            dagger.a r0 = r5.f296245m
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.settings.shared.m r0 = (com.google.android.apps.gsa.assistant.settings.shared.m) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0086
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f296243k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90044cw.f248737l
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0019
            goto L_0x0054
        L_0x0019:
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f296243k
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90044cw.f248736k
            long r0 = r0.mo79743a(r1)
            int r1 = (int) r0
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.assistant.shared.l.e.a(r1)
            android.app.Activity r1 = r5.f296244l
            android.content.Intent r1 = r1.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r1)
            java.lang.String r2 = ","
            com.google.common.base.cf r2 = com.google.common.base.C58869cf.m90938d(r2)
            com.google.android.apps.gsa.search.core.i.t r3 = r5.f296243k
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90044cw.f248734i
            java.lang.String r3 = r3.mo79758x(r4)
            java.util.List r2 = r2.mo56155i(r3)
            if (r1 == r0) goto L_0x0054
            int r0 = r1.ca
            java.lang.String r0 = java.lang.Integer.toString(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0086
        L_0x0054:
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f296243k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90044cw.f248731f
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x006c
            dagger.a r0 = r5.f296242j
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.k r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113880k) r0
            boolean r0 = r0.mo100740f()
            if (r0 != 0) goto L_0x0086
        L_0x006c:
            boolean r0 = r5.f296237e
            if (r0 != 0) goto L_0x0086
            android.app.Activity r0 = r5.f296244l
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            int r0 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r0)
            r1 = 1
            if (r0 == r1) goto L_0x0086
            r2 = 7
            if (r0 != r2) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            return r1
        L_0x0086:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8182af.C106147x.mo95322c():boolean");
    }

    /* renamed from: d */
    public final boolean mo95323d(Bundle bundle) {
        return mo95324e(bundle) != 1;
    }

    /* renamed from: e */
    public final int mo95324e(Bundle bundle) {
        Account a;
        if (mo95322c()) {
            return 2;
        }
        if (!this.f296243k.mo79746e(C90037cp.f248418Z) || (a = ((C86054o) this.f296241i.mo27525b()).mo79668a()) == null) {
            return 1;
        }
        String languageTag = ((ae) this.f296240h.mo27525b()).d(a.name).toLanguageTag();
        int i = ((SharedPreferences) this.f296235c.mo27525b()).getInt("opa_fre_language_picker_dismiss_count", 0);
        int a2 = (int) this.f296243k.mo79743a(C90037cp.f248433aN);
        String string = ((SharedPreferences) this.f296235c.mo27525b()).getString("opa_fre_language_picker_user_selection", BuildConfig.FLAVOR);
        if (string.length() > 0) {
            if (string.equals(languageTag)) {
                if (!((ae) this.f296240h.mo27525b()).g(Locale.forLanguageTag(languageTag))) {
                    return 3;
                }
                if ((!this.f296243k.mo79746e(C90037cp.f248570cs) || C87566i.m142259aG(bundle)) && !((SharedPreferences) this.f296235c.mo27525b()).getBoolean("opa_fre_language_picker_phone_language_supported_shown", false)) {
                    String languageTag2 = Locale.getDefault().toLanguageTag();
                    if (languageTag2.equals(languageTag) || !C113764ag.m188330a(languageTag2, this.f296243k)) {
                        return 1;
                    }
                    return 4;
                }
            }
            return 1;
        } else if (!C87566i.m142300ax(this.f296244l.getIntent().getExtras()) && i >= a2) {
            return 1;
        } else {
            if (C113764ag.m188330a(languageTag, this.f296243k) && !this.f296243k.mo79746e(C90037cp.f248435aP)) {
                return 1;
            }
            return 2;
        }
    }
}
