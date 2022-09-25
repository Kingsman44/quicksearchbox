package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ea */
/* compiled from: PG */
public final class C142403ea extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142403ea f386410a;

    /* renamed from: b */
    private static volatile C63010eb f386411b;

    static {
        C142403ea eaVar = new C142403ea();
        f386410a = eaVar;
        C62942bv.registerDefaultInstance(C142403ea.class, eaVar);
    }

    private C142403ea() {
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
                return newMessageInfo(f386410a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C142403ea();
            case 4:
                return new C142401dz();
            case 5:
                return f386410a;
            case 6:
                C63010eb ebVar = f386411b;
                if (ebVar == null) {
                    synchronized (C142403ea.class) {
                        ebVar = f386411b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386410a);
                            f386411b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
