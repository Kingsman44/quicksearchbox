package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class UnquantumLicenseMenuActivity extends C0167am implements C41956d {
    /* renamed from: a */
    public final void mo44397a(License license) {
        Intent intent = new Intent(this, UnquantumLicenseActivity.class);
        intent.putExtra("license", license);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_menu_activity);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        FragmentManager fragmentManager = this.f727a.f739a.f744e;
        if (!(fragmentManager.f634a.mo670b(R.id.license_menu_fragment_container) instanceof C41957e)) {
            C41957e eVar = new C41957e();
            C0154a aVar = new C0154a(fragmentManager);
            aVar.mo511h(R.id.license_menu_fragment_container, eVar, (String) null, 1);
            aVar.mo509f();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
