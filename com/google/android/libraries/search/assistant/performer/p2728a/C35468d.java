package com.google.android.libraries.search.assistant.performer.p2728a;

import android.content.Intent;

/* renamed from: com.google.android.libraries.search.assistant.performer.a.d */
/* compiled from: PG */
public final class C35468d extends C35465a {

    /* renamed from: a */
    private final int f93158a;

    /* renamed from: b */
    private final Intent f93159b;

    public C35468d(int i, Intent intent) {
        this.f93158a = i;
        this.f93159b = intent;
    }

    /* renamed from: a */
    public final int mo39651a() {
        return this.f93158a;
    }

    /* renamed from: b */
    public final Intent mo39652b() {
        return this.f93159b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f93159b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.search.assistant.performer.p2728a.C35465a
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.search.assistant.performer.a.a r5 = (com.google.android.libraries.search.assistant.performer.p2728a.C35465a) r5
            int r1 = r4.f93158a
            int r3 = r5.mo39651a()
            if (r1 != r3) goto L_0x002a
            android.content.Intent r1 = r4.f93159b
            if (r1 != 0) goto L_0x001e
            android.content.Intent r5 = r5.mo39652b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            android.content.Intent r5 = r5.mo39652b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2728a.C35468d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f93158a ^ 1000003) * 1000003;
        Intent intent = this.f93159b;
        return i ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        int i = this.f93158a;
        String valueOf = String.valueOf(this.f93159b);
        return "ActivityResult{resultCode=" + i + ", intent=" + valueOf + "}";
    }
}
