package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.be */
/* compiled from: PG */
public final class C45561be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45561be f119063c;

    /* renamed from: d */
    private static volatile C63010eb f119064d;

    /* renamed from: a */
    public C62971cq f119065a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62961ch f119066b = emptyIntList();

    static {
        C45561be beVar = new C45561be();
        f119063c = beVar;
        C62942bv.registerDefaultInstance(C45561be.class, beVar);
    }

    private C45561be() {
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
                return newMessageInfo(f119063c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002,", new Object[]{"a", "b"});
            case 3:
                return new C45561be();
            case 4:
                return new C45560bd();
            case 5:
                return f119063c;
            case 6:
                C63010eb ebVar = f119064d;
                if (ebVar == null) {
                    synchronized (C45561be.class) {
                        ebVar = f119064d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119063c);
                            f119064d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
