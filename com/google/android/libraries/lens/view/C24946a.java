package com.google.android.libraries.lens.view;

import java.util.UUID;

/* renamed from: com.google.android.libraries.lens.view.a */
/* compiled from: PG */
final class C24946a extends C28222y {

    /* renamed from: a */
    public final UUID f68075a;

    /* renamed from: b */
    public final int f68076b;

    public C24946a(UUID uuid, int i) {
        if (uuid != null) {
            this.f68075a = uuid;
            this.f68076b = i;
            return;
        }
        throw new NullPointerException("Null uuid");
    }

    /* renamed from: a */
    public final int mo30185a() {
        return this.f68076b;
    }

    /* renamed from: b */
    public final UUID mo30186b() {
        return this.f68075a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28222y) {
            C28222y yVar = (C28222y) obj;
            return this.f68075a.equals(yVar.mo30186b()) && this.f68076b == yVar.mo30185a();
        }
    }

    public final int hashCode() {
        return ((this.f68075a.hashCode() ^ 1000003) * 1000003) ^ this.f68076b;
    }
}
