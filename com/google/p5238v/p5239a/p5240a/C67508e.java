package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5251g.C67630i;
import com.google.p5238v.p5239a.p5251g.C67631j;
import com.google.p5238v.p5239a.p5255j.C67703cf;
import com.google.p5238v.p5239a.p5255j.C67705ch;
import com.google.p5238v.p5239a.p5255j.C67767g;
import com.google.p5238v.p5239a.p5255j.C67768h;
import com.google.p5238v.p5239a.p5255j.C67770j;
import com.google.p5238v.p5239a.p5255j.C67778r;
import com.google.p5238v.p5239a.p5255j.C67780t;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.e */
/* compiled from: PG */
final class C67508e extends C67599f {
    public C67508e(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67770j jVar = (C67770j) messageLite;
        C67599f a = new C67512i().mo59891a();
        C67780t tVar = jVar.f183865a;
        if (tVar == null) {
            tVar = C67780t.f183887c;
        }
        C67778r rVar = (C67778r) a.mo59888a(tVar);
        new C67631j();
        C67705ch chVar = jVar.f183866b;
        if (chVar == null) {
            chVar = C67705ch.f183706c;
        }
        C67703cf e = C67630i.m97803e(chVar);
        C67767g gVar = (C67767g) C67768h.f183858d.createBuilder();
        gVar.copyOnWrite();
        rVar.getClass();
        ((C67768h) gVar.instance).f183861b = rVar;
        gVar.copyOnWrite();
        e.getClass();
        ((C67768h) gVar.instance).f183862c = e;
        gVar.copyOnWrite();
        ((C67768h) gVar.instance).f183860a = 0;
        return (C67768h) gVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67770j) C62942bv.parseFrom((C62942bv) C67770j.f183863c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", C67509f.m97542g(16, 16, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C67509f.m97542g(16, 16, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", C67509f.m97542g(32, 32, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C67509f.m97542g(32, 32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67770j jVar = (C67770j) messageLite;
        C67599f a = new C67512i().mo59891a();
        C67780t tVar = jVar.f183865a;
        if (tVar == null) {
            tVar = C67780t.f183887c;
        }
        a.mo59890d(tVar);
        new C67631j();
        C67705ch chVar = jVar.f183866b;
        if (chVar == null) {
            chVar = C67705ch.f183706c;
        }
        C67630i.m97804f(chVar);
        C67780t tVar2 = jVar.f183865a;
        if (tVar2 == null) {
            tVar2 = C67780t.f183887c;
        }
        C67870bp.m98083a(tVar2.f183890b);
    }
}
