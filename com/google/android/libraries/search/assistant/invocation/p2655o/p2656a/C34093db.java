package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.db */
/* compiled from: PG */
public final class C34093db extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34093db f90828c;

    /* renamed from: d */
    private static volatile C63010eb f90829d;

    /* renamed from: a */
    public int f90830a;

    /* renamed from: b */
    public boolean f90831b;

    static {
        C34093db dbVar = new C34093db();
        f90828c = dbVar;
        C62942bv.registerDefaultInstance(C34093db.class, dbVar);
    }

    private C34093db() {
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
                return newMessageInfo(f90828c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34093db();
            case 4:
                return new C34092da();
            case 5:
                return f90828c;
            case 6:
                C63010eb ebVar = f90829d;
                if (ebVar == null) {
                    synchronized (C34093db.class) {
                        ebVar = f90829d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90828c);
                            f90829d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
