package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.n */
/* compiled from: PG */
public final class C91274n {
    /* renamed from: a */
    public static Uri m149207a(String str, List list, boolean z, SharedPreferences sharedPreferences, C85923cq cqVar, Context context, C22871g gVar, Map map) {
        Uri.Builder builder;
        if (str != null) {
            if (str.contains("android.googleapis.com")) {
                gVar.mo28212l("showErrorToast", new C91273m(context));
            }
            builder = Uri.parse(str).buildUpon();
        } else {
            builder = new Uri.Builder().scheme("https");
            builder.encodedAuthority(cqVar.mo83211i());
            builder.path("/tg/fe");
        }
        builder.appendPath("request");
        if (!list.isEmpty()) {
            builder.appendQueryParameter("rqt", new C58827ar(".").mo56097d(list));
        }
        builder.appendQueryParameter("bq", true != z ? "1" : "0");
        if (sharedPreferences.getBoolean("save_dapper_traces", false)) {
            builder.appendQueryParameter("dt", BuildConfig.FLAVOR);
        }
        String string = sharedPreferences.getString("now_extra_query_params", (String) null);
        if (!C58837ba.m90859h(string)) {
            for (Map.Entry entry : C58495hd.m89898l(C90772bp.m148291R(string)).entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            builder.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return builder.build();
    }

    /* renamed from: b */
    public static String m149208b(C86127w wVar) {
        return C58837ba.m90856e(wVar.f232790a.mo79723b().getString("sidekick_server_override", (String) null));
    }
}
