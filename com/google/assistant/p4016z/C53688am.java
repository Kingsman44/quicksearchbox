package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.am */
/* compiled from: PG */
public final class C53688am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53688am f140921a;

    /* renamed from: b */
    private static volatile C63010eb f140922b;

    static {
        C53688am amVar = new C53688am();
        f140921a = amVar;
        C62942bv.registerDefaultInstance(C53688am.class, amVar);
    }

    private C53688am() {
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
                return newMessageInfo(f140921a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53688am();
            case 4:
                return new C53687al();
            case 5:
                return f140921a;
            case 6:
                C63010eb ebVar = f140922b;
                if (ebVar == null) {
                    synchronized (C53688am.class) {
                        ebVar = f140922b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140921a);
                            f140922b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
