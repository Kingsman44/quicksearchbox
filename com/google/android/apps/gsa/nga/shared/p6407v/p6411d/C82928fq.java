package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fq */
/* compiled from: PG */
public final class C82928fq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C82928fq f226243b;

    /* renamed from: c */
    private static volatile C63010eb f226244c;

    /* renamed from: a */
    public C62971cq f226245a = emptyProtobufList();

    static {
        C82928fq fqVar = new C82928fq();
        f226243b = fqVar;
        C62942bv.registerDefaultInstance(C82928fq.class, fqVar);
    }

    private C82928fq() {
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
                return newMessageInfo(f226243b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C82927fp.class});
            case 3:
                return new C82928fq();
            case 4:
                return new C82925fn();
            case 5:
                return f226243b;
            case 6:
                C63010eb ebVar = f226244c;
                if (ebVar == null) {
                    synchronized (C82928fq.class) {
                        ebVar = f226244c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226243b);
                            f226244c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
