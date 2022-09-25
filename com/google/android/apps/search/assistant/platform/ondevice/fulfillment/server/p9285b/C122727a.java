package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9285b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.b.a */
/* compiled from: PG */
public final class C122727a {

    /* renamed from: a */
    public final StringBuilder f340040a;

    /* renamed from: b */
    private final int f340041b;

    public C122727a(int i, StringBuilder sb) {
        this.f340041b = i;
        this.f340040a = sb;
    }

    /* renamed from: c */
    private final void m202099c() {
        for (int i = 0; i < this.f340041b; i++) {
            this.f340040a.append(' ');
        }
    }

    /* renamed from: a */
    public final C122727a mo105730a(String str) {
        m202099c();
        this.f340040a.append(str);
        this.f340040a.append(":\n");
        return new C122727a(this.f340041b + 2, this.f340040a);
    }

    /* renamed from: b */
    public final void mo105731b(String str, String str2) {
        m202099c();
        this.f340040a.append(str);
        this.f340040a.append(": ");
        this.f340040a.append(str2);
        this.f340040a.append(10);
    }
}
