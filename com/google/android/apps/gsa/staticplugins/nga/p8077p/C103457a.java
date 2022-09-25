package com.google.android.apps.gsa.staticplugins.nga.p8077p;

import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.p.a */
/* compiled from: PG */
public final class C103457a implements C89193a {

    /* renamed from: a */
    private final C58833ax f288323a;

    public C103457a(C58833ax axVar) {
        this.f288323a = axVar;
    }

    /* renamed from: b */
    private static String m171389b(boolean z) {
        return true != z ? "0" : "1";
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        if (!"nga_enabled".equals(str)) {
            return null;
        }
        if (!this.f288323a.mo56113h()) {
            return m171389b(false);
        }
        return m171389b(((C74720bx) this.f288323a.mo56107c()).mo71089f().b());
    }
}
