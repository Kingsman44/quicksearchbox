package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.b */
/* compiled from: PG */
final class C61587b extends C61610x {

    /* renamed from: a */
    private final AccountId f166443a;

    /* renamed from: b */
    private final String f166444b;

    public C61587b(AccountId accountId, String str) {
        this.f166443a = accountId;
        this.f166444b = str;
    }

    /* renamed from: a */
    public final AccountId mo58135a() {
        return this.f166443a;
    }

    /* renamed from: b */
    public final String mo58136b() {
        return this.f166444b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f166444b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.frameworks.client.data.android.server.tiktok.C61610x
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.frameworks.client.data.android.server.tiktok.x r5 = (com.google.frameworks.client.data.android.server.tiktok.C61610x) r5
            com.google.apps.tiktok.account.AccountId r1 = r4.f166443a
            com.google.apps.tiktok.account.AccountId r3 = r5.mo58135a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r4.f166444b
            if (r1 != 0) goto L_0x0022
            java.lang.String r5 = r5.mo58136b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.String r5 = r5.mo58136b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.server.tiktok.C61587b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f166443a.hashCode() ^ 1000003) * 1000003;
        String str = this.f166444b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f166443a.toString();
        String str = this.f166444b;
        return "CallScope{accountId=" + obj + ", alternateService=" + str + "}";
    }
}
