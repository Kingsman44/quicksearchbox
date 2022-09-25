package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.ap */
/* compiled from: PG */
public class C2589ap {

    /* renamed from: a */
    public final Uri f7145a;

    /* renamed from: b */
    public final String f7146b;

    /* renamed from: c */
    public final String f7147c;

    /* renamed from: d */
    public final int f7148d = 1;

    /* renamed from: e */
    public final int f7149e = 0;

    /* renamed from: f */
    public final String f7150f = null;

    /* renamed from: g */
    public final String f7151g = null;

    public C2589ap(Uri uri, String str, String str2) {
        this.f7145a = uri;
        this.f7146b = str;
        this.f7147c = str2;
    }

    public C2589ap(C2588ao aoVar) {
        this.f7145a = aoVar.f7142a;
        this.f7146b = aoVar.f7143b;
        this.f7147c = aoVar.f7144c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2589ap)) {
            return false;
        }
        C2589ap apVar = (C2589ap) obj;
        if (this.f7145a.equals(apVar.f7145a) && C2612ak.m6951aa(this.f7146b, apVar.f7146b) && C2612ak.m6951aa(this.f7147c, apVar.f7147c)) {
            int i = apVar.f7148d;
            int i2 = apVar.f7149e;
            String str = apVar.f7150f;
            if (C2612ak.m6951aa((Object) null, (Object) null)) {
                String str2 = apVar.f7151g;
                if (C2612ak.m6951aa((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f7145a.hashCode() * 31) + this.f7146b.hashCode()) * 31;
        String str = this.f7147c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return (((hashCode + i) * 31) + 1) * 29791;
    }
}
