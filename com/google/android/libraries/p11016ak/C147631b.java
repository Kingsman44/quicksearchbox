package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.b */
/* compiled from: PG */
public final class C147631b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147631b f398465c;

    /* renamed from: d */
    private static volatile C63010eb f398466d;

    /* renamed from: a */
    public C62971cq f398467a = emptyProtobufList();

    /* renamed from: b */
    public boolean f398468b;

    static {
        C147631b bVar = new C147631b();
        f398465c = bVar;
        C62942bv.registerDefaultInstance(C147631b.class, bVar);
    }

    private C147631b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f398465c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"a", C62910ar.class, "b"});
            case 3:
                return new C147631b();
            case 4:
                return new C147611a();
            case 5:
                return f398465c;
            case 6:
                C63010eb ebVar = f398466d;
                if (ebVar == null) {
                    synchronized (C147631b.class) {
                        ebVar = f398466d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398465c);
                            f398466d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
