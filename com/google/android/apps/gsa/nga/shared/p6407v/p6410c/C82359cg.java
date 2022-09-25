package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cg */
/* compiled from: PG */
public final class C82359cg extends C82588kt {

    /* renamed from: a */
    private final String f224993a = "NGA_GELLER_ASSISTANT_HISTORY_WRITE_COUNT";

    /* renamed from: b */
    private final String f224994b;

    public C82359cg(String str, String str2) {
        this.f224994b = str2;
    }

    /* renamed from: b */
    public final String mo75856b() {
        return this.f224994b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224993a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82588kt) {
            C82588kt ktVar = (C82588kt) obj;
            return this.f224993a.equals(ktVar.mo75583d()) && this.f224994b.equals(ktVar.mo75856b());
        }
    }

    public final int hashCode() {
        return ((this.f224993a.hashCode() ^ 1000003) * 1000003) ^ this.f224994b.hashCode();
    }

    public final String toString() {
        String str = this.f224993a;
        String str2 = this.f224994b;
        return "NgaGellerAssistantHistoryWriteCountEvent{token=" + str + ", status=" + str2 + "}";
    }
}
