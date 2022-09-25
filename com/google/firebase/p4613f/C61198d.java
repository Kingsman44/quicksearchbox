package com.google.firebase.p4613f;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.f.d */
/* compiled from: PG */
public final class C61198d {

    /* renamed from: a */
    public static volatile C61198d f165549a;

    /* renamed from: b */
    private final Set f165550b = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo57765a() {
        Set unmodifiableSet;
        synchronized (this.f165550b) {
            unmodifiableSet = Collections.unmodifiableSet(this.f165550b);
        }
        return unmodifiableSet;
    }
}
