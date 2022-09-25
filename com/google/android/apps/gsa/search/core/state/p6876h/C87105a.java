package com.google.android.apps.gsa.search.core.state.p6876h;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.core.state.h.a */
/* compiled from: PG */
public final class C87105a {
    /* renamed from: a */
    public static boolean m140757a(Context context, Query query, SharedPreferences sharedPreferences) {
        String string = context.getResources().getString(R.string.prefValue_ttsMode_on);
        String string2 = context.getResources().getString(R.string.prefValue_ttsMode_voiceOnly);
        String string3 = context.getResources().getString(R.string.prefValue_ttsMode_verbose);
        String string4 = context.getResources().getString(R.string.prefValue_ttsMode_brief);
        String string5 = sharedPreferences.getString("ttsMode", context.getResources().getString(R.string.prefDefault_ttsMode));
        return !string5.equals(string) && !string5.equals(string2) && !string5.equals(string3) && !string5.equals(string4) && !query.mo84337bV();
    }
}
