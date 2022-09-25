package com.google.protos.p4892au;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.h */
/* compiled from: PG */
public final class C63830h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63830h f172621c;

    /* renamed from: e */
    private static volatile C63010eb f172622e;

    /* renamed from: a */
    public int f172623a;

    /* renamed from: b */
    public C62971cq f172624b = emptyProtobufList();

    /* renamed from: d */
    private int f172625d;

    static {
        C63830h hVar = new C63830h();
        f172621c = hVar;
        C62942bv.registerDefaultInstance(C63830h.class, hVar);
    }

    private C63830h() {
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
                return newMessageInfo(f172621c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "b", C63826d.class, "a", C63828f.f172620a});
            case 3:
                return new C63830h();
            case 4:
                return new C63827e();
            case 5:
                return f172621c;
            case 6:
                C63010eb ebVar = f172622e;
                if (ebVar == null) {
                    synchronized (C63830h.class) {
                        ebVar = f172622e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172621c);
                            f172622e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
