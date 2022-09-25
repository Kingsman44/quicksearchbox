package com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.c.d */
/* compiled from: PG */
public final class C19665d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19665d f54690b;

    /* renamed from: d */
    private static volatile C63010eb f54691d;

    /* renamed from: a */
    public C62971cq f54692a = emptyProtobufList();

    /* renamed from: c */
    private byte f54693c = 2;

    static {
        C19665d dVar = new C19665d();
        f54690b = dVar;
        C62942bv.registerDefaultInstance(C19665d.class, dVar);
    }

    private C19665d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f54693c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f54693c = b;
                return null;
            case 2:
                return newMessageInfo(f54690b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C19663b.class});
            case 3:
                return new C19665d();
            case 4:
                return new C19664c();
            case 5:
                return f54690b;
            case 6:
                C63010eb ebVar = f54691d;
                if (ebVar == null) {
                    synchronized (C19665d.class) {
                        ebVar = f54691d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54690b);
                            f54691d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
