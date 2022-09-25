package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.h */
/* compiled from: PG */
final class C132006h extends C132020v {

    /* renamed from: a */
    private final String f360348a;

    /* renamed from: b */
    private final String f360349b;

    /* renamed from: c */
    private final boolean f360350c;

    public C132006h(String str, String str2, boolean z) {
        if (str != null) {
            this.f360348a = str;
            if (str2 != null) {
                this.f360349b = str2;
                this.f360350c = z;
                return;
            }
            throw new NullPointerException("Null accountType");
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: a */
    public final String mo110371a() {
        return this.f360348a;
    }

    /* renamed from: b */
    public final String mo110372b() {
        return this.f360349b;
    }

    /* renamed from: c */
    public final boolean mo110373c() {
        return this.f360350c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C132020v) {
            C132020v vVar = (C132020v) obj;
            return this.f360348a.equals(vVar.mo110371a()) && this.f360349b.equals(vVar.mo110372b()) && this.f360350c == vVar.mo110373c();
        }
    }

    public final int hashCode() {
        return ((((this.f360348a.hashCode() ^ 1000003) * 1000003) ^ this.f360349b.hashCode()) * 1000003) ^ (true != this.f360350c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f360348a;
        String str2 = this.f360349b;
        boolean z = this.f360350c;
        return "AccountNameAndType{accountName=" + str + ", accountType=" + str2 + ", workProfile=" + z + "}";
    }
}
