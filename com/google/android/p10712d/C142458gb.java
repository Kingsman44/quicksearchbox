package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gb */
/* compiled from: PG */
public final class C142458gb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142458gb f386568c;

    /* renamed from: d */
    private static volatile C63010eb f386569d;

    /* renamed from: a */
    public int f386570a;

    /* renamed from: b */
    public int f386571b;

    static {
        C142458gb gbVar = new C142458gb();
        f386568c = gbVar;
        C62942bv.registerDefaultInstance(C142458gb.class, gbVar);
    }

    private C142458gb() {
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
                return newMessageInfo(f386568c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142458gb();
            case 4:
                return new C142457ga();
            case 5:
                return f386568c;
            case 6:
                C63010eb ebVar = f386569d;
                if (ebVar == null) {
                    synchronized (C142458gb.class) {
                        ebVar = f386569d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386568c);
                            f386569d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
