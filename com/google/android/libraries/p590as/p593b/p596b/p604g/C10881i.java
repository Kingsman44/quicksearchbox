package com.google.android.libraries.p590as.p593b.p596b.p604g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.b.b.g.i */
/* compiled from: PG */
public final class C10881i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10881i f35965b;

    /* renamed from: c */
    private static volatile C63010eb f35966c;

    /* renamed from: a */
    public C62971cq f35967a = emptyProtobufList();

    static {
        C10881i iVar = new C10881i();
        f35965b = iVar;
        C62942bv.registerDefaultInstance(C10881i.class, iVar);
    }

    private C10881i() {
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
                return newMessageInfo(f35965b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C10879g.class});
            case 3:
                return new C10881i();
            case 4:
                return new C10880h();
            case 5:
                return f35965b;
            case 6:
                C63010eb ebVar = f35966c;
                if (ebVar == null) {
                    synchronized (C10881i.class) {
                        ebVar = f35966c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35965b);
                            f35966c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
