package com.google.android.apps.gsa.assistant.p509a;

import android.content.res.Resources;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.assistant.a.a */
/* compiled from: PG */
public final class C9437a {
    /* renamed from: a */
    public static String m23953a(Resources resources) {
        return "<a href=\"" + Uri.parse(String.format("https://www.google.com/intl/%s/policies/privacy/", new Object[]{Locale.getDefault().toLanguageTag()})) + "\">" + resources.getString(R.string.opa_privacy_policy_chip_text) + "</a>";
    }

    /* renamed from: b */
    public static String m23954b(Resources resources) {
        return "<a href=\"" + Uri.parse(String.format("https://www.google.com/intl/%s/policies/terms/", new Object[]{Locale.getDefault().toLanguageTag()})) + "\">" + resources.getString(R.string.opa_terms_of_service_chip_text) + "</a>";
    }
}
