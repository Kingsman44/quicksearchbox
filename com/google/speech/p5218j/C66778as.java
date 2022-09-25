package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.as */
/* compiled from: PG */
public final class C66778as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66778as f181608d;

    /* renamed from: e */
    private static volatile C63010eb f181609e;

    /* renamed from: a */
    public int f181610a;

    /* renamed from: b */
    public C67171p f181611b;

    /* renamed from: c */
    public int f181612c;

    static {
        C66778as asVar = new C66778as();
        f181608d = asVar;
        C62942bv.registerDefaultInstance(C66778as.class, asVar);
    }

    private C66778as() {
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
                return newMessageInfo(f181608d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C67125lz.m97425b()});
            case 3:
                return new C66778as();
            case 4:
                return new C66777ar();
            case 5:
                return f181608d;
            case 6:
                C63010eb ebVar = f181609e;
                if (ebVar == null) {
                    synchronized (C66778as.class) {
                        ebVar = f181609e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181608d);
                            f181609e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
