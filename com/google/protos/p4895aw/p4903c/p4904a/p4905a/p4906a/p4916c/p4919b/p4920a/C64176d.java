package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.p4920a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.C64177b;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.b.a.d */
/* compiled from: PG */
public final class C64176d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64176d f173514b;

    /* renamed from: c */
    public static final C62940bt f173515c;

    /* renamed from: e */
    private static volatile C63010eb f173516e;

    /* renamed from: a */
    public C64177b f173517a;

    /* renamed from: d */
    private int f173518d;

    static {
        C64176d dVar = new C64176d();
        f173514b = dVar;
        C62942bv.registerDefaultInstance(C64176d.class, dVar);
        f173515c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 428550848, C63066gd.MESSAGE, C64176d.class);
    }

    private C64176d() {
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
                return newMessageInfo(f173514b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64176d();
            case 4:
                return new C64175c();
            case 5:
                return f173514b;
            case 6:
                C63010eb ebVar = f173516e;
                if (ebVar == null) {
                    synchronized (C64176d.class) {
                        ebVar = f173516e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173514b);
                            f173516e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
