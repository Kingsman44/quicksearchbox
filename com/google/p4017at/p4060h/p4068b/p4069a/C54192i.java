package com.google.p4017at.p4060h.p4068b.p4069a;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.at.h.b.a.i */
/* compiled from: PG */
public final class C54192i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54192i f142221a;

    /* renamed from: b */
    public static final C62940bt f142222b = C62942bv.newSingularGeneratedExtension(C54201r.f142243f, C57784p.f154382f, C57784p.f154382f, (C62958ce) null, 5, C63066gd.MESSAGE, C57784p.class);

    /* renamed from: c */
    private static volatile C63010eb f142223c;

    static {
        C54192i iVar = new C54192i();
        f142221a = iVar;
        C62942bv.registerDefaultInstance(C54192i.class, iVar);
    }

    private C54192i() {
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
                return newMessageInfo(f142221a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54192i();
            case 4:
                return new C54191h();
            case 5:
                return f142221a;
            case 6:
                C63010eb ebVar = f142223c;
                if (ebVar == null) {
                    synchronized (C54192i.class) {
                        ebVar = f142223c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142221a);
                            f142223c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
