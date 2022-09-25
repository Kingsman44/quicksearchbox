package com.google.android.apps.p8928i.p8932c.p8933a;

/* renamed from: com.google.android.apps.i.c.a.c */
/* compiled from: PG */
public final class C119152c extends C119157h {

    /* renamed from: a */
    public int f332324a;

    /* renamed from: b */
    private String f332325b;

    /* renamed from: a */
    public final C119158i mo104217a() {
        int i;
        String str = this.f332325b;
        if (str != null && (i = this.f332324a) != 0) {
            return new C119153d(str, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f332325b == null) {
            sb.append(" id");
        }
        if (this.f332324a == 0) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104218b(String str) {
        if (str != null) {
            this.f332325b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }
}
