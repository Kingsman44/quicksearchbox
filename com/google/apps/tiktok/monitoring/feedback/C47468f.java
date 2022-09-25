package com.google.apps.tiktok.monitoring.feedback;

import android.net.Uri;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.f */
/* compiled from: PG */
final class C47468f extends C47488y {

    /* renamed from: a */
    private final String f123266a;

    /* renamed from: b */
    private final Uri f123267b;

    /* renamed from: c */
    private final C58485gu f123268c;

    public C47468f(String str, Uri uri, C58485gu guVar) {
        this.f123266a = str;
        this.f123267b = uri;
        this.f123268c = guVar;
    }

    /* renamed from: a */
    public final Uri mo51322a() {
        return this.f123267b;
    }

    /* renamed from: b */
    public final C58485gu mo51323b() {
        return this.f123268c;
    }

    /* renamed from: c */
    public final String mo51324c() {
        return this.f123266a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47488y) {
            C47488y yVar = (C47488y) obj;
            return this.f123266a.equals(yVar.mo51324c()) && this.f123267b.equals(yVar.mo51322a()) && C58597ky.m90218i(this.f123268c, yVar.mo51323b());
        }
    }

    public final int hashCode() {
        return ((((this.f123266a.hashCode() ^ 1000003) * 1000003) ^ this.f123267b.hashCode()) * 1000003) ^ this.f123268c.hashCode();
    }

    public final String toString() {
        String str = this.f123266a;
        String obj = this.f123267b.toString();
        String valueOf = String.valueOf(this.f123268c);
        return "HelpOptions{helpCenterContext=" + str + ", fallbackSupportUri=" + obj + ", overflowMenuItems=" + valueOf + "}";
    }
}
