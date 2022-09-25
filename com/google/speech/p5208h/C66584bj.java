package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.speech.h.bj */
/* compiled from: PG */
public final class C66584bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66584bj f181115c;

    /* renamed from: d */
    public static final C62940bt f181116d;

    /* renamed from: f */
    private static volatile C63010eb f181117f;

    /* renamed from: a */
    public int f181118a;

    /* renamed from: b */
    public C67400ap f181119b;

    /* renamed from: e */
    private byte f181120e = 2;

    static {
        C66584bj bjVar = new C66584bj();
        f181115c = bjVar;
        C62942bv.registerDefaultInstance(C66584bj.class, bjVar);
        f181116d = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, bjVar, bjVar, (C62958ce) null, 144024677, C63066gd.MESSAGE, C66584bj.class);
    }

    private C66584bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181120e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181120e = b;
                return null;
            case 2:
                return newMessageInfo(f181115c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C66584bj();
            case 4:
                return new C66583bi();
            case 5:
                return f181115c;
            case 6:
                C63010eb ebVar = f181117f;
                if (ebVar == null) {
                    synchronized (C66584bj.class) {
                        ebVar = f181117f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181115c);
                            f181117f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
