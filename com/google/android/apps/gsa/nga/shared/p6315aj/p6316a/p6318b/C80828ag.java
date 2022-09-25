package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.ag */
/* compiled from: PG */
public final class C80828ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80828ag f221747a;

    /* renamed from: b */
    private static volatile C63010eb f221748b;

    static {
        C80828ag agVar = new C80828ag();
        f221747a = agVar;
        C62942bv.registerDefaultInstance(C80828ag.class, agVar);
    }

    private C80828ag() {
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
                return newMessageInfo(f221747a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80828ag();
            case 4:
                return new C80827af();
            case 5:
                return f221747a;
            case 6:
                C63010eb ebVar = f221748b;
                if (ebVar == null) {
                    synchronized (C80828ag.class) {
                        ebVar = f221748b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221747a);
                            f221748b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
