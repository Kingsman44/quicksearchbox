package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.accounts.AccountManager;
import android.app.Activity;
import android.database.DataSetObservable;
import android.preference.Preference;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.settingsui.C88988c;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.shared.p7129r.C90466h;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7184t.C91098h;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bj */
/* compiled from: PG */
public final class C97986bj extends C88987b {

    /* renamed from: b */
    private final C86130z f273584b;

    /* renamed from: c */
    private final C86124t f273585c;

    /* renamed from: d */
    private final C85929cw f273586d;

    /* renamed from: e */
    private final C90929bz f273587e;

    /* renamed from: f */
    private final Activity f273588f;

    /* renamed from: g */
    private final C86127w f273589g;

    /* renamed from: h */
    private final C69464a f273590h;

    /* renamed from: i */
    private final C68214a f273591i;

    /* renamed from: j */
    private final C68214a f273592j;

    /* renamed from: k */
    private final C68214a f273593k;

    /* renamed from: l */
    private final C68214a f273594l;

    /* renamed from: m */
    private final C68214a f273595m;

    /* renamed from: n */
    private final boolean f273596n;

    /* renamed from: o */
    private final boolean f273597o;

    /* renamed from: p */
    private final C68214a f273598p;

    /* renamed from: q */
    private final C68214a f273599q;

    /* renamed from: r */
    private final cb f273600r;

    /* renamed from: s */
    private final C68214a f273601s;

    /* renamed from: t */
    private final C98028w f273602t;

    /* renamed from: u */
    private final C68214a f273603u;

    public C97986bj(Activity activity, C86124t tVar, C86127w wVar, C86130z zVar, C85929cw cwVar, C90929bz bzVar, C69464a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, boolean z, boolean z2, C68214a aVar7, C68214a aVar8, cb cbVar, C68214a aVar9, C98028w wVar2, C68214a aVar10) {
        this.f273584b = zVar;
        this.f273585c = tVar;
        this.f273586d = cwVar;
        this.f273588f = activity;
        this.f273587e = bzVar;
        this.f273589g = wVar;
        this.f273590h = aVar;
        this.f273591i = aVar2;
        this.f273592j = aVar3;
        this.f273593k = aVar4;
        this.f273594l = aVar5;
        this.f273595m = aVar6;
        this.f273596n = z;
        this.f273597o = z2;
        this.f273598p = aVar7;
        this.f273599q = aVar8;
        this.f273600r = cbVar;
        this.f273601s = aVar9;
        this.f273602t = wVar2;
        this.f273603u = aVar10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        String b = mo82940b(preference);
        C91097g gVar = null;
        if ("account_settings_controller".equals(b)) {
            Activity activity = this.f273588f;
            if (activity instanceof C91098h) {
                gVar = ((C91098h) activity).mo17775x();
            }
            return new C98031z(this.f273585c, (C86054o) this.f273592j.mo27525b(), (C85651bb) this.f273593k.mo27525b(), this.f273588f, (DataSetObservable) this.f273594l.mo27525b(), this.f273596n, this.f273597o, (C92518d) this.f273590h.mo17428b(), gVar, this.f273601s, this.f273602t, this.f273600r);
        } else if ("google_account_search_history".equals(b)) {
            return new C97967b((C86054o) this.f273592j.mo27525b(), this.f273599q);
        } else {
            if ("location_tos".equals(b)) {
                return new C97985bi(this.f273588f, this.f273586d, (C91748d) this.f273599q.mo27525b(), this.f273584b.mo79764c(R.string.location_tos_url), this.f273585c);
            }
            if ("tos".equals(b)) {
                return new C97996bt(this.f273588f, this.f273586d, (C91748d) this.f273599q.mo27525b(), this.f273584b.mo79764c(R.string.tos_url_format), this.f273585c);
            }
            if ("privacy_preferences".equals(b)) {
                return new C97990bn(this.f273588f, (C86054o) this.f273592j.mo27525b());
            }
            if ("legal_notices".equals(b)) {
                return new C97996bt(this.f273588f, this.f273586d, (C91748d) this.f273599q.mo27525b(), this.f273584b.mo79764c(R.string.legal_notices_url), this.f273585c);
            }
            if ("gel_usage_stats".equals(b)) {
                return new C98022q(this.f273588f, this.f273589g);
            }
            if ("relationships".equals(b)) {
                return new C88988c();
            }
            if ("feedback_use_nonredacted_report_saved_decision".equals(b)) {
                return new C98001by((C90466h) this.f273595m.mo27525b(), (AccountManager) this.f273591i.mo27525b());
            }
            if ("shake_to_send_feedback_enabled".equals(b)) {
                return new C88988c();
            }
            if ("signed_out_search".equals(b)) {
                return new C88988c();
            }
            if ("use_custom_tabs".equals(b)) {
                return new C98009d(this.f273588f, this.f273587e, this.f273598p);
            }
            if ("use_recently".equals(b)) {
                return new C97992bp(this.f273588f);
            }
            if ("about_app_version".equals(b)) {
                return new C97937a(this.f273603u);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo82940b(Preference preference) {
        String key = preference.getKey();
        if (key == null) {
            return null;
        }
        int i = C98031z.f273743j;
        return (C90507o.f253011a.equals(key) || "google_account_history".equals(key)) ? "account_settings_controller" : key;
    }

    /* renamed from: g */
    public final void mo82945g() {
        super.mo82945g();
        C58976aa aaVar = C58975e.f156826a;
        this.f273600r.e();
    }
}
