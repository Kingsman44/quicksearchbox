package com.google.protos.p4883as.p4884a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5047y.C65381b;

/* renamed from: com.google.protos.as.a.c */
/* compiled from: PG */
public final class C63774c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63774c f172513d;

    /* renamed from: e */
    private static volatile C63010eb f172514e;

    /* renamed from: a */
    public int f172515a;

    /* renamed from: b */
    public float f172516b;

    /* renamed from: c */
    public C65381b f172517c;

    static {
        C63774c cVar = new C63774c();
        f172513d = cVar;
        C62942bv.registerDefaultInstance(C63774c.class, cVar);
    }

    private C63774c() {
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
                return newMessageInfo(f172513d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63774c();
            case 4:
                return new C63773b();
            case 5:
                return f172513d;
            case 6:
                C63010eb ebVar = f172514e;
                if (ebVar == null) {
                    synchronized (C63774c.class) {
                        ebVar = f172514e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172513d);
                            f172514e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
