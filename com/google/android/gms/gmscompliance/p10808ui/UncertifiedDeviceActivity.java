package com.google.android.gms.gmscompliance.p10808ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C1878d;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1647az.p1648a.C19603a;
import com.google.android.setupcompat.p3550b.C45249f;
import com.google.android.setupdesign.p3558f.C45316j;
import com.google.android.setupdesign.p3558f.C45317k;

/* renamed from: com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity */
/* compiled from: PG */
public class UncertifiedDeviceActivity extends C0395p {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            C45317k c = C45317k.m80773c();
            int i2 = c.f118379a;
            String str = c.f118380b;
            boolean z = c.f118381c;
            i = C45316j.m80772a(0).mo49239b("glif_v3_light", false);
        }
        if (i != 0) {
            setTheme(i);
        }
        C45249f.m80603a(getWindow(), this);
        setContentView((int) R.layout.auth_uncertified_activity_v2);
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(C1878d.m5128a(this, R.color.play_protect_auth_navigation_bar_color));
        }
        C19603a.m37408a((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (TextUtils.isEmpty(stringExtra) || intent == null) {
                button.setVisibility(4);
            } else {
                Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new C144278b(this, intent, bundleExtra));
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty(stringExtra2)) {
                textView.setVisibility(4);
            } else {
                textView.setText(C1951d.m5280a(stringExtra2, 63));
                C19603a.m37408a(textView, LinkMovementMethod.getInstance());
                Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new C144277a(this, intent2));
                }
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new C144279c(this));
        }
    }
}
