package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.x */
/* compiled from: PG */
public final class C64233x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64233x f173672a;

    /* renamed from: b */
    public static final C62940bt f173673b;

    /* renamed from: c */
    private static volatile C63010eb f173674c;

    static {
        C64233x xVar = new C64233x();
        f173672a = xVar;
        C62942bv.registerDefaultInstance(C64233x.class, xVar);
        f173673b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, xVar, xVar, (C62958ce) null, 456353174, C63066gd.MESSAGE, C64233x.class);
    }

    private C64233x() {
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
                return newMessageInfo(f173672a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64233x();
            case 4:
                return new C64232w();
            case 5:
                return f173672a;
            case 6:
                C63010eb ebVar = f173674c;
                if (ebVar == null) {
                    synchronized (C64233x.class) {
                        ebVar = f173674c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173672a);
                            f173674c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
