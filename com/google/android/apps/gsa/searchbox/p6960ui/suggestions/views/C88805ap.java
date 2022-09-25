package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ap */
/* compiled from: PG */
public final class C88805ap {

    /* renamed from: a */
    public final int f240430a;

    /* renamed from: b */
    public final int f240431b;

    /* renamed from: c */
    private final int f240432c;

    public C88805ap(int i, int i2, int i3) {
        this.f240432c = i;
        this.f240430a = i2;
        this.f240431b = i3;
    }

    /* renamed from: a */
    public final boolean mo82592a() {
        return (this.f240431b & 2) != 0;
    }

    /* renamed from: b */
    public final boolean mo82593b() {
        return (this.f240431b & 8) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C88805ap)) {
            return false;
        }
        C88805ap apVar = (C88805ap) obj;
        if (this == apVar) {
            return true;
        }
        if (this.f240432c == apVar.f240432c && this.f240430a == apVar.f240430a && this.f240431b == apVar.f240431b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f240432c), Integer.valueOf(this.f240430a), Integer.valueOf(this.f240431b)});
    }
}
