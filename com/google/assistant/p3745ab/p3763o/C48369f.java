package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.o.f */
/* compiled from: PG */
public final class C48369f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48369f f125041a;

    /* renamed from: c */
    private static volatile C63010eb f125042c;

    /* renamed from: b */
    private byte f125043b = 2;

    static {
        C48369f fVar = new C48369f();
        f125041a = fVar;
        C62942bv.registerDefaultInstance(C48369f.class, fVar);
    }

    private C48369f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125043b);
            case 1:
                this.f125043b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f125041a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48369f();
            case 4:
                return new C48368e();
            case 5:
                return f125041a;
            case 6:
                C63010eb ebVar = f125042c;
                if (ebVar == null) {
                    synchronized (C48369f.class) {
                        ebVar = f125042c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125041a);
                            f125042c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
