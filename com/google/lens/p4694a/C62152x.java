package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.x */
/* compiled from: PG */
public final class C62152x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62152x f167788a;

    /* renamed from: c */
    private static volatile C63010eb f167789c;

    /* renamed from: b */
    private byte f167790b = 2;

    static {
        C62152x xVar = new C62152x();
        f167788a = xVar;
        C62942bv.registerDefaultInstance(C62152x.class, xVar);
    }

    private C62152x() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167790b);
            case 1:
                this.f167790b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167788a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62152x();
            case 4:
                return new C62151w();
            case 5:
                return f167788a;
            case 6:
                C63010eb ebVar = f167789c;
                if (ebVar == null) {
                    synchronized (C62152x.class) {
                        ebVar = f167789c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167788a);
                            f167789c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
