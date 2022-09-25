package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.al */
/* compiled from: PG */
public final class C53552al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53552al f140539e;

    /* renamed from: f */
    private static volatile C63010eb f140540f;

    /* renamed from: a */
    public int f140541a;

    /* renamed from: b */
    public int f140542b = 0;

    /* renamed from: c */
    public Object f140543c;

    /* renamed from: d */
    public int f140544d;

    static {
        C53552al alVar = new C53552al();
        f140539e = alVar;
        C62942bv.registerDefaultInstance(C53552al.class, alVar);
    }

    private C53552al() {
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
                return newMessageInfo(f140539e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53556ap.m86866c(), C53561au.class, C53566az.class, C53563aw.class});
            case 3:
                return new C53552al();
            case 4:
                return new C53551ak();
            case 5:
                return f140539e;
            case 6:
                C63010eb ebVar = f140540f;
                if (ebVar == null) {
                    synchronized (C53552al.class) {
                        ebVar = f140540f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140539e);
                            f140540f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
