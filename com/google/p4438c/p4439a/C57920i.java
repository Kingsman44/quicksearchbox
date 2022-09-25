package com.google.p4438c.p4439a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.c.a.i */
/* compiled from: PG */
public final class C57920i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57920i f154916f;

    /* renamed from: g */
    private static volatile C63010eb f154917g;

    /* renamed from: a */
    public int f154918a;

    /* renamed from: b */
    public int f154919b = 0;

    /* renamed from: c */
    public Object f154920c;

    /* renamed from: d */
    public int f154921d;

    /* renamed from: e */
    public C57917f f154922e;

    static {
        C57920i iVar = new C57920i();
        f154916f = iVar;
        C62942bv.registerDefaultInstance(C57920i.class, iVar);
    }

    private C57920i() {
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
                return newMessageInfo(f154916f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0004\u0004ဵ\u0000\u0005ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C57919h.f154915a, "e"});
            case 3:
                return new C57920i();
            case 4:
                return new C57918g();
            case 5:
                return f154916f;
            case 6:
                C63010eb ebVar = f154917g;
                if (ebVar == null) {
                    synchronized (C57920i.class) {
                        ebVar = f154917g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154916f);
                            f154917g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
