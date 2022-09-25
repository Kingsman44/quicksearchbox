package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57109x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ad */
/* compiled from: PG */
public final class C64182ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64182ad f173530b;

    /* renamed from: c */
    public static final C62940bt f173531c;

    /* renamed from: f */
    private static volatile C63010eb f173532f;

    /* renamed from: a */
    public C57109x f173533a;

    /* renamed from: d */
    private int f173534d;

    /* renamed from: e */
    private byte f173535e = 2;

    static {
        C64182ad adVar = new C64182ad();
        f173530b = adVar;
        C62942bv.registerDefaultInstance(C64182ad.class, adVar);
        f173531c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, adVar, adVar, (C62958ce) null, 267449278, C63066gd.MESSAGE, C64182ad.class);
    }

    private C64182ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173535e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173535e = b;
                return null;
            case 2:
                return newMessageInfo(f173530b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64182ad();
            case 4:
                return new C64181ac();
            case 5:
                return f173530b;
            case 6:
                C63010eb ebVar = f173532f;
                if (ebVar == null) {
                    synchronized (C64182ad.class) {
                        ebVar = f173532f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173530b);
                            f173532f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
