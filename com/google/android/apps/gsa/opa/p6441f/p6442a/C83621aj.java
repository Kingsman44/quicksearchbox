package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.aj */
/* compiled from: PG */
public final class C83621aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83621aj f227966c;

    /* renamed from: d */
    private static volatile C63010eb f227967d;

    /* renamed from: a */
    public int f227968a;

    /* renamed from: b */
    public long f227969b;

    static {
        C83621aj ajVar = new C83621aj();
        f227966c = ajVar;
        C62942bv.registerDefaultInstance(C83621aj.class, ajVar);
    }

    private C83621aj() {
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
                return newMessageInfo(f227966c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83621aj();
            case 4:
                return new C83620ai();
            case 5:
                return f227966c;
            case 6:
                C63010eb ebVar = f227967d;
                if (ebVar == null) {
                    synchronized (C83621aj.class) {
                        ebVar = f227967d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227966c);
                            f227967d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
