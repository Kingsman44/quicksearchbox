package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.p */
/* compiled from: PG */
public final class C33688p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33688p f90006c;

    /* renamed from: e */
    private static volatile C63010eb f90007e;

    /* renamed from: a */
    public int f90008a = 0;

    /* renamed from: b */
    public Object f90009b;

    /* renamed from: d */
    private byte f90010d = 2;

    static {
        C33688p pVar = new C33688p();
        f90006c = pVar;
        C62942bv.registerDefaultInstance(C33688p.class, pVar);
    }

    private C33688p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90010d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90010d = b;
                return null;
            case 2:
                return newMessageInfo(f90006c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C33683k.class, C33677e.class});
            case 3:
                return new C33688p();
            case 4:
                return new C33686n();
            case 5:
                return f90006c;
            case 6:
                C63010eb ebVar = f90007e;
                if (ebVar == null) {
                    synchronized (C33688p.class) {
                        ebVar = f90007e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90006c);
                            f90007e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
