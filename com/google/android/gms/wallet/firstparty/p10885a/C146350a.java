package com.google.android.gms.wallet.firstparty.p10885a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.wallet.firstparty.C146349a;

/* renamed from: com.google.android.gms.wallet.firstparty.a.a */
/* compiled from: PG */
public final class C146350a extends C146349a {
    public C146350a(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_COLLECT_ADDRESS", BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final void mo122943a() {
        byte[] byteArrayExtra = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = this.f395377c.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        if ((byteArrayExtra == null || byteArrayExtra.length <= 0) && (byteArrayExtra2 == null || byteArrayExtra2.length <= 0)) {
            z = false;
        }
        C143919bh.m233960c(z, "Either parameters or initialization token is required");
    }
}
