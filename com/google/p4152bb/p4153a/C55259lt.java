package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.lt */
/* compiled from: PG */
public final class C55259lt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55259lt f145526f;

    /* renamed from: g */
    public static final C62940bt f145527g;

    /* renamed from: i */
    private static volatile C63010eb f145528i;

    /* renamed from: a */
    public int f145529a;

    /* renamed from: b */
    public C62961ch f145530b = emptyIntList();

    /* renamed from: c */
    public C55213ka f145531c;

    /* renamed from: d */
    public C55136he f145532d;

    /* renamed from: e */
    public int f145533e;

    /* renamed from: h */
    private byte f145534h = 2;

    static {
        C55259lt ltVar = new C55259lt();
        f145526f = ltVar;
        C62942bv.registerDefaultInstance(C55259lt.class, ltVar);
        f145527g = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, ltVar, ltVar, (C62958ce) null, 86204916, C63066gd.MESSAGE, C55259lt.class);
    }

    private C55259lt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145534h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145534h = b;
                return null;
            case 2:
                return newMessageInfo(f145526f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u0016\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55259lt();
            case 4:
                return new C55258ls();
            case 5:
                return f145526f;
            case 6:
                C63010eb ebVar = f145528i;
                if (ebVar == null) {
                    synchronized (C55259lt.class) {
                        ebVar = f145528i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145526f);
                            f145528i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
