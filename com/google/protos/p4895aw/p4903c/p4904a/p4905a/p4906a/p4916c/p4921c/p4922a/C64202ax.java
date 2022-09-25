package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57082ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ax */
/* compiled from: PG */
public final class C64202ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64202ax f173592b;

    /* renamed from: c */
    public static final C62940bt f173593c;

    /* renamed from: f */
    private static volatile C63010eb f173594f;

    /* renamed from: a */
    public C57082ax f173595a;

    /* renamed from: d */
    private int f173596d;

    /* renamed from: e */
    private byte f173597e = 2;

    static {
        C64202ax axVar = new C64202ax();
        f173592b = axVar;
        C62942bv.registerDefaultInstance(C64202ax.class, axVar);
        f173593c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, axVar, axVar, (C62958ce) null, 301187969, C63066gd.MESSAGE, C64202ax.class);
    }

    private C64202ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173597e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173597e = b;
                return null;
            case 2:
                return newMessageInfo(f173592b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64202ax();
            case 4:
                return new C64201aw();
            case 5:
                return f173592b;
            case 6:
                C63010eb ebVar = f173594f;
                if (ebVar == null) {
                    synchronized (C64202ax.class) {
                        ebVar = f173594f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173592b);
                            f173594f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
