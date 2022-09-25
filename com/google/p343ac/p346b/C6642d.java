package com.google.p343ac.p346b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.d */
/* compiled from: PG */
public final class C6642d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6642d f19870e;

    /* renamed from: f */
    private static volatile C63010eb f19871f;

    /* renamed from: a */
    public C62961ch f19872a = emptyIntList();

    /* renamed from: b */
    public C62961ch f19873b = emptyIntList();

    /* renamed from: c */
    public C62961ch f19874c = emptyIntList();

    /* renamed from: d */
    public C62961ch f19875d = emptyIntList();

    static {
        C6642d dVar = new C6642d();
        f19870e = dVar;
        C62942bv.registerDefaultInstance(C6642d.class, dVar);
    }

    private C6642d() {
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
                return newMessageInfo(f19870e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C6642d();
            case 4:
                return new C6641c();
            case 5:
                return f19870e;
            case 6:
                C63010eb ebVar = f19871f;
                if (ebVar == null) {
                    synchronized (C6642d.class) {
                        ebVar = f19871f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19870e);
                            f19871f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
