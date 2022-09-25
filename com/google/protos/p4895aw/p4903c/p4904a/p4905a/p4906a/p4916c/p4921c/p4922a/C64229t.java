package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57103r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.t */
/* compiled from: PG */
public final class C64229t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64229t f173660b;

    /* renamed from: c */
    public static final C62940bt f173661c;

    /* renamed from: f */
    private static volatile C63010eb f173662f;

    /* renamed from: a */
    public C57103r f173663a;

    /* renamed from: d */
    private int f173664d;

    /* renamed from: e */
    private byte f173665e = 2;

    static {
        C64229t tVar = new C64229t();
        f173660b = tVar;
        C62942bv.registerDefaultInstance(C64229t.class, tVar);
        f173661c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, tVar, tVar, (C62958ce) null, 305910851, C63066gd.MESSAGE, C64229t.class);
    }

    private C64229t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173665e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173665e = b;
                return null;
            case 2:
                return newMessageInfo(f173660b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64229t();
            case 4:
                return new C64228s();
            case 5:
                return f173660b;
            case 6:
                C63010eb ebVar = f173662f;
                if (ebVar == null) {
                    synchronized (C64229t.class) {
                        ebVar = f173662f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173660b);
                            f173662f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
