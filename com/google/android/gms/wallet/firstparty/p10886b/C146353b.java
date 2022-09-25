package com.google.android.gms.wallet.firstparty.p10886b;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.wallet.firstparty.C146349a;

/* renamed from: com.google.android.gms.wallet.firstparty.b.b */
/* compiled from: PG */
public class C146353b extends C146349a {
    public C146353b(Context context, String str) {
        super(context, str, "flow_im");
    }

    /* renamed from: a */
    public final void mo122943a() {
        byte[] byteArrayExtra = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        if (!z2 && !z3) {
            z = false;
        }
        C143919bh.m233960c(z, "Either Instrument Manager params or initialization token is required");
    }
}
