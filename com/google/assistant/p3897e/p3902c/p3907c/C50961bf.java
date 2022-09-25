package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bf */
/* compiled from: PG */
public final class C50961bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50961bf f132664b;

    /* renamed from: e */
    private static volatile C63010eb f132665e;

    /* renamed from: a */
    public C50936ah f132666a;

    /* renamed from: c */
    private int f132667c;

    /* renamed from: d */
    private byte f132668d = 2;

    static {
        C50961bf bfVar = new C50961bf();
        f132664b = bfVar;
        C62942bv.registerDefaultInstance(C50961bf.class, bfVar);
    }

    private C50961bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132668d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132668d = b;
                return null;
            case 2:
                return newMessageInfo(f132664b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50961bf();
            case 4:
                return new C50960be();
            case 5:
                return f132664b;
            case 6:
                C63010eb ebVar = f132665e;
                if (ebVar == null) {
                    synchronized (C50961bf.class) {
                        ebVar = f132665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132664b);
                            f132665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
