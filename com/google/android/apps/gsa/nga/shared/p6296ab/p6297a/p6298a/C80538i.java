package com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.a.a.i */
/* compiled from: PG */
public final class C80538i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80538i f221080a;

    /* renamed from: b */
    private static volatile C63010eb f221081b;

    static {
        C80538i iVar = new C80538i();
        f221080a = iVar;
        C62942bv.registerDefaultInstance(C80538i.class, iVar);
    }

    private C80538i() {
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
                return newMessageInfo(f221080a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80538i();
            case 4:
                return new C80537h();
            case 5:
                return f221080a;
            case 6:
                C63010eb ebVar = f221081b;
                if (ebVar == null) {
                    synchronized (C80538i.class) {
                        ebVar = f221081b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221080a);
                            f221081b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
