package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.InputStream;

/* renamed from: com.google.v.a.b */
/* compiled from: PG */
public final class C67542b implements C67906v {

    /* renamed from: a */
    private final InputStream f183460a;

    public C67542b(InputStream inputStream) {
        this.f183460a = inputStream;
    }

    /* renamed from: a */
    public final C67729de mo59915a() {
        try {
            return (C67729de) C62942bv.parseFrom((C62942bv) C67729de.f183760c, this.f183460a, C62921ba.f169869a);
        } finally {
            this.f183460a.close();
        }
    }
}
