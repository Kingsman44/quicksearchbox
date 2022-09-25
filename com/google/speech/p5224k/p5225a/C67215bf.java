package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.speech.k.a.bf */
/* compiled from: PG */
public final class C67215bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67215bf f182680b;

    /* renamed from: c */
    public static final C62940bt f182681c;

    /* renamed from: e */
    private static volatile C63010eb f182682e;

    /* renamed from: a */
    public C62971cq f182683a = emptyProtobufList();

    /* renamed from: d */
    private byte f182684d = 2;

    static {
        C67215bf bfVar = new C67215bf();
        f182680b = bfVar;
        C62942bv.registerDefaultInstance(C67215bf.class, bfVar);
        f182681c = C62942bv.newSingularGeneratedExtension(C67402ar.f183192d, bfVar, bfVar, (C62958ce) null, 121687294, C63066gd.MESSAGE, C67215bf.class);
    }

    private C67215bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182684d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182684d = b;
                return null;
            case 2:
                return newMessageInfo(f182680b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C67213bd.class});
            case 3:
                return new C67215bf();
            case 4:
                return new C67214be();
            case 5:
                return f182680b;
            case 6:
                C63010eb ebVar = f182682e;
                if (ebVar == null) {
                    synchronized (C67215bf.class) {
                        ebVar = f182682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182680b);
                            f182682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
