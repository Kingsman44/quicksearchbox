package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58495hd;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.dk */
/* compiled from: PG */
public final class C85965dk implements C58881cr {

    /* renamed from: a */
    public final C85981c f232475a;

    /* renamed from: b */
    private final C86338r f232476b;

    public C85965dk(C85981c cVar, C86338r rVar) {
        this.f232475a = cVar;
        this.f232476b = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        return mo79626b((C85966dl) null);
    }

    /* renamed from: b */
    public final UriRequest mo79626b(C85966dl dlVar) {
        Uri uri = this.f232475a.f232493a;
        C58838bb.m90866a(uri, "Uri is null when building request");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        Map c = mo79627c();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : c.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
            sb.append('&');
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        clearQuery.encodedQuery(sb.toString());
        String encodedQuery = clearQuery.build().getEncodedQuery();
        if (encodedQuery != null) {
            clearQuery.encodedQuery(encodedQuery.replace("%20", "+"));
        }
        clearQuery.encodedFragment(this.f232475a.f232494b);
        Uri build = clearQuery.build();
        Map map = this.f232475a.f232497e;
        if (dlVar != null) {
            build = Uri.parse(dlVar.mo79629a(0, build.toString()));
        }
        C85981c cVar = this.f232475a;
        Map map2 = cVar.f232498f;
        byte[] bArr = cVar.f232500h;
        return new UriRequest(build, map, map2, (byte[]) null);
    }

    /* renamed from: c */
    public final Map mo79627c() {
        Map a = C85981c.m138234a(new LinkedHashMap(C58495hd.m89898l(C90772bp.m148291R(this.f232476b.getString("extra_query_params", (String) null)))));
        Map map = this.f232475a.f232499g;
        if (map != null) {
            a.putAll(map);
        }
        a.putAll(this.f232475a.f232495c);
        a.putAll(this.f232475a.f232496d);
        return a;
    }

    public final String toString() {
        return mo79626b((C85966dl) null).toString();
    }
}
