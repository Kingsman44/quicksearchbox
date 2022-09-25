package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.ap.a.a.z */
/* compiled from: PG */
public final class C63687z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63687z f172197c;

    /* renamed from: e */
    private static volatile C63010eb f172198e;

    /* renamed from: a */
    public int f172199a;

    /* renamed from: b */
    public C63684w f172200b;

    /* renamed from: d */
    private int f172201d;

    static {
        C63687z zVar = new C63687z();
        f172197c = zVar;
        C62942bv.registerDefaultInstance(C63687z.class, zVar);
    }

    private C63687z() {
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
                return newMessageInfo(f172197c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C65753ak.m96798c(), "b"});
            case 3:
                return new C63687z();
            case 4:
                return new C63686y();
            case 5:
                return f172197c;
            case 6:
                C63010eb ebVar = f172198e;
                if (ebVar == null) {
                    synchronized (C63687z.class) {
                        ebVar = f172198e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172197c);
                            f172198e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
