package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.z */
/* compiled from: PG */
public final class C136009z {

    /* renamed from: a */
    public final Fragment f370413a;

    /* renamed from: b */
    public final AccountId f370414b;

    /* renamed from: c */
    public final C28443m f370415c;

    /* renamed from: d */
    public final C47770dh f370416d;

    /* renamed from: e */
    private final C28306ab f370417e;

    public C136009z(Fragment fragment, AccountId accountId, C28306ab abVar, C28443m mVar, C47770dh dhVar) {
        this.f370413a = fragment;
        this.f370414b = accountId;
        this.f370417e = abVar;
        this.f370415c = mVar;
        this.f370416d = dhVar;
    }

    /* renamed from: a */
    public final void mo112681a(View view, int i) {
        C28306ab abVar = this.f370417e;
        abVar.mo33801b(view, abVar.f76990a.mo33805a(C28427h.m53115a(i)));
    }

    /* renamed from: b */
    public final void mo112682b(CheckedTextView checkedTextView, int i, int i2) {
        this.f370415c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(checkedTextView));
        checkedTextView.toggle();
        C28306ab.m52929e(checkedTextView);
        if (true != checkedTextView.isChecked()) {
            i = i2;
        }
        mo112681a(checkedTextView, i);
        mo112683c();
    }

    /* renamed from: c */
    public final void mo112683c() {
        Button button = (Button) this.f370413a.requireView().findViewById(R.id.googleapp_browser_settings_cleardata_button);
        boolean z = true;
        if (!mo112684d() && !mo112685e()) {
            z = false;
        }
        button.setEnabled(z);
    }

    /* renamed from: d */
    public final boolean mo112684d() {
        return ((CheckedTextView) this.f370413a.requireView().findViewById(R.id.googleapp_browser_setting_clear_cache)).isChecked();
    }

    /* renamed from: e */
    public final boolean mo112685e() {
        return ((CheckedTextView) this.f370413a.requireView().findViewById(R.id.googleapp_browser_setting_clear_data)).isChecked();
    }
}
