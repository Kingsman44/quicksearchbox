package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.bl */
/* compiled from: PG */
final class C143764bl {

    /* renamed from: a */
    public final C143820i f389760a;

    /* renamed from: b */
    public final Feature f389761b;

    public C143764bl(C143820i iVar, Feature feature) {
        this.f389760a = iVar;
        this.f389761b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C143764bl)) {
            C143764bl blVar = (C143764bl) obj;
            if (!C143912ba.m233950b(this.f389760a, blVar.f389760a) || !C143912ba.m233950b(this.f389761b, blVar.f389761b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389760a, this.f389761b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("key", this.f389760a, arrayList);
        C143910az.m233947b("feature", this.f389761b, arrayList);
        return C143910az.m233946a(arrayList, this);
    }
}
