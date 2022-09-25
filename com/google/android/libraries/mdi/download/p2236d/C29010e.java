package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;

/* renamed from: com.google.android.libraries.mdi.download.d.e */
/* compiled from: PG */
public final class C29010e extends C29139g {

    /* renamed from: a */
    private final C29334dr f78770a;

    public C29010e(C29334dr drVar) {
        this.f78770a = drVar;
    }

    /* renamed from: b */
    public final int mo34503b() {
        return 1;
    }

    /* renamed from: d */
    public final C29334dr mo34528d() {
        return this.f78770a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29166h) {
            C29166h hVar = (C29166h) obj;
            if (hVar.mo34503b() != 1 || !this.f78770a.equals(hVar.mo34528d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78770a.hashCode();
    }
}
