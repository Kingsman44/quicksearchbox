package com.google.android.play.core.p3534f;

import java.io.File;

/* renamed from: com.google.android.play.core.f.b */
/* compiled from: PG */
final class C45087b extends C45112t {

    /* renamed from: a */
    private final File f117752a;

    /* renamed from: b */
    private final String f117753b;

    public C45087b(File file, String str) {
        if (file != null) {
            this.f117752a = file;
            if (str != null) {
                this.f117753b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* renamed from: a */
    public final File mo48919a() {
        return this.f117752a;
    }

    /* renamed from: b */
    public final String mo48920b() {
        return this.f117753b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45112t) {
            C45112t tVar = (C45112t) obj;
            return this.f117752a.equals(tVar.mo48919a()) && this.f117753b.equals(tVar.mo48920b());
        }
    }

    public final int hashCode() {
        return ((this.f117752a.hashCode() ^ 1000003) * 1000003) ^ this.f117753b.hashCode();
    }

    public final String toString() {
        String obj = this.f117752a.toString();
        String str = this.f117753b;
        return "SplitFileInfo{splitFile=" + obj + ", splitId=" + str + "}";
    }
}
