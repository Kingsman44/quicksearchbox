package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57105t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.v */
/* compiled from: PG */
public final class C64231v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64231v f173666b;

    /* renamed from: c */
    public static final C62940bt f173667c;

    /* renamed from: f */
    private static volatile C63010eb f173668f;

    /* renamed from: a */
    public C57105t f173669a;

    /* renamed from: d */
    private int f173670d;

    /* renamed from: e */
    private byte f173671e = 2;

    static {
        C64231v vVar = new C64231v();
        f173666b = vVar;
        C62942bv.registerDefaultInstance(C64231v.class, vVar);
        f173667c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, vVar, vVar, (C62958ce) null, 372233181, C63066gd.MESSAGE, C64231v.class);
    }

    private C64231v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173671e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173671e = b;
                return null;
            case 2:
                return newMessageInfo(f173666b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64231v();
            case 4:
                return new C64230u();
            case 5:
                return f173666b;
            case 6:
                C63010eb ebVar = f173668f;
                if (ebVar == null) {
                    synchronized (C64231v.class) {
                        ebVar = f173668f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173666b);
                            f173668f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
