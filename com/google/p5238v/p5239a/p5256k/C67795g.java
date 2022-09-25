package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67692bv;
import com.google.p5238v.p5239a.p5255j.C67693bw;
import com.google.p5238v.p5239a.p5255j.C67694bx;
import com.google.p5238v.p5239a.p5255j.C67695by;
import com.google.p5238v.p5239a.p5255j.C67696bz;
import com.google.p5238v.p5239a.p5259m.C67831ad;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.k.g */
/* compiled from: PG */
final class C67795g extends C67599f {
    public C67795g(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67692bv bvVar = (C67692bv) messageLite;
        byte[] a = C67859be.m98062a(32);
        if (a.length == 32) {
            byte[] a2 = C67831ad.m97983b(C67831ad.m97987f(a)).mo59992a();
            C67695by byVar = (C67695by) C67696bz.f183693c.createBuilder();
            byVar.copyOnWrite();
            ((C67696bz) byVar.instance).f183695a = 0;
            C63088z A = C63088z.m96139A(Arrays.copyOf(a2, 32));
            byVar.copyOnWrite();
            ((C67696bz) byVar.instance).f183696b = A;
            C67696bz bzVar = (C67696bz) byVar.build();
            C67693bw bwVar = (C67693bw) C67694bx.f183688d.createBuilder();
            bwVar.copyOnWrite();
            ((C67694bx) bwVar.instance).f183690a = 0;
            C63088z A2 = C63088z.m96139A(Arrays.copyOf(a, 32));
            bwVar.copyOnWrite();
            ((C67694bx) bwVar.instance).f183691b = A2;
            bwVar.copyOnWrite();
            bzVar.getClass();
            ((C67694bx) bwVar.instance).f183692c = bzVar;
            return (C67694bx) bwVar.build();
        }
        throw new IllegalArgumentException(String.format("Given secret seed length is not %s", new Object[]{32}));
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67692bv) C62942bv.parseFrom((C62942bv) C67692bv.f183686a, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new C67598e(C67692bv.f183686a, 1));
        hashMap.put("ED25519_RAW", new C67598e(C67692bv.f183686a, 3));
        hashMap.put("ED25519WithRawOutput", new C67598e(C67692bv.f183686a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67692bv bvVar = (C67692bv) messageLite;
    }
}
