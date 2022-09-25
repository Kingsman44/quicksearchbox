package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.m.bx */
/* compiled from: PG */
public final class C67320bx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67320bx f182979e;

    /* renamed from: f */
    public static final C62940bt f182980f;

    /* renamed from: g */
    private static volatile C63010eb f182981g;

    /* renamed from: a */
    public int f182982a;

    /* renamed from: b */
    public C67327cd f182983b;

    /* renamed from: c */
    public C67318bv f182984c;

    /* renamed from: d */
    public C67322bz f182985d;

    static {
        C67320bx bxVar = new C67320bx();
        f182979e = bxVar;
        C62942bv.registerDefaultInstance(C67320bx.class, bxVar);
        f182980f = C62942bv.newSingularGeneratedExtension(C67357u.f183084a, bxVar, bxVar, (C62958ce) null, 435752543, C63066gd.MESSAGE, C67320bx.class);
    }

    private C67320bx() {
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
                return newMessageInfo(f182979e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67320bx();
            case 4:
                return new C67319bw();
            case 5:
                return f182979e;
            case 6:
                C63010eb ebVar = f182981g;
                if (ebVar == null) {
                    synchronized (C67320bx.class) {
                        ebVar = f182981g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182979e);
                            f182981g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
