package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bc */
/* compiled from: PG */
public final class C66825bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66825bc f181714c;

    /* renamed from: e */
    private static volatile C63010eb f181715e;

    /* renamed from: a */
    public int f181716a;

    /* renamed from: b */
    public C66999hh f181717b;

    /* renamed from: d */
    private byte f181718d = 2;

    static {
        C66825bc bcVar = new C66825bc();
        f181714c = bcVar;
        C62942bv.registerDefaultInstance(C66825bc.class, bcVar);
    }

    private C66825bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181718d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181718d = b;
                return null;
            case 2:
                return newMessageInfo(f181714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66825bc();
            case 4:
                return new C66824bb();
            case 5:
                return f181714c;
            case 6:
                C63010eb ebVar = f181715e;
                if (ebVar == null) {
                    synchronized (C66825bc.class) {
                        ebVar = f181715e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181714c);
                            f181715e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
