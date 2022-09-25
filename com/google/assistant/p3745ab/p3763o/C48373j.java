package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.o.j */
/* compiled from: PG */
public final class C48373j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48373j f125046a;

    /* renamed from: d */
    private static volatile C63010eb f125047d;

    /* renamed from: b */
    private C48375l f125048b;

    /* renamed from: c */
    private byte f125049c = 2;

    static {
        C48373j jVar = new C48373j();
        f125046a = jVar;
        C62942bv.registerDefaultInstance(C48373j.class, jVar);
    }

    private C48373j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125049c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125049c = b;
                return null;
            case 2:
                return newMessageInfo(f125046a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ", new Object[]{"b"});
            case 3:
                return new C48373j();
            case 4:
                return new C48372i();
            case 5:
                return f125046a;
            case 6:
                C63010eb ebVar = f125047d;
                if (ebVar == null) {
                    synchronized (C48373j.class) {
                        ebVar = f125047d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125046a);
                            f125047d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
