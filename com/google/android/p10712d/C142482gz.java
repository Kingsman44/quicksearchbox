package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gz */
/* compiled from: PG */
public final class C142482gz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142482gz f386657c;

    /* renamed from: d */
    private static volatile C63010eb f386658d;

    /* renamed from: a */
    public String f386659a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f386660b = BuildConfig.FLAVOR;

    static {
        C142482gz gzVar = new C142482gz();
        f386657c = gzVar;
        C62942bv.registerDefaultInstance(C142482gz.class, gzVar);
    }

    private C142482gz() {
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
                return newMessageInfo(f386657c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C142482gz();
            case 4:
                return new C142481gy();
            case 5:
                return f386657c;
            case 6:
                C63010eb ebVar = f386658d;
                if (ebVar == null) {
                    synchronized (C142482gz.class) {
                        ebVar = f386658d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386657c);
                            f386658d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
