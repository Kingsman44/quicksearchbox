package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.mh */
/* compiled from: PG */
public final class C55274mh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55274mh f145586d;

    /* renamed from: e */
    public static final C62940bt f145587e;

    /* renamed from: f */
    private static volatile C63010eb f145588f;

    /* renamed from: a */
    public int f145589a;

    /* renamed from: b */
    public int f145590b;

    /* renamed from: c */
    public int f145591c;

    static {
        C55274mh mhVar = new C55274mh();
        f145586d = mhVar;
        C62942bv.registerDefaultInstance(C55274mh.class, mhVar);
        f145587e = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, mhVar, mhVar, (C62958ce) null, 69584432, C63066gd.MESSAGE, C55274mh.class);
    }

    private C55274mh() {
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
                return newMessageInfo(f145586d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55272mf.f145585a});
            case 3:
                return new C55274mh();
            case 4:
                return new C55271me();
            case 5:
                return f145586d;
            case 6:
                C63010eb ebVar = f145588f;
                if (ebVar == null) {
                    synchronized (C55274mh.class) {
                        ebVar = f145588f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145586d);
                            f145588f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
