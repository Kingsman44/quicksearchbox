package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.cc */
/* compiled from: PG */
public final class C67700cc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67700cc f183697c;

    /* renamed from: d */
    private static volatile C63010eb f183698d;

    /* renamed from: a */
    public C63088z f183699a = C63088z.f170246b;

    /* renamed from: b */
    public C67733di f183700b;

    static {
        C67700cc ccVar = new C67700cc();
        f183697c = ccVar;
        C62942bv.registerDefaultInstance(C67700cc.class, ccVar);
    }

    private C67700cc() {
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
                return newMessageInfo(f183697c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C67700cc();
            case 4:
                return new C67699cb();
            case 5:
                return f183697c;
            case 6:
                C63010eb ebVar = f183698d;
                if (ebVar == null) {
                    synchronized (C67700cc.class) {
                        ebVar = f183698d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183697c);
                            f183698d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
