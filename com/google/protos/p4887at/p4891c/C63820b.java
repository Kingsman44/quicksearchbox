package com.google.protos.p4887at.p4891c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5195a.p5196a.C66446z;

/* renamed from: com.google.protos.at.c.b */
/* compiled from: PG */
public final class C63820b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63820b f172597b;

    /* renamed from: e */
    private static volatile C63010eb f172598e;

    /* renamed from: a */
    public C66446z f172599a;

    /* renamed from: c */
    private int f172600c;

    /* renamed from: d */
    private byte f172601d = 2;

    static {
        C63820b bVar = new C63820b();
        f172597b = bVar;
        C62942bv.registerDefaultInstance(C63820b.class, bVar);
    }

    private C63820b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172601d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172601d = b;
                return null;
            case 2:
                return newMessageInfo(f172597b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63820b();
            case 4:
                return new C63819a();
            case 5:
                return f172597b;
            case 6:
                C63010eb ebVar = f172598e;
                if (ebVar == null) {
                    synchronized (C63820b.class) {
                        ebVar = f172598e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172597b);
                            f172598e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
