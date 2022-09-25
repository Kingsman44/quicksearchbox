package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57066ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.aj */
/* compiled from: PG */
public final class C64188aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64188aj f173548b;

    /* renamed from: c */
    public static final C62940bt f173549c;

    /* renamed from: f */
    private static volatile C63010eb f173550f;

    /* renamed from: a */
    public C57066ah f173551a;

    /* renamed from: d */
    private int f173552d;

    /* renamed from: e */
    private byte f173553e = 2;

    static {
        C64188aj ajVar = new C64188aj();
        f173548b = ajVar;
        C62942bv.registerDefaultInstance(C64188aj.class, ajVar);
        f173549c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, ajVar, ajVar, (C62958ce) null, 278020244, C63066gd.MESSAGE, C64188aj.class);
    }

    private C64188aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173553e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173553e = b;
                return null;
            case 2:
                return newMessageInfo(f173548b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64188aj();
            case 4:
                return new C64187ai();
            case 5:
                return f173548b;
            case 6:
                C63010eb ebVar = f173550f;
                if (ebVar == null) {
                    synchronized (C64188aj.class) {
                        ebVar = f173550f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173548b);
                            f173550f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
