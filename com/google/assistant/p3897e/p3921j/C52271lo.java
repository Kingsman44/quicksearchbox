package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lo */
/* compiled from: PG */
public final class C52271lo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52271lo f137214c;

    /* renamed from: d */
    private static volatile C63010eb f137215d;

    /* renamed from: a */
    public int f137216a;

    /* renamed from: b */
    public String f137217b = BuildConfig.FLAVOR;

    static {
        C52271lo loVar = new C52271lo();
        f137214c = loVar;
        C62942bv.registerDefaultInstance(C52271lo.class, loVar);
    }

    private C52271lo() {
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
                return newMessageInfo(f137214c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52271lo();
            case 4:
                return new C52270ln();
            case 5:
                return f137214c;
            case 6:
                C63010eb ebVar = f137215d;
                if (ebVar == null) {
                    synchronized (C52271lo.class) {
                        ebVar = f137215d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137214c);
                            f137215d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
