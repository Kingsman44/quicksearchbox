package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.y */
/* compiled from: PG */
public final class C80879y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80879y f221830a;

    /* renamed from: b */
    private static volatile C63010eb f221831b;

    static {
        C80879y yVar = new C80879y();
        f221830a = yVar;
        C62942bv.registerDefaultInstance(C80879y.class, yVar);
    }

    private C80879y() {
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
                return newMessageInfo(f221830a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80879y();
            case 4:
                return new C80878x();
            case 5:
                return f221830a;
            case 6:
                C63010eb ebVar = f221831b;
                if (ebVar == null) {
                    synchronized (C80879y.class) {
                        ebVar = f221831b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221830a);
                            f221831b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
