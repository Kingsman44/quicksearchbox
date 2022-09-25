package com.google.protos.youtube.elements.p5167c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.c.d */
/* compiled from: PG */
public final class C66152d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66152d f179871a;

    /* renamed from: b */
    public static final C62940bt f179872b;

    /* renamed from: c */
    private static volatile C63010eb f179873c;

    static {
        C66152d dVar = new C66152d();
        f179871a = dVar;
        C62942bv.registerDefaultInstance(C66152d.class, dVar);
        f179872b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 225399221, C63066gd.MESSAGE, C66152d.class);
    }

    private C66152d() {
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
                return newMessageInfo(f179871a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66152d();
            case 4:
                return new C66151c();
            case 5:
                return f179871a;
            case 6:
                C63010eb ebVar = f179873c;
                if (ebVar == null) {
                    synchronized (C66152d.class) {
                        ebVar = f179873c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179871a);
                            f179873c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
