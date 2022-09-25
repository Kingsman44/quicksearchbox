package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4008y.p4013d.C53663o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ait */
/* compiled from: PG */
public final class ait extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ait f158838e;

    /* renamed from: f */
    public static final C62940bt f158839f;

    /* renamed from: g */
    private static volatile C63010eb f158840g;

    /* renamed from: a */
    public int f158841a;

    /* renamed from: b */
    public long f158842b;

    /* renamed from: c */
    public long f158843c;

    /* renamed from: d */
    public int f158844d;

    static {
        ait ait = new ait();
        f158838e = ait;
        C62942bv.registerDefaultInstance(ait.class, ait);
        f158839f = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ait, ait, (C62958ce) null, 403, C63066gd.MESSAGE, ait.class);
    }

    private ait() {
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
                return newMessageInfo(f158838e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C53663o.m86883b()});
            case 3:
                return new ait();
            case 4:
                return new ais();
            case 5:
                return f158838e;
            case 6:
                C63010eb ebVar = f158840g;
                if (ebVar == null) {
                    synchronized (ait.class) {
                        ebVar = f158840g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158838e);
                            f158840g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
