package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fb */
/* compiled from: PG */
public final class C82435fb extends C82664no {

    /* renamed from: a */
    private final String f225242a = "NGA_START_ASSISTANT_INTERACTION_SUCCESS";

    /* renamed from: b */
    private final boolean f225243b;

    public C82435fb(String str, boolean z) {
        this.f225243b = z;
    }

    /* renamed from: b */
    public final boolean mo76210b() {
        return this.f225243b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225242a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82664no) {
            C82664no noVar = (C82664no) obj;
            return this.f225242a.equals(noVar.mo75583d()) && this.f225243b == noVar.mo76210b();
        }
    }

    public final int hashCode() {
        return ((this.f225242a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225243b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225242a;
        boolean z = this.f225243b;
        return "NgaStartAssistantInteractionSuccessEvent{token=" + str + ", success=" + z + "}";
    }
}
