package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67657an;
import com.google.p5238v.p5239a.p5255j.C67658ao;
import com.google.p5238v.p5239a.p5255j.C67659ap;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.v.a.a.r */
/* compiled from: PG */
public final class C67521r extends C67600g {
    public C67521r() {
        super(C67657an.class, new C67519p(C67486a.class));
    }

    /* renamed from: g */
    public static boolean m97588g() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static C67598e m97589h(int i, int i2) {
        C67658ao aoVar = (C67658ao) C67659ap.f183619b.createBuilder();
        aoVar.copyOnWrite();
        ((C67659ap) aoVar.instance).f183621a = i;
        return new C67598e((C67659ap) aoVar.build(), i2);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67520q(C67659ap.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67657an) C62942bv.parseFrom((C62942bv) C67657an.f183615c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67657an anVar = (C67657an) messageLite;
        C67870bp.m98087e(anVar.f183617a);
        C67870bp.m98083a(anVar.f183618b.mo59031d());
    }
}
