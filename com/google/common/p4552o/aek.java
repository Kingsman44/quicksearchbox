package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.C48260bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aek */
/* compiled from: PG */
public final class aek extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aek f158464e;

    /* renamed from: f */
    public static final C62940bt f158465f;

    /* renamed from: g */
    private static volatile C63010eb f158466g;

    /* renamed from: a */
    public int f158467a;

    /* renamed from: b */
    public aej f158468b;

    /* renamed from: c */
    public C48260bq f158469c;

    /* renamed from: d */
    public int f158470d;

    static {
        aek aek = new aek();
        f158464e = aek;
        C62942bv.registerDefaultInstance(aek.class, aek);
        f158465f = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, aek, aek, (C62958ce) null, 115, C63066gd.MESSAGE, aek.class);
    }

    private aek() {
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
                return newMessageInfo(f158464e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", aeh.f158459a});
            case 3:
                return new aek();
            case 4:
                return new aeg();
            case 5:
                return f158464e;
            case 6:
                C63010eb ebVar = f158466g;
                if (ebVar == null) {
                    synchronized (aek.class) {
                        ebVar = f158466g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158464e);
                            f158466g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
