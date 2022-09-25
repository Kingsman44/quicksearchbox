package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.o.ax */
/* compiled from: PG */
public final class C65669ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65669ax f178434c;

    /* renamed from: d */
    public static final C62940bt f178435d;

    /* renamed from: e */
    private static volatile C63010eb f178436e;

    /* renamed from: a */
    public int f178437a;

    /* renamed from: b */
    public long f178438b;

    static {
        C65669ax axVar = new C65669ax();
        f178434c = axVar;
        C62942bv.registerDefaultInstance(C65669ax.class, axVar);
        f178435d = C62942bv.newSingularGeneratedExtension(C65695u.f178492a, axVar, axVar, (C62958ce) null, 310943758, C63066gd.MESSAGE, C65669ax.class);
    }

    private C65669ax() {
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
                return newMessageInfo(f178434c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65669ax();
            case 4:
                return new C65668aw();
            case 5:
                return f178434c;
            case 6:
                C63010eb ebVar = f178436e;
                if (ebVar == null) {
                    synchronized (C65669ax.class) {
                        ebVar = f178436e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178434c);
                            f178436e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
