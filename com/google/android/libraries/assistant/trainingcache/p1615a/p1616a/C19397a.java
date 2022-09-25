package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.a */
/* compiled from: PG */
public final class C19397a extends C19407k {

    /* renamed from: a */
    public String f54267a;

    /* renamed from: b */
    private String f54268b;

    /* renamed from: c */
    private int f54269c;

    /* renamed from: d */
    private byte f54270d;

    /* renamed from: a */
    public final C19408l mo24544a() {
        String str;
        String str2;
        if (this.f54270d == 1 && (str = this.f54268b) != null && (str2 = this.f54267a) != null) {
            return new C19398b(str, str2, this.f54269c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f54268b == null) {
            sb.append(" population");
        }
        if (this.f54267a == null) {
            sb.append(" sessionName");
        }
        if (this.f54270d == 0) {
            sb.append(" sessionJobId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24545b(String str) {
        if (str != null) {
            this.f54268b = str;
            return;
        }
        throw new NullPointerException("Null population");
    }

    /* renamed from: c */
    public final void mo24546c(int i) {
        this.f54269c = i;
        this.f54270d = 1;
    }
}
