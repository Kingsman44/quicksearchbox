package com.google.android.apps.gsa.search.core.p6519al.p6688da;

/* renamed from: com.google.android.apps.gsa.search.core.al.da.a */
/* compiled from: PG */
public final class C85279a extends C85282b {

    /* renamed from: a */
    public final String f231045a;

    /* renamed from: b */
    public final String f231046b;

    /* renamed from: c */
    public final String f231047c;

    /* renamed from: d */
    public final String f231048d;

    public C85279a(String str, String str2, String str3, String str4) {
        this.f231045a = str;
        this.f231046b = str2;
        this.f231047c = str3;
        this.f231048d = str4;
    }

    /* renamed from: a */
    public final String mo78839a() {
        return this.f231048d;
    }

    /* renamed from: b */
    public final String mo78840b() {
        return this.f231047c;
    }

    /* renamed from: c */
    public final String mo78841c() {
        return this.f231046b;
    }

    /* renamed from: d */
    public final String mo78842d() {
        return this.f231045a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C85282b) {
            C85282b bVar = (C85282b) obj;
            String str = this.f231045a;
            if (str != null ? str.equals(bVar.mo78842d()) : bVar.mo78842d() == null) {
                String str2 = this.f231046b;
                if (str2 != null ? str2.equals(bVar.mo78841c()) : bVar.mo78841c() == null) {
                    String str3 = this.f231047c;
                    if (str3 != null ? str3.equals(bVar.mo78840b()) : bVar.mo78840b() == null) {
                        String str4 = this.f231048d;
                        if (str4 != null ? str4.equals(bVar.mo78839a()) : bVar.mo78839a() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f231045a;
        String str2 = this.f231046b;
        String str3 = this.f231047c;
        String str4 = this.f231048d;
        return "ShareContent{sheetTitle=" + str + ", plainText=" + str2 + ", pageUrl=" + str3 + ", imageUrl=" + str4 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f231045a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        String str2 = this.f231046b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        String str3 = this.f231047c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        String str4 = this.f231048d;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 ^ i4;
    }
}
