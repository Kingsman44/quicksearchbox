package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
import com.google.p4181bi.p4182a.C55790h;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_ExtendedData  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Email_ExtendedData extends Email.ExtendedData {

    /* renamed from: a */
    public final boolean f110639a;

    /* renamed from: b */
    public final Email.EmailSecurityData f110640b;

    /* renamed from: c */
    public final C55790h f110641c;

    public C$AutoValue_Email_ExtendedData(boolean z, Email.EmailSecurityData emailSecurityData, C55790h hVar) {
        this.f110639a = z;
        this.f110640b = emailSecurityData;
        if (hVar != null) {
            this.f110641c = hVar;
            return;
        }
        throw new NullPointerException("Null internalExternalState");
    }

    /* renamed from: a */
    public final Email.EmailSecurityData mo45000a() {
        return this.f110640b;
    }

    /* renamed from: b */
    public final C55790h mo45001b() {
        return this.f110641c;
    }

    /* renamed from: c */
    public final boolean mo45002c() {
        return this.f110639a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f110640b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.Email.ExtendedData
            r2 = 0
            if (r1 == 0) goto L_0x0036
            com.google.android.libraries.social.populous.core.Email$ExtendedData r5 = (com.google.android.libraries.social.populous.core.Email.ExtendedData) r5
            boolean r1 = r4.f110639a
            boolean r3 = r5.mo45002c()
            if (r1 != r3) goto L_0x0036
            com.google.android.libraries.social.populous.core.Email$EmailSecurityData r1 = r4.f110640b
            if (r1 != 0) goto L_0x001e
            com.google.android.libraries.social.populous.core.Email$EmailSecurityData r1 = r5.mo45000a()
            if (r1 != 0) goto L_0x0036
            goto L_0x0029
        L_0x001e:
            com.google.android.libraries.social.populous.core.Email$EmailSecurityData r3 = r5.mo45000a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0036
        L_0x0029:
            com.google.bi.a.h r1 = r4.f110641c
            com.google.bi.a.h r5 = r5.mo45001b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0036
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_Email_ExtendedData.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        boolean z = this.f110639a;
        String valueOf = String.valueOf(this.f110640b);
        String num = Integer.toString(this.f110641c.f147217e);
        return "ExtendedData{doesSmtpServerSupportTls=" + z + ", emailSecurityData=" + valueOf + ", internalExternalState=" + num + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = ((true != this.f110639a ? 1237 : 1231) ^ 1000003) * 1000003;
        Email.EmailSecurityData emailSecurityData = this.f110640b;
        if (emailSecurityData == null) {
            i = 0;
        } else {
            i = emailSecurityData.hashCode();
        }
        return ((i2 ^ i) * 1000003) ^ this.f110641c.hashCode();
    }
}
