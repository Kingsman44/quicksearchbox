package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;

/* renamed from: com.google.android.apps.gsa.search.core.aj.ar */
/* compiled from: PG */
public final class C84533ar {

    /* renamed from: a */
    public final SharedPreferences.Editor f230052a;

    public C84533ar(SharedPreferences.Editor editor) {
        this.f230052a = editor;
    }

    /* renamed from: a */
    public final void mo78235a() {
        this.f230052a.apply();
    }

    /* renamed from: b */
    public final boolean mo78236b() {
        C90476a aVar = C91018d.f254254a;
        return this.f230052a.commit();
    }

    /* renamed from: c */
    public final void mo78237c(String str, boolean z) {
        this.f230052a.putBoolean(str, z);
    }

    /* renamed from: d */
    public final void mo78238d(String str, long j) {
        this.f230052a.putLong(str, j);
    }

    /* renamed from: e */
    public final void mo78239e(String str, String str2) {
        this.f230052a.putString(str, str2);
    }

    /* renamed from: f */
    public final void mo78240f(String str) {
        this.f230052a.remove(str);
    }
}
