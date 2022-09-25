package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bx */
/* compiled from: PG */
public final class C50759bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50759bx f132088c;

    /* renamed from: d */
    public static final C62940bt f132089d;

    /* renamed from: e */
    private static volatile C63010eb f132090e;

    /* renamed from: a */
    public int f132091a;

    /* renamed from: b */
    public C50853y f132092b;

    static {
        C50759bx bxVar = new C50759bx();
        f132088c = bxVar;
        C62942bv.registerDefaultInstance(C50759bx.class, bxVar);
        f132089d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bxVar, bxVar, (C62958ce) null, 362058265, C63066gd.MESSAGE, C50759bx.class);
    }

    private C50759bx() {
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
                return newMessageInfo(f132088c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50759bx();
            case 4:
                return new C50758bw();
            case 5:
                return f132088c;
            case 6:
                C63010eb ebVar = f132090e;
                if (ebVar == null) {
                    synchronized (C50759bx.class) {
                        ebVar = f132090e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132088c);
                            f132090e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
