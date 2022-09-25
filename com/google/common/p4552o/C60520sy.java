package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.sy */
/* compiled from: PG */
public final class C60520sy extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60520sy f163836e;

    /* renamed from: f */
    private static volatile C63010eb f163837f;

    /* renamed from: a */
    public int f163838a;

    /* renamed from: b */
    public int f163839b;

    /* renamed from: c */
    public C62961ch f163840c = emptyIntList();

    /* renamed from: d */
    public C62961ch f163841d = emptyIntList();

    static {
        C60520sy syVar = new C60520sy();
        f163836e = syVar;
        C62942bv.registerDefaultInstance(C60520sy.class, syVar);
    }

    private C60520sy() {
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
                return newMessageInfo(f163836e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002,\u0003,", new Object[]{"a", "b", C60517sv.f163824a, C45240c.f118157a, C60516su.m92602b(), "d", C60519sx.m92604b()});
            case 3:
                return new C60520sy();
            case 4:
                return new C60514ss();
            case 5:
                return f163836e;
            case 6:
                C63010eb ebVar = f163837f;
                if (ebVar == null) {
                    synchronized (C60520sy.class) {
                        ebVar = f163837f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163836e);
                            f163837f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
