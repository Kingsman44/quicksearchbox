package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.f */
/* compiled from: PG */
public final class C62531f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62531f f168830c;

    /* renamed from: d */
    private static volatile C63010eb f168831d;

    /* renamed from: a */
    public int f168832a;

    /* renamed from: b */
    public String f168833b = BuildConfig.FLAVOR;

    static {
        C62531f fVar = new C62531f();
        f168830c = fVar;
        C62942bv.registerDefaultInstance(C62531f.class, fVar);
    }

    private C62531f() {
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
                return newMessageInfo(f168830c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62531f();
            case 4:
                return new C62504e();
            case 5:
                return f168830c;
            case 6:
                C63010eb ebVar = f168831d;
                if (ebVar == null) {
                    synchronized (C62531f.class) {
                        ebVar = f168831d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168830c);
                            f168831d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
