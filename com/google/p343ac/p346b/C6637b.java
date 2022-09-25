package com.google.p343ac.p346b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.b */
/* compiled from: PG */
public final class C6637b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6637b f19857e;

    /* renamed from: f */
    private static volatile C63010eb f19858f;

    /* renamed from: a */
    public C62961ch f19859a = emptyIntList();

    /* renamed from: b */
    public C62961ch f19860b = emptyIntList();

    /* renamed from: c */
    public C62961ch f19861c = emptyIntList();

    /* renamed from: d */
    public C62961ch f19862d = emptyIntList();

    static {
        C6637b bVar = new C6637b();
        f19857e = bVar;
        C62942bv.registerDefaultInstance(C6637b.class, bVar);
    }

    private C6637b() {
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
                return newMessageInfo(f19857e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001'\u0002'\u0003'\u0004'", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C6637b();
            case 4:
                return new C6623a();
            case 5:
                return f19857e;
            case 6:
                C63010eb ebVar = f19858f;
                if (ebVar == null) {
                    synchronized (C6637b.class) {
                        ebVar = f19858f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19857e);
                            f19858f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
