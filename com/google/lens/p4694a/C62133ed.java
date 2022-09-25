package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ed */
/* compiled from: PG */
public final class C62133ed extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62133ed f167762a;

    /* renamed from: c */
    private static volatile C63010eb f167763c;

    /* renamed from: b */
    private byte f167764b = 2;

    static {
        C62133ed edVar = new C62133ed();
        f167762a = edVar;
        C62942bv.registerDefaultInstance(C62133ed.class, edVar);
    }

    private C62133ed() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167764b);
            case 1:
                this.f167764b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167762a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62133ed();
            case 4:
                return new C62132ec();
            case 5:
                return f167762a;
            case 6:
                C63010eb ebVar = f167763c;
                if (ebVar == null) {
                    synchronized (C62133ed.class) {
                        ebVar = f167763c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167762a);
                            f167763c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
