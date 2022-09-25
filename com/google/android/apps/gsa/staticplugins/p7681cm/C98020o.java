package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.accounts.Account;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C85653bd;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.o */
/* compiled from: PG */
final class C98020o extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final C68214a f273691a;

    /* renamed from: b */
    private final C85651bb f273692b;

    /* renamed from: c */
    private final C68214a f273693c;

    /* renamed from: d */
    private final C22871g f273694d;

    /* renamed from: e */
    private final C85653bd f273695e;

    /* renamed from: f */
    private final C86054o f273696f;

    /* renamed from: g */
    private SwitchPreference f273697g;

    /* renamed from: h */
    private SwitchPreference f273698h;

    /* renamed from: i */
    private boolean f273699i;

    /* renamed from: j */
    private boolean f273700j;

    public C98020o(C85651bb bbVar, C68214a aVar, C22871g gVar, C68214a aVar2, C85653bd bdVar, C86054o oVar) {
        this.f273692b = bbVar;
        this.f273693c = aVar;
        this.f273694d = gVar;
        this.f273691a = aVar2;
        this.f273695e = bdVar;
        this.f273696f = oVar;
    }

    /* renamed from: a */
    private final String m162277a() {
        Account a = this.f273696f.mo79668a();
        if (a != null) {
            return a.name;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82941c(android.preference.Preference r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getKey()
            int r1 = r0.hashCode()
            r2 = 462857737(0x1b96a609, float:2.4922716E-22)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 1885773017(0x70669cd9, float:2.8548468E29)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "feed_data_saver_preference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "show_interest_feed_preference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0050
            if (r0 == r3) goto L_0x002e
            return
        L_0x002e:
            android.preference.SwitchPreference r5 = (android.preference.SwitchPreference) r5
            r4.f273698h = r5
            com.google.android.apps.gsa.search.core.bb r0 = r4.f273692b
            boolean r0 = r0.mo79140M()
            r5.setEnabled(r0)
            android.preference.SwitchPreference r5 = r4.f273698h
            com.google.android.apps.gsa.search.core.bd r0 = r4.f273695e
            java.lang.String r1 = r4.m162277a()
            boolean r0 = r0.mo79170h(r1)
            r5.setChecked(r0)
            android.preference.SwitchPreference r5 = r4.f273698h
            r5.setOnPreferenceChangeListener(r4)
            return
        L_0x0050:
            android.preference.SwitchPreference r5 = (android.preference.SwitchPreference) r5
            r4.f273697g = r5
            com.google.android.apps.gsa.search.core.bb r0 = r4.f273692b
            boolean r0 = r0.mo79140M()
            r5.setChecked(r0)
            android.preference.SwitchPreference r5 = r4.f273697g
            r5.setOnPreferenceChangeListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7681cm.C98020o.mo82941c(android.preference.Preference):void");
    }

    /* renamed from: j */
    public final void mo82948j() {
        if (this.f273700j) {
            this.f273694d.mo28212l("forceInvalidate", new C98019n(this));
        }
        if (this.f273699i) {
            ((C91480f) this.f273693c.mo27525b()).mo85826f();
        }
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        if ("show_interest_feed_preference".equals(preference.getKey())) {
            C85651bb bbVar = this.f273692b;
            if (bbVar.f231497h.mo79746e(C90010bp.f246931a)) {
                return true;
            }
            if (!bbVar.f231500k.mo78198e() || ((C84474e) bbVar.f231500k.f229939a.mo27525b()).mo78083aA()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreferenceChange(android.preference.Preference r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getKey()
            int r0 = r6.hashCode()
            r1 = 462857737(0x1b96a609, float:2.4922716E-22)
            r2 = 1
            if (r0 == r1) goto L_0x001e
            r1 = 1885773017(0x70669cd9, float:2.8548468E29)
            if (r0 == r1) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r0 = "feed_data_saver_preference"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x001e:
            java.lang.String r0 = "show_interest_feed_preference"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x0029
        L_0x0028:
            r6 = -1
        L_0x0029:
            if (r6 == 0) goto L_0x00bb
            if (r6 == r2) goto L_0x002f
            goto L_0x00cd
        L_0x002f:
            r5.f273699i = r2
            com.google.android.apps.gsa.search.core.bd r6 = r5.f273695e
            java.lang.String r0 = r5.m162277a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r0 != 0) goto L_0x0047
            com.google.android.apps.gsa.search.core.aj.ad r1 = r6.f231514c
            boolean r1 = r1.mo78233a()
            if (r1 == 0) goto L_0x00cd
        L_0x0047:
            boolean r1 = r6.mo79170h(r0)
            dagger.a r3 = r6.f231512a
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r3 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r3
            com.google.android.apps.gsa.search.core.preferences.q r3 = r3.mo80076b()
            java.lang.String r0 = com.google.android.apps.gsa.search.core.C85653bd.m137485d(r0)
            r3.mo80067b(r0, r7)
            r3.apply()
            if (r1 == r7) goto L_0x00cd
            com.google.android.apps.gsa.tasks.ag r7 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.tasks.af r7 = (com.google.android.apps.gsa.tasks.C118471af) r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 5
            long r0 = r0.toMillis(r3)
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3
            int r4 = r3.f328821a
            r4 = r4 | 2
            r3.f328821a = r4
            r3.f328823c = r0
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.android.apps.gsa.tasks.ag r0 = (com.google.android.apps.gsa.tasks.C118472ag) r0
            r0.f328824d = r2
            int r1 = r0.f328821a
            r1 = r1 | 4
            r0.f328821a = r1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 1
            long r0 = r0.toMillis(r3)
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3
            int r4 = r3.f328821a
            r4 = r4 | r2
            r3.f328821a = r4
            r3.f328822b = r0
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            dagger.a r6 = r6.f231513b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.tasks.t r6 = (com.google.android.apps.gsa.tasks.C118561t) r6
            com.google.android.apps.gsa.tasks.by r0 = com.google.android.apps.gsa.tasks.C118522by.CHIME_REGISTRATION
            r6.mo103754e(r0, r7)
            goto L_0x00cd
        L_0x00bb:
            r5.f273700j = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            com.google.android.apps.gsa.search.core.bb r7 = r5.f273692b
            r7.mo79159v(r6)
            android.preference.SwitchPreference r7 = r5.f273698h
            r7.setEnabled(r6)
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7681cm.C98020o.onPreferenceChange(android.preference.Preference, java.lang.Object):boolean");
    }
}
