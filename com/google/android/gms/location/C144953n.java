package com.google.android.gms.location;

import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;

/* renamed from: com.google.android.gms.location.n */
/* compiled from: PG */
public final class C144953n {

    /* renamed from: a */
    public long f391906a = 60000;

    /* renamed from: b */
    private int f391907b = 102;

    /* renamed from: a */
    public final CurrentLocationRequest mo120457a() {
        return new CurrentLocationRequest(this.f391906a, 0, this.f391907b, Long.MAX_VALUE, false, 0, (String) null, new WorkSource((WorkSource) null), (ClientIdentity) null);
    }

    /* renamed from: b */
    public final void mo120458b() {
        C144901be.m235500b(100);
        this.f391907b = 100;
    }
}
