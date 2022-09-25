package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3825an.p3834e.p3835a.C49366h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.bz */
/* compiled from: PG */
public final class C65795bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65795bz f178849c;

    /* renamed from: d */
    public static final C62940bt f178850d;

    /* renamed from: e */
    private static volatile C63010eb f178851e;

    /* renamed from: a */
    public int f178852a;

    /* renamed from: b */
    public C49366h f178853b;

    static {
        C65795bz bzVar = new C65795bz();
        f178849c = bzVar;
        C62942bv.registerDefaultInstance(C65795bz.class, bzVar);
        f178850d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, bzVar, bzVar, (C62958ce) null, 392437292, C63066gd.MESSAGE, C65795bz.class);
    }

    private C65795bz() {
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
                return newMessageInfo(f178849c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65795bz();
            case 4:
                return new C65794by();
            case 5:
                return f178849c;
            case 6:
                C63010eb ebVar = f178851e;
                if (ebVar == null) {
                    synchronized (C65795bz.class) {
                        ebVar = f178851e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178849c);
                            f178851e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
