package com.google.p5238v.p5239a.p5248e.p5249a;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.v.a.e.a.f */
/* compiled from: PG */
public final class C67589f {

    /* renamed from: a */
    public final SharedPreferences.Editor f183522a;

    /* renamed from: b */
    public final String f183523b = "aes128_gcm_hkdf_4kb";

    public C67589f(Context context) {
        this.f183522a = context.getApplicationContext().getSharedPreferences("mobstore_encrypt", 0).edit();
    }
}
