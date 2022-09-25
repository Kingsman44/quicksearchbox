package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.p6796f.C85980b;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.shared.p6994ap.C89255a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.a */
/* compiled from: PG */
public abstract class C85774a implements C85983e {

    /* renamed from: a */
    private static final C59071e f231925a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a");

    /* renamed from: b */
    private final C89255a f231926b;

    protected C85774a(C89255a aVar) {
        this.f231926b = aVar;
    }

    /* renamed from: b */
    public static Map m137828b(Uri uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                String queryParameter = uri.getQueryParameter(next);
                if (queryParameter != null) {
                    linkedHashMap.put(next, queryParameter);
                } else {
                    C59104x d = f231925a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AbsUrlBaseDataHandler");
                    ((C59052c) ((C59052c) d).mo56372aa(7817)).mo56389s("Error parsing URL: %s", uri);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    private final void m137829g(C85981c cVar, String str, String str2, String str3) {
        mo79437e(cVar, Uri.parse(String.format(C85980b.f232491a, str, new Object[]{str2, str3})));
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo79434a(Query query);

    /* renamed from: c */
    public final void mo79435c(C85981c cVar, String str) {
        m137829g(cVar, str, this.f231926b.mo83212j(), this.f231926b.mo83211i());
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        mo79438f(cVar, mo79434a(query));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo79437e(C85981c cVar, Uri uri) {
        cVar.mo79640f(uri);
        for (Map.Entry entry : m137828b(uri).entrySet()) {
            cVar.mo79638d((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo79438f(C85981c cVar, String str) {
        m137829g(cVar, str, this.f231926b.mo83212j(), this.f231926b.mo83211i());
    }
}
