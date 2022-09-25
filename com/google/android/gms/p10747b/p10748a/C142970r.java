package com.google.android.gms.p10747b.p10748a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.r */
/* compiled from: PG */
public final class C142970r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142970r f387925b;

    /* renamed from: c */
    private static volatile C63010eb f387926c;

    /* renamed from: a */
    public C62971cq f387927a = emptyProtobufList();

    static {
        C142970r rVar = new C142970r();
        f387925b = rVar;
        C62942bv.registerDefaultInstance(C142970r.class, rVar);
    }

    private C142970r() {
        emptyProtobufList();
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
                return newMessageInfo(f387925b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C142969q.class});
            case 3:
                return new C142970r();
            case 4:
                return new C142955c();
            case 5:
                return f387925b;
            case 6:
                C63010eb ebVar = f387926c;
                if (ebVar == null) {
                    synchronized (C142970r.class) {
                        ebVar = f387926c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387925b);
                            f387926c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
