package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bf */
/* compiled from: PG */
public final class C80128bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80128bf f219873a;

    /* renamed from: b */
    private static volatile C63010eb f219874b;

    static {
        C80128bf bfVar = new C80128bf();
        f219873a = bfVar;
        C62942bv.registerDefaultInstance(C80128bf.class, bfVar);
    }

    private C80128bf() {
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
                return newMessageInfo(f219873a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80128bf();
            case 4:
                return new C80127be();
            case 5:
                return f219873a;
            case 6:
                C63010eb ebVar = f219874b;
                if (ebVar == null) {
                    synchronized (C80128bf.class) {
                        ebVar = f219874b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219873a);
                            f219874b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
