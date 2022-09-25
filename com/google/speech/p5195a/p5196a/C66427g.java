package com.google.speech.p5195a.p5196a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.a.a.g */
/* compiled from: PG */
public final class C66427g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66427g f180621d;

    /* renamed from: e */
    private static volatile C63010eb f180622e;

    /* renamed from: a */
    public int f180623a;

    /* renamed from: b */
    public int f180624b;

    /* renamed from: c */
    public C62971cq f180625c = emptyProtobufList();

    static {
        C66427g gVar = new C66427g();
        f180621d = gVar;
        C62942bv.registerDefaultInstance(C66427g.class, gVar);
    }

    private C66427g() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f180621d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b", new Object[]{"a", "b", C66426f.f180620a, C45240c.f118157a, C66429i.class});
            case 3:
                return new C66427g();
            case 4:
                return new C66425e();
            case 5:
                return f180621d;
            case 6:
                C63010eb ebVar = f180622e;
                if (ebVar == null) {
                    synchronized (C66427g.class) {
                        ebVar = f180622e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180621d);
                            f180622e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
