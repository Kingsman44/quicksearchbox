package com.google.android.libraries.assistant.portable.p1586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.ac */
/* compiled from: PG */
public final class C19059ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19059ac f53463e;

    /* renamed from: f */
    private static volatile C63010eb f53464f;

    /* renamed from: a */
    public int f53465a;

    /* renamed from: b */
    public int f53466b = 0;

    /* renamed from: c */
    public Object f53467c;

    /* renamed from: d */
    public int f53468d;

    static {
        C19059ac acVar = new C19059ac();
        f53463e = acVar;
        C62942bv.registerDefaultInstance(C19059ac.class, acVar);
    }

    private C19059ac() {
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
                return newMessageInfo(f53463e, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C19057aa.f53462a, C19092x.class});
            case 3:
                return new C19059ac();
            case 4:
                return new C19090v();
            case 5:
                return f53463e;
            case 6:
                C63010eb ebVar = f53464f;
                if (ebVar == null) {
                    synchronized (C19059ac.class) {
                        ebVar = f53464f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53463e);
                            f53464f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
