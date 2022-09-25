package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.bf */
/* compiled from: PG */
public final class C28728bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28728bf f78043d;

    /* renamed from: e */
    private static volatile C63010eb f78044e;

    /* renamed from: a */
    public int f78045a;

    /* renamed from: b */
    public C62971cq f78046b = emptyProtobufList();

    /* renamed from: c */
    public C28727be f78047c;

    static {
        C28728bf bfVar = new C28728bf();
        f78043d = bfVar;
        C62942bv.registerDefaultInstance(C28728bf.class, bfVar);
    }

    private C28728bf() {
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
                return newMessageInfo(f78043d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C28725bc.class, C45240c.f118157a});
            case 3:
                return new C28728bf();
            case 4:
                return new C28717aw();
            case 5:
                return f78043d;
            case 6:
                C63010eb ebVar = f78044e;
                if (ebVar == null) {
                    synchronized (C28728bf.class) {
                        ebVar = f78044e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78043d);
                            f78044e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
