package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67778r;
import com.google.p5238v.p5239a.p5255j.C67780t;
import com.google.p5238v.p5239a.p5255j.C67782v;
import com.google.p5238v.p5239a.p5259m.C67851ax;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.i */
/* compiled from: PG */
public final class C67512i extends C67600g {
    public C67512i() {
        super(C67778r.class, new C67510g(C67851ax.class));
    }

    /* renamed from: g */
    public static final void m97553g(C67782v vVar) {
        int i = vVar.f183893a;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: h */
    public static final void m97554h(C67778r rVar) {
        C67870bp.m98087e(rVar.f183884a);
        C67870bp.m98083a(rVar.f183886c.mo59031d());
        C67782v vVar = rVar.f183885b;
        if (vVar == null) {
            vVar = C67782v.f183891b;
        }
        m97553g(vVar);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67511h(C67780t.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67778r) C62942bv.parseFrom((C62942bv) C67778r.f183882d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        m97554h((C67778r) messageLite);
    }
}
