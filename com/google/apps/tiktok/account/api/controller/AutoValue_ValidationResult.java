package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;

/* compiled from: PG */
final class AutoValue_ValidationResult extends ValidationResult {

    /* renamed from: a */
    private final boolean f120792a;

    /* renamed from: b */
    private final boolean f120793b;

    /* renamed from: c */
    private final Intent f120794c;

    public AutoValue_ValidationResult(boolean z, boolean z2, Intent intent) {
        this.f120792a = z;
        this.f120793b = z2;
        this.f120794c = intent;
    }

    /* renamed from: a */
    public final Intent mo50106a() {
        return this.f120794c;
    }

    /* renamed from: b */
    public final boolean mo50107b() {
        return this.f120793b;
    }

    /* renamed from: c */
    public final boolean mo50108c() {
        return this.f120792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f120794c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.account.api.controller.ValidationResult
            r2 = 0
            if (r1 == 0) goto L_0x0032
            com.google.apps.tiktok.account.api.controller.ValidationResult r5 = (com.google.apps.tiktok.account.api.controller.ValidationResult) r5
            boolean r1 = r4.f120792a
            boolean r3 = r5.mo50108c()
            if (r1 != r3) goto L_0x0032
            boolean r1 = r4.f120793b
            boolean r3 = r5.mo50107b()
            if (r1 != r3) goto L_0x0032
            android.content.Intent r1 = r4.f120794c
            if (r1 != 0) goto L_0x0026
            android.content.Intent r5 = r5.mo50106a()
            if (r5 != 0) goto L_0x0032
            goto L_0x0031
        L_0x0026:
            android.content.Intent r5 = r5.mo50106a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return r0
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f120792a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f120793b) {
            i = 1231;
        }
        int i3 = (i2 ^ i) * 1000003;
        Intent intent = this.f120794c;
        return i3 ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        boolean z = this.f120792a;
        boolean z2 = this.f120793b;
        String valueOf = String.valueOf(this.f120794c);
        return "ValidationResult{isValid=" + z + ", clearState=" + z2 + ", getIntentToMeet=" + valueOf + "}";
    }
}
