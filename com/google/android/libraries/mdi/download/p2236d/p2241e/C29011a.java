package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60141bf;

/* renamed from: com.google.android.libraries.mdi.download.d.e.a */
/* compiled from: PG */
final class C29011a extends C29036c {

    /* renamed from: a */
    private final C60141bf f78771a;

    /* renamed from: b */
    private final C60126ar f78772b;

    public C29011a(C60141bf bfVar, C60126ar arVar) {
        if (bfVar != null) {
            this.f78771a = bfVar;
            if (arVar != null) {
                this.f78772b = arVar;
                return;
            }
            throw new NullPointerException("Null fileGroupDetails");
        }
        throw new NullPointerException("Null fileGroupStatus");
    }

    /* renamed from: a */
    public final C60126ar mo34531a() {
        return this.f78772b;
    }

    /* renamed from: b */
    public final C60141bf mo34532b() {
        return this.f78771a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29036c) {
            C29036c cVar = (C29036c) obj;
            return this.f78771a.equals(cVar.mo34532b()) && this.f78772b.equals(cVar.mo34531a());
        }
    }

    public final int hashCode() {
        return ((this.f78771a.hashCode() ^ 1000003) * 1000003) ^ this.f78772b.hashCode();
    }

    public final String toString() {
        String obj = this.f78771a.toString();
        String obj2 = this.f78772b.toString();
        return "FileGroupStatusWithDetails{fileGroupStatus=" + obj + ", fileGroupDetails=" + obj2 + "}";
    }
}
