package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.h */
/* compiled from: PG */
public final class C62136h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62136h f167767a;

    /* renamed from: c */
    private static volatile C63010eb f167768c;

    /* renamed from: b */
    private byte f167769b = 2;

    static {
        C62136h hVar = new C62136h();
        f167767a = hVar;
        C62942bv.registerDefaultInstance(C62136h.class, hVar);
    }

    private C62136h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167769b);
            case 1:
                this.f167769b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167767a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62136h();
            case 4:
                return new C62135g();
            case 5:
                return f167767a;
            case 6:
                C63010eb ebVar = f167768c;
                if (ebVar == null) {
                    synchronized (C62136h.class) {
                        ebVar = f167768c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167767a);
                            f167768c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
