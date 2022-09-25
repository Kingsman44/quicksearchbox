package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.at */
/* compiled from: PG */
public final class C53762at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53762at f141127c;

    /* renamed from: d */
    private static volatile C63010eb f141128d;

    /* renamed from: a */
    public int f141129a;

    /* renamed from: b */
    public C53789bt f141130b;

    static {
        C53762at atVar = new C53762at();
        f141127c = atVar;
        C62942bv.registerDefaultInstance(C53762at.class, atVar);
    }

    private C53762at() {
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
                return newMessageInfo(f141127c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53762at();
            case 4:
                return new C53761as();
            case 5:
                return f141127c;
            case 6:
                C63010eb ebVar = f141128d;
                if (ebVar == null) {
                    synchronized (C53762at.class) {
                        ebVar = f141128d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141127c);
                            f141128d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
