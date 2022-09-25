package com.google.p5238v.p5239a.p5248e.p5249a;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.p5238v.p5239a.C67906v;
import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.p5238v.p5239a.p5259m.C67849av;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* renamed from: com.google.v.a.e.a.e */
/* compiled from: PG */
public final class C67588e implements C67906v {

    /* renamed from: a */
    private final SharedPreferences f183520a;

    /* renamed from: b */
    private final String f183521b = "aes128_gcm_hkdf_4kb";

    public C67588e(Context context) {
        this.f183520a = context.getApplicationContext().getSharedPreferences("mobstore_encrypt", 0);
    }

    /* renamed from: a */
    public final C67729de mo59915a() {
        return (C67729de) C62942bv.parseFrom((C62942bv) C67729de.f183760c, mo59935b(), C62921ba.f169869a);
    }

    /* renamed from: b */
    public final byte[] mo59935b() {
        try {
            String string = this.f183520a.getString(this.f183521b, (String) null);
            if (string != null) {
                return C67849av.m98041b(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f183521b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f183521b}));
        }
    }
}
