package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.v */
/* compiled from: PG */
public final class C50919v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50919v f132564d;

    /* renamed from: e */
    private static volatile C63010eb f132565e;

    /* renamed from: a */
    public int f132566a;

    /* renamed from: b */
    public C50911n f132567b;

    /* renamed from: c */
    public int f132568c;

    static {
        C50919v vVar = new C50919v();
        f132564d = vVar;
        C62942bv.registerDefaultInstance(C50919v.class, vVar);
    }

    private C50919v() {
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
                return newMessageInfo(f132564d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50917t.f132563a});
            case 3:
                return new C50919v();
            case 4:
                return new C50916s();
            case 5:
                return f132564d;
            case 6:
                C63010eb ebVar = f132565e;
                if (ebVar == null) {
                    synchronized (C50919v.class) {
                        ebVar = f132565e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132564d);
                            f132565e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
