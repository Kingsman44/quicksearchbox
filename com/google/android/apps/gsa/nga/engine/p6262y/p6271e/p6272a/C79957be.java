package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.be */
/* compiled from: PG */
public final class C79957be extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79957be f219286d;

    /* renamed from: e */
    private static volatile C63010eb f219287e;

    /* renamed from: a */
    public C62960cg f219288a = emptyFloatList();

    /* renamed from: b */
    public C62960cg f219289b = emptyFloatList();

    /* renamed from: c */
    public C62961ch f219290c = emptyIntList();

    static {
        C79957be beVar = new C79957be();
        f219286d = beVar;
        C62942bv.registerDefaultInstance(C79957be.class, beVar);
    }

    private C79957be() {
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
                return newMessageInfo(f219286d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u0013\u0002\u0013\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79957be();
            case 4:
                return new C79956bd();
            case 5:
                return f219286d;
            case 6:
                C63010eb ebVar = f219287e;
                if (ebVar == null) {
                    synchronized (C79957be.class) {
                        ebVar = f219287e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219286d);
                            f219287e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
