package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gk */
/* compiled from: PG */
public final class C82949gk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82949gk f226314a;

    /* renamed from: b */
    private static volatile C63010eb f226315b;

    static {
        C82949gk gkVar = new C82949gk();
        f226314a = gkVar;
        C62942bv.registerDefaultInstance(C82949gk.class, gkVar);
    }

    private C82949gk() {
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
                return newMessageInfo(f226314a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82949gk();
            case 4:
                return new C82948gj();
            case 5:
                return f226314a;
            case 6:
                C63010eb ebVar = f226315b;
                if (ebVar == null) {
                    synchronized (C82949gk.class) {
                        ebVar = f226315b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226314a);
                            f226315b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
