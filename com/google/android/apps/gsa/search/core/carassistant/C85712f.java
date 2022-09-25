package com.google.android.apps.gsa.search.core.carassistant;

import android.net.Uri;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f */
/* compiled from: PG */
final class C85712f extends C85736n {

    /* renamed from: a */
    private final Query f231773a;

    /* renamed from: b */
    private final Uri f231774b;

    /* renamed from: c */
    private final int f231775c;

    /* renamed from: d */
    private final long f231776d;

    /* renamed from: e */
    private final QueryTriggerType f231777e;

    /* renamed from: f */
    private final boolean f231778f;

    /* renamed from: g */
    private final String f231779g;

    /* renamed from: h */
    private final String f231780h;

    /* renamed from: i */
    private final boolean f231781i;

    /* renamed from: j */
    private final String f231782j;

    public C85712f(Query query, Uri uri, int i, long j, QueryTriggerType queryTriggerType, boolean z, String str, String str2, boolean z2, String str3) {
        this.f231773a = query;
        this.f231774b = uri;
        this.f231775c = i;
        this.f231776d = j;
        this.f231777e = queryTriggerType;
        this.f231778f = z;
        this.f231779g = str;
        this.f231780h = str2;
        this.f231781i = z2;
        this.f231782j = str3;
    }

    /* renamed from: a */
    public final int mo79348a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo79349b() {
        return this.f231775c;
    }

    /* renamed from: c */
    public final long mo79350c() {
        return this.f231776d;
    }

    /* renamed from: d */
    public final long mo79351d() {
        return 0;
    }

    /* renamed from: e */
    public final Uri mo79352e() {
        return this.f231774b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r1 = r7.f231779g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        r1 = r7.f231780h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r1 = r7.f231782j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.apps.gsa.search.core.carassistant.C85736n
            r2 = 0
            if (r1 == 0) goto L_0x00b4
            com.google.android.apps.gsa.search.core.carassistant.n r8 = (com.google.android.apps.gsa.search.core.carassistant.C85736n) r8
            com.google.android.apps.gsa.shared.search.Query r1 = r7.f231773a
            if (r1 != 0) goto L_0x0016
            com.google.android.apps.gsa.shared.search.Query r1 = r8.mo79354f()
            if (r1 != 0) goto L_0x00b4
            goto L_0x0020
        L_0x0016:
            com.google.android.apps.gsa.shared.search.Query r3 = r8.mo79354f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b4
        L_0x0020:
            android.net.Uri r1 = r7.f231774b
            if (r1 != 0) goto L_0x002b
            android.net.Uri r1 = r8.mo79352e()
            if (r1 != 0) goto L_0x00b4
            goto L_0x0035
        L_0x002b:
            android.net.Uri r3 = r8.mo79352e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b4
        L_0x0035:
            int r1 = r7.f231775c
            int r3 = r8.mo79349b()
            if (r1 != r3) goto L_0x00b4
            long r3 = r7.f231776d
            long r5 = r8.mo79350c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b4
            com.google.android.apps.gsa.shared.search.QueryTriggerType r1 = r7.f231777e
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = r8.mo79355g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r7.f231778f
            boolean r3 = r8.mo79361l()
            if (r1 != r3) goto L_0x00b4
            java.lang.String r1 = r7.f231779g
            if (r1 != 0) goto L_0x0066
            java.lang.String r1 = r8.mo79359j()
            if (r1 != 0) goto L_0x00b4
            goto L_0x0070
        L_0x0066:
            java.lang.String r3 = r8.mo79359j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b4
        L_0x0070:
            java.lang.String r1 = r7.f231780h
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = r8.mo79358i()
            if (r1 != 0) goto L_0x00b4
            goto L_0x0085
        L_0x007b:
            java.lang.String r3 = r8.mo79358i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b4
        L_0x0085:
            boolean r1 = r7.f231781i
            boolean r3 = r8.mo79360k()
            if (r1 != r3) goto L_0x00b4
            int r1 = r8.mo79348a()
            if (r1 != 0) goto L_0x00b4
            long r3 = r8.mo79351d()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b4
            java.lang.String r1 = r7.f231782j
            if (r1 != 0) goto L_0x00a8
            java.lang.String r8 = r8.mo79356h()
            if (r8 != 0) goto L_0x00b4
            goto L_0x00b3
        L_0x00a8:
            java.lang.String r8 = r8.mo79356h()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            return r0
        L_0x00b4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.C85712f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Query mo79354f() {
        return this.f231773a;
    }

    /* renamed from: g */
    public final QueryTriggerType mo79355g() {
        return this.f231777e;
    }

    /* renamed from: h */
    public final String mo79356h() {
        return this.f231782j;
    }

    /* renamed from: i */
    public final String mo79358i() {
        return this.f231780h;
    }

    /* renamed from: j */
    public final String mo79359j() {
        return this.f231779g;
    }

    /* renamed from: k */
    public final boolean mo79360k() {
        return this.f231781i;
    }

    /* renamed from: l */
    public final boolean mo79361l() {
        return this.f231778f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f231773a);
        String valueOf2 = String.valueOf(this.f231774b);
        int i = this.f231775c;
        long j = this.f231776d;
        String obj = this.f231777e.toString();
        boolean z = this.f231778f;
        String str = this.f231779g;
        String str2 = this.f231780h;
        boolean z2 = this.f231781i;
        String str3 = this.f231782j;
        return "Spec{baseQuery=" + valueOf + ", audioContentUri=" + valueOf2 + ", samplingRateHz=" + i + ", externalStartTimeMillis=" + j + ", triggerType=" + obj + ", reopenUriForFollowOn=" + z + ", source=" + str + ", queryText=" + str2 + ", isDeviceTriggered=" + z2 + ", audioSessionId=0, queryRequestId=0, foregroundAppPackageName=" + str3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Query query = this.f231773a;
        int i5 = 0;
        if (query == null) {
            i = 0;
        } else {
            i = query.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        Uri uri = this.f231774b;
        if (uri == null) {
            i2 = 0;
        } else {
            i2 = uri.hashCode();
        }
        int i7 = this.f231775c;
        long j = this.f231776d;
        int hashCode = (((((((i6 ^ i2) * 1000003) ^ i7) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f231777e.hashCode()) * 1000003;
        int i8 = 1237;
        int i9 = (hashCode ^ (true != this.f231778f ? 1237 : 1231)) * 1000003;
        String str = this.f231779g;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i10 = (i9 ^ i3) * 1000003;
        String str2 = this.f231780h;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i11 = (i10 ^ i4) * 1000003;
        if (true == this.f231781i) {
            i8 = 1231;
        }
        int i12 = (i11 ^ i8) * 583896283;
        String str3 = this.f231782j;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i12 ^ i5;
    }
}
