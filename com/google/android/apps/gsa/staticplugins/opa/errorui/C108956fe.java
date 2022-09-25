package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C90732ap;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fe */
/* compiled from: PG */
public final class C108956fe extends C83907bm {

    /* renamed from: f */
    private static final C59071e f302988f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.fe");

    /* renamed from: b */
    public C86124t f302989b;

    /* renamed from: c */
    public SharedPreferences f302990c;

    /* renamed from: d */
    public SharedPreferences f302991d;

    /* renamed from: e */
    public C21370a f302992e;

    /* renamed from: g */
    private FrameLayout f302993g;

    /* renamed from: g */
    private final void m181236g() {
        Toast.makeText(getContext(), R.string.opa_error_enable_playstore_message, 1).show();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:com.android.vending"));
        try {
            startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            C59104x c = f302988f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UpdatedRequiredFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24461)).mo56386p("Couldn't redirect user to Play Store settings page");
        }
    }

    /* renamed from: h */
    private final void m181237h() {
        String packageName = getActivity().getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", packageName).appendQueryParameter("referrer", "OPA-forced-update").appendQueryParameter("allow_update", "true").build());
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", packageName);
        C58976aa aaVar = C58975e.f156826a;
        try {
            startActivityForResult(intent, 12);
        } catch (ActivityNotFoundException e) {
            C59104x c = f302988f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "UpdatedRequiredFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24464)).mo56389s("Couldn't find Play Store: %s", e.getMessage());
            m181236g();
        }
        m181238i(2);
    }

    /* renamed from: i */
    private final void m181238i(int i) {
        int i2 = i == 1 ? R.layout.error_opa_update_required : R.layout.error_opa_update_in_progress;
        int i3 = i == 1 ? 36594 : 36603;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) View.inflate(getActivity(), i2, (ViewGroup) null);
        if (i == 1) {
            legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108954fc(this)));
            legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108955fd(this)));
        }
        this.f302993g.removeAllViews();
        this.f302993g.addView(legacyOpaStandardPage);
        C28295m.m52919e(this.f302993g, new C28292j(i3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: c */
    public final void mo77315c() {
        this.f302990c.edit().remove(C90507o.f253033w).apply();
    }

    /* renamed from: e */
    public final void mo97310e() {
        this.f302990c.edit().putLong(C90507o.f253035y, this.f302992e.mo26870b()).apply();
        long a = this.f302989b.mo79743a(C90014bt.f247796ns);
        C58976aa aaVar = C58975e.f156826a;
        if (((int) a) != 2) {
            try {
                startActivity(C90732ap.m148195a(getContext(), getActivity().getPackageName()));
            } catch (ActivityNotFoundException e) {
                C59104x c = f302988f.mo56225c();
                c.mo56378ag(C58975e.f156826a, "UpdatedRequiredFragment");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24467)).mo56389s("Couldn't find Play Store: %s", e.getMessage());
                m181236g();
            }
        } else {
            m181237h();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C58976aa aaVar = C58975e.f156826a;
        if (i != 12) {
            return;
        }
        if (i2 != -1) {
            m181238i(1);
            return;
        }
        this.f302991d.edit().putLong("opa_forced_update_started_time", this.f302992e.mo26870b()).apply();
        this.f302990c.edit().putBoolean(C90507o.f253033w, true).apply();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f302993g = new FrameLayout(getActivity());
        long j = this.f302991d.getLong("opa_forced_update_started_time", 0);
        long millis = TimeUnit.SECONDS.toMillis(this.f302989b.mo79743a(C90014bt.f247329fB));
        int i = 1;
        if (j > 0 && this.f302992e.mo26870b() - j < millis) {
            i = 2;
        }
        C58976aa aaVar = C58975e.f156826a;
        m181238i(i);
        return this.f302993g;
    }
}
