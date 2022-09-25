package com.google.android.gms.location;

import android.os.Build;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.identity.ClientIdentity;

/* renamed from: com.google.android.gms.location.au */
/* compiled from: PG */
public final class C144890au {

    /* renamed from: a */
    public int f391827a;

    /* renamed from: b */
    public long f391828b;

    /* renamed from: c */
    public float f391829c;

    /* renamed from: d */
    public boolean f391830d;

    /* renamed from: e */
    public int f391831e;

    /* renamed from: f */
    public int f391832f;

    /* renamed from: g */
    public boolean f391833g;

    /* renamed from: h */
    public WorkSource f391834h;

    /* renamed from: i */
    private final long f391835i;

    /* renamed from: j */
    private final long f391836j;

    /* renamed from: k */
    private long f391837k;

    /* renamed from: l */
    private final int f391838l;

    /* renamed from: m */
    private long f391839m;

    /* renamed from: n */
    private String f391840n;

    /* renamed from: o */
    private final ClientIdentity f391841o;

    public C144890au() {
        this.f391835i = 500;
        this.f391827a = 102;
        this.f391828b = -1;
        this.f391836j = 0;
        this.f391837k = Long.MAX_VALUE;
        this.f391838l = Integer.MAX_VALUE;
        this.f391829c = 0.0f;
        this.f391830d = true;
        this.f391839m = -1;
        this.f391831e = 0;
        this.f391832f = 0;
        this.f391840n = null;
        this.f391833g = false;
        this.f391834h = null;
        this.f391841o = null;
    }

    public C144890au(int i, long j) {
        C143919bh.m233960c(j >= 0, "intervalMillis must be greater than or equal to 0");
        C144901be.m235500b(i);
        this.f391827a = i;
        this.f391835i = j;
        this.f391828b = -1;
        this.f391836j = 0;
        this.f391837k = Long.MAX_VALUE;
        this.f391838l = Integer.MAX_VALUE;
        this.f391829c = 0.0f;
        this.f391830d = true;
        this.f391839m = -1;
        this.f391831e = 0;
        this.f391832f = 0;
        this.f391840n = null;
        this.f391833g = false;
        this.f391834h = null;
        this.f391841o = null;
    }

    public C144890au(LocationRequest locationRequest) {
        this.f391827a = locationRequest.f391766a;
        this.f391835i = locationRequest.f391767b;
        this.f391828b = locationRequest.f391768c;
        this.f391836j = locationRequest.f391769d;
        this.f391837k = locationRequest.f391770e;
        this.f391838l = locationRequest.f391771f;
        this.f391829c = locationRequest.f391772g;
        this.f391830d = locationRequest.f391773h;
        this.f391839m = locationRequest.f391774i;
        this.f391831e = locationRequest.f391775j;
        this.f391832f = locationRequest.f391776k;
        this.f391840n = locationRequest.f391777l;
        this.f391833g = locationRequest.f391778m;
        this.f391834h = locationRequest.f391779n;
        this.f391841o = locationRequest.f391780o;
    }

    /* renamed from: b */
    public final void mo120384b(long j) {
        C143919bh.m233960c(j > 0, "durationMillis must be greater than 0");
        this.f391837k = j;
    }

    /* renamed from: c */
    public final void mo120385c(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        C143919bh.m233960c(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.f391839m = j;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo120386d(String str) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f391840n = str;
        }
    }

    /* renamed from: a */
    public final LocationRequest mo120383a() {
        int i = this.f391827a;
        long j = this.f391835i;
        long j2 = this.f391828b;
        if (j2 == -1) {
            j2 = j;
        } else if (i != 105) {
            j2 = Math.min(j2, j);
        }
        long max = Math.max(this.f391836j, this.f391835i);
        long j3 = this.f391837k;
        int i2 = this.f391838l;
        float f = this.f391829c;
        boolean z = this.f391830d;
        long j4 = this.f391839m;
        long j5 = j4 == -1 ? this.f391835i : j4;
        int i3 = this.f391831e;
        int i4 = this.f391832f;
        String str = this.f391840n;
        boolean z2 = this.f391833g;
        WorkSource workSource = r7;
        WorkSource workSource2 = new WorkSource(this.f391834h);
        return new LocationRequest(i, j, j2, max, Long.MAX_VALUE, j3, i2, f, z, j5, i3, i4, str, z2, workSource, this.f391841o);
    }
}
