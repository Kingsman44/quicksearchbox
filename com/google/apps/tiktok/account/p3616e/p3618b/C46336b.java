package com.google.apps.tiktok.account.p3616e.p3618b;

import com.google.apps.tiktok.account.data.C46215j;

/* renamed from: com.google.apps.tiktok.account.e.b.b */
/* compiled from: PG */
public final class C46336b extends C46335a {

    /* renamed from: b */
    private final C46215j f121329b;

    public C46336b(C46215j jVar) {
        if (jVar != null) {
            this.f121329b = jVar;
            return;
        }
        throw new NullPointerException("Null accountInfo");
    }

    /* renamed from: b */
    public final C46215j mo50319b() {
        return this.f121329b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46335a) {
            return this.f121329b.equals(((C46335a) obj).mo50319b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f121329b.hashCode() ^ 1000003;
    }
}
