package com.google.android.libraries.social.licenses;

import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.social.licenses.g */
/* compiled from: PG */
public final /* synthetic */ class C41959g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UnquantumLicenseActivity f109511a;

    /* renamed from: b */
    public final /* synthetic */ int f109512b;

    /* renamed from: c */
    public final /* synthetic */ ScrollView f109513c;

    public /* synthetic */ C41959g(UnquantumLicenseActivity unquantumLicenseActivity, int i, ScrollView scrollView) {
        this.f109511a = unquantumLicenseActivity;
        this.f109512b = i;
        this.f109513c = scrollView;
    }

    public final void run() {
        UnquantumLicenseActivity unquantumLicenseActivity = this.f109511a;
        int i = this.f109512b;
        ScrollView scrollView = this.f109513c;
        Layout layout = ((TextView) unquantumLicenseActivity.findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
        }
    }
}
