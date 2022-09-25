package com.google.assistant.p3863av.p3875f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5002e.C64844m;

/* renamed from: com.google.assistant.av.f.d */
/* compiled from: PG */
public final class C50571d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50571d f131608b;

    /* renamed from: c */
    private static volatile C63010eb f131609c;

    /* renamed from: a */
    public C62971cq f131610a = emptyProtobufList();

    static {
        C50571d dVar = new C50571d();
        f131608b = dVar;
        C62942bv.registerDefaultInstance(C50571d.class, dVar);
    }

    private C50571d() {
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
                return newMessageInfo(f131608b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64844m.class});
            case 3:
                return new C50571d();
            case 4:
                return new C50570c();
            case 5:
                return f131608b;
            case 6:
                C63010eb ebVar = f131609c;
                if (ebVar == null) {
                    synchronized (C50571d.class) {
                        ebVar = f131609c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131608b);
                            f131609c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
