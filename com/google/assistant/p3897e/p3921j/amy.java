package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.amy */
/* compiled from: PG */
public final class amy extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final amy f135404d;

    /* renamed from: e */
    private static volatile C63010eb f135405e;

    /* renamed from: a */
    public int f135406a;

    /* renamed from: b */
    public boolean f135407b;

    /* renamed from: c */
    public C63037fb f135408c;

    static {
        amy amy = new amy();
        f135404d = amy;
        C62942bv.registerDefaultInstance(amy.class, amy);
    }

    private amy() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f135404d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new amy();
            case 4:
                return new amx();
            case 5:
                return f135404d;
            case 6:
                C63010eb ebVar = f135405e;
                if (ebVar == null) {
                    synchronized (amy.class) {
                        ebVar = f135405e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135404d);
                            f135405e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
