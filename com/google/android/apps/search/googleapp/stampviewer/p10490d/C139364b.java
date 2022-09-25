package com.google.android.apps.search.googleapp.stampviewer.p10490d;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.b */
/* compiled from: PG */
final class C139364b extends C139380f {

    /* renamed from: a */
    private final String f378977a;

    /* renamed from: b */
    private final boolean f378978b;

    public C139364b(String str, boolean z) {
        this.f378977a = str;
        this.f378978b = z;
    }

    /* renamed from: a */
    public final String mo114931a() {
        return this.f378977a;
    }

    /* renamed from: b */
    public final boolean mo114932b() {
        return this.f378978b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139380f) {
            C139380f fVar = (C139380f) obj;
            return this.f378977a.equals(fVar.mo114931a()) && this.f378978b == fVar.mo114932b();
        }
    }

    public final int hashCode() {
        return ((this.f378977a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f378978b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f378977a;
        boolean z = this.f378978b;
        return "StoryHeart{storyUrl=" + str + ", isHearted=" + z + "}";
    }
}
