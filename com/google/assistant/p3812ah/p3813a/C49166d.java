package com.google.assistant.p3812ah.p3813a;

import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ah.a.d */
/* compiled from: PG */
public final class C49166d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49166d f127135b;

    /* renamed from: c */
    public static final C62940bt f127136c;

    /* renamed from: e */
    private static volatile C63010eb f127137e;

    /* renamed from: a */
    public long f127138a;

    /* renamed from: d */
    private int f127139d;

    static {
        C49166d dVar = new C49166d();
        f127135b = dVar;
        C62942bv.registerDefaultInstance(C49166d.class, dVar);
        f127136c = C62942bv.newSingularGeneratedExtension(C61690bd.f166668a, dVar, dVar, (C62958ce) null, 1009, C63066gd.MESSAGE, C49166d.class);
    }

    private C49166d() {
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
                return newMessageInfo(f127135b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C49166d();
            case 4:
                return new C49165c();
            case 5:
                return f127135b;
            case 6:
                C63010eb ebVar = f127137e;
                if (ebVar == null) {
                    synchronized (C49166d.class) {
                        ebVar = f127137e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127135b);
                            f127137e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
