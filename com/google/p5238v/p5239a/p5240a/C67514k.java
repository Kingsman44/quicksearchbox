package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67645ab;
import com.google.p5238v.p5239a.p5255j.C67783w;
import com.google.p5238v.p5239a.p5255j.C67784x;
import com.google.p5238v.p5239a.p5255j.C67786z;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.k */
/* compiled from: PG */
final class C67514k extends C67599f {
    public C67514k(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67786z zVar = (C67786z) messageLite;
        C67783w wVar = (C67783w) C67784x.f183894d.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(zVar.f183902b));
        wVar.copyOnWrite();
        ((C67784x) wVar.instance).f183898c = A;
        C67645ab abVar = zVar.f183901a;
        if (abVar == null) {
            abVar = C67645ab.f183591b;
        }
        wVar.copyOnWrite();
        abVar.getClass();
        ((C67784x) wVar.instance).f183897b = abVar;
        wVar.copyOnWrite();
        ((C67784x) wVar.instance).f183896a = 0;
        return (C67784x) wVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67786z) C62942bv.parseFrom((C62942bv) C67786z.f183899c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", C67515l.m97565g(16, 1));
        hashMap.put("AES128_EAX_RAW", C67515l.m97565g(16, 3));
        hashMap.put("AES256_EAX", C67515l.m97565g(32, 1));
        hashMap.put("AES256_EAX_RAW", C67515l.m97565g(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67786z zVar = (C67786z) messageLite;
        C67870bp.m98083a(zVar.f183902b);
        C67645ab abVar = zVar.f183901a;
        if (abVar == null) {
            abVar = C67645ab.f183591b;
        }
        if (abVar.f183593a != 12) {
            C67645ab abVar2 = zVar.f183901a;
            if (abVar2 == null) {
                abVar2 = C67645ab.f183591b;
            }
            if (abVar2.f183593a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
