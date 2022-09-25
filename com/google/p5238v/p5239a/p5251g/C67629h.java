package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67703cf;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5259m.C67856bb;
import com.google.p5238v.p5239a.p5259m.C67857bc;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.g.h */
/* compiled from: PG */
final class C67629h extends C67612s {
    public C67629h(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67703cf cfVar = (C67703cf) messageLite;
        C67707cj cjVar = cfVar.f183704b;
        if (cjVar == null) {
            cjVar = C67707cj.f183710c;
        }
        int b = C67701cd.m97842b(cjVar.f183712a);
        if (b == 0) {
            b = 1;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(cfVar.f183705c.mo59174N(), "HMAC");
        C67707cj cjVar2 = cfVar.f183704b;
        if (cjVar2 == null) {
            cjVar2 = C67707cj.f183710c;
        }
        int i = cjVar2.f183713b;
        int i2 = b - 2;
        if (i2 == 1) {
            return new C67857bc(new C67856bb("HMACSHA1", secretKeySpec), i);
        }
        if (i2 == 2) {
            return new C67857bc(new C67856bb("HMACSHA384", secretKeySpec), i);
        }
        if (i2 == 3) {
            return new C67857bc(new C67856bb("HMACSHA256", secretKeySpec), i);
        }
        if (i2 == 4) {
            return new C67857bc(new C67856bb("HMACSHA512", secretKeySpec), i);
        }
        if (i2 == 5) {
            return new C67857bc(new C67856bb("HMACSHA224", secretKeySpec), i);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
