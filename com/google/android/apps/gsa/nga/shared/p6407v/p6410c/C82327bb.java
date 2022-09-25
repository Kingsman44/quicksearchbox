package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bb */
/* compiled from: PG */
public final class C82327bb extends C82556jo {

    /* renamed from: a */
    private final String f224901a = "NGA_CLIENT_CONVERSATION_DONE_DELAY";

    /* renamed from: b */
    private final Double f224902b;

    /* renamed from: c */
    private final int f224903c;

    /* renamed from: d */
    private final boolean f224904d;

    public C82327bb(String str, Double d, int i, boolean z) {
        this.f224902b = d;
        this.f224903c = i;
        this.f224904d = z;
    }

    /* renamed from: b */
    public final int mo75725b() {
        return this.f224903c;
    }

    /* renamed from: c */
    public final Double mo75726c() {
        return this.f224902b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224901a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82556jo) {
            C82556jo joVar = (C82556jo) obj;
            return this.f224901a.equals(joVar.mo75583d()) && this.f224902b.equals(joVar.mo75726c()) && this.f224903c == joVar.mo75725b() && this.f224904d == joVar.mo75728f();
        }
    }

    /* renamed from: f */
    public final boolean mo75728f() {
        return this.f224904d;
    }

    public final int hashCode() {
        return ((((((this.f224901a.hashCode() ^ 1000003) * 1000003) ^ this.f224902b.hashCode()) * 1000003) ^ this.f224903c) * 1000003) ^ (true != this.f224904d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224901a;
        Double d = this.f224902b;
        int i = this.f224903c;
        boolean z = this.f224904d;
        return "NgaClientConversationDoneDelayEvent{token=" + str + ", value=" + d + ", configuredTimeout=" + i + ", violation=" + z + "}";
    }
}
