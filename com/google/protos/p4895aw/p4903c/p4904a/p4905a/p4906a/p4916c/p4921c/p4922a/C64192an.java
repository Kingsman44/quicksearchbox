package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57074ap;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.an */
/* compiled from: PG */
public final class C64192an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64192an f173560a;

    /* renamed from: b */
    public static final C62940bt f173561b;

    /* renamed from: f */
    private static volatile C63010eb f173562f;

    /* renamed from: c */
    private int f173563c;

    /* renamed from: d */
    private C57074ap f173564d;

    /* renamed from: e */
    private byte f173565e = 2;

    static {
        C64192an anVar = new C64192an();
        f173560a = anVar;
        C62942bv.registerDefaultInstance(C64192an.class, anVar);
        f173561b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, anVar, anVar, (C62958ce) null, 309762127, C63066gd.MESSAGE, C64192an.class);
    }

    private C64192an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173565e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173565e = b;
                return null;
            case 2:
                return newMessageInfo(f173560a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "d"});
            case 3:
                return new C64192an();
            case 4:
                return new C64191am();
            case 5:
                return f173560a;
            case 6:
                C63010eb ebVar = f173562f;
                if (ebVar == null) {
                    synchronized (C64192an.class) {
                        ebVar = f173562f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173560a);
                            f173562f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
