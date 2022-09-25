package com.google.protos.p4985f.p5027o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.o.f */
/* compiled from: PG */
public final class C64971f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64971f f175954c;

    /* renamed from: e */
    private static volatile C63010eb f175955e;

    /* renamed from: a */
    public String f175956a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f175957b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f175958d;

    static {
        C64971f fVar = new C64971f();
        f175954c = fVar;
        C62942bv.registerDefaultInstance(C64971f.class, fVar);
    }

    private C64971f() {
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
                return newMessageInfo(f175954c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
            case 3:
                return new C64971f();
            case 4:
                return new C64970e();
            case 5:
                return f175954c;
            case 6:
                C63010eb ebVar = f175955e;
                if (ebVar == null) {
                    synchronized (C64971f.class) {
                        ebVar = f175955e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175954c);
                            f175955e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
