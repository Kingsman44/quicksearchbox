package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.C67540ak;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67706ci;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67772l;
import com.google.p5238v.p5239a.p5255j.C67773m;
import com.google.p5238v.p5239a.p5255j.C67774n;
import com.google.p5238v.p5239a.p5255j.C67775o;
import com.google.p5238v.p5239a.p5255j.C67776p;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.l.c */
/* compiled from: PG */
public final class C67817c extends C67600g {
    public C67817c() {
        super(C67772l.class, new C67815a(C67540ak.class));
    }

    /* renamed from: g */
    public static void m97946g(C67776p pVar) {
        C67870bp.m98083a(pVar.f183879b);
        int b = C67701cd.m97842b(pVar.f183880c);
        if (b != 0 && b == 2) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        C67707cj cjVar = pVar.f183881d;
        if (cjVar == null) {
            cjVar = C67707cj.f183710c;
        }
        int b2 = C67701cd.m97842b(cjVar.f183712a);
        if (b2 != 0 && b2 == 2) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        C67707cj cjVar2 = pVar.f183881d;
        C67707cj cjVar3 = cjVar2 == null ? C67707cj.f183710c : cjVar2;
        int i = cjVar3.f183713b;
        if (i >= 10) {
            int b3 = C67701cd.m97842b(cjVar3.f183712a);
            if (b3 == 0) {
                b3 = 1;
            }
            int i2 = b3 - 2;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (i > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (i > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            int i3 = pVar.f183878a;
            int i4 = pVar.f183879b;
            if (cjVar2 == null) {
                cjVar2 = C67707cj.f183710c;
            }
            if (i3 < i4 + cjVar2.f183713b + 9) {
                throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too small");
    }

    /* renamed from: h */
    public static C67774n m97947h(int i, int i2, int i3) {
        C67706ci ciVar = (C67706ci) C67707cj.f183710c.createBuilder();
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183712a = C67701cd.m97841a(5);
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183713b = 32;
        C67707cj cjVar = (C67707cj) ciVar.build();
        C67775o oVar = (C67775o) C67776p.f183876e.createBuilder();
        oVar.copyOnWrite();
        ((C67776p) oVar.instance).f183878a = i3;
        oVar.copyOnWrite();
        ((C67776p) oVar.instance).f183879b = i2;
        oVar.copyOnWrite();
        ((C67776p) oVar.instance).f183880c = C67701cd.m97841a(5);
        oVar.copyOnWrite();
        cjVar.getClass();
        ((C67776p) oVar.instance).f183881d = cjVar;
        C67776p pVar = (C67776p) oVar.build();
        C67773m mVar = (C67773m) C67774n.f183872c.createBuilder();
        mVar.copyOnWrite();
        pVar.getClass();
        ((C67774n) mVar.instance).f183874a = pVar;
        mVar.copyOnWrite();
        ((C67774n) mVar.instance).f183875b = i;
        return (C67774n) mVar.build();
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67816b(C67774n.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67772l) C62942bv.parseFrom((C62942bv) C67772l.f183867d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67772l lVar = (C67772l) messageLite;
        C67870bp.m98087e(lVar.f183869a);
        if (lVar.f183871c.mo59031d() >= 16) {
            int d = lVar.f183871c.mo59031d();
            C67776p pVar = lVar.f183870b;
            if (pVar == null) {
                pVar = C67776p.f183876e;
            }
            if (d >= pVar.f183879b) {
                C67776p pVar2 = lVar.f183870b;
                if (pVar2 == null) {
                    pVar2 = C67776p.f183876e;
                }
                m97946g(pVar2);
                return;
            }
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        throw new GeneralSecurityException("key_value must have at least 16 bytes");
    }
}
