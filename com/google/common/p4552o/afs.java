package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afs */
/* compiled from: PG */
public final class afs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afs f158570e;

    /* renamed from: f */
    private static volatile C63010eb f158571f;

    /* renamed from: a */
    public int f158572a;

    /* renamed from: b */
    public afr f158573b;

    /* renamed from: c */
    public C62971cq f158574c = emptyProtobufList();

    /* renamed from: d */
    public long f158575d;

    static {
        afs afs = new afs();
        f158570e = afs;
        C62942bv.registerDefaultInstance(afs.class, afs);
    }

    private afs() {
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
                return newMessageInfo(f158570e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a, afr.class, "d"});
            case 3:
                return new afs();
            case 4:
                return new afp();
            case 5:
                return f158570e;
            case 6:
                C63010eb ebVar = f158571f;
                if (ebVar == null) {
                    synchronized (afs.class) {
                        ebVar = f158571f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158570e);
                            f158571f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
