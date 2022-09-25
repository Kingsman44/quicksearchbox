package com.google.android.libraries.lens.view.p2078at;

import android.content.Intent;

/* renamed from: com.google.android.libraries.lens.view.at.d */
/* compiled from: PG */
final class C25521d extends C25481a {

    /* renamed from: a */
    private final int f69498a;

    /* renamed from: b */
    private final Intent f69499b;

    public C25521d(int i, Intent intent) {
        this.f69498a = i;
        this.f69499b = intent;
    }

    /* renamed from: a */
    public final int mo30515a() {
        return this.f69498a;
    }

    /* renamed from: b */
    public final Intent mo30516b() {
        return this.f69499b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f69499b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.p2078at.C25481a
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.lens.view.at.a r5 = (com.google.android.libraries.lens.view.p2078at.C25481a) r5
            int r1 = r4.f69498a
            int r3 = r5.mo30515a()
            if (r1 != r3) goto L_0x002a
            android.content.Intent r1 = r4.f69499b
            if (r1 != 0) goto L_0x001e
            android.content.Intent r5 = r5.mo30516b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            android.content.Intent r5 = r5.mo30516b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2078at.C25521d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f69498a ^ 1000003) * 1000003;
        Intent intent = this.f69499b;
        return i ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        int i = this.f69498a;
        String valueOf = String.valueOf(this.f69499b);
        return "PendingResult{resultCode=" + i + ", data=" + valueOf + "}";
    }
}
