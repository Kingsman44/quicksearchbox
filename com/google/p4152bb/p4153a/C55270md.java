package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4653i.p4654a.C61683ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.md */
/* compiled from: PG */
public final class C55270md extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55270md f145577e;

    /* renamed from: f */
    public static final C62940bt f145578f;

    /* renamed from: h */
    private static volatile C63010eb f145579h;

    /* renamed from: a */
    public int f145580a;

    /* renamed from: b */
    public C61683ax f145581b;

    /* renamed from: c */
    public int f145582c;

    /* renamed from: d */
    public int f145583d;

    /* renamed from: g */
    private byte f145584g = 2;

    static {
        C55270md mdVar = new C55270md();
        f145577e = mdVar;
        C62942bv.registerDefaultInstance(C55270md.class, mdVar);
        f145578f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, mdVar, mdVar, (C62958ce) null, 65797276, C63066gd.MESSAGE, C55270md.class);
    }

    private C55270md() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145584g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145584g = b;
                return null;
            case 2:
                return newMessageInfo(f145577e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55270md();
            case 4:
                return new C55269mc();
            case 5:
                return f145577e;
            case 6:
                C63010eb ebVar = f145579h;
                if (ebVar == null) {
                    synchronized (C55270md.class) {
                        ebVar = f145579h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145577e);
                            f145579h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
