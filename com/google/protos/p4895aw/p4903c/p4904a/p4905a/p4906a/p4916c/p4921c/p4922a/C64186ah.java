package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57064af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ah */
/* compiled from: PG */
public final class C64186ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64186ah f173542b;

    /* renamed from: c */
    public static final C62940bt f173543c;

    /* renamed from: f */
    private static volatile C63010eb f173544f;

    /* renamed from: a */
    public C57064af f173545a;

    /* renamed from: d */
    private int f173546d;

    /* renamed from: e */
    private byte f173547e = 2;

    static {
        C64186ah ahVar = new C64186ah();
        f173542b = ahVar;
        C62942bv.registerDefaultInstance(C64186ah.class, ahVar);
        f173543c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, ahVar, ahVar, (C62958ce) null, 264568942, C63066gd.MESSAGE, C64186ah.class);
    }

    private C64186ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173547e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173547e = b;
                return null;
            case 2:
                return newMessageInfo(f173542b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64186ah();
            case 4:
                return new C64185ag();
            case 5:
                return f173542b;
            case 6:
                C63010eb ebVar = f173544f;
                if (ebVar == null) {
                    synchronized (C64186ah.class) {
                        ebVar = f173544f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173542b);
                            f173544f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
