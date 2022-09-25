package com.google.android.p3523p.p3524a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.p5219a.C66752s;

/* renamed from: com.google.android.p.a.g */
/* compiled from: PG */
public final class C45022g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45022g f117632d;

    /* renamed from: f */
    private static volatile C63010eb f117633f;

    /* renamed from: a */
    public int f117634a;

    /* renamed from: b */
    public C66999hh f117635b;

    /* renamed from: c */
    public C66752s f117636c;

    /* renamed from: e */
    private byte f117637e = 2;

    static {
        C45022g gVar = new C45022g();
        f117632d = gVar;
        C62942bv.registerDefaultInstance(C45022g.class, gVar);
    }

    private C45022g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f117637e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f117637e = b;
                return null;
            case 2:
                return newMessageInfo(f117632d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45022g();
            case 4:
                return new C45021f();
            case 5:
                return f117632d;
            case 6:
                C63010eb ebVar = f117633f;
                if (ebVar == null) {
                    synchronized (C45022g.class) {
                        ebVar = f117633f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f117632d);
                            f117633f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
