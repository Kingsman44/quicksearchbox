package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.l */
/* compiled from: PG */
public final class C80257l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80257l f220192c;

    /* renamed from: d */
    private static volatile C63010eb f220193d;

    /* renamed from: a */
    public int f220194a = 0;

    /* renamed from: b */
    public Object f220195b;

    static {
        C80257l lVar = new C80257l();
        f220192c = lVar;
        C62942bv.registerDefaultInstance(C80257l.class, lVar);
    }

    private C80257l() {
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
                return newMessageInfo(f220192c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003်\u0000", new Object[]{"b", "a", C80244ck.class, C80201av.m128094b()});
            case 3:
                return new C80257l();
            case 4:
                return new C80256k();
            case 5:
                return f220192c;
            case 6:
                C63010eb ebVar = f220193d;
                if (ebVar == null) {
                    synchronized (C80257l.class) {
                        ebVar = f220193d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220192c);
                            f220193d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
