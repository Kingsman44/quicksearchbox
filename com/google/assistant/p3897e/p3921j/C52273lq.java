package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lq */
/* compiled from: PG */
public final class C52273lq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52273lq f137218c;

    /* renamed from: d */
    private static volatile C63010eb f137219d;

    /* renamed from: a */
    public int f137220a;

    /* renamed from: b */
    public String f137221b = BuildConfig.FLAVOR;

    static {
        C52273lq lqVar = new C52273lq();
        f137218c = lqVar;
        C62942bv.registerDefaultInstance(C52273lq.class, lqVar);
    }

    private C52273lq() {
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
                return newMessageInfo(f137218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52273lq();
            case 4:
                return new C52272lp();
            case 5:
                return f137218c;
            case 6:
                C63010eb ebVar = f137219d;
                if (ebVar == null) {
                    synchronized (C52273lq.class) {
                        ebVar = f137219d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137218c);
                            f137219d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
