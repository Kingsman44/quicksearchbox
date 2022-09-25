package com.google.android.libraries.mdi.download.p2236d.p2237a;

import com.google.android.libraries.mdi.download.C29334dr;

/* renamed from: com.google.android.libraries.mdi.download.d.a.b */
/* compiled from: PG */
public final class C28815b extends C28817d {

    /* renamed from: a */
    private final C29334dr f78284a;

    /* renamed from: b */
    private final C29334dr f78285b;

    public C28815b(C29334dr drVar, C29334dr drVar2) {
        this.f78284a = drVar;
        this.f78285b = drVar2;
    }

    /* renamed from: a */
    public final C29334dr mo34488a() {
        return this.f78285b;
    }

    /* renamed from: b */
    public final C29334dr mo34489b() {
        return this.f78284a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28817d) {
            C28817d dVar = (C28817d) obj;
            C29334dr drVar = this.f78284a;
            if (drVar != null ? drVar.equals(dVar.mo34489b()) : dVar.mo34489b() == null) {
                C29334dr drVar2 = this.f78285b;
                if (drVar2 != null ? drVar2.equals(dVar.mo34488a()) : dVar.mo34488a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f78284a);
        String valueOf2 = String.valueOf(this.f78285b);
        return "GroupPair{pendingGroup=" + valueOf + ", downloadedGroup=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        C29334dr drVar = this.f78284a;
        int i2 = 0;
        if (drVar == null) {
            i = 0;
        } else {
            i = drVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C29334dr drVar2 = this.f78285b;
        if (drVar2 != null) {
            i2 = drVar2.hashCode();
        }
        return i3 ^ i2;
    }
}
