package com.google.android.libraries.abuse.reporting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.abuse.reporting.ar */
/* compiled from: PG */
public final class C146729ar {
    /* renamed from: a */
    public static final Intent m239083a(Context context, String str, String str2, String str3, String str4, C146727ap apVar) {
        Intent intent = new Intent(context, ReportAbuseActivity.class);
        if (apVar != null) {
            C146728aq.f396252a.f396253b = apVar;
        }
        intent.putExtra("config_name", str);
        intent.putExtra("reported_item_id", str2);
        intent.putExtra("reported_item_extra_data", (Parcelable) null);
        intent.putExtra("additional_display_data", (Bundle) null);
        intent.putExtra("language", str3);
        intent.putExtra("reporter_account_name", str4);
        intent.putExtra("fulfilled_requirements", (String[]) null);
        intent.putExtra("no_report_mode", true);
        intent.putExtra("app_source", (String) null);
        intent.putExtra("reporter_role", (Serializable) null);
        intent.putExtra("client_environment", (String) null);
        return intent;
    }
}
