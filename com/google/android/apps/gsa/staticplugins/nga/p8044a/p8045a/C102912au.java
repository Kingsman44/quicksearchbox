package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.gsa.nga.api.C74712bm;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81005a;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6332a.C81006b;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a.C103774j;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a.C103775k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.ahi;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.au */
/* compiled from: PG */
public final class C102912au implements C74712bm {

    /* renamed from: a */
    public final C74714bo f287383a;

    /* renamed from: b */
    public final SharedPreferences f287384b;

    /* renamed from: c */
    private final C81006b f287385c;

    public C102912au(C74714bo boVar, SharedPreferences sharedPreferences, C81006b bVar) {
        this.f287383a = boVar;
        this.f287384b = sharedPreferences;
        this.f287385c = bVar;
    }

    /* renamed from: f */
    private final Snackbar m170679f(View view, int i) {
        Snackbar p = Snackbar.m79660p(view, i, -2);
        p.mo48353t(R.string.nga_non_eligibility_snackbar_ok, new C102910as(this, p));
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = view.getContext().getTheme();
        theme.resolveAttribute(16843829, typedValue, true);
        p.f117089j.setBackgroundTintList(ColorStateList.valueOf(typedValue.data));
        theme.resolveAttribute(16843270, typedValue, true);
        p.mo48351r().f117107a.setTextColor(typedValue.data);
        p.mo48351r().f117108b.setTextColor(typedValue.data);
        return p;
    }

    /* renamed from: g */
    private final C58833ax m170680g(Context context, C103774j jVar) {
        if (m170681h("nga_dismissed_eligibility_card")) {
            return C58836b.f156633a;
        }
        if (!C74714bo.f208859a.contains(this.f287383a.mo71080b())) {
            return C58836b.f156633a;
        }
        String string = context.getString(R.string.nga_non_eligibility_card_change_language);
        C103775k kVar = new C103775k(context, jVar);
        kVar.f288953a.setText(string);
        kVar.mo71070b(new C102911at(this));
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("assistant_settings_feature", "language");
        kVar.f288958f = intent;
        return C58833ax.m90834k(kVar);
    }

    /* renamed from: h */
    private final boolean m170681h(String str) {
        if (this.f287384b.getInt(str, -1) == this.f287383a.mo71080b().f158764y) {
            return true;
        }
        if (!this.f287384b.contains(str)) {
            return false;
        }
        this.f287384b.edit().remove(str).apply();
        return false;
    }

    /* renamed from: a */
    public final int mo71071a() {
        return R.xml.nga_preferences;
    }

    /* renamed from: b */
    public final C58833ax mo71072b(Context context) {
        return m170680g(context, C103774j.AGSA_SETTINGS);
    }

    /* renamed from: c */
    public final C58833ax mo71073c(Context context) {
        return m170680g(context, C103774j.OS_SETTINGS);
    }

    /* renamed from: d */
    public final C58833ax mo71074d(View view) {
        if (m170681h("nga_dismissed_eligibility_snackbar")) {
            return C58836b.f156633a;
        }
        ahi ahi = ahi.UNKNOWN;
        int ordinal = this.f287383a.mo71080b().ordinal();
        if (ordinal == 11) {
            return C58833ax.m90834k(m170679f(view, R.string.nga_non_eligibility_snackbar_gsuite_account_present));
        }
        if (ordinal != 20) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(m170679f(view, R.string.nga_non_eligibility_snackbar_gsuite_account_saa));
    }

    /* renamed from: e */
    public final boolean mo71075e() {
        return C81005a.m128913b(this.f287385c);
    }
}
