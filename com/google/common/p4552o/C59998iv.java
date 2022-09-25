package com.google.common.p4552o;

import com.google.assistant.p3745ab.C48340h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.iv */
/* compiled from: PG */
public final class C59998iv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59998iv f162152c;

    /* renamed from: d */
    public static final C62940bt f162153d;

    /* renamed from: e */
    private static volatile C63010eb f162154e;

    /* renamed from: a */
    public int f162155a;

    /* renamed from: b */
    public C48340h f162156b;

    static {
        C59998iv ivVar = new C59998iv();
        f162152c = ivVar;
        C62942bv.registerDefaultInstance(C59998iv.class, ivVar);
        f162153d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ivVar, ivVar, (C62958ce) null, 377, C63066gd.MESSAGE, C59998iv.class);
    }

    private C59998iv() {
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
                return newMessageInfo(f162152c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59998iv();
            case 4:
                return new C59997iu();
            case 5:
                return f162152c;
            case 6:
                C63010eb ebVar = f162154e;
                if (ebVar == null) {
                    synchronized (C59998iv.class) {
                        ebVar = f162154e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162152c);
                            f162154e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
