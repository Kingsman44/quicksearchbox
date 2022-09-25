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

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.h */
/* compiled from: PG */
public final class C64217h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64217h f173633a;

    /* renamed from: b */
    public static final C62940bt f173634b;

    /* renamed from: c */
    private static volatile C63010eb f173635c;

    static {
        C64217h hVar = new C64217h();
        f173633a = hVar;
        C62942bv.registerDefaultInstance(C64217h.class, hVar);
        f173634b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 268482738, C63066gd.MESSAGE, C64217h.class);
    }

    private C64217h() {
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
                return newMessageInfo(f173633a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64217h();
            case 4:
                return new C64216g();
            case 5:
                return f173633a;
            case 6:
                C63010eb ebVar = f173635c;
                if (ebVar == null) {
                    synchronized (C64217h.class) {
                        ebVar = f173635c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173633a);
                            f173635c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
