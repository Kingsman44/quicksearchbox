package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.h */
/* compiled from: PG */
public final class C64167h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64167h f173488c;

    /* renamed from: d */
    public static final C62940bt f173489d;

    /* renamed from: f */
    private static volatile C63010eb f173490f;

    /* renamed from: a */
    public int f173491a;

    /* renamed from: b */
    public C57696b f173492b;

    /* renamed from: e */
    private byte f173493e = 2;

    static {
        C64167h hVar = new C64167h();
        f173488c = hVar;
        C62942bv.registerDefaultInstance(C64167h.class, hVar);
        f173489d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 309580677, C63066gd.MESSAGE, C64167h.class);
    }

    private C64167h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173493e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173493e = b;
                return null;
            case 2:
                return newMessageInfo(f173488c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64167h();
            case 4:
                return new C64166g();
            case 5:
                return f173488c;
            case 6:
                C63010eb ebVar = f173490f;
                if (ebVar == null) {
                    synchronized (C64167h.class) {
                        ebVar = f173490f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173488c);
                            f173490f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
