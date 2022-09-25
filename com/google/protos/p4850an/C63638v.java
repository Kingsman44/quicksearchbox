package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.v */
/* compiled from: PG */
public final class C63638v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63638v f172106a;

    /* renamed from: b */
    private static volatile C63010eb f172107b;

    static {
        C63638v vVar = new C63638v();
        f172106a = vVar;
        C62942bv.registerDefaultInstance(C63638v.class, vVar);
    }

    private C63638v() {
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
                return newMessageInfo(f172106a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63638v();
            case 4:
                return new C63637u();
            case 5:
                return f172106a;
            case 6:
                C63010eb ebVar = f172107b;
                if (ebVar == null) {
                    synchronized (C63638v.class) {
                        ebVar = f172107b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172106a);
                            f172107b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
