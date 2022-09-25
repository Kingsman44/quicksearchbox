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

/* renamed from: com.google.speech.h.bh */
/* compiled from: PG */
public final class C66582bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66582bh f181109c;

    /* renamed from: d */
    public static final C62940bt f181110d;

    /* renamed from: f */
    private static volatile C63010eb f181111f;

    /* renamed from: a */
    public int f181112a;

    /* renamed from: b */
    public C67400ap f181113b;

    /* renamed from: e */
    private byte f181114e = 2;

    static {
        C66582bh bhVar = new C66582bh();
        f181109c = bhVar;
        C62942bv.registerDefaultInstance(C66582bh.class, bhVar);
        f181110d = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, bhVar, bhVar, (C62958ce) null, 67046194, C63066gd.MESSAGE, C66582bh.class);
    }

    private C66582bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181114e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181114e = b;
                return null;
            case 2:
                return newMessageInfo(f181109c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66582bh();
            case 4:
                return new C66581bg();
            case 5:
                return f181109c;
            case 6:
                C63010eb ebVar = f181111f;
                if (ebVar == null) {
                    synchronized (C66582bh.class) {
                        ebVar = f181111f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181109c);
                            f181111f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
