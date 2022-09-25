package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.b */
/* compiled from: PG */
public final class C80848b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80848b f221783a;

    /* renamed from: b */
    private static volatile C63010eb f221784b;

    static {
        C80848b bVar = new C80848b();
        f221783a = bVar;
        C62942bv.registerDefaultInstance(C80848b.class, bVar);
    }

    private C80848b() {
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
                return newMessageInfo(f221783a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80848b();
            case 4:
                return new C80821a();
            case 5:
                return f221783a;
            case 6:
                C63010eb ebVar = f221784b;
                if (ebVar == null) {
                    synchronized (C80848b.class) {
                        ebVar = f221784b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221783a);
                            f221784b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
