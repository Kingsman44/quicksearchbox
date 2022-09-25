package com.google.android.apps.gsa.staticplugins.opa;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108326eo;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.de */
/* compiled from: PG */
final class C108528de implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301947a;

    public C108528de(C109040fj fjVar) {
        this.f301947a = fjVar;
    }

    public final void run() {
        this.f301947a.f303450o.mo95430s(new C108326eo(this.f301947a.f303455t));
        SharedPreferences sharedPreferences = (SharedPreferences) this.f301947a.f303251aK.mo27525b();
        int i = sharedPreferences.getInt("opa_lockhart_greeting_count", 0);
        if (sharedPreferences.getBoolean("opa_has_seen_greeting_for_lockhart", false)) {
            i = Math.max(i, 1);
        }
        sharedPreferences.edit().putBoolean("opa_has_seen_greeting_for_lockhart", true).putInt("opa_lockhart_greeting_count", i + 1).apply();
        this.f301947a.mo97427O();
        this.f301947a.mo97438Z();
        this.f301947a.mo97437Y();
    }
}
