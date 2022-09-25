package com.google.assistant.p3897e.p3921j.p3925d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.d.j */
/* compiled from: PG */
public final class C51784j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51784j f135871b;

    /* renamed from: d */
    private static volatile C63010eb f135872d;

    /* renamed from: a */
    public C51782h f135873a;

    /* renamed from: c */
    private int f135874c;

    static {
        C51784j jVar = new C51784j();
        f135871b = jVar;
        C62942bv.registerDefaultInstance(C51784j.class, jVar);
    }

    private C51784j() {
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
                return newMessageInfo(f135871b, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0000\fဉ\u000b", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51784j();
            case 4:
                return new C51783i();
            case 5:
                return f135871b;
            case 6:
                C63010eb ebVar = f135872d;
                if (ebVar == null) {
                    synchronized (C51784j.class) {
                        ebVar = f135872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135871b);
                            f135872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
