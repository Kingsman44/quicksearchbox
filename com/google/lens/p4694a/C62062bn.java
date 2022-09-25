package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bn */
/* compiled from: PG */
public final class C62062bn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62062bn f167658a;

    /* renamed from: c */
    private static volatile C63010eb f167659c;

    /* renamed from: b */
    private byte f167660b = 2;

    static {
        C62062bn bnVar = new C62062bn();
        f167658a = bnVar;
        C62942bv.registerDefaultInstance(C62062bn.class, bnVar);
    }

    private C62062bn() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167660b);
            case 1:
                this.f167660b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167658a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62062bn();
            case 4:
                return new C62061bm();
            case 5:
                return f167658a;
            case 6:
                C63010eb ebVar = f167659c;
                if (ebVar == null) {
                    synchronized (C62062bn.class) {
                        ebVar = f167659c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167658a);
                            f167659c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
