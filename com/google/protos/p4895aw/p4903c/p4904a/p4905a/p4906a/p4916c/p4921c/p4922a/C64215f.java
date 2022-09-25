package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.f */
/* compiled from: PG */
public final class C64215f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64215f f173627b;

    /* renamed from: c */
    public static final C62940bt f173628c;

    /* renamed from: f */
    private static volatile C63010eb f173629f;

    /* renamed from: a */
    public C57060ab f173630a;

    /* renamed from: d */
    private int f173631d;

    /* renamed from: e */
    private byte f173632e = 2;

    static {
        C64215f fVar = new C64215f();
        f173627b = fVar;
        C62942bv.registerDefaultInstance(C64215f.class, fVar);
        f173628c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 277313630, C63066gd.MESSAGE, C64215f.class);
    }

    private C64215f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173632e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173632e = b;
                return null;
            case 2:
                return newMessageInfo(f173627b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64215f();
            case 4:
                return new C64214e();
            case 5:
                return f173627b;
            case 6:
                C63010eb ebVar = f173629f;
                if (ebVar == null) {
                    synchronized (C64215f.class) {
                        ebVar = f173629f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173627b);
                            f173629f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
