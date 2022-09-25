package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.f */
/* compiled from: PG */
public final class C33612f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33612f f89831a;

    /* renamed from: b */
    private static volatile C63010eb f89832b;

    static {
        C33612f fVar = new C33612f();
        f89831a = fVar;
        C62942bv.registerDefaultInstance(C33612f.class, fVar);
    }

    private C33612f() {
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
                return newMessageInfo(f89831a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33612f();
            case 4:
                return new C33611e();
            case 5:
                return f89831a;
            case 6:
                C63010eb ebVar = f89832b;
                if (ebVar == null) {
                    synchronized (C33612f.class) {
                        ebVar = f89832b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89831a);
                            f89832b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
