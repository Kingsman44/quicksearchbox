package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.w */
/* compiled from: PG */
public final class C18993w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18993w f53364a;

    /* renamed from: b */
    private static volatile C63010eb f53365b;

    static {
        C18993w wVar = new C18993w();
        f53364a = wVar;
        C62942bv.registerDefaultInstance(C18993w.class, wVar);
    }

    private C18993w() {
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
                return newMessageInfo(f53364a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C18993w();
            case 4:
                return new C18992v();
            case 5:
                return f53364a;
            case 6:
                C63010eb ebVar = f53365b;
                if (ebVar == null) {
                    synchronized (C18993w.class) {
                        ebVar = f53365b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53364a);
                            f53365b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
