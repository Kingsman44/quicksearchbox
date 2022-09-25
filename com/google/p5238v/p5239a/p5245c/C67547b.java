package com.google.p5238v.p5239a.p5245c;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67660aq;
import com.google.p5238v.p5239a.p5255j.C67661ar;
import com.google.p5238v.p5239a.p5255j.C67662as;
import com.google.p5238v.p5239a.p5255j.C67663at;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.c.b */
/* compiled from: PG */
final class C67547b extends C67599f {
    public C67547b(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67660aq aqVar = (C67660aq) C67661ar.f183622c.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(((C67663at) messageLite).f183628a));
        aqVar.copyOnWrite();
        ((C67661ar) aqVar.instance).f183625b = A;
        aqVar.copyOnWrite();
        ((C67661ar) aqVar.instance).f183624a = 0;
        return (C67661ar) aqVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67663at) C62942bv.parseFrom((C62942bv) C67663at.f183626b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        C67662as asVar = (C67662as) C67663at.f183626b.createBuilder();
        asVar.copyOnWrite();
        ((C67663at) asVar.instance).f183628a = 64;
        hashMap.put("AES256_SIV", new C67598e((C67663at) asVar.build(), 1));
        C67662as asVar2 = (C67662as) C67663at.f183626b.createBuilder();
        asVar2.copyOnWrite();
        ((C67663at) asVar2.instance).f183628a = 64;
        hashMap.put("AES256_SIV_RAW", new C67598e((C67663at) asVar2.build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67663at atVar = (C67663at) messageLite;
        if (atVar.f183628a != 64) {
            int i = atVar.f183628a;
            throw new InvalidAlgorithmParameterException("invalid key size: " + i + ". Valid keys must have 64 bytes.");
        }
    }
}
