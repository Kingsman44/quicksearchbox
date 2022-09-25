package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pb */
/* compiled from: PG */
public final class C7926pb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7926pb f27844d;

    /* renamed from: e */
    private static volatile C63010eb f27845e;

    /* renamed from: a */
    public int f27846a;

    /* renamed from: b */
    public int f27847b;

    /* renamed from: c */
    public int f27848c;

    static {
        C7926pb pbVar = new C7926pb();
        f27844d = pbVar;
        C62942bv.registerDefaultInstance(C7926pb.class, pbVar);
    }

    private C7926pb() {
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
                return newMessageInfo(f27844d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C7915or.m22890b(), C45240c.f118157a, C7915or.m22890b()});
            case 3:
                return new C7926pb();
            case 4:
                return new C7925pa();
            case 5:
                return f27844d;
            case 6:
                C63010eb ebVar = f27845e;
                if (ebVar == null) {
                    synchronized (C7926pb.class) {
                        ebVar = f27845e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27844d);
                            f27845e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
