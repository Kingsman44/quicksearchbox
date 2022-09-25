package com.google.android.apps.gsa.search.core.p6511ah;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.C73850cd;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.search.C90507o;

/* renamed from: com.google.android.apps.gsa.search.core.ah.g */
/* compiled from: PG */
public final class C84500g implements C86091a {

    /* renamed from: a */
    private final SharedPreferences f229975a;

    /* renamed from: b */
    private final C87573b f229976b;

    /* renamed from: c */
    private final C73850cd f229977c;

    public C84500g(SharedPreferences sharedPreferences, C87573b bVar, C73850cd cdVar) {
        this.f229975a = sharedPreferences;
        this.f229976b = bVar;
        this.f229977c = cdVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (z) {
            if (this.f229975a.getBoolean(C90507o.f253033w, false)) {
                this.f229975a.edit().remove(C90507o.f253033w).apply();
                this.f229976b.mo81705c((Bundle) null);
            }
            this.f229977c.e();
        }
    }
}
