package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ak */
/* compiled from: PG */
public final class C51241ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51241ak f133409a;

    /* renamed from: b */
    private static volatile C63010eb f133410b;

    static {
        C51241ak akVar = new C51241ak();
        f133409a = akVar;
        C62942bv.registerDefaultInstance(C51241ak.class, akVar);
    }

    private C51241ak() {
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
                return newMessageInfo(f133409a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51241ak();
            case 4:
                return new C51240aj();
            case 5:
                return f133409a;
            case 6:
                C63010eb ebVar = f133410b;
                if (ebVar == null) {
                    synchronized (C51241ak.class) {
                        ebVar = f133410b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133409a);
                            f133410b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
