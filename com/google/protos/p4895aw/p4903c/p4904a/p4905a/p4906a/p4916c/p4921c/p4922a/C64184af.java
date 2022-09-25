package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57062ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.af */
/* compiled from: PG */
public final class C64184af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64184af f173536b;

    /* renamed from: c */
    public static final C62940bt f173537c;

    /* renamed from: f */
    private static volatile C63010eb f173538f;

    /* renamed from: a */
    public C57062ad f173539a;

    /* renamed from: d */
    private int f173540d;

    /* renamed from: e */
    private byte f173541e = 2;

    static {
        C64184af afVar = new C64184af();
        f173536b = afVar;
        C62942bv.registerDefaultInstance(C64184af.class, afVar);
        f173537c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, afVar, afVar, (C62958ce) null, 294696617, C63066gd.MESSAGE, C64184af.class);
    }

    private C64184af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173541e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173541e = b;
                return null;
            case 2:
                return newMessageInfo(f173536b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64184af();
            case 4:
                return new C64183ae();
            case 5:
                return f173536b;
            case 6:
                C63010eb ebVar = f173538f;
                if (ebVar == null) {
                    synchronized (C64184af.class) {
                        ebVar = f173538f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173536b);
                            f173538f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
