package com.google.protos.p4985f.p5001d;

import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.d.i */
/* compiled from: PG */
public final class C64827i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64827i f175673c;

    /* renamed from: d */
    public static final C62940bt f175674d;

    /* renamed from: e */
    private static volatile C63010eb f175675e;

    /* renamed from: a */
    public int f175676a;

    /* renamed from: b */
    public int f175677b;

    static {
        C64827i iVar = new C64827i();
        f175673c = iVar;
        C62942bv.registerDefaultInstance(C64827i.class, iVar);
        f175674d = C62942bv.newSingularGeneratedExtension(C61754p.f166816a, iVar, iVar, (C62958ce) null, 438707432, C63066gd.MESSAGE, C64827i.class);
    }

    private C64827i() {
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
                return newMessageInfo(f175673c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C64826h.f175672a});
            case 3:
                return new C64827i();
            case 4:
                return new C64825g();
            case 5:
                return f175673c;
            case 6:
                C63010eb ebVar = f175675e;
                if (ebVar == null) {
                    synchronized (C64827i.class) {
                        ebVar = f175675e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175673c);
                            f175675e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
