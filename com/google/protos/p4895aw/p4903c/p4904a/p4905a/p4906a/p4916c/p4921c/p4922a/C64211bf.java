package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57087bb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.bf */
/* compiled from: PG */
public final class C64211bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64211bf f173616b;

    /* renamed from: c */
    public static final C62940bt f173617c;

    /* renamed from: e */
    private static volatile C63010eb f173618e;

    /* renamed from: a */
    public C57087bb f173619a;

    /* renamed from: d */
    private int f173620d;

    static {
        C64211bf bfVar = new C64211bf();
        f173616b = bfVar;
        C62942bv.registerDefaultInstance(C64211bf.class, bfVar);
        f173617c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bfVar, bfVar, (C62958ce) null, 365073807, C63066gd.MESSAGE, C64211bf.class);
    }

    private C64211bf() {
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
                return newMessageInfo(f173616b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64211bf();
            case 4:
                return new C64210be();
            case 5:
                return f173616b;
            case 6:
                C63010eb ebVar = f173618e;
                if (ebVar == null) {
                    synchronized (C64211bf.class) {
                        ebVar = f173618e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173616b);
                            f173618e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
