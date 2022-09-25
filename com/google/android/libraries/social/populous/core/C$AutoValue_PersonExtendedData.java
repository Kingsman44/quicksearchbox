package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_PersonExtendedData  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_PersonExtendedData extends PersonExtendedData {

    /* renamed from: a */
    public final boolean f110659a;

    /* renamed from: b */
    public final DynamiteExtendedData f110660b;

    public C$AutoValue_PersonExtendedData(boolean z, DynamiteExtendedData dynamiteExtendedData) {
        this.f110659a = z;
        this.f110660b = dynamiteExtendedData;
    }

    /* renamed from: a */
    public final DynamiteExtendedData mo45034a() {
        return this.f110660b;
    }

    /* renamed from: b */
    public final boolean mo45035b() {
        return this.f110659a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f110660b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.PersonExtendedData
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.social.populous.core.PersonExtendedData r5 = (com.google.android.libraries.social.populous.core.PersonExtendedData) r5
            boolean r1 = r4.f110659a
            boolean r3 = r5.mo45035b()
            if (r1 != r3) goto L_0x002a
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r1 = r4.f110660b
            if (r1 != 0) goto L_0x001e
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r5 = r5.mo45034a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r5 = r5.mo45034a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_PersonExtendedData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = ((true != this.f110659a ? 1237 : 1231) ^ 1000003) * 1000003;
        DynamiteExtendedData dynamiteExtendedData = this.f110660b;
        return i ^ (dynamiteExtendedData == null ? 0 : dynamiteExtendedData.hashCode());
    }

    public final String toString() {
        boolean z = this.f110659a;
        String valueOf = String.valueOf(this.f110660b);
        return "PersonExtendedData{tlsIsPlaceholder=" + z + ", dynamiteExtendedData=" + valueOf + "}";
    }
}
