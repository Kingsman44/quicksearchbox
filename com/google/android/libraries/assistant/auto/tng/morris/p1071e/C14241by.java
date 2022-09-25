package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.by */
/* compiled from: PG */
public final class C14241by extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14241by f43097e;

    /* renamed from: f */
    private static volatile C63010eb f43098f;

    /* renamed from: a */
    public int f43099a;

    /* renamed from: b */
    public int f43100b;

    /* renamed from: c */
    public int f43101c;

    /* renamed from: d */
    public boolean f43102d;

    static {
        C14241by byVar = new C14241by();
        f43097e = byVar;
        C62942bv.registerDefaultInstance(C14241by.class, byVar);
    }

    private C14241by() {
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
                return newMessageInfo(f43097e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0004\f\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14241by();
            case 4:
                return new C14240bx();
            case 5:
                return f43097e;
            case 6:
                C63010eb ebVar = f43098f;
                if (ebVar == null) {
                    synchronized (C14241by.class) {
                        ebVar = f43098f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43097e);
                            f43098f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
