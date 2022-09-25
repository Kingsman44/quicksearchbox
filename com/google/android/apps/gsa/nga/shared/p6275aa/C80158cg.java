package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cg */
/* compiled from: PG */
public final class C80158cg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80158cg f219960a;

    /* renamed from: b */
    private static volatile C63010eb f219961b;

    static {
        C80158cg cgVar = new C80158cg();
        f219960a = cgVar;
        C62942bv.registerDefaultInstance(C80158cg.class, cgVar);
    }

    private C80158cg() {
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
                return newMessageInfo(f219960a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80158cg();
            case 4:
                return new C80157cf();
            case 5:
                return f219960a;
            case 6:
                C63010eb ebVar = f219961b;
                if (ebVar == null) {
                    synchronized (C80158cg.class) {
                        ebVar = f219961b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219960a);
                            f219961b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
