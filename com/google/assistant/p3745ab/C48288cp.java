package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cp */
/* compiled from: PG */
public final class C48288cp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48288cp f124883a;

    /* renamed from: d */
    private static volatile C63010eb f124884d;

    /* renamed from: b */
    private C48290cr f124885b;

    /* renamed from: c */
    private byte f124886c = 2;

    static {
        C48288cp cpVar = new C48288cp();
        f124883a = cpVar;
        C62942bv.registerDefaultInstance(C48288cp.class, cpVar);
    }

    private C48288cp() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124886c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124886c = b;
                return null;
            case 2:
                return newMessageInfo(f124883a, "\u0000\u0001\u0000\u0000\u0013\u0013\u0001\u0000\u0000\u0001\u0013Љ", new Object[]{"b"});
            case 3:
                return new C48288cp();
            case 4:
                return new C48287co();
            case 5:
                return f124883a;
            case 6:
                C63010eb ebVar = f124884d;
                if (ebVar == null) {
                    synchronized (C48288cp.class) {
                        ebVar = f124884d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124883a);
                            f124884d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
