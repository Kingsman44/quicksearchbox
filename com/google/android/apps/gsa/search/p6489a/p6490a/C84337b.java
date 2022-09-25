package com.google.android.apps.gsa.search.p6489a.p6490a;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.a.a.b */
/* compiled from: PG */
public final class C84337b {

    /* renamed from: a */
    private final C60870cx f229526a;

    public C84337b(C85923cq cqVar) {
        this.f229526a = C60856cj.m92900i(cqVar);
    }

    /* renamed from: a */
    public final Uri mo77868a() {
        String str;
        String str2;
        try {
            C85923cq cqVar = (C85923cq) C90877ak.m148472f(this.f229526a);
            str = cqVar.mo83212j();
            try {
                str2 = cqVar.mo83211i();
            } catch (InterruptedException | ExecutionException unused) {
                C58976aa aaVar = C58975e.f156826a;
                str2 = "www.google.com";
                return new Uri.Builder().scheme(str).encodedAuthority(str2).build();
            }
        } catch (InterruptedException | ExecutionException unused2) {
            str = "https";
            C58976aa aaVar2 = C58975e.f156826a;
            str2 = "www.google.com";
            return new Uri.Builder().scheme(str).encodedAuthority(str2).build();
        }
        return new Uri.Builder().scheme(str).encodedAuthority(str2).build();
    }

    /* renamed from: b */
    public final String mo77869b(String str) {
        String str2;
        String str3 = null;
        try {
            str3 = ((C85923cq) C90877ak.m148472f(this.f229526a)).f232307a.getString("extra_query_params", (String) null);
        } catch (InterruptedException | ExecutionException unused) {
        }
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        String fragment = Uri.parse(str).getFragment();
        boolean isEmpty = TextUtils.isEmpty(fragment);
        String str4 = BuildConfig.FLAVOR;
        if (!isEmpty) {
            String concat = "#".concat(String.valueOf(fragment));
            str2 = str.replace(concat, str4);
            str4 = concat;
        } else {
            str2 = str;
        }
        String str5 = "?";
        if (true == str.contains(str5)) {
            str5 = "&";
        }
        return str2 + str5 + str3 + str4;
    }
}
