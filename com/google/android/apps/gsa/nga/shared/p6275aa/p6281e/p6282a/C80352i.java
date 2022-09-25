package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62956cc;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.i */
/* compiled from: PG */
public final class C80352i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80352i f220476b;

    /* renamed from: c */
    private static volatile C63010eb f220477c;

    /* renamed from: a */
    public C62956cc f220478a = emptyDoubleList();

    static {
        C80352i iVar = new C80352i();
        f220476b = iVar;
        C62942bv.registerDefaultInstance(C80352i.class, iVar);
    }

    private C80352i() {
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
                return newMessageInfo(f220476b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"a"});
            case 3:
                return new C80352i();
            case 4:
                return new C80351h();
            case 5:
                return f220476b;
            case 6:
                C63010eb ebVar = f220477c;
                if (ebVar == null) {
                    synchronized (C80352i.class) {
                        ebVar = f220477c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220476b);
                            f220477c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
