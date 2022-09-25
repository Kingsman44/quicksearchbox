package com.google.android.apps.gsa.shared.p7008az;

import android.net.Uri;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.az.b */
/* compiled from: PG */
public final class C89333b {

    /* renamed from: a */
    public final String f242198a;

    /* renamed from: b */
    private final String f242199b;

    /* renamed from: c */
    private final String f242200c;

    public C89333b(String str, String str2, String str3) {
        this.f242199b = str;
        this.f242198a = str2;
        this.f242200c = str3;
    }

    /* renamed from: a */
    public final Uri mo83278a(Uri uri) {
        String authority = uri.getAuthority();
        C58838bb.m90868c(this.f242198a.equals(authority));
        authority.getClass();
        Uri.Builder authority2 = new Uri.Builder().scheme("content").authority(this.f242200c);
        String str = this.f242199b;
        String str2 = this.f242198a;
        Uri.Builder appendPath = authority2.appendPath(str + "." + str2).appendPath(authority);
        for (String appendPath2 : uri.getPathSegments()) {
            appendPath.appendPath(appendPath2);
        }
        appendPath.encodedQuery(uri.getEncodedQuery());
        return appendPath.build();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89333b)) {
            return false;
        }
        C89333b bVar = (C89333b) obj;
        if (!C58832aw.m90831a(this.f242199b, bVar.f242199b) || !C58832aw.m90831a(this.f242198a, bVar.f242198a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f242199b, this.f242198a});
    }

    public final String toString() {
        String str = this.f242199b;
        String str2 = this.f242198a;
        return "DynamicProviderId{jar=" + str + ";authority=" + str2 + "}";
    }
}
