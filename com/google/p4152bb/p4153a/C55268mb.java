package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.mb */
/* compiled from: PG */
public final class C55268mb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55268mb f145570d;

    /* renamed from: e */
    public static final C62940bt f145571e;

    /* renamed from: g */
    private static volatile C63010eb f145572g;

    /* renamed from: a */
    public int f145573a;

    /* renamed from: b */
    public C62971cq f145574b = emptyProtobufList();

    /* renamed from: c */
    public C55373pz f145575c;

    /* renamed from: f */
    private byte f145576f = 2;

    static {
        C55268mb mbVar = new C55268mb();
        f145570d = mbVar;
        C62942bv.registerDefaultInstance(C55268mb.class, mbVar);
        f145571e = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, mbVar, mbVar, (C62958ce) null, 77588877, C63066gd.MESSAGE, C55268mb.class);
    }

    private C55268mb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145576f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145576f = b;
                return null;
            case 2:
                return newMessageInfo(f145570d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", C55361pn.class, C45240c.f118157a});
            case 3:
                return new C55268mb();
            case 4:
                return new C55267ma();
            case 5:
                return f145570d;
            case 6:
                C63010eb ebVar = f145572g;
                if (ebVar == null) {
                    synchronized (C55268mb.class) {
                        ebVar = f145572g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145570d);
                            f145572g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
