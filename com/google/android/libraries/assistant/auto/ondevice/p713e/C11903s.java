package com.google.android.libraries.assistant.auto.ondevice.p713e;

import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.s */
/* compiled from: PG */
public final class C11903s {

    /* renamed from: a */
    final long f38279a;

    /* renamed from: b */
    boolean f38280b;

    /* renamed from: c */
    final C11899o f38281c = ((C11899o) C11900p.f38273b.createBuilder());

    public C11903s(long j) {
        this.f38279a = j;
        this.f38280b = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo20293a() {
        return ((C11900p) this.f38281c.build()).f38275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11903s) && this.f38279a == ((C11903s) obj).f38279a;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f38279a));
    }
}
