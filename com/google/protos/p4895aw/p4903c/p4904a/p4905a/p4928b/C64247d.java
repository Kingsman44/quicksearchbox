package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.b.d */
/* compiled from: PG */
public final class C64247d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64247d f173714c;

    /* renamed from: d */
    public static final C62940bt f173715d;

    /* renamed from: f */
    private static volatile C63010eb f173716f;

    /* renamed from: a */
    public int f173717a;

    /* renamed from: b */
    public C66166ck f173718b;

    /* renamed from: e */
    private byte f173719e = 2;

    static {
        C64247d dVar = new C64247d();
        f173714c = dVar;
        C62942bv.registerDefaultInstance(C64247d.class, dVar);
        f173715d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 247957207, C63066gd.MESSAGE, C64247d.class);
    }

    private C64247d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173719e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173719e = b;
                return null;
            case 2:
                return newMessageInfo(f173714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64247d();
            case 4:
                return new C64246c();
            case 5:
                return f173714c;
            case 6:
                C63010eb ebVar = f173716f;
                if (ebVar == null) {
                    synchronized (C64247d.class) {
                        ebVar = f173716f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173714c);
                            f173716f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
