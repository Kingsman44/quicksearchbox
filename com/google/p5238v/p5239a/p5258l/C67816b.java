package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67771k;
import com.google.p5238v.p5239a.p5255j.C67772l;
import com.google.p5238v.p5239a.p5255j.C67774n;
import com.google.p5238v.p5239a.p5255j.C67776p;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.l.b */
/* compiled from: PG */
final class C67816b extends C67599f {
    public C67816b(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67774n nVar = (C67774n) messageLite;
        C67771k kVar = (C67771k) C67772l.f183867d.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(nVar.f183875b));
        kVar.copyOnWrite();
        ((C67772l) kVar.instance).f183871c = A;
        C67776p pVar = nVar.f183874a;
        if (pVar == null) {
            pVar = C67776p.f183876e;
        }
        kVar.copyOnWrite();
        pVar.getClass();
        ((C67772l) kVar.instance).f183870b = pVar;
        kVar.copyOnWrite();
        ((C67772l) kVar.instance).f183869a = 0;
        return (C67772l) kVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67774n) C62942bv.parseFrom((C62942bv) C67774n.f183872c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256_4KB", new C67598e(C67817c.m97947h(16, 16, 4096), 3));
        hashMap.put("AES128_CTR_HMAC_SHA256_1MB", new C67598e(C67817c.m97947h(16, 16, 1048576), 3));
        hashMap.put("AES256_CTR_HMAC_SHA256_4KB", new C67598e(C67817c.m97947h(32, 32, 4096), 3));
        hashMap.put("AES256_CTR_HMAC_SHA256_1MB", new C67598e(C67817c.m97947h(32, 32, 1048576), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67774n nVar = (C67774n) messageLite;
        if (nVar.f183875b >= 16) {
            C67776p pVar = nVar.f183874a;
            if (pVar == null) {
                pVar = C67776p.f183876e;
            }
            C67817c.m97946g(pVar);
            return;
        }
        throw new GeneralSecurityException("key_size must be at least 16 bytes");
    }
}
