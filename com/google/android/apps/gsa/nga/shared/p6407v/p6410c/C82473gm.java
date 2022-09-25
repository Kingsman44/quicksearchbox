package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gm */
/* compiled from: PG */
public final class C82473gm extends C82702oz {

    /* renamed from: a */
    private final String f225347a = "NGA_WARM_ACTIONS_TRIGGER_COUNT";

    /* renamed from: b */
    private final int f225348b;

    /* renamed from: c */
    private final String f225349c;

    public C82473gm(String str, int i, String str2) {
        this.f225348b = i;
        this.f225349c = str2;
    }

    /* renamed from: b */
    public final int mo76377b() {
        return this.f225348b;
    }

    /* renamed from: c */
    public final String mo76378c() {
        return this.f225349c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225347a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82702oz) {
            C82702oz ozVar = (C82702oz) obj;
            return this.f225347a.equals(ozVar.mo75583d()) && this.f225348b == ozVar.mo76377b() && this.f225349c.equals(ozVar.mo76378c());
        }
    }

    public final int hashCode() {
        return ((((this.f225347a.hashCode() ^ 1000003) * 1000003) ^ this.f225348b) * 1000003) ^ this.f225349c.hashCode();
    }

    public final String toString() {
        String str = this.f225347a;
        int i = this.f225348b;
        String str2 = this.f225349c;
        return "NgaWarmActionsTriggerCountEvent{token=" + str + ", contextType=" + i + ", command=" + str2 + "}";
    }
}
