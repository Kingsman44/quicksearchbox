package com.google.android.apps.gsa.unifiedime;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.h */
/* compiled from: PG */
public final class C118590h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C118590h f330865d;

    /* renamed from: e */
    private static volatile C63010eb f330866e;

    /* renamed from: a */
    public int f330867a;

    /* renamed from: b */
    public C62971cq f330868b = emptyProtobufList();

    /* renamed from: c */
    public int f330869c;

    static {
        C118590h hVar = new C118590h();
        f330865d = hVar;
        C62942bv.registerDefaultInstance(C118590h.class, hVar);
    }

    private C118590h() {
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
                return newMessageInfo(f330865d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", C118588f.class, C45240c.f118157a});
            case 3:
                return new C118590h();
            case 4:
                return new C118589g();
            case 5:
                return f330865d;
            case 6:
                C63010eb ebVar = f330866e;
                if (ebVar == null) {
                    synchronized (C118590h.class) {
                        ebVar = f330866e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330865d);
                            f330866e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
