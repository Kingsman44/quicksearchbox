package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7783ju;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.at */
/* compiled from: PG */
public final class C9157at extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9157at f31606f;

    /* renamed from: g */
    private static volatile C63010eb f31607g;

    /* renamed from: a */
    public int f31608a;

    /* renamed from: b */
    public C7783ju f31609b;

    /* renamed from: c */
    public int f31610c;

    /* renamed from: d */
    public int f31611d;

    /* renamed from: e */
    public boolean f31612e;

    static {
        C9157at atVar = new C9157at();
        f31606f = atVar;
        C62942bv.registerDefaultInstance(C9157at.class, atVar);
    }

    private C9157at() {
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
                return newMessageInfo(f31606f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9157at();
            case 4:
                return new C9156as();
            case 5:
                return f31606f;
            case 6:
                C63010eb ebVar = f31607g;
                if (ebVar == null) {
                    synchronized (C9157at.class) {
                        ebVar = f31607g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31606f);
                            f31607g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
