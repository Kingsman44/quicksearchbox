package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57095j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.r */
/* compiled from: PG */
public final class C64227r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64227r f173654b;

    /* renamed from: c */
    public static final C62940bt f173655c;

    /* renamed from: f */
    private static volatile C63010eb f173656f;

    /* renamed from: a */
    public C57095j f173657a;

    /* renamed from: d */
    private int f173658d;

    /* renamed from: e */
    private byte f173659e = 2;

    static {
        C64227r rVar = new C64227r();
        f173654b = rVar;
        C62942bv.registerDefaultInstance(C64227r.class, rVar);
        f173655c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, rVar, rVar, (C62958ce) null, 343095590, C63066gd.MESSAGE, C64227r.class);
    }

    private C64227r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173659e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173659e = b;
                return null;
            case 2:
                return newMessageInfo(f173654b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64227r();
            case 4:
                return new C64226q();
            case 5:
                return f173654b;
            case 6:
                C63010eb ebVar = f173656f;
                if (ebVar == null) {
                    synchronized (C64227r.class) {
                        ebVar = f173656f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173654b);
                            f173656f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
