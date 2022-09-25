package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.g */
/* compiled from: PG */
public final class C78680g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C78680g f216602b;

    /* renamed from: c */
    private static volatile C63010eb f216603c;

    /* renamed from: a */
    public C62971cq f216604a = C62942bv.emptyProtobufList();

    static {
        C78680g gVar = new C78680g();
        f216602b = gVar;
        C62942bv.registerDefaultInstance(C78680g.class, gVar);
    }

    private C78680g() {
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
                return newMessageInfo(f216602b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C78680g();
            case 4:
                return new C78679f();
            case 5:
                return f216602b;
            case 6:
                C63010eb ebVar = f216603c;
                if (ebVar == null) {
                    synchronized (C78680g.class) {
                        ebVar = f216603c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216602b);
                            f216603c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
