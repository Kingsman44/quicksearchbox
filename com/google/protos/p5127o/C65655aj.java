package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.o.aj */
/* compiled from: PG */
public final class C65655aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65655aj f178399c;

    /* renamed from: d */
    public static final C62940bt f178400d;

    /* renamed from: e */
    private static volatile C63010eb f178401e;

    /* renamed from: a */
    public int f178402a;

    /* renamed from: b */
    public long f178403b;

    static {
        C65655aj ajVar = new C65655aj();
        f178399c = ajVar;
        C62942bv.registerDefaultInstance(C65655aj.class, ajVar);
        f178400d = C62942bv.newSingularGeneratedExtension(C65695u.f178492a, ajVar, ajVar, (C62958ce) null, 380554054, C63066gd.MESSAGE, C65655aj.class);
    }

    private C65655aj() {
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
                return newMessageInfo(f178399c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65655aj();
            case 4:
                return new C65654ai();
            case 5:
                return f178399c;
            case 6:
                C63010eb ebVar = f178401e;
                if (ebVar == null) {
                    synchronized (C65655aj.class) {
                        ebVar = f178401e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178399c);
                            f178401e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
