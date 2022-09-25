package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bk */
/* compiled from: PG */
final class C80682bk extends C80765em {

    /* renamed from: a */
    private final boolean f221525a;

    /* renamed from: b */
    private final boolean f221526b;

    /* renamed from: c */
    private final C58495hd f221527c;

    /* renamed from: d */
    private final C58495hd f221528d;

    public C80682bk(boolean z, boolean z2, C58495hd hdVar, C58495hd hdVar2) {
        this.f221525a = z;
        this.f221526b = z2;
        this.f221527c = hdVar;
        this.f221528d = hdVar2;
    }

    /* renamed from: a */
    public final C58495hd mo74574a() {
        return this.f221528d;
    }

    /* renamed from: b */
    public final C58495hd mo74575b() {
        return this.f221527c;
    }

    /* renamed from: c */
    public final boolean mo74576c() {
        return this.f221526b;
    }

    /* renamed from: d */
    public final boolean mo74577d() {
        return this.f221525a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80765em) {
            C80765em emVar = (C80765em) obj;
            return this.f221525a == emVar.mo74577d() && this.f221526b == emVar.mo74576c() && this.f221527c.equals(emVar.mo74575b()) && this.f221528d.equals(emVar.mo74574a());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f221525a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f221526b) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ C58758qx.m90643a(this.f221527c.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f221528d.entrySet());
    }

    public final String toString() {
        boolean z = this.f221525a;
        boolean z2 = this.f221526b;
        String obj = this.f221527c.toString();
        String obj2 = this.f221528d.toString();
        return "SecondaryDisplayState{show=" + z + ", forceEnable=" + z2 + ", featureMap=" + obj + ", categoryFeatureMap=" + obj2 + "}";
    }
}
