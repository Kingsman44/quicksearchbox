package com.google.android.apps.gsa.nga.shared.p6337e.p6338a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.e.a.b */
/* compiled from: PG */
public final class C81022b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C81022b f222080a;

    /* renamed from: b */
    private static volatile C63010eb f222081b;

    static {
        C81022b bVar = new C81022b();
        f222080a = bVar;
        C62942bv.registerDefaultInstance(C81022b.class, bVar);
    }

    private C81022b() {
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
                return newMessageInfo(f222080a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C81022b();
            case 4:
                return new C81021a();
            case 5:
                return f222080a;
            case 6:
                C63010eb ebVar = f222081b;
                if (ebVar == null) {
                    synchronized (C81022b.class) {
                        ebVar = f222081b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222080a);
                            f222081b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
