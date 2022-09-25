package com.google.protos.p4985f.p4988b.p4993d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.f */
/* compiled from: PG */
public final class C64786f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64786f f175589d;

    /* renamed from: e */
    private static volatile C63010eb f175590e;

    /* renamed from: a */
    public int f175591a;

    /* renamed from: b */
    public String f175592b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C64788h f175593c;

    static {
        C64786f fVar = new C64786f();
        f175589d = fVar;
        C62942bv.registerDefaultInstance(C64786f.class, fVar);
    }

    private C64786f() {
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
                return newMessageInfo(f175589d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64786f();
            case 4:
                return new C64785e();
            case 5:
                return f175589d;
            case 6:
                C63010eb ebVar = f175590e;
                if (ebVar == null) {
                    synchronized (C64786f.class) {
                        ebVar = f175590e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175589d);
                            f175590e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
