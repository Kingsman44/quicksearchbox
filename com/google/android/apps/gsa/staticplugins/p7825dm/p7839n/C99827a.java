package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.a */
/* compiled from: PG */
final class C99827a extends C99828b {

    /* renamed from: a */
    private final String f279279a;

    /* renamed from: b */
    private final byte[] f279280b;

    /* renamed from: c */
    private final String f279281c;

    public C99827a(String str, byte[] bArr, String str2) {
        this.f279279a = str;
        this.f279280b = bArr;
        this.f279281c = str2;
    }

    /* renamed from: a */
    public final String mo91608a() {
        return this.f279281c;
    }

    /* renamed from: b */
    public final String mo91609b() {
        return this.f279279a;
    }

    /* renamed from: c */
    public final byte[] mo91610c() {
        return this.f279280b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C99828b) {
            C99828b bVar = (C99828b) obj;
            if (this.f279279a.equals(bVar.mo91609b())) {
                return Arrays.equals(this.f279280b, bVar instanceof C99827a ? ((C99827a) bVar).f279280b : bVar.mo91610c()) && this.f279281c.equals(bVar.mo91608a());
            }
        }
    }

    public final int hashCode() {
        return ((((this.f279279a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f279280b)) * 1000003) ^ this.f279281c.hashCode();
    }

    public final String toString() {
        String str = this.f279279a;
        String arrays = Arrays.toString(this.f279280b);
        String str2 = this.f279281c;
        return "ImageData{url=" + str + ", data=" + arrays + ", contentType=" + str2 + "}";
    }
}
