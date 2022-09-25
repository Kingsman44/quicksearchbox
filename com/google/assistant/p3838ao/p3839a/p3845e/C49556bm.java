package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.bm */
/* compiled from: PG */
public final class C49556bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49556bm f127868b;

    /* renamed from: c */
    public static final C62940bt f127869c;

    /* renamed from: d */
    private static volatile C63010eb f127870d;

    /* renamed from: a */
    public C62971cq f127871a = emptyProtobufList();

    static {
        C49556bm bmVar = new C49556bm();
        f127868b = bmVar;
        C62942bv.registerDefaultInstance(C49556bm.class, bmVar);
        f127869c = C62942bv.newSingularGeneratedExtension(C49621l.f128062b, bmVar, bmVar, (C62958ce) null, 284535032, C63066gd.MESSAGE, C49556bm.class);
    }

    private C49556bm() {
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
                return newMessageInfo(f127868b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49555bl.class});
            case 3:
                return new C49556bm();
            case 4:
                return new C49553bj();
            case 5:
                return f127868b;
            case 6:
                C63010eb ebVar = f127870d;
                if (ebVar == null) {
                    synchronized (C49556bm.class) {
                        ebVar = f127870d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127868b);
                            f127870d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
