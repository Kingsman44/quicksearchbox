package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.am */
/* compiled from: PG */
public final class C83832am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83832am f228459d;

    /* renamed from: e */
    private static volatile C63010eb f228460e;

    /* renamed from: a */
    public int f228461a;

    /* renamed from: b */
    public C83831al f228462b;

    /* renamed from: c */
    public C83831al f228463c;

    static {
        C83832am amVar = new C83832am();
        f228459d = amVar;
        C62942bv.registerDefaultInstance(C83832am.class, amVar);
    }

    private C83832am() {
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
                return newMessageInfo(f228459d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83832am();
            case 4:
                return new C83828ai();
            case 5:
                return f228459d;
            case 6:
                C63010eb ebVar = f228460e;
                if (ebVar == null) {
                    synchronized (C83832am.class) {
                        ebVar = f228460e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228459d);
                            f228460e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
