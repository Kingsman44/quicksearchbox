package com.google.android.gms.cast.framework.internal;

import com.google.android.gms.cast.framework.C143544o;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.internal.b */
/* compiled from: PG */
public final class C143438b extends C143544o {

    /* renamed from: a */
    public final Set f388975a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public final int mo118643a() {
        return 223810000;
    }

    /* renamed from: b */
    public final C144165j mo118644b() {
        return new C144166k(this);
    }

    /* renamed from: c */
    public final void mo118645c() {
        for (C143434a a : this.f388975a) {
            a.mo118546a();
        }
    }

    /* renamed from: d */
    public final void mo118646d() {
        for (C143434a b : this.f388975a) {
            b.mo118547b();
        }
    }

    /* renamed from: e */
    public final void mo118647e(C143434a aVar) {
        this.f388975a.add(aVar);
    }
}
