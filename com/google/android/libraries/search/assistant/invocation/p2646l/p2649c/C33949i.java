package com.google.android.libraries.search.assistant.invocation.p2646l.p2649c;

import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.c.i */
/* compiled from: PG */
public final class C33949i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33949i f90522b;

    /* renamed from: d */
    private static volatile C63010eb f90523d;

    /* renamed from: a */
    public C51450id f90524a;

    /* renamed from: c */
    private byte f90525c = 2;

    static {
        C33949i iVar = new C33949i();
        f90522b = iVar;
        C62942bv.registerDefaultInstance(C33949i.class, iVar);
    }

    private C33949i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90525c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f90525c = b;
                return null;
            case 2:
                return newMessageInfo(f90522b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C33949i();
            case 4:
                return new C33948h();
            case 5:
                return f90522b;
            case 6:
                C63010eb ebVar = f90523d;
                if (ebVar == null) {
                    synchronized (C33949i.class) {
                        ebVar = f90523d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90522b);
                            f90523d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
