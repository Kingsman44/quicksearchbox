package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ax */
/* compiled from: PG */
public final class C80109ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80109ax f219819a;

    /* renamed from: b */
    private static volatile C63010eb f219820b;

    static {
        C80109ax axVar = new C80109ax();
        f219819a = axVar;
        C62942bv.registerDefaultInstance(C80109ax.class, axVar);
    }

    private C80109ax() {
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
                return newMessageInfo(f219819a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80109ax();
            case 4:
                return new C80108aw();
            case 5:
                return f219819a;
            case 6:
                C63010eb ebVar = f219820b;
                if (ebVar == null) {
                    synchronized (C80109ax.class) {
                        ebVar = f219820b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219819a);
                            f219820b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
