package com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a;

import android.net.Uri;
import com.google.common.base.C58826aq;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58490gz;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.a.e */
/* compiled from: PG */
final class C97030e {

    /* renamed from: a */
    public final Uri.Builder f271158a;

    /* renamed from: b */
    public final C58490gz f271159b = new C58490gz(4);

    /* renamed from: c */
    public final C58490gz f271160c = new C58490gz(4);

    /* renamed from: d */
    public final List f271161d = new LinkedList();

    /* renamed from: e */
    public boolean f271162e = false;

    public C97030e(String str, String str2, String str3) {
        this.f271158a = new Uri.Builder().scheme(str).encodedAuthority(str2).appendPath("async").appendPath(str3);
    }

    /* renamed from: a */
    public static String m160602a(Map map) {
        return new C58826aq(new C58827ar(","), ":").mo56095a(map);
    }

    /* renamed from: b */
    public static final String m160603b(String str, String str2) {
        if (str2.isEmpty()) {
            return null;
        }
        return str.concat("=").concat(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo90400c(String str, String str2) {
        this.f271158a.appendQueryParameter(str, str2);
        this.f271162e = true;
    }
}
