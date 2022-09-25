package com.google.android.apps.gsa.search.core;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.search.C90507o;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.af */
/* compiled from: PG */
final class C84465af implements C84493ah {

    /* renamed from: a */
    final /* synthetic */ Map f229865a;

    /* renamed from: b */
    final /* synthetic */ C84509ai f229866b;

    public C84465af(C84509ai aiVar, Map map) {
        this.f229866b = aiVar;
        this.f229865a = map;
    }

    /* renamed from: a */
    public final C86337q mo78024a(String str) {
        if (str.equals(C90507o.f253011a)) {
            this.f229866b.mo78213b().mo80075j(str);
            return this.f229866b.mo78214c();
        } else if (str.equals("web_corpora_json") || str.equals("web_corpora_json_url")) {
            this.f229866b.mo78213b().mo80075j(str);
            return null;
        } else if (str.equals("session_key") || str.equals("web_corpora_config") || str.equals("gstatic_configuration_data") || str.equals("gstatic_configuration_override_1") || str.startsWith("configuration_bytes_key_")) {
            Object obj = this.f229865a.get(str);
            if (obj instanceof String) {
                try {
                    this.f229866b.mo78213b().mo80068c(str, Base64.decode((String) obj, 0));
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } else if (C84509ai.m135133d(str)) {
            return this.f229866b.mo78214c();
        } else {
            return this.f229866b.mo78213b();
        }
    }
}
