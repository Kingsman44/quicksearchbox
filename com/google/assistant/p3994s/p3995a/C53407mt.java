package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mt */
/* compiled from: PG */
public final class C53407mt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53407mt f140139d;

    /* renamed from: e */
    private static volatile C63010eb f140140e;

    /* renamed from: a */
    public int f140141a;

    /* renamed from: b */
    public C53368lh f140142b;

    /* renamed from: c */
    public C62971cq f140143c = emptyProtobufList();

    static {
        C53407mt mtVar = new C53407mt();
        f140139d = mtVar;
        C62942bv.registerDefaultInstance(C53407mt.class, mtVar);
    }

    private C53407mt() {
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
                return newMessageInfo(f140139d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C53368lh.class});
            case 3:
                return new C53407mt();
            case 4:
                return new C53406ms();
            case 5:
                return f140139d;
            case 6:
                C63010eb ebVar = f140140e;
                if (ebVar == null) {
                    synchronized (C53407mt.class) {
                        ebVar = f140140e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140139d);
                            f140140e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
