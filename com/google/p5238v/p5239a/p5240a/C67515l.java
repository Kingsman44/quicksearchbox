package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67644aa;
import com.google.p5238v.p5239a.p5255j.C67645ab;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67784x;
import com.google.p5238v.p5239a.p5255j.C67785y;
import com.google.p5238v.p5239a.p5255j.C67786z;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.l */
/* compiled from: PG */
public final class C67515l extends C67600g {
    public C67515l() {
        super(C67784x.class, new C67513j(C67486a.class));
    }

    /* renamed from: g */
    public static C67598e m97565g(int i, int i2) {
        C67785y yVar = (C67785y) C67786z.f183899c.createBuilder();
        yVar.copyOnWrite();
        ((C67786z) yVar.instance).f183902b = i;
        C67644aa aaVar = (C67644aa) C67645ab.f183591b.createBuilder();
        aaVar.copyOnWrite();
        ((C67645ab) aaVar.instance).f183593a = 16;
        C67645ab abVar = (C67645ab) aaVar.build();
        yVar.copyOnWrite();
        abVar.getClass();
        ((C67786z) yVar.instance).f183901a = abVar;
        return new C67598e((C67786z) yVar.build(), i2);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67514k(C67786z.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67784x) C62942bv.parseFrom((C62942bv) C67784x.f183894d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67784x xVar = (C67784x) messageLite;
        C67870bp.m98087e(xVar.f183896a);
        C67870bp.m98083a(xVar.f183898c.mo59031d());
        C67645ab abVar = xVar.f183897b;
        if (abVar == null) {
            abVar = C67645ab.f183591b;
        }
        if (abVar.f183593a != 12) {
            C67645ab abVar2 = xVar.f183897b;
            if (abVar2 == null) {
                abVar2 = C67645ab.f183591b;
            }
            if (abVar2.f183593a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
