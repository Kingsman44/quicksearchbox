package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bw */
/* compiled from: PG */
public final class C81292bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81292bw f222532c;

    /* renamed from: d */
    private static volatile C63010eb f222533d;

    /* renamed from: a */
    public C62971cq f222534a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f222535b = emptyProtobufList();

    static {
        C81292bw bwVar = new C81292bw();
        f222532c = bwVar;
        C62942bv.registerDefaultInstance(C81292bw.class, bwVar);
    }

    private C81292bw() {
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
                return newMessageInfo(f222532c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C81290bu.class, "b", C81290bu.class});
            case 3:
                return new C81292bw();
            case 4:
                return new C81291bv();
            case 5:
                return f222532c;
            case 6:
                C63010eb ebVar = f222533d;
                if (ebVar == null) {
                    synchronized (C81292bw.class) {
                        ebVar = f222533d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222532c);
                            f222533d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
