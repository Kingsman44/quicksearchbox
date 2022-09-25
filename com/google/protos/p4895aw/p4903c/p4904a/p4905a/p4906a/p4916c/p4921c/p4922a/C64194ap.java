package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57078at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ap */
/* compiled from: PG */
public final class C64194ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64194ap f173566b;

    /* renamed from: c */
    public static final C62940bt f173567c;

    /* renamed from: e */
    private static volatile C63010eb f173568e;

    /* renamed from: a */
    public C57078at f173569a;

    /* renamed from: d */
    private int f173570d;

    static {
        C64194ap apVar = new C64194ap();
        f173566b = apVar;
        C62942bv.registerDefaultInstance(C64194ap.class, apVar);
        f173567c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, apVar, apVar, (C62958ce) null, 327448230, C63066gd.MESSAGE, C64194ap.class);
    }

    private C64194ap() {
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
                return newMessageInfo(f173566b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64194ap();
            case 4:
                return new C64193ao();
            case 5:
                return f173566b;
            case 6:
                C63010eb ebVar = f173568e;
                if (ebVar == null) {
                    synchronized (C64194ap.class) {
                        ebVar = f173568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173566b);
                            f173568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
