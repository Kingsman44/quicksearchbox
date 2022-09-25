package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ca */
/* compiled from: PG */
public final class C81297ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C81297ca f222540b;

    /* renamed from: c */
    private static volatile C63010eb f222541c;

    /* renamed from: a */
    public C62971cq f222542a = emptyProtobufList();

    static {
        C81297ca caVar = new C81297ca();
        f222540b = caVar;
        C62942bv.registerDefaultInstance(C81297ca.class, caVar);
    }

    private C81297ca() {
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
                return newMessageInfo(f222540b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C81294by.class});
            case 3:
                return new C81297ca();
            case 4:
                return new C81295bz();
            case 5:
                return f222540b;
            case 6:
                C63010eb ebVar = f222541c;
                if (ebVar == null) {
                    synchronized (C81297ca.class) {
                        ebVar = f222541c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222540b);
                            f222541c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
