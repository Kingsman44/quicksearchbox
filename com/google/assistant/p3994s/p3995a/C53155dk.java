package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dk */
/* compiled from: PG */
public final class C53155dk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53155dk f139320a;

    /* renamed from: c */
    private static volatile C63010eb f139321c;

    /* renamed from: b */
    private byte f139322b = 2;

    static {
        C53155dk dkVar = new C53155dk();
        f139320a = dkVar;
        C62942bv.registerDefaultInstance(C53155dk.class, dkVar);
    }

    private C53155dk() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139322b);
            case 1:
                this.f139322b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139320a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53155dk();
            case 4:
                return new C53154dj();
            case 5:
                return f139320a;
            case 6:
                C63010eb ebVar = f139321c;
                if (ebVar == null) {
                    synchronized (C53155dk.class) {
                        ebVar = f139321c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139320a);
                            f139321c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
