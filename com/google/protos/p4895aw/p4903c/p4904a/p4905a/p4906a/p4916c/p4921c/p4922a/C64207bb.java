package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57084az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.bb */
/* compiled from: PG */
public final class C64207bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64207bb f173607b;

    /* renamed from: c */
    public static final C62940bt f173608c;

    /* renamed from: f */
    private static volatile C63010eb f173609f;

    /* renamed from: a */
    public C57084az f173610a;

    /* renamed from: d */
    private int f173611d;

    /* renamed from: e */
    private byte f173612e = 2;

    static {
        C64207bb bbVar = new C64207bb();
        f173607b = bbVar;
        C62942bv.registerDefaultInstance(C64207bb.class, bbVar);
        f173608c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bbVar, bbVar, (C62958ce) null, 272764214, C63066gd.MESSAGE, C64207bb.class);
    }

    private C64207bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173612e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173612e = b;
                return null;
            case 2:
                return newMessageInfo(f173607b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64207bb();
            case 4:
                return new C64206ba();
            case 5:
                return f173607b;
            case 6:
                C63010eb ebVar = f173609f;
                if (ebVar == null) {
                    synchronized (C64207bb.class) {
                        ebVar = f173609f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173607b);
                            f173609f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
