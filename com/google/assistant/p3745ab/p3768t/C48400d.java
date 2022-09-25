package com.google.assistant.p3745ab.p3768t;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.t.d */
/* compiled from: PG */
public final class C48400d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48400d f125096a;

    /* renamed from: d */
    private static volatile C63010eb f125097d;

    /* renamed from: b */
    private C48402f f125098b;

    /* renamed from: c */
    private byte f125099c = 2;

    static {
        C48400d dVar = new C48400d();
        f125096a = dVar;
        C62942bv.registerDefaultInstance(C48400d.class, dVar);
    }

    private C48400d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125099c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125099c = b;
                return null;
            case 2:
                return newMessageInfo(f125096a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C48400d();
            case 4:
                return new C48399c();
            case 5:
                return f125096a;
            case 6:
                C63010eb ebVar = f125097d;
                if (ebVar == null) {
                    synchronized (C48400d.class) {
                        ebVar = f125097d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125096a);
                            f125097d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
