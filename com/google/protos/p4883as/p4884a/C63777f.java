package com.google.protos.p4883as.p4884a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.a.f */
/* compiled from: PG */
public final class C63777f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63777f f172527a;

    /* renamed from: e */
    private static volatile C63010eb f172528e;

    /* renamed from: b */
    private int f172529b;

    /* renamed from: c */
    private C63779h f172530c;

    /* renamed from: d */
    private byte f172531d = 2;

    static {
        C63777f fVar = new C63777f();
        f172527a = fVar;
        C62942bv.registerDefaultInstance(C63777f.class, fVar);
    }

    private C63777f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172531d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172531d = b;
                return null;
            case 2:
                return newMessageInfo(f172527a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0005", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63777f();
            case 4:
                return new C63776e();
            case 5:
                return f172527a;
            case 6:
                C63010eb ebVar = f172528e;
                if (ebVar == null) {
                    synchronized (C63777f.class) {
                        ebVar = f172528e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172527a);
                            f172528e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
