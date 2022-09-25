package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bs */
/* compiled from: PG */
public final class C51276bs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51276bs f133497a;

    /* renamed from: b */
    private static volatile C63010eb f133498b;

    static {
        C51276bs bsVar = new C51276bs();
        f133497a = bsVar;
        C62942bv.registerDefaultInstance(C51276bs.class, bsVar);
    }

    private C51276bs() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f133497a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51276bs();
            case 4:
                return new C51275br();
            case 5:
                return f133497a;
            case 6:
                C63010eb ebVar = f133498b;
                if (ebVar == null) {
                    synchronized (C51276bs.class) {
                        ebVar = f133498b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133497a);
                            f133498b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
