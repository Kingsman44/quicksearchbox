package com.google.protos.p5129p.p5131b;

import com.google.p4273bs.p4277b.p4278a.C56481u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.bx */
/* compiled from: PG */
public final class C65793bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65793bx f178844c;

    /* renamed from: d */
    public static final C62940bt f178845d;

    /* renamed from: e */
    private static volatile C63010eb f178846e;

    /* renamed from: a */
    public int f178847a;

    /* renamed from: b */
    public C56481u f178848b;

    static {
        C65793bx bxVar = new C65793bx();
        f178844c = bxVar;
        C62942bv.registerDefaultInstance(C65793bx.class, bxVar);
        f178845d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, bxVar, bxVar, (C62958ce) null, 310209381, C63066gd.MESSAGE, C65793bx.class);
    }

    private C65793bx() {
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
                return newMessageInfo(f178844c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65793bx();
            case 4:
                return new C65792bw();
            case 5:
                return f178844c;
            case 6:
                C63010eb ebVar = f178846e;
                if (ebVar == null) {
                    synchronized (C65793bx.class) {
                        ebVar = f178846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178844c);
                            f178846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
