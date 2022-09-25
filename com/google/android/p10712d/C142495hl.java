package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hl */
/* compiled from: PG */
public final class C142495hl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142495hl f386686c;

    /* renamed from: d */
    private static volatile C63010eb f386687d;

    /* renamed from: a */
    public int f386688a;

    /* renamed from: b */
    public boolean f386689b;

    static {
        C142495hl hlVar = new C142495hl();
        f386686c = hlVar;
        C62942bv.registerDefaultInstance(C142495hl.class, hlVar);
    }

    private C142495hl() {
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
                return newMessageInfo(f386686c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C142495hl();
            case 4:
                return new C142494hk();
            case 5:
                return f386686c;
            case 6:
                C63010eb ebVar = f386687d;
                if (ebVar == null) {
                    synchronized (C142495hl.class) {
                        ebVar = f386687d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386686c);
                            f386687d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
