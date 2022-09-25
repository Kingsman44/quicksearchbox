package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67590f;
import com.google.p5238v.p5239a.C67902r;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67668ay;
import com.google.p5238v.p5239a.p5255j.C67679bi;
import com.google.p5238v.p5239a.p5255j.C67680bj;
import com.google.p5238v.p5239a.p5255j.C67681bk;
import com.google.p5238v.p5239a.p5255j.C67682bl;
import com.google.p5238v.p5239a.p5255j.C67683bm;
import com.google.p5238v.p5239a.p5255j.C67684bn;
import com.google.p5238v.p5239a.p5255j.C67686bp;
import com.google.p5238v.p5239a.p5255j.C67688br;
import com.google.p5238v.p5239a.p5255j.C67689bs;
import com.google.p5238v.p5239a.p5255j.C67690bt;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67723cz;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.c */
/* compiled from: PG */
public final class C67573c extends C67613t {

    /* renamed from: a */
    public static final byte[] f183500a = new byte[0];

    public C67573c() {
        super(C67686bp.class, new C67553a(C67590f.class));
    }

    /* renamed from: g */
    public static C67598e m97718g(int i, C67902r rVar, byte[] bArr, int i2) {
        C67742dr drVar;
        C67681bk bkVar = (C67681bk) C67682bl.f183662b.createBuilder();
        C67689bs bsVar = (C67689bs) C67690bt.f183681d.createBuilder();
        bsVar.copyOnWrite();
        int i3 = 4;
        ((C67690bt) bsVar.instance).f183683a = C67698ca.m97839a(4);
        bsVar.copyOnWrite();
        ((C67690bt) bsVar.instance).f183684b = C67701cd.m97841a(5);
        C63088z A = C63088z.m96139A(bArr);
        bsVar.copyOnWrite();
        ((C67690bt) bsVar.instance).f183685c = A;
        C67690bt btVar = (C67690bt) bsVar.build();
        C67723cz czVar = (C67723cz) C67725da.f183749d.createBuilder();
        String str = rVar.f184083a.f183751a;
        czVar.copyOnWrite();
        str.getClass();
        ((C67725da) czVar.instance).f183751a = str;
        C63088z A2 = C63088z.m96139A(rVar.f184083a.f183752b.mo59174N());
        czVar.copyOnWrite();
        ((C67725da) czVar.instance).f183752b = A2;
        C67742dr a = C67742dr.m97851a(rVar.f184083a.f183753c);
        if (a == null) {
            a = C67742dr.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            i3 = 1;
        } else if (ordinal == 2) {
            i3 = 2;
        } else if (ordinal == 3) {
            i3 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        int i4 = i3 - 1;
        if (i4 != 0) {
            drVar = i4 != 1 ? i4 != 2 ? C67742dr.CRUNCHY : C67742dr.RAW : C67742dr.LEGACY;
        } else {
            drVar = C67742dr.TINK;
        }
        czVar.copyOnWrite();
        ((C67725da) czVar.instance).f183753c = drVar.getNumber();
        C67725da daVar = (C67725da) czVar.build();
        C67679bi biVar = (C67679bi) C67680bj.f183659b.createBuilder();
        biVar.copyOnWrite();
        daVar.getClass();
        ((C67680bj) biVar.instance).f183661a = daVar;
        C67680bj bjVar = (C67680bj) biVar.build();
        C67683bm bmVar = (C67683bm) C67684bn.f183665d.createBuilder();
        bmVar.copyOnWrite();
        btVar.getClass();
        ((C67684bn) bmVar.instance).f183667a = btVar;
        bmVar.copyOnWrite();
        bjVar.getClass();
        ((C67684bn) bmVar.instance).f183668b = bjVar;
        bmVar.copyOnWrite();
        ((C67684bn) bmVar.instance).f183669c = C67668ay.m97836a(i);
        C67684bn bnVar = (C67684bn) bmVar.build();
        bkVar.copyOnWrite();
        bnVar.getClass();
        ((C67682bl) bkVar.instance).f183664a = bnVar;
        return new C67598e((C67682bl) bkVar.build(), i2);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67572b(C67682bl.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67686bp) C62942bv.parseFrom((C62942bv) C67686bp.f183670d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67686bp bpVar = (C67686bp) messageLite;
        if (!bpVar.f183674c.mo59173M()) {
            C67870bp.m98087e(bpVar.f183672a);
            C67688br brVar = bpVar.f183673b;
            if (brVar == null) {
                brVar = C67688br.f183675e;
            }
            C67684bn bnVar = brVar.f183678b;
            if (bnVar == null) {
                bnVar = C67684bn.f183665d;
            }
            C67581k.m97737a(bnVar);
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
