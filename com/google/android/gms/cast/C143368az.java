package com.google.android.gms.cast;

import com.google.android.gms.common.internal.C143912ba;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.az */
/* compiled from: PG */
public final class C143368az {

    /* renamed from: a */
    public final long f388822a;

    /* renamed from: b */
    private final int f388823b = 0;

    /* renamed from: c */
    private final boolean f388824c = false;

    /* renamed from: d */
    private final JSONObject f388825d = null;

    public C143368az(long j) {
        this.f388822a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143368az)) {
            return false;
        }
        C143368az azVar = (C143368az) obj;
        if (this.f388822a == azVar.f388822a) {
            int i = azVar.f388823b;
            boolean z = azVar.f388824c;
            JSONObject jSONObject = azVar.f388825d;
            if (C143912ba.m233950b((Object) null, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f388822a), 0, false, null});
    }
}
