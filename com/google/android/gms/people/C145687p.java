package com.google.android.gms.people;

import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;

/* renamed from: com.google.android.gms.people.p */
/* compiled from: PG */
public final class C145687p implements C143721f {

    /* renamed from: a */
    public final int f393928a;

    /* renamed from: b */
    private final String f393929b = null;

    public C145687p(C145686o oVar) {
        this.f393928a = oVar.f393927a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C145687p)) {
            return false;
        }
        C145687p pVar = (C145687p) obj;
        if (this.f393928a == pVar.f393928a) {
            String str = pVar.f393929b;
            if (C143912ba.m233950b((Object) null, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393928a), null});
    }
}
