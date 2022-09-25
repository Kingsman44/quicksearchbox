package com.google.android.libraries.p3332u.p3333a.p3338e;

import android.content.Context;
import android.content.SharedPreferences;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.e.a */
/* compiled from: PG */
public final class C43200a {

    /* renamed from: a */
    private final SharedPreferences f112923a;

    public C43200a(Context context) {
        C69664n.m101061g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("gms_compl", 0);
        C69664n.m101060f(sharedPreferences, "context.getSharedPrefere… Context.MODE_PRIVATE\n  )");
        this.f112923a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo46266a(boolean z) {
        SharedPreferences.Editor edit = this.f112923a.edit();
        C69664n.m101060f(edit, "editor");
        edit.putBoolean("PREFS_KEY_COMPONENTS_RESET_PENDING", z);
        edit.commit();
    }

    /* renamed from: b */
    public final boolean mo46267b() {
        return this.f112923a.getBoolean("PREFS_KEY_COMPONENTS_RESET_PENDING", false);
    }
}
