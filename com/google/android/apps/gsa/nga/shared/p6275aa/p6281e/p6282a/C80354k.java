package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.k */
/* compiled from: PG */
public final class C80354k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80354k f220479b;

    /* renamed from: c */
    private static volatile C63010eb f220480c;

    /* renamed from: a */
    public C62960cg f220481a = emptyFloatList();

    static {
        C80354k kVar = new C80354k();
        f220479b = kVar;
        C62942bv.registerDefaultInstance(C80354k.class, kVar);
    }

    private C80354k() {
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
                return newMessageInfo(f220479b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new C80354k();
            case 4:
                return new C80353j();
            case 5:
                return f220479b;
            case 6:
                C63010eb ebVar = f220480c;
                if (ebVar == null) {
                    synchronized (C80354k.class) {
                        ebVar = f220480c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220479b);
                            f220480c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
