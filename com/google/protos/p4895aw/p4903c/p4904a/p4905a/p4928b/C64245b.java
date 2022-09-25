package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.b.b */
/* compiled from: PG */
public final class C64245b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64245b f173711a;

    /* renamed from: b */
    public static final C62940bt f173712b;

    /* renamed from: c */
    private static volatile C63010eb f173713c;

    static {
        C64245b bVar = new C64245b();
        f173711a = bVar;
        C62942bv.registerDefaultInstance(C64245b.class, bVar);
        f173712b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 247469613, C63066gd.MESSAGE, C64245b.class);
    }

    private C64245b() {
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
                return newMessageInfo(f173711a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64245b();
            case 4:
                return new C64244a();
            case 5:
                return f173711a;
            case 6:
                C63010eb ebVar = f173713c;
                if (ebVar == null) {
                    synchronized (C64245b.class) {
                        ebVar = f173713c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173711a);
                            f173713c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
