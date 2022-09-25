package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.p968b.p969a;

import com.google.p4272br.C56449r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.b.a.a */
/* compiled from: PG */
public final class C13446a extends C13447b {

    /* renamed from: a */
    private final C56449r f41281a;

    public C13446a(C56449r rVar) {
        this.f41281a = rVar;
    }

    /* renamed from: b */
    public final C56449r mo21094b() {
        return this.f41281a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13447b) {
            return this.f41281a.equals(((C13447b) obj).mo21094b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f41281a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f41281a.f150776a;
        return "RegexSmartActionTriggerImpl{pattern=" + str + "}";
    }
}
