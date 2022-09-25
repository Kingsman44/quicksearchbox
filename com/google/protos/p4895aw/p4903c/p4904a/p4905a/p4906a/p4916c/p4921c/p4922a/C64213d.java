package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57089d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.d */
/* compiled from: PG */
public final class C64213d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64213d f173621b;

    /* renamed from: c */
    public static final C62940bt f173622c;

    /* renamed from: f */
    private static volatile C63010eb f173623f;

    /* renamed from: a */
    public C57089d f173624a;

    /* renamed from: d */
    private int f173625d;

    /* renamed from: e */
    private byte f173626e = 2;

    static {
        C64213d dVar = new C64213d();
        f173621b = dVar;
        C62942bv.registerDefaultInstance(C64213d.class, dVar);
        f173622c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 327866290, C63066gd.MESSAGE, C64213d.class);
    }

    private C64213d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173626e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173626e = b;
                return null;
            case 2:
                return newMessageInfo(f173621b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64213d();
            case 4:
                return new C64212c();
            case 5:
                return f173621b;
            case 6:
                C63010eb ebVar = f173623f;
                if (ebVar == null) {
                    synchronized (C64213d.class) {
                        ebVar = f173623f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173621b);
                            f173623f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
