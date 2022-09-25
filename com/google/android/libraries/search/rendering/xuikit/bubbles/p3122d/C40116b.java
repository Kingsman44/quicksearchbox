package com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.d.b */
/* compiled from: PG */
public final class C40116b extends C40118d {

    /* renamed from: a */
    private final String f105368a;

    /* renamed from: b */
    private final String f105369b;

    /* renamed from: c */
    private final String f105370c;

    /* renamed from: d */
    private final int f105371d;

    public C40116b(String str, String str2, String str3, int i) {
        this.f105368a = str;
        this.f105369b = str2;
        this.f105370c = str3;
        this.f105371d = i;
    }

    /* renamed from: a */
    public final int mo42204a() {
        return this.f105371d;
    }

    /* renamed from: b */
    public final String mo42205b() {
        return this.f105368a;
    }

    /* renamed from: c */
    public final String mo42206c() {
        return this.f105370c;
    }

    /* renamed from: d */
    public final String mo42207d() {
        return this.f105369b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40118d) {
            C40118d dVar = (C40118d) obj;
            return this.f105368a.equals(dVar.mo42205b()) && this.f105369b.equals(dVar.mo42207d()) && this.f105370c.equals(dVar.mo42206c()) && this.f105371d == dVar.mo42204a();
        }
    }

    public final int hashCode() {
        return ((((((this.f105368a.hashCode() ^ 1000003) * 1000003) ^ this.f105369b.hashCode()) * 1000003) ^ this.f105370c.hashCode()) * 1000003) ^ this.f105371d;
    }

    public final String toString() {
        String str = this.f105368a;
        String str2 = this.f105369b;
        String str3 = this.f105370c;
        int i = this.f105371d;
        return "BubbleNotificationData{bubbleContentDescription=" + str + ", multipleBubblesTitle=" + str2 + ", contextText=" + str3 + ", smallIcon=" + i + "}";
    }
}
