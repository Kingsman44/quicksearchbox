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

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.bd */
/* compiled from: PG */
public final class C64209bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64209bd f173613a;

    /* renamed from: b */
    public static final C62940bt f173614b;

    /* renamed from: c */
    private static volatile C63010eb f173615c;

    static {
        C64209bd bdVar = new C64209bd();
        f173613a = bdVar;
        C62942bv.registerDefaultInstance(C64209bd.class, bdVar);
        f173614b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bdVar, bdVar, (C62958ce) null, 275112715, C63066gd.MESSAGE, C64209bd.class);
    }

    private C64209bd() {
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
                return newMessageInfo(f173613a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64209bd();
            case 4:
                return new C64208bc();
            case 5:
                return f173613a;
            case 6:
                C63010eb ebVar = f173615c;
                if (ebVar == null) {
                    synchronized (C64209bd.class) {
                        ebVar = f173615c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173613a);
                            f173615c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
