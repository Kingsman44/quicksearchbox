package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.as.p */
/* compiled from: PG */
public final class C49802p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49802p f128644b;

    /* renamed from: c */
    public static final C62940bt f128645c;

    /* renamed from: d */
    private static volatile C63010eb f128646d;

    /* renamed from: a */
    public C62971cq f128647a = emptyProtobufList();

    static {
        C49802p pVar = new C49802p();
        f128644b = pVar;
        C62942bv.registerDefaultInstance(C49802p.class, pVar);
        f128645c = C62942bv.newSingularGeneratedExtension(C49742ae.f128440a, pVar, pVar, (C62958ce) null, 308574983, C63066gd.MESSAGE, C49802p.class);
    }

    private C49802p() {
        emptyProtobufList();
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
                return newMessageInfo(f128644b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C49801o.class});
            case 3:
                return new C49802p();
            case 4:
                return new C49799m();
            case 5:
                return f128644b;
            case 6:
                C63010eb ebVar = f128646d;
                if (ebVar == null) {
                    synchronized (C49802p.class) {
                        ebVar = f128646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128644b);
                            f128646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
