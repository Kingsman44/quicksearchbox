package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.as */
/* compiled from: PG */
public final class C63905as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63905as f172804c;

    /* renamed from: e */
    private static volatile C63010eb f172805e;

    /* renamed from: a */
    public boolean f172806a;

    /* renamed from: b */
    public boolean f172807b;

    /* renamed from: d */
    private int f172808d;

    static {
        C63905as asVar = new C63905as();
        f172804c = asVar;
        C62942bv.registerDefaultInstance(C63905as.class, asVar);
    }

    private C63905as() {
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
                return newMessageInfo(f172804c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0001\u0006ဇ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C63905as();
            case 4:
                return new C63904ar();
            case 5:
                return f172804c;
            case 6:
                C63010eb ebVar = f172805e;
                if (ebVar == null) {
                    synchronized (C63905as.class) {
                        ebVar = f172805e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172804c);
                            f172805e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
