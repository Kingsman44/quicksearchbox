package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.ae */
/* compiled from: PG */
public final class C80826ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80826ae f221745a;

    /* renamed from: b */
    private static volatile C63010eb f221746b;

    static {
        C80826ae aeVar = new C80826ae();
        f221745a = aeVar;
        C62942bv.registerDefaultInstance(C80826ae.class, aeVar);
    }

    private C80826ae() {
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
                return newMessageInfo(f221745a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80826ae();
            case 4:
                return new C80825ad();
            case 5:
                return f221745a;
            case 6:
                C63010eb ebVar = f221746b;
                if (ebVar == null) {
                    synchronized (C80826ae.class) {
                        ebVar = f221746b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221745a);
                            f221746b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
