package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.d */
/* compiled from: PG */
final class C36021d extends C36019b {

    /* renamed from: a */
    private final C60870cx f94230a;

    /* renamed from: b */
    private final boolean f94231b;

    public C36021d(C60870cx cxVar, boolean z) {
        this.f94230a = cxVar;
        this.f94231b = z;
    }

    /* renamed from: b */
    public final C60870cx mo39937b() {
        return this.f94230a;
    }

    /* renamed from: c */
    public final boolean mo39938c() {
        return this.f94231b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36019b) {
            C36019b bVar = (C36019b) obj;
            return this.f94230a.equals(bVar.mo39937b()) && this.f94231b == bVar.mo39938c();
        }
    }

    public final int hashCode() {
        return ((this.f94230a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f94231b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f94230a.toString();
        boolean z = this.f94231b;
        return "ActiveMediaControllerCompat{mediaControllerCompatFuture=" + obj + ", isFromExistingMediaSession=" + z + "}";
    }
}
