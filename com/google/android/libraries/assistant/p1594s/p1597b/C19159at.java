package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.at */
/* compiled from: PG */
public final class C19159at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19159at f53655b;

    /* renamed from: d */
    private static volatile C63010eb f53656d;

    /* renamed from: a */
    public long f53657a;

    /* renamed from: c */
    private int f53658c;

    static {
        C19159at atVar = new C19159at();
        f53655b = atVar;
        C62942bv.registerDefaultInstance(C19159at.class, atVar);
    }

    private C19159at() {
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
                return newMessageInfo(f53655b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C19159at();
            case 4:
                return new C19158as();
            case 5:
                return f53655b;
            case 6:
                C63010eb ebVar = f53656d;
                if (ebVar == null) {
                    synchronized (C19159at.class) {
                        ebVar = f53656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53655b);
                            f53656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
