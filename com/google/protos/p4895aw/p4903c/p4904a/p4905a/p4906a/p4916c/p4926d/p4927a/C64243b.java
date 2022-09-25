package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4926d.p4927a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.d.a.b */
/* compiled from: PG */
public final class C64243b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64243b f173706b;

    /* renamed from: c */
    public static final C62940bt f173707c;

    /* renamed from: e */
    private static volatile C63010eb f173708e;

    /* renamed from: a */
    public boolean f173709a;

    /* renamed from: d */
    private int f173710d;

    static {
        C64243b bVar = new C64243b();
        f173706b = bVar;
        C62942bv.registerDefaultInstance(C64243b.class, bVar);
        f173707c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 383277260, C63066gd.MESSAGE, C64243b.class);
    }

    private C64243b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f173706b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64243b();
            case 4:
                return new C64242a();
            case 5:
                return f173706b;
            case 6:
                C63010eb ebVar = f173708e;
                if (ebVar == null) {
                    synchronized (C64243b.class) {
                        ebVar = f173708e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173706b);
                            f173708e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
