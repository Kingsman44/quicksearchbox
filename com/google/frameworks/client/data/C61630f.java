package com.google.frameworks.client.data;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.frameworks.client.data.f */
/* compiled from: PG */
public final class C61630f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61630f f166513b;

    /* renamed from: c */
    public static final C62940bt f166514c;

    /* renamed from: d */
    private static volatile C63010eb f166515d;

    /* renamed from: a */
    public C62971cq f166516a = emptyProtobufList();

    static {
        C61630f fVar = new C61630f();
        f166513b = fVar;
        C62942bv.registerDefaultInstance(C61630f.class, fVar);
        f166514c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, fVar, fVar, (C62958ce) null, 198889211, C63066gd.MESSAGE, C61630f.class);
    }

    private C61630f() {
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
                return newMessageInfo(f166513b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            case 3:
                return new C61630f();
            case 4:
                return new C61629e();
            case 5:
                return f166513b;
            case 6:
                C63010eb ebVar = f166515d;
                if (ebVar == null) {
                    synchronized (C61630f.class) {
                        ebVar = f166515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166513b);
                            f166515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
