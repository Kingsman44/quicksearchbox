package com.google.protos.p4895aw.p4902b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.x */
/* compiled from: PG */
public final class C64106x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64106x f173313c;

    /* renamed from: d */
    private static volatile C63010eb f173314d;

    /* renamed from: a */
    public int f173315a;

    /* renamed from: b */
    public String f173316b = BuildConfig.FLAVOR;

    static {
        C64106x xVar = new C64106x();
        f173313c = xVar;
        C62942bv.registerDefaultInstance(C64106x.class, xVar);
    }

    private C64106x() {
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
                return newMessageInfo(f173313c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64106x();
            case 4:
                return new C64105w();
            case 5:
                return f173313c;
            case 6:
                C63010eb ebVar = f173314d;
                if (ebVar == null) {
                    synchronized (C64106x.class) {
                        ebVar = f173314d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173313c);
                            f173314d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
