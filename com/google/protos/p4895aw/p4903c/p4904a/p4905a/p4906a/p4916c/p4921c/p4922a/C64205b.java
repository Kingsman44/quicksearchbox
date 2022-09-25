package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57085b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.b */
/* compiled from: PG */
public final class C64205b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64205b f173601b;

    /* renamed from: c */
    public static final C62940bt f173602c;

    /* renamed from: f */
    private static volatile C63010eb f173603f;

    /* renamed from: a */
    public C57085b f173604a;

    /* renamed from: d */
    private int f173605d;

    /* renamed from: e */
    private byte f173606e = 2;

    static {
        C64205b bVar = new C64205b();
        f173601b = bVar;
        C62942bv.registerDefaultInstance(C64205b.class, bVar);
        f173602c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 421379939, C63066gd.MESSAGE, C64205b.class);
    }

    private C64205b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173606e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173606e = b;
                return null;
            case 2:
                return newMessageInfo(f173601b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64205b();
            case 4:
                return new C64178a();
            case 5:
                return f173601b;
            case 6:
                C63010eb ebVar = f173603f;
                if (ebVar == null) {
                    synchronized (C64205b.class) {
                        ebVar = f173603f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173601b);
                            f173603f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
