package com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.a.a.b */
/* compiled from: PG */
public final class C80531b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80531b f221071a;

    /* renamed from: b */
    private static volatile C63010eb f221072b;

    static {
        C80531b bVar = new C80531b();
        f221071a = bVar;
        C62942bv.registerDefaultInstance(C80531b.class, bVar);
    }

    private C80531b() {
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
                return newMessageInfo(f221071a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80531b();
            case 4:
                return new C80530a();
            case 5:
                return f221071a;
            case 6:
                C63010eb ebVar = f221072b;
                if (ebVar == null) {
                    synchronized (C80531b.class) {
                        ebVar = f221072b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221071a);
                            f221072b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
