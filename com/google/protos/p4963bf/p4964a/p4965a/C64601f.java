package com.google.protos.p4963bf.p4964a.p4965a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.f */
/* compiled from: PG */
public final class C64601f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64601f f175141e;

    /* renamed from: f */
    private static volatile C63010eb f175142f;

    /* renamed from: a */
    public int f175143a;

    /* renamed from: b */
    public String f175144b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175145c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C64593bo f175146d;

    static {
        C64601f fVar = new C64601f();
        f175141e = fVar;
        C62942bv.registerDefaultInstance(C64601f.class, fVar);
    }

    private C64601f() {
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
                return newMessageInfo(f175141e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64601f();
            case 4:
                return new C64600e();
            case 5:
                return f175141e;
            case 6:
                C63010eb ebVar = f175142f;
                if (ebVar == null) {
                    synchronized (C64601f.class) {
                        ebVar = f175142f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175141e);
                            f175142f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
