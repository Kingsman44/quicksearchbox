package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57093h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.b.ar */
/* compiled from: PG */
public final class C57134ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57134ar f152505c;

    /* renamed from: d */
    public static final C62940bt f152506d;

    /* renamed from: f */
    private static volatile C63010eb f152507f;

    /* renamed from: a */
    public int f152508a;

    /* renamed from: b */
    public CommandOuterClass$Command f152509b;

    /* renamed from: e */
    private byte f152510e = 2;

    static {
        C57134ar arVar = new C57134ar();
        f152505c = arVar;
        C62942bv.registerDefaultInstance(C57134ar.class, arVar);
        f152506d = C62942bv.newSingularGeneratedExtension(C57093h.f152415c, arVar, arVar, (C62958ce) null, 279668062, C63066gd.MESSAGE, C57134ar.class);
    }

    private C57134ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152510e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152510e = b;
                return null;
            case 2:
                return newMessageInfo(f152505c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57134ar();
            case 4:
                return new C57133aq();
            case 5:
                return f152505c;
            case 6:
                C63010eb ebVar = f152507f;
                if (ebVar == null) {
                    synchronized (C57134ar.class) {
                        ebVar = f152507f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152505c);
                            f152507f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
