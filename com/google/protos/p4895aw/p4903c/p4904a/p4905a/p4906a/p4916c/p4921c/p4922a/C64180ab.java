package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57107v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ab */
/* compiled from: PG */
public final class C64180ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64180ab f173524b;

    /* renamed from: c */
    public static final C62940bt f173525c;

    /* renamed from: f */
    private static volatile C63010eb f173526f;

    /* renamed from: a */
    public C57107v f173527a;

    /* renamed from: d */
    private int f173528d;

    /* renamed from: e */
    private byte f173529e = 2;

    static {
        C64180ab abVar = new C64180ab();
        f173524b = abVar;
        C62942bv.registerDefaultInstance(C64180ab.class, abVar);
        f173525c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, abVar, abVar, (C62958ce) null, 323067788, C63066gd.MESSAGE, C64180ab.class);
    }

    private C64180ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173529e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173529e = b;
                return null;
            case 2:
                return newMessageInfo(f173524b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64180ab();
            case 4:
                return new C64179aa();
            case 5:
                return f173524b;
            case 6:
                C63010eb ebVar = f173526f;
                if (ebVar == null) {
                    synchronized (C64180ab.class) {
                        ebVar = f173526f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173524b);
                            f173526f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
