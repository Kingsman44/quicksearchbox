package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57068aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.al */
/* compiled from: PG */
public final class C64190al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64190al f173554b;

    /* renamed from: c */
    public static final C62940bt f173555c;

    /* renamed from: f */
    private static volatile C63010eb f173556f;

    /* renamed from: a */
    public C57068aj f173557a;

    /* renamed from: d */
    private int f173558d;

    /* renamed from: e */
    private byte f173559e = 2;

    static {
        C64190al alVar = new C64190al();
        f173554b = alVar;
        C62942bv.registerDefaultInstance(C64190al.class, alVar);
        f173555c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, alVar, alVar, (C62958ce) null, 346028485, C63066gd.MESSAGE, C64190al.class);
    }

    private C64190al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173559e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173559e = b;
                return null;
            case 2:
                return newMessageInfo(f173554b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64190al();
            case 4:
                return new C64189ak();
            case 5:
                return f173554b;
            case 6:
                C63010eb ebVar = f173556f;
                if (ebVar == null) {
                    synchronized (C64190al.class) {
                        ebVar = f173556f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173554b);
                            f173556f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
