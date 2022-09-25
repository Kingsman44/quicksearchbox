package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mp */
/* compiled from: PG */
public final class C53403mp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53403mp f140133a;

    /* renamed from: c */
    private static volatile C63010eb f140134c;

    /* renamed from: b */
    private byte f140135b = 2;

    static {
        C53403mp mpVar = new C53403mp();
        f140133a = mpVar;
        C62942bv.registerDefaultInstance(C53403mp.class, mpVar);
    }

    private C53403mp() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140135b);
            case 1:
                this.f140135b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f140133a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53403mp();
            case 4:
                return new C53402mo();
            case 5:
                return f140133a;
            case 6:
                C63010eb ebVar = f140134c;
                if (ebVar == null) {
                    synchronized (C53403mp.class) {
                        ebVar = f140134c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140133a);
                            f140134c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
