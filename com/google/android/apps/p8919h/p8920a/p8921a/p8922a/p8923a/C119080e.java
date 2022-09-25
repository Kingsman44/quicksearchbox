package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;

/* renamed from: com.google.android.apps.h.a.a.a.a.e */
/* compiled from: PG */
public final class C119080e extends C119088m {

    /* renamed from: a */
    public final C119103al f332187a;

    /* renamed from: b */
    public final int f332188b;

    /* renamed from: c */
    public final int f332189c;

    /* renamed from: d */
    public final String f332190d;

    public C119080e(C119103al alVar, int i, int i2, String str) {
        if (alVar != null) {
            this.f332187a = alVar;
            this.f332188b = i;
            this.f332189c = i2;
            if (str != null) {
                this.f332190d = str;
                return;
            }
            throw new NullPointerException("Null playbackSessionId");
        }
        throw new NullPointerException("Null speakrInput");
    }

    /* renamed from: a */
    public final int mo104147a() {
        return this.f332188b;
    }

    /* renamed from: b */
    public final int mo104148b() {
        return this.f332189c;
    }

    /* renamed from: c */
    public final C119103al mo104149c() {
        return this.f332187a;
    }

    /* renamed from: d */
    public final String mo104150d() {
        return this.f332190d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119088m) {
            C119088m mVar = (C119088m) obj;
            return this.f332187a.equals(mVar.mo104149c()) && this.f332188b == mVar.mo104147a() && this.f332189c == mVar.mo104148b() && this.f332190d.equals(mVar.mo104150d());
        }
    }

    public final int hashCode() {
        return ((((((this.f332187a.hashCode() ^ 1000003) * 1000003) ^ this.f332188b) * 1000003) ^ this.f332189c) * 1000003) ^ this.f332190d.hashCode();
    }

    public final String toString() {
        String obj = this.f332187a.toString();
        int i = this.f332188b;
        int i2 = this.f332189c;
        String str = this.f332190d;
        return "RequestId{speakrInput=" + obj + ", paragraphIndex=" + i + ", paragraphsCount=" + i2 + ", playbackSessionId=" + str + "}";
    }
}
