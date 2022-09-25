package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1494c;

/* renamed from: com.google.android.libraries.assistant.g.c.a.c.g */
/* compiled from: PG */
public final class C18070g extends C18084u {

    /* renamed from: a */
    private String f51544a;

    /* renamed from: b */
    private String f51545b;

    /* renamed from: b */
    public final C18085v mo23506a() {
        String str;
        String str2 = this.f51544a;
        if (str2 != null && (str = this.f51545b) != null) {
            return new C18071h(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f51544a == null) {
            sb.append(" recipient");
        }
        if (this.f51545b == null) {
            sb.append(" content");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo23582c(String str) {
        if (str != null) {
            this.f51545b = str;
            return;
        }
        throw new NullPointerException("Null content");
    }

    /* renamed from: d */
    public final void mo23583d(String str) {
        if (str != null) {
            this.f51544a = str;
            return;
        }
        throw new NullPointerException("Null recipient");
    }
}
