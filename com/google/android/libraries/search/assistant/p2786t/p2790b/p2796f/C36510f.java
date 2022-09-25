package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.f */
/* compiled from: PG */
public final class C36510f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C36510f f95276a;

    /* renamed from: b */
    private static volatile C63010eb f95277b;

    static {
        C36510f fVar = new C36510f();
        f95276a = fVar;
        C62942bv.registerDefaultInstance(C36510f.class, fVar);
    }

    private C36510f() {
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
                return newMessageInfo(f95276a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C36510f();
            case 4:
                return new C36509e();
            case 5:
                return f95276a;
            case 6:
                C63010eb ebVar = f95277b;
                if (ebVar == null) {
                    synchronized (C36510f.class) {
                        ebVar = f95277b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95276a);
                            f95277b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
