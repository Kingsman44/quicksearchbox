package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10015i;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.i.b */
/* compiled from: PG */
final class C131746b extends C131748d {

    /* renamed from: a */
    private final boolean f359893a;

    /* renamed from: b */
    private final String f359894b;

    /* renamed from: c */
    private final boolean f359895c;

    /* renamed from: d */
    private final int f359896d;

    public C131746b(boolean z, String str, int i, boolean z2) {
        this.f359893a = z;
        this.f359894b = str;
        this.f359896d = i;
        this.f359895c = z2;
    }

    /* renamed from: a */
    public final String mo110291a() {
        return this.f359894b;
    }

    /* renamed from: b */
    public final boolean mo110292b() {
        return this.f359895c;
    }

    /* renamed from: c */
    public final boolean mo110293c() {
        return this.f359893a;
    }

    /* renamed from: d */
    public final int mo110294d() {
        return this.f359896d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131748d) {
            C131748d dVar = (C131748d) obj;
            return this.f359893a == dVar.mo110293c() && this.f359894b.equals(dVar.mo110291a()) && this.f359896d == dVar.mo110294d() && this.f359895c == dVar.mo110292b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.f359893a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f359894b.hashCode()) * 1000003) ^ this.f359896d) * 1000003;
        if (true == this.f359895c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f359893a;
        String str = this.f359894b;
        int i = this.f359896d;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "SPEED_LIMIT_EXCEEDED" : "POOR_ACCURACY" : "STALENESS" : "NONE";
        boolean z2 = this.f359895c;
        return "DiscardingCheckResult{shouldDiscard=" + z + ", message=" + str + ", reason=" + str2 + ", shouldClearCards=" + z2 + "}";
    }
}
