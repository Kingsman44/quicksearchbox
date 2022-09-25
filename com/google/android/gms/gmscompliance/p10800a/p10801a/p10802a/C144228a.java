package com.google.android.gms.gmscompliance.p10800a.p10801a.p10802a;

/* renamed from: com.google.android.gms.gmscompliance.a.a.a.a */
/* compiled from: PG */
public final class C144228a extends C144230c {

    /* renamed from: a */
    public String f390667a;

    /* renamed from: b */
    public String f390668b;

    /* renamed from: c */
    private int f390669c;

    /* renamed from: d */
    private byte f390670d;

    /* renamed from: a */
    public final C144231d mo119773a() {
        if (this.f390670d == 1 && this.f390667a != null && this.f390668b != null) {
            return new C144229b(this.f390667a, this.f390669c, this.f390668b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f390667a == null) {
            sb.append(" hostName");
        }
        if (this.f390670d == 0) {
            sb.append(" hostPort");
        }
        if (this.f390668b == null) {
            sb.append(" apiKey");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo119774b(int i) {
        this.f390669c = 443;
        this.f390670d = 1;
    }
}
