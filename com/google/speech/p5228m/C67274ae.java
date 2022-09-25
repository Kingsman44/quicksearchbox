package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ae */
/* compiled from: PG */
public final class C67274ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67274ae f182870c;

    /* renamed from: e */
    private static volatile C63010eb f182871e;

    /* renamed from: a */
    public int f182872a;

    /* renamed from: b */
    public C67357u f182873b;

    /* renamed from: d */
    private byte f182874d = 2;

    static {
        C67274ae aeVar = new C67274ae();
        f182870c = aeVar;
        C62942bv.registerDefaultInstance(C67274ae.class, aeVar);
    }

    private C67274ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182874d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182874d = b;
                return null;
            case 2:
                return newMessageInfo(f182870c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67274ae();
            case 4:
                return new C67273ad();
            case 5:
                return f182870c;
            case 6:
                C63010eb ebVar = f182871e;
                if (ebVar == null) {
                    synchronized (C67274ae.class) {
                        ebVar = f182871e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182870c);
                            f182871e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
