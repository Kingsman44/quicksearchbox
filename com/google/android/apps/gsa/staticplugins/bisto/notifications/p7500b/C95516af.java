package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.af */
/* compiled from: PG */
public final class C95516af {

    /* renamed from: a */
    public final boolean f267280a;

    /* renamed from: b */
    public final boolean f267281b;

    /* renamed from: c */
    public final boolean f267282c;

    /* renamed from: d */
    public final boolean f267283d;

    /* renamed from: e */
    public final boolean f267284e;

    /* renamed from: f */
    public final boolean f267285f;

    /* renamed from: g */
    public final boolean f267286g;

    /* renamed from: h */
    private final boolean f267287h;

    public C95516af(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f267280a = z;
        this.f267281b = z2;
        this.f267282c = z3;
        this.f267283d = z4;
        this.f267284e = z5;
        this.f267287h = z6;
        this.f267285f = z7;
        this.f267286g = z8;
    }

    /* renamed from: a */
    public static C95516af m158009a(boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        return new C95516af(false, !z2 && (z || !z3), true, true, true, true, false, true);
    }

    public final String toString() {
        boolean z = this.f267280a;
        boolean z2 = this.f267281b;
        boolean z3 = this.f267282c;
        boolean z4 = this.f267283d;
        boolean z5 = this.f267284e;
        boolean z6 = this.f267285f;
        boolean z7 = this.f267286g;
        boolean z8 = this.f267287h;
        return "Sound Effect = " + z + ", Summary = " + z2 + ", Content = " + z3 + ", Action prompt = " + z4 + ", Action window = " + z5 + ", Is repeat = false, Contents played due to being expanded = " + z6 + ", Is interruptive = " + z7 + ", Is recently expanded = " + z8;
    }
}
