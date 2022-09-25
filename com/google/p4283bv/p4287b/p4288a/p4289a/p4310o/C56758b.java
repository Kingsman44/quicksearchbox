package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.b */
/* compiled from: PG */
public final class C56758b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56758b f151481d;

    /* renamed from: e */
    private static volatile C63010eb f151482e;

    /* renamed from: a */
    public int f151483a;

    /* renamed from: b */
    public boolean f151484b;

    /* renamed from: c */
    public C56772p f151485c;

    static {
        C56758b bVar = new C56758b();
        f151481d = bVar;
        C62942bv.registerDefaultInstance(C56758b.class, bVar);
    }

    private C56758b() {
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
                return newMessageInfo(f151481d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56758b();
            case 4:
                return new C56746a();
            case 5:
                return f151481d;
            case 6:
                C63010eb ebVar = f151482e;
                if (ebVar == null) {
                    synchronized (C56758b.class) {
                        ebVar = f151482e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151481d);
                            f151482e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
