package com.google.android.apps.gsa.nga.engine.p6032h.p6033a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.h.a.a */
/* compiled from: PG */
final class C76144a extends C76145b {

    /* renamed from: a */
    private final String f211120a;

    /* renamed from: b */
    private final String f211121b;

    /* renamed from: c */
    private final C58485gu f211122c;

    public C76144a(String str, String str2, C58485gu guVar) {
        if (str != null) {
            this.f211120a = str;
            if (str2 != null) {
                this.f211121b = str2;
                if (guVar != null) {
                    this.f211122c = guVar;
                    return;
                }
                throw new NullPointerException("Null emailAddresses");
            }
            throw new NullPointerException("Null photoUrl");
        }
        throw new NullPointerException("Null displayName");
    }

    /* renamed from: a */
    public final C58485gu mo72085a() {
        return this.f211122c;
    }

    /* renamed from: b */
    public final String mo72086b() {
        return this.f211120a;
    }

    /* renamed from: c */
    public final String mo72087c() {
        return this.f211121b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76145b) {
            C76145b bVar = (C76145b) obj;
            return this.f211120a.equals(bVar.mo72086b()) && this.f211121b.equals(bVar.mo72087c()) && C58597ky.m90218i(this.f211122c, bVar.mo72085a());
        }
    }

    public final int hashCode() {
        return ((((this.f211120a.hashCode() ^ 1000003) * 1000003) ^ this.f211121b.hashCode()) * 1000003) ^ this.f211122c.hashCode();
    }

    public final String toString() {
        String str = this.f211120a;
        String str2 = this.f211121b;
        String obj = this.f211122c.toString();
        return "CloudContact{displayName=" + str + ", photoUrl=" + str2 + ", emailAddresses=" + obj + "}";
    }
}
