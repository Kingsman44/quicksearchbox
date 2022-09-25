package com.google.android.libraries.storage.protostore;

import android.content.SharedPreferences;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import java.util.Set;

/* renamed from: com.google.android.libraries.storage.protostore.cf */
/* compiled from: PG */
public final class C42938cf {

    /* renamed from: a */
    public final SharedPreferences f112327a;

    /* renamed from: b */
    private final Set f112328b;

    public C42938cf(SharedPreferences sharedPreferences, Set set) {
        this.f112327a = sharedPreferences;
        this.f112328b = set;
    }

    /* renamed from: a */
    public final C58495hd mo46010a() {
        C58838bb.m90869d(this.f112328b == null, "SharedPreferencesView#getAll() not available on key migration");
        return C58495hd.m89898l(this.f112327a.getAll());
    }

    /* renamed from: b */
    public final void mo46011b(String str) {
        Set set = this.f112328b;
        if (set != null) {
            C58838bb.m90873h(set.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    /* renamed from: c */
    public final long mo46012c(String str) {
        SharedPreferences sharedPreferences = this.f112327a;
        mo46011b(str);
        return sharedPreferences.getLong(str, 0);
    }
}
