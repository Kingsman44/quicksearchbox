package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.m */
/* compiled from: PG */
public final class C80867m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80867m f221815a;

    /* renamed from: b */
    private static volatile C63010eb f221816b;

    static {
        C80867m mVar = new C80867m();
        f221815a = mVar;
        C62942bv.registerDefaultInstance(C80867m.class, mVar);
    }

    private C80867m() {
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
                return newMessageInfo(f221815a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80867m();
            case 4:
                return new C80866l();
            case 5:
                return f221815a;
            case 6:
                C63010eb ebVar = f221816b;
                if (ebVar == null) {
                    synchronized (C80867m.class) {
                        ebVar = f221816b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221815a);
                            f221816b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
