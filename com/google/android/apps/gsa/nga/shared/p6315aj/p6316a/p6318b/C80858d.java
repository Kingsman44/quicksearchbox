package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.d */
/* compiled from: PG */
public final class C80858d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80858d f221801b;

    /* renamed from: c */
    private static volatile C63010eb f221802c;

    /* renamed from: a */
    public boolean f221803a;

    static {
        C80858d dVar = new C80858d();
        f221801b = dVar;
        C62942bv.registerDefaultInstance(C80858d.class, dVar);
    }

    private C80858d() {
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
                return newMessageInfo(f221801b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C80858d();
            case 4:
                return new C80857c();
            case 5:
                return f221801b;
            case 6:
                C63010eb ebVar = f221802c;
                if (ebVar == null) {
                    synchronized (C80858d.class) {
                        ebVar = f221802c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221801b);
                            f221802c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
