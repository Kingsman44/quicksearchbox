package com.google.protos.youtube.elements.p5165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.n */
/* compiled from: PG */
public final class C66026n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66026n f179559c;

    /* renamed from: d */
    public static final C62940bt f179560d;

    /* renamed from: e */
    private static volatile C63010eb f179561e;

    /* renamed from: a */
    public int f179562a;

    /* renamed from: b */
    public int f179563b;

    static {
        C66026n nVar = new C66026n();
        f179559c = nVar;
        C62942bv.registerDefaultInstance(C66026n.class, nVar);
        f179560d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, nVar, nVar, (C62958ce) null, 329240327, C63066gd.MESSAGE, C66026n.class);
    }

    private C66026n() {
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
                return newMessageInfo(f179559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66028p.m96833b()});
            case 3:
                return new C66026n();
            case 4:
                return new C66025m();
            case 5:
                return f179559c;
            case 6:
                C63010eb ebVar = f179561e;
                if (ebVar == null) {
                    synchronized (C66026n.class) {
                        ebVar = f179561e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179559c);
                            f179561e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
