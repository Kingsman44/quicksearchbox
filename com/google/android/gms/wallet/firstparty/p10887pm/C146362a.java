package com.google.android.gms.wallet.firstparty.p10887pm;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.wallet.firstparty.C146349a;

/* renamed from: com.google.android.gms.wallet.firstparty.pm.a */
/* compiled from: PG */
public final class C146362a extends C146349a {
    public C146362a(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER", "flow_pm");
    }

    /* renamed from: a */
    public final void mo122943a() {
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) this.f395377c.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] byteArrayExtra = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        C143919bh.m233960c(securePaymentsPayload != null || z2 || z3, "One of SecurePaymentsPayload, encrypted parameters, or unencrypted parameters required");
        if (securePaymentsPayload != null) {
            byte[] bArr = securePaymentsPayload.f395384a;
            C143919bh.m233960c((bArr == null || bArr.length == 0) ? false : true, "SecurePaymentsPayload requires an opaque token");
            if (z2 || z3) {
                z = false;
            }
            C143919bh.m233960c(z, "Can't have both SecurePaymentsPayload and either encrypted or unencrypted parameters");
        }
    }
}
