package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67738dn;
import com.google.p5238v.p5239a.p5255j.C67739do;
import com.google.p5238v.p5239a.p5255j.C67741dq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.aa */
/* compiled from: PG */
final class C67498aa extends C67599f {
    public C67498aa(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67741dq dqVar = (C67741dq) messageLite;
        C67738dn dnVar = (C67738dn) C67739do.f183781c.createBuilder();
        dnVar.copyOnWrite();
        dqVar.getClass();
        ((C67739do) dnVar.instance).f183784b = dqVar;
        dnVar.copyOnWrite();
        ((C67739do) dnVar.instance).f183783a = 0;
        return (C67739do) dnVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67741dq) C62942bv.parseFrom((C62942bv) C67741dq.f183785c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67741dq dqVar = (C67741dq) messageLite;
        if (dqVar.f183787a.isEmpty() || dqVar.f183788b == null) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
