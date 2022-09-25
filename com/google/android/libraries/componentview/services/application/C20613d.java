package com.google.android.libraries.componentview.services.application;

/* renamed from: com.google.android.libraries.componentview.services.application.d */
/* compiled from: PG */
public final class C20613d extends C20597bx {

    /* renamed from: a */
    public String f57814a;

    /* renamed from: b */
    public String f57815b;

    /* renamed from: c */
    public String f57816c;

    /* renamed from: d */
    public String f57817d;

    /* renamed from: e */
    public String f57818e;

    /* renamed from: f */
    public String f57819f;

    /* renamed from: g */
    public Long f57820g;

    /* renamed from: a */
    public final LogData mo25528a() {
        String str;
        String str2 = this.f57814a;
        if (str2 != null && (str = this.f57815b) != null) {
            return new AutoValue_LogData(str2, str, this.f57816c, this.f57817d, this.f57818e, this.f57819f, this.f57820g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f57814a == null) {
            sb.append(" url");
        }
        if (this.f57815b == null) {
            sb.append(" ved");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo25529b(String str) {
        if (str != null) {
            this.f57814a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: c */
    public final void mo25530c(String str) {
        if (str != null) {
            this.f57815b = str;
            return;
        }
        throw new NullPointerException("Null ved");
    }
}
