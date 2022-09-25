package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.my */
/* compiled from: PG */
public final class C14538my extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14538my f43976a;

    /* renamed from: b */
    private static volatile C63010eb f43977b;

    static {
        C14538my myVar = new C14538my();
        f43976a = myVar;
        C62942bv.registerDefaultInstance(C14538my.class, myVar);
    }

    private C14538my() {
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
                return newMessageInfo(f43976a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14538my();
            case 4:
                return new C14537mx();
            case 5:
                return f43976a;
            case 6:
                C63010eb ebVar = f43977b;
                if (ebVar == null) {
                    synchronized (C14538my.class) {
                        ebVar = f43977b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43976a);
                            f43977b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
