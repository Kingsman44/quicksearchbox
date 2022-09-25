package com.google.android.libraries.social.licenses;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class UnquantumLicenseActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        License license = (License) getIntent().getParcelableExtra("license");
        if (getActionBar() != null) {
            getActionBar().setTitle(license.f109503a);
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String a = C41958f.m73470a(this, license);
        if (a == null) {
            finish();
        } else {
            textView.setText(a);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new C41959g(this, i, scrollView));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
