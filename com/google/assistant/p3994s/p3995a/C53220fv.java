package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fv */
/* compiled from: PG */
public final class C53220fv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53220fv f139484a;

    /* renamed from: c */
    private static volatile C63010eb f139485c;

    /* renamed from: b */
    private byte f139486b = 2;

    static {
        C53220fv fvVar = new C53220fv();
        f139484a = fvVar;
        C62942bv.registerDefaultInstance(C53220fv.class, fvVar);
    }

    private C53220fv() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139486b);
            case 1:
                this.f139486b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139484a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53220fv();
            case 4:
                return new C53219fu();
            case 5:
                return f139484a;
            case 6:
                C63010eb ebVar = f139485c;
                if (ebVar == null) {
                    synchronized (C53220fv.class) {
                        ebVar = f139485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139484a);
                            f139485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
