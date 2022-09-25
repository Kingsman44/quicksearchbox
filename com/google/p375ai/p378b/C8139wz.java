package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wz */
/* compiled from: PG */
public final class C8139wz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8139wz f28614d;

    /* renamed from: e */
    private static volatile C63010eb f28615e;

    /* renamed from: a */
    public int f28616a;

    /* renamed from: b */
    public C8135wv f28617b;

    /* renamed from: c */
    public C62971cq f28618c = emptyProtobufList();

    static {
        C8139wz wzVar = new C8139wz();
        f28614d = wzVar;
        C62942bv.registerDefaultInstance(C8139wz.class, wzVar);
    }

    private C8139wz() {
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
                return newMessageInfo(f28614d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C8138wy.class});
            case 3:
                return new C8139wz();
            case 4:
                return new C8136ww();
            case 5:
                return f28614d;
            case 6:
                C63010eb ebVar = f28615e;
                if (ebVar == null) {
                    synchronized (C8139wz.class) {
                        ebVar = f28615e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28614d);
                            f28615e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
