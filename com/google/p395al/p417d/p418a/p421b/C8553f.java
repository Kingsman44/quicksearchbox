package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.f */
/* compiled from: PG */
public final class C8553f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8553f f29650a;

    /* renamed from: b */
    private static volatile C63010eb f29651b;

    static {
        C8553f fVar = new C8553f();
        f29650a = fVar;
        C62942bv.registerDefaultInstance(C8553f.class, fVar);
    }

    private C8553f() {
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
                return newMessageInfo(f29650a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8553f();
            case 4:
                return new C8552e();
            case 5:
                return f29650a;
            case 6:
                C63010eb ebVar = f29651b;
                if (ebVar == null) {
                    synchronized (C8553f.class) {
                        ebVar = f29651b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29650a);
                            f29651b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
