package androidx.core.app;

import android.app.PendingIntent;

@Deprecated
/* renamed from: androidx.core.app.aa */
/* compiled from: PG */
public final class C1784aa {

    /* renamed from: a */
    public final String[] f5562a;

    /* renamed from: b */
    public final C1811ba f5563b;

    /* renamed from: c */
    public final PendingIntent f5564c;

    /* renamed from: d */
    public final long f5565d;

    /* renamed from: e */
    private final String[] f5566e;

    public C1784aa(String[] strArr, C1811ba baVar, PendingIntent pendingIntent, String[] strArr2, long j) {
        this.f5562a = strArr;
        this.f5563b = baVar;
        this.f5564c = pendingIntent;
        this.f5566e = strArr2;
        this.f5565d = j;
    }

    /* renamed from: a */
    public final String mo4985a() {
        String[] strArr = this.f5566e;
        if (strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }
}
