package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ar */
/* compiled from: PG */
public final class C62205ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62205ar f167954c;

    /* renamed from: d */
    private static volatile C63010eb f167955d;

    /* renamed from: a */
    public int f167956a;

    /* renamed from: b */
    public String f167957b = BuildConfig.FLAVOR;

    static {
        C62205ar arVar = new C62205ar();
        f167954c = arVar;
        C62942bv.registerDefaultInstance(C62205ar.class, arVar);
    }

    private C62205ar() {
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
                return newMessageInfo(f167954c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62205ar();
            case 4:
                return new C62204aq();
            case 5:
                return f167954c;
            case 6:
                C63010eb ebVar = f167955d;
                if (ebVar == null) {
                    synchronized (C62205ar.class) {
                        ebVar = f167955d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167954c);
                            f167955d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
