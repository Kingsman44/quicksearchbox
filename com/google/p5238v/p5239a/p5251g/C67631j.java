package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.C67909y;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67703cf;
import com.google.p5238v.p5239a.p5255j.C67704cg;
import com.google.p5238v.p5239a.p5255j.C67705ch;
import com.google.p5238v.p5239a.p5255j.C67706ci;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.g.j */
/* compiled from: PG */
public final class C67631j extends C67600g {
    public C67631j() {
        super(C67703cf.class, new C67629h(C67909y.class));
    }

    /* renamed from: g */
    public static void m97809g(C67707cj cjVar) {
        int i = cjVar.f183713b;
        if (i >= 10) {
            int b = C67701cd.m97842b(cjVar.f183712a);
            if (b == 0) {
                b = 1;
            }
            int i2 = b - 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (i > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (i > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (i > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (i > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (i > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: h */
    public static final void m97810h(C67703cf cfVar) {
        C67870bp.m98087e(cfVar.f183703a);
        if (cfVar.f183705c.mo59031d() >= 16) {
            C67707cj cjVar = cfVar.f183704b;
            if (cjVar == null) {
                cjVar = C67707cj.f183710c;
            }
            m97809g(cjVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: k */
    public static C67598e m97811k(int i, int i2, int i3, int i4) {
        C67704cg cgVar = (C67704cg) C67705ch.f183706c.createBuilder();
        C67706ci ciVar = (C67706ci) C67707cj.f183710c.createBuilder();
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183712a = C67701cd.m97841a(i3);
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183713b = i2;
        C67707cj cjVar = (C67707cj) ciVar.build();
        cgVar.copyOnWrite();
        cjVar.getClass();
        ((C67705ch) cgVar.instance).f183708a = cjVar;
        cgVar.copyOnWrite();
        ((C67705ch) cgVar.instance).f183709b = i;
        return new C67598e((C67705ch) cgVar.build(), i4);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67630i(C67705ch.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67703cf) C62942bv.parseFrom((C62942bv) C67703cf.f183701d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        m97810h((C67703cf) messageLite);
    }

    /* renamed from: f */
    public final int mo59902f() {
        return 2;
    }
}
