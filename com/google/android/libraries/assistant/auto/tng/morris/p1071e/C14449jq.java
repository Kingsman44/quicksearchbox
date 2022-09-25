package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jq */
/* compiled from: PG */
public final class C14449jq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14449jq f43715a;

    /* renamed from: b */
    private static volatile C63010eb f43716b;

    static {
        C14449jq jqVar = new C14449jq();
        f43715a = jqVar;
        C62942bv.registerDefaultInstance(C14449jq.class, jqVar);
    }

    private C14449jq() {
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
                return newMessageInfo(f43715a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14449jq();
            case 4:
                return new C14448jp();
            case 5:
                return f43715a;
            case 6:
                C63010eb ebVar = f43716b;
                if (ebVar == null) {
                    synchronized (C14449jq.class) {
                        ebVar = f43716b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43715a);
                            f43716b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
