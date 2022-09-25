package com.google.android.play.core.install;

/* renamed from: com.google.android.play.core.install.a */
/* compiled from: PG */
public final class C45197a extends InstallState {

    /* renamed from: a */
    private final int f117952a;

    /* renamed from: b */
    private final long f117953b;

    /* renamed from: c */
    private final long f117954c;

    /* renamed from: d */
    private final int f117955d;

    /* renamed from: e */
    private final String f117956e;

    public C45197a(int i, long j, long j2, int i2, String str) {
        this.f117952a = i;
        this.f117953b = j;
        this.f117954c = j2;
        this.f117955d = i2;
        if (str != null) {
            this.f117956e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final int mo49019a() {
        return this.f117955d;
    }

    /* renamed from: b */
    public final int mo49020b() {
        return this.f117952a;
    }

    /* renamed from: c */
    public final long mo49021c() {
        return this.f117953b;
    }

    /* renamed from: d */
    public final long mo49022d() {
        return this.f117954c;
    }

    /* renamed from: e */
    public final String mo49023e() {
        return this.f117956e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f117952a == installState.mo49020b() && this.f117953b == installState.mo49021c() && this.f117954c == installState.mo49022d() && this.f117955d == installState.mo49019a() && this.f117956e.equals(installState.mo49023e());
        }
    }

    public final int hashCode() {
        int i = this.f117952a;
        long j = this.f117953b;
        long j2 = this.f117954c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f117955d) * 1000003) ^ this.f117956e.hashCode();
    }

    public final String toString() {
        int i = this.f117952a;
        long j = this.f117953b;
        long j2 = this.f117954c;
        int i2 = this.f117955d;
        String str = this.f117956e;
        return "InstallState{installStatus=" + i + ", bytesDownloaded=" + j + ", totalBytesToDownload=" + j2 + ", installErrorCode=" + i2 + ", packageName=" + str + "}";
    }
}
