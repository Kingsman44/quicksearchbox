package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67702ce;
import com.google.p5238v.p5239a.p5255j.C67703cf;
import com.google.p5238v.p5239a.p5255j.C67705ch;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.g.i */
/* compiled from: PG */
public final class C67630i extends C67599f {
    public C67630i(Class cls) {
        super(cls);
    }

    /* renamed from: e */
    public static final C67703cf m97803e(C67705ch chVar) {
        C67702ce ceVar = (C67702ce) C67703cf.f183701d.createBuilder();
        ceVar.copyOnWrite();
        ((C67703cf) ceVar.instance).f183703a = 0;
        C67707cj cjVar = chVar.f183708a;
        if (cjVar == null) {
            cjVar = C67707cj.f183710c;
        }
        ceVar.copyOnWrite();
        cjVar.getClass();
        ((C67703cf) ceVar.instance).f183704b = cjVar;
        C63088z A = C63088z.m96139A(C67859be.m98062a(chVar.f183709b));
        ceVar.copyOnWrite();
        ((C67703cf) ceVar.instance).f183705c = A;
        return (C67703cf) ceVar.build();
    }

    /* renamed from: f */
    public static final void m97804f(C67705ch chVar) {
        if (chVar.f183709b >= 16) {
            C67707cj cjVar = chVar.f183708a;
            if (cjVar == null) {
                cjVar = C67707cj.f183710c;
            }
            C67631j.m97809g(cjVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        return m97803e((C67705ch) messageLite);
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67705ch) C62942bv.parseFrom((C62942bv) C67705ch.f183706c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", C67631j.m97811k(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", C67631j.m97811k(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", C67631j.m97811k(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", C67631j.m97811k(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", C67631j.m97811k(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", C67631j.m97811k(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", C67631j.m97811k(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", C67631j.m97811k(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", C67631j.m97811k(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", C67631j.m97811k(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        m97804f((C67705ch) messageLite);
    }
}
