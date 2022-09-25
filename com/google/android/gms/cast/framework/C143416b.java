package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.cast.framework.p10772a.C143381a;
import com.google.android.gms.cast.framework.p10772a.C143391b;
import com.google.android.gms.cast.framework.p10772a.C143392c;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143390i;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146042v;
import com.google.android.p10723g.C142652b;
import com.google.android.p10723g.p10724a.C142650c;
import com.google.android.p10723g.p10724a.C142651d;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.framework.b */
/* compiled from: PG */
public final /* synthetic */ class C143416b implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C143429e f388915a;

    public /* synthetic */ C143416b(C143429e eVar) {
        this.f388915a = eVar;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        C143429e eVar = this.f388915a;
        Bundle bundle = (Bundle) obj;
        C143392c cVar = new C143392c(eVar.f388951d, eVar.f388955h, eVar.f388953f, eVar.f388957j, eVar.f388956i);
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (!z) {
            if (z2) {
                z2 = true;
            } else {
                return;
            }
        }
        String packageName = cVar.f388891a.getPackageName();
        String format = String.format(Locale.ROOT, "%s.%s", new Object[]{packageName, "client_cast_analytics_data"});
        cVar.f388896f = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
        C142651d.m231443b(cVar.f388891a);
        Context context = C142651d.m231442a().f387088a;
        C142652b bVar = new C142652b();
        C143391b bVar2 = C143391b.f388890a;
        if (new C142652b().equals(bVar)) {
            cVar.f388897g = C142650c.m231441a("CAST_SENDER_SDK", bVar2, context);
            SharedPreferences sharedPreferences = cVar.f388891a.getApplicationContext().getSharedPreferences(format, 0);
            if (z) {
                C146006ab c = cVar.f388892b.mo118915c(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                ((C146014aj) c).mo122495n(C146013ai.f394700a, new C143381a(cVar, packageName, sharedPreferences));
            }
            if (z2) {
                C143919bh.m233958a(sharedPreferences);
                C143390i a = C143390i.m232666a(sharedPreferences, cVar, packageName);
                String string = a.f388883d.getString("feature_usage_sdk_version", (String) null);
                String string2 = a.f388883d.getString("feature_usage_package_name", (String) null);
                a.f388887h.clear();
                a.f388888i.clear();
                a.f388889j = 0;
                if (!C143390i.f388880b.equals(string) || !a.f388884e.equals(string2)) {
                    HashSet hashSet = new HashSet();
                    for (String next : a.f388883d.getAll().keySet()) {
                        if (next.startsWith("feature_usage_timestamp_")) {
                            hashSet.add(next);
                        }
                    }
                    hashSet.add("feature_usage_last_report_time");
                    a.mo118565f(hashSet);
                    a.f388883d.edit().putString("feature_usage_sdk_version", C143390i.f388880b).putString("feature_usage_package_name", a.f388884e).apply();
                } else {
                    a.f388889j = a.f388883d.getLong("feature_usage_last_report_time", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet2 = new HashSet();
                    for (String next2 : a.f388883d.getAll().keySet()) {
                        if (next2.startsWith("feature_usage_timestamp_")) {
                            long j = a.f388883d.getLong(next2, 0);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet2.add(next2);
                            } else if (next2.startsWith("feature_usage_timestamp_reported_feature_")) {
                                C59715c b = C143390i.m232667b(next2.substring(41));
                                a.f388888i.add(b);
                                a.f388887h.add(b);
                            } else if (next2.startsWith("feature_usage_timestamp_detected_feature_")) {
                                a.f388887h.add(C143390i.m232667b(next2.substring(41)));
                            }
                        }
                    }
                    a.mo118565f(hashSet2);
                    Handler handler = a.f388886g;
                    C143919bh.m233958a(a.f388885f);
                    a.mo118566g();
                }
                C143390i.m232669e(C59715c.CAST_CONTEXT);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(bVar.toString()));
    }
}
