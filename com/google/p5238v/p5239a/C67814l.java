package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67719cv;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.l */
/* compiled from: PG */
class C67814l implements C67642j {

    /* renamed from: a */
    private final C67600g f183907a;

    /* renamed from: b */
    private final Class f183908b;

    public C67814l(C67600g gVar, Class cls) {
        if (gVar.mo59938j().contains(cls) || Void.class.equals(cls)) {
            this.f183907a = gVar;
            this.f183908b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{gVar.toString(), cls.getName()}));
    }

    /* renamed from: f */
    private final C67787k m97934f() {
        return new C67787k(this.f183907a.mo59891a());
    }

    /* renamed from: g */
    private final Object m97935g(MessageLite messageLite) {
        if (!Void.class.equals(this.f183908b)) {
            this.f183907a.mo59895e(messageLite);
            return this.f183907a.mo59937i(messageLite, this.f183908b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final C67721cx mo59970a(C63088z zVar) {
        try {
            MessageLite a = m97934f().mo59978a(zVar);
            C67719cv cvVar = (C67719cv) C67721cx.f183740d.createBuilder();
            String d = this.f183907a.mo59894d();
            cvVar.copyOnWrite();
            d.getClass();
            ((C67721cx) cvVar.instance).f183742a = d;
            C63088z byteString = a.toByteString();
            cvVar.copyOnWrite();
            byteString.getClass();
            ((C67721cx) cvVar.instance).f183743b = byteString;
            C67720cw b = this.f183907a.mo59892b();
            cvVar.copyOnWrite();
            ((C67721cx) cvVar.instance).f183744c = b.getNumber();
            return (C67721cx) cvVar.build();
        } catch (C62974ct e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: b */
    public final MessageLite mo59971b(C63088z zVar) {
        try {
            return m97934f().mo59978a(zVar);
        } catch (C62974ct e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.f183907a.mo59891a().f183534a.getName())), e);
        }
    }

    /* renamed from: c */
    public final Object mo59972c(C63088z zVar) {
        try {
            return m97935g(this.f183907a.mo59893c(zVar));
        } catch (C62974ct e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.f183907a.f183536b.getName())), e);
        }
    }

    /* renamed from: d */
    public final Object mo59973d(MessageLite messageLite) {
        String concat = "Expected proto of type ".concat(String.valueOf(this.f183907a.f183536b.getName()));
        if (this.f183907a.f183536b.isInstance(messageLite)) {
            return m97935g(messageLite);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: e */
    public final String mo59974e() {
        return this.f183907a.mo59894d();
    }
}
