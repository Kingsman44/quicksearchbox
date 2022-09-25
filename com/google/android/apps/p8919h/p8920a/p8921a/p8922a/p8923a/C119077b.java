package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.h.a.a.a.a.b */
/* compiled from: PG */
public final class C119077b extends C119084i {

    /* renamed from: a */
    private final C63088z f332176a;

    /* renamed from: b */
    private final String f332177b;

    /* renamed from: c */
    private final C62910ar f332178c;

    public C119077b(C63088z zVar, String str, C62910ar arVar) {
        if (zVar != null) {
            this.f332176a = zVar;
            if (str != null) {
                this.f332177b = str;
                if (arVar != null) {
                    this.f332178c = arVar;
                    return;
                }
                throw new NullPointerException("Null duration");
            }
            throw new NullPointerException("Null audioFormat");
        }
        throw new NullPointerException("Null audio");
    }

    /* renamed from: a */
    public final C63088z mo104130a() {
        return this.f332176a;
    }

    /* renamed from: b */
    public final C62910ar mo104131b() {
        return this.f332178c;
    }

    /* renamed from: c */
    public final String mo104132c() {
        return this.f332177b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119084i) {
            C119084i iVar = (C119084i) obj;
            return this.f332176a.equals(iVar.mo104130a()) && this.f332177b.equals(iVar.mo104132c()) && this.f332178c.equals(iVar.mo104131b());
        }
    }

    public final int hashCode() {
        return ((((this.f332176a.hashCode() ^ 1000003) * 1000003) ^ this.f332177b.hashCode()) * 1000003) ^ this.f332178c.hashCode();
    }

    public final String toString() {
        String obj = this.f332176a.toString();
        String str = this.f332177b;
        String obj2 = this.f332178c.toString();
        return "ParagraphAudio{audio=" + obj + ", audioFormat=" + str + ", duration=" + obj2 + "}";
    }
}
