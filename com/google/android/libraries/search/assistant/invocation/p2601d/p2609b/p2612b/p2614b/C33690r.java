package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.r */
/* compiled from: PG */
public final class C33690r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33690r f90011c;

    /* renamed from: d */
    private static volatile C63010eb f90012d;

    /* renamed from: a */
    public int f90013a = 0;

    /* renamed from: b */
    public Object f90014b;

    static {
        C33690r rVar = new C33690r();
        f90011c = rVar;
        C62942bv.registerDefaultInstance(C33690r.class, rVar);
    }

    private C33690r() {
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
                return newMessageInfo(f90011c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C33685m.class, C33681i.class});
            case 3:
                return new C33690r();
            case 4:
                return new C33689q();
            case 5:
                return f90011c;
            case 6:
                C63010eb ebVar = f90012d;
                if (ebVar == null) {
                    synchronized (C33690r.class) {
                        ebVar = f90012d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90011c);
                            f90012d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
