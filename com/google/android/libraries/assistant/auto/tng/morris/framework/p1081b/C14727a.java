package com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.b.a */
/* compiled from: PG */
public final class C14727a {

    /* renamed from: a */
    public final C14324f f44508a;

    /* renamed from: b */
    public final C14324f f44509b;

    public C14727a(C14324f fVar, C14324f fVar2) {
        this.f44508a = fVar;
        this.f44509b = fVar2;
    }

    /* renamed from: a */
    public final boolean mo21707a() {
        int c = C0025a.m8c(this.f44509b.f43333b);
        if (c == 0) {
            c = 1;
        }
        int c2 = C0025a.m8c(this.f44508a.f43333b);
        if (c2 == 0) {
            c2 = 1;
        }
        return c != c2;
    }

    /* renamed from: b */
    public final boolean mo21708b() {
        C0027c a = C0027c.m9a(this.f44509b.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        C0027c a2 = C0027c.m9a(this.f44508a.f43332a);
        if (a2 == null) {
            a2 = C0027c.UNRECOGNIZED;
        }
        return a != a2;
    }

    /* renamed from: c */
    public final boolean mo21709c() {
        C0027c a = C0027c.m9a(this.f44509b.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a != C0027c.OFF) {
            return false;
        }
        C0027c a2 = C0027c.m9a(this.f44508a.f43332a);
        if (a2 == null) {
            a2 = C0027c.UNRECOGNIZED;
        }
        return a2 != C0027c.OFF;
    }

    /* renamed from: d */
    public final boolean mo21710d() {
        C0027c a = C0027c.m9a(this.f44509b.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        if (a == C0027c.OFF) {
            return false;
        }
        C0027c a2 = C0027c.m9a(this.f44508a.f43332a);
        if (a2 == null) {
            a2 = C0027c.UNRECOGNIZED;
        }
        return a2 == C0027c.OFF;
    }
}
