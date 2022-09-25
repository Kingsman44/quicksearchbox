package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.n */
/* compiled from: PG */
public final class C62142n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62142n f167775a;

    /* renamed from: c */
    private static volatile C63010eb f167776c;

    /* renamed from: b */
    private byte f167777b = 2;

    static {
        C62142n nVar = new C62142n();
        f167775a = nVar;
        C62942bv.registerDefaultInstance(C62142n.class, nVar);
    }

    private C62142n() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167777b);
            case 1:
                this.f167777b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167775a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62142n();
            case 4:
                return new C62141m();
            case 5:
                return f167775a;
            case 6:
                C63010eb ebVar = f167776c;
                if (ebVar == null) {
                    synchronized (C62142n.class) {
                        ebVar = f167776c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167775a);
                            f167776c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
