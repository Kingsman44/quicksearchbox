package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gu */
/* compiled from: PG */
public final class C51413gu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51413gu f133917a;

    /* renamed from: c */
    private static volatile C63010eb f133918c;

    /* renamed from: b */
    private byte f133919b = 2;

    static {
        C51413gu guVar = new C51413gu();
        f133917a = guVar;
        C62942bv.registerDefaultInstance(C51413gu.class, guVar);
    }

    private C51413gu() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133919b);
            case 1:
                this.f133919b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f133917a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51413gu();
            case 4:
                return new C51412gt();
            case 5:
                return f133917a;
            case 6:
                C63010eb ebVar = f133918c;
                if (ebVar == null) {
                    synchronized (C51413gu.class) {
                        ebVar = f133918c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133917a);
                            f133918c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
