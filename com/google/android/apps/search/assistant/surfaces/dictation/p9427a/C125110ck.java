package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ck */
/* compiled from: PG */
public final class C125110ck extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C125110ck f345145d;

    /* renamed from: e */
    private static volatile C63010eb f345146e;

    /* renamed from: a */
    public int f345147a = 0;

    /* renamed from: b */
    public Object f345148b;

    /* renamed from: c */
    public C62910ar f345149c;

    static {
        C125110ck ckVar = new C125110ck();
        f345145d = ckVar;
        C62942bv.registerDefaultInstance(C125110ck.class, ckVar);
    }

    private C125110ck() {
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
                return newMessageInfo(f345145d, "\u0000\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b\t\t?\u0000", new Object[]{"b", "a", C125109cj.class, C125097by.class, C125100ca.class, C62912at.class, C125103cd.class, C45240c.f118157a});
            case 3:
                return new C125110ck();
            case 4:
                return new C125095bw();
            case 5:
                return f345145d;
            case 6:
                C63010eb ebVar = f345146e;
                if (ebVar == null) {
                    synchronized (C125110ck.class) {
                        ebVar = f345146e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345145d);
                            f345146e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
