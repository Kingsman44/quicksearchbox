package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.l */
/* compiled from: PG */
public final class C38253l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38253l f101358c;

    /* renamed from: d */
    private static volatile C63010eb f101359d;

    /* renamed from: a */
    public int f101360a;

    /* renamed from: b */
    public C37639gr f101361b;

    static {
        C38253l lVar = new C38253l();
        f101358c = lVar;
        C62942bv.registerDefaultInstance(C38253l.class, lVar);
    }

    private C38253l() {
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
                return newMessageInfo(f101358c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C38253l();
            case 4:
                return new C38252k();
            case 5:
                return f101358c;
            case 6:
                C63010eb ebVar = f101359d;
                if (ebVar == null) {
                    synchronized (C38253l.class) {
                        ebVar = f101359d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101358c);
                            f101359d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
